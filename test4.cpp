

#define SIZE 8 
#define NULL 0
struct block{

  struct block *ptr;

  int size;
};
//struct block;
static  struct block base;
static  struct block *freep= NULL;

void *malloc(int nbytes) {

  struct block *p, *prevp;
  struct block *morecore(int);
  int nunits;
  nunits = (nbytes + SIZE - 1) / SIZE + 1;
  if ((prevp = freep) == NULL) {

    base.ptr = freep = prevp = &base;
    base.size = NULL;
  }

  for(p = prevp-> ptr; ;prevp = p, p= p-> ptr) 
	{
		if(p-> size >= nunits) /* 足够大 */
		{ 
			if (p-> size == nunits)  /* 正好 */
				prevp-> ptr = p-> ptr;
			else  /*分配末尾部分*/
			{                 
				p-> size -= nunits;
				p += p-> size;
				p-> size = nunits;
			}
			freep = prevp;
			return (void*)(p+1);
		}
		if (p== freep) /* 闭环的空闲链表*/
			if ((p = morecore(nunits)) == NULL)
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