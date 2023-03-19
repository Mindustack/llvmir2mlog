

#define SIZE 8 
#define NULL 0
struct block{

  struct block *ptr;

  int size;
};
//struct block;
static  struct block base;
static  struct block *freep= NULL;
void *morespace(int nunits){
	
}

void *malloc(int nbytes) {

  struct block *present, *prevp;
  //struct block *morecore(int);
  int nunits;
  nunits = (nbytes + SIZE - 1) / SIZE + 1;
  if ((prevp = freep) == NULL) {//fail to find...  throw line 41 to solve

    base.ptr = freep = prevp = &base;
    base.size = NULL;
  }

  for (present = prevp->ptr;; prevp = present, present = present->ptr) {
    if (present->size >= nunits) /* 足够大 */
    {
      if (present->size == nunits) /* 正好 */
        prevp->ptr = present->ptr;
      else /*分配末尾部分*/
      {
        present->size -= nunits;
        present += present->size;
        present->size = nunits;
      }
      freep = prevp;
      return (void *)(present + 1);
    }
    if (present == freep) /* 闭环的空闲链表*/
      if ((present = (block *)morespace(nunits)) == NULL)
        return NULL; /* 没有剩余的存储空间 */
  }
}

void free(void *ap)
{
	struct block *bp,*p;
	bp = (block *)ap -1; /* 指向块头 */

	for(p=freep;!(bp>p && bp< p-> ptr);p=p-> ptr)
		if(p>=p-> ptr && (bp>p || bp<p-> ptr))
			break;    /* 被释放的块在链表的开头或结尾*/
			

	if (bp+bp-> size==p-> ptr) /*与上一相邻块合并 */
	{    
		bp-> size += p-> ptr-> size;
		bp-> ptr = p-> ptr-> ptr;
	} 
	else
		bp-> ptr = p-> ptr;
	if (p+p-> size == bp)/* 与下一相邻块合并 */ 
	{     
		p-> size += bp-> size;
		p-> ptr = bp-> ptr;
	} 
	else
		p-> ptr = bp;
	freep = p;
}

