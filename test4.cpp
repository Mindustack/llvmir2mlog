

//#define SIZE 8 
#define NULL 0


// void write(int ads);
// void write(*void ads);
// void read(int ads);
// void read(int ads);

typedef long Align;/*for alignment to long boundary*/


union header { 
    struct {
        union header *ptr; /*next block if on Mfree list*/
        unsigned size; /*size of this block*/
    } s;
    Align x;
};

typedef union header Header;



static Header base;
static Header *freep = NULL;
void Mfree(void *ap)
{

    Header *bp,*p;
    bp = (Header *)ap -1; /* point to block header */
    for(p=freep;!(bp>p && bp< p->s.ptr);p=p->s.ptr)
        if(p>=p->s.ptr && (bp>p || bp<p->s.ptr))
            break;    /* freed block at start or end of arena*/
    if (bp+bp->s.size==p->s.ptr) {    /* join to upper nbr */
        bp->s.size += p->s.ptr->s.size;
        bp->s.ptr = p->s.ptr->s.ptr;
    } else
        bp->s.ptr = p->s.ptr;
    if (p+p->s.size == bp) {     /* join to lower nbr */
        p->s.size += bp->s.size;
        p->s.ptr = bp->s.ptr;
    } else
        p->s.ptr = bp;
    freep = p;
 }
#include <unistd.h>
//int brk(void *addr);
// #define intptr_t int;
void *sbrk(intptr_t increment);

//static header* heapcap= freep ;
#define NALLOC 4    /* minimum #units to request */
static Header *Mmorecore(unsigned nu)
{
    //int *heapcap;
   // Header *up;


//   //  if(nu < NALLOC)
//        // nu = NALLOC;

//  heapcap = sbrk(nu * sizeof(Header));

//    //  heapcap += nu * sizeof(Header);


//    if(heapcap == (char *)-1)    /* no space at all*/
//       //  return NULL;
//     up = (Header *)heapcap;
//     //up->s.size = nu;
//     Mfree((void *)(up+1));
//     return freep;


    char *cp;
    Header *up;
    if(nu < NALLOC)
        nu = NALLOC;
    cp = (char *)sbrk(
       // nu * sizeof(Header)
       512
        );
    if(cp == (char *)-1)    /* no space at all*/
        return NULL;
    up = (Header *)cp;
    up->s.size = nu;
    Mfree((void *)(up+1));
    return freep;
}



void *Mmalloc(unsigned nbytes)
{
    Header *p, *prevp;
    unsigned nunits;
    nunits = (nbytes+sizeof(Header)-1)/sizeof(Header) + 1;
    if((prevp = freep) == NULL) { /* no Mfree list */
        base.s.ptr = freep = prevp = &base;
        base.s.size = 0;
    }
    for(p = prevp->s.ptr; ;prevp = p, p= p->s.ptr) {
        if(p->s.size >= nunits) { /* big enough */
            if (p->s.size == nunits)  /* exactly */
                prevp->s.ptr = p->s.ptr;
            else {
                p->s.size -= nunits;
                p += p->s.size;
                p->s.size = nunits;
            }
            freep = prevp;
            return (void*)(p+1);
        }
        if (p== freep) /* wrapped around Mfree list */
            if ((p = Mmorecore(nunits)) == NULL)
                return NULL; /* none left */
    }
}

#include <iostream>
 
using namespace std;

int main (){

void * ip= (void *)Mmalloc(64);
 // cout << "Address stored in ip variable: ";
cout << ip << endl;
// Mfree(ip);
ip= (void *)Mmalloc(32);
  //cout << "Address stored in ip variable: ";
cout << ip << endl;
// Mfree(ip);
ip= (void *)Mmalloc(64);

  //
cout << ip << endl;
// Mfree(ip);
cout << "计算十进制数值"<< endl;
	return 0;
	} 
