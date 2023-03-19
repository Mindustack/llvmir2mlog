#include <cstddef>
typedef long Align;/*按照long类型的边界对齐*/
union header/*块的头部*/
{
	struct
	{
		union header *ptr;/*空闲块链表中的下一块*/
		unsigned size;/*本块的大小*/
	}s;
	Align x;/*强制块对齐*/
};
typedef union header Header;
static Header base;/*从空链表开始*/
static Header *freep = NULL;/*空闲链表的初始指针*/
 
void *malloc(unsigned nbytes)
{
	Header *p, *prevp;
	Header *morecore(unsigned);
	unsigned nunits;
 
	nunits = (nbytes+sizeof(Header)-1)/sizeof(Header) + 1;
	if((prevp = freep) == NULL) /* 没有空闲链表 */
	{ 
		base.s.ptr = freep = prevp = &base;
		base.s.size = 0;
	}
	for(p = prevp->s.ptr; ;prevp = p, p= p->s.ptr) 
	{
		if(p->s.size >= nunits) /* 足够大 */
		{ 
			if (p->s.size == nunits)  /* 正好 */
				prevp->s.ptr = p->s.ptr;
			else  /*分配末尾部分*/
			{                 
				p->s.size -= nunits;
				p += p->s.size;
				p->s.size = nunits;
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
	Header *bp,*p;
	bp = (Header *)ap -1; /* 指向块头 */
	for(p=freep;!(bp>p && bp< p->s.ptr);p=p->s.ptr)
		if(p>=p->s.ptr && (bp>p || bp<p->s.ptr))
			break;    /* 被释放的块在链表的开头或结尾*/
	if (bp+bp->s.size==p->s.ptr) /*与上一相邻块合并 */
	{    
		bp->s.size += p->s.ptr->s.size;
		bp->s.ptr = p->s.ptr->s.ptr;
	} 
	else
		bp->s.ptr = p->s.ptr;
	if (p+p->s.size == bp)/* 与下一相邻块合并 */ 
	{     
		p->s.size += bp->s.size;
		p->s.ptr = bp->s.ptr;
	} 
	else
		p->s.ptr = bp;
	freep = p;
}