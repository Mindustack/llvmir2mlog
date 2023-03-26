



#include <iostream>
using namespace std;
//#define SIZE 8 
//#define NULL 0


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
 //   Align x;
};

typedef union header Header;


//static char space[200] ;
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
#define NALLOC 8 /* minimum #units to request */
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
        nu * sizeof(Header)
  //     512
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
      //   cout << p+1 << endl;
            return (void*)(p+1);
        }
        if (p== freep) /* wrapped around Mfree list */
            if ((p = Mmorecore(nunits)) == NULL)
                return NULL; /* none left */
    }
}


void printMemory(const void* start, const void* end	) {
    cout<<endl<<endl;
    const char* startChar = static_cast<const char*>(start);
    const char* endChar = static_cast<const char*>(end);
    int byteCount = 0;
    for (const char* i = startChar; i < endChar; i++) {
    	if(byteCount%8==0)cout<<endl;
        cout << static_cast< unsigned>(*i) <<' ';
        
        byteCount++;
    }


}
void write(void* ptr, size_t size,char t) {
	//cout << ptr << endl;
    char* p = (char*)(ptr);
    
//    cout << p << endl;
    for (size_t i = 0; i < size; ++i) {

   //  cout << *p << endl;
   //   cout << p << endl;
             *p++ = t;
    }
//    for (size_t i = 0; i < size; ++i) {
//    std::cout << static_cast<int>(p[i]) << " ";
//}
}







void* test(int size){
	void * ip;
ip= (void *)Mmalloc(size);
 write(ip,size,1);
 return ip;
	}
 





//		原作者：五岳

//		出处：http://www.cnblogs.com/wuyuegb2312

int main (){
	void * start=sbrk(0);
void *a; void*b;void*c;void* d;void*e;
a=test(4);

b= test(8);

c=  test(16);

d=  test(32);
 
e= test(64);
printMemory(start,sbrk(0));
Mfree(a);
write(a,4,0);
Mfree(b);
write(b,8,0);
Mfree(c);
write(c,16,0);
Mfree(d);
write(d,32,0);


printMemory(start,sbrk(0));
test(4);
test(4);
test(4);
test(4);
test(4);
test(4);
test(4);
test(4);
test(4);
test(4);
test(4);
test(4);
test(4);
printMemory(start,sbrk(0));
 // cout << "Address stored in ip variable: ";
//cout << ip << endl;
// Mfree(ip);
//ip= (void *)Mmalloc(32);
  //cout << "Address stored in ip variable: ";
//cout << ip << endl;
// Mfree(ip);
//ip= (void *)Mmalloc(64);

  //
//cout << ip << endl;
//cout << *ip +2<< endl;
// Mfree(ip);
//cout << "计算十进制数值"<< endl;
	return 0;
	
	} 
