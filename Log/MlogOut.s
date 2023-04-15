mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	    main_LabelForTail:
	set s0 s0
	set s1 s1
	set s2 s2
	set s3 s3
	set s4 s4
	set s5 s5
	set s6 s6
	set s7 s7
	set s8 s8
	set s9 s9
	set s10 s10
	set s11 s11
	set ra ra
	                              #move arguments 0~7 to reg
	set t0 a0
	                              #load arguments in mem to reg
	                              #start
	op add a0 t0 1
	set a0 a0
	op add a0 t0 2
	set a0 a0
	set a0 a0
	set s0 s0
	set s1 s1
	set s2 s2
	set s3 s3
	set s4 s4
	set s5 s5
	set s6 s6
	set s7 s7
	set s8 s8
	set s9 s9
	set s10 s10
	set s11 s11
	                              #ra temp back
	set ra ra
	                              #sp and fp
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	    main_LabelForTail:
	                              #move arguments 0~7 to reg
	set t0 a0
	                              #load arguments in mem to reg
	                              #start
	op add a0 t0 2
	                              #ra temp back
	                              #sp and fp
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	set t0 a0
	                              #load arguments in mem to reg
	                              #start
	op add a0 t0 2
	                              #ra temp back
	                              #sp and fp
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add t0 a0 1
	op add t0 t0 2
	set t1 10
	jump lessThan t0 t1
	jump always mainexit
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainexit:
	set a0 t0
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add t0 a0 1
	op add t0 t0 2
	set t1 10
	jump lessThan t0 t1
	jump always mainexit
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainexit:
	set a0 t0
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add t0 a0 1
	op add t0 t0 2
	set t1 10
	jump lessThan t0 t1
	jump always mainexit
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainexit:
	set a0 t0
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add t0 a0 1
	op add t0 t0 2
	set t1 10
	jump lessThan t0 t1 mainentry
	jump always mainexit
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainexit:
	set a0 t0
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add a0 a0 2
	set t0 10
	jump lessThan a0 t0 mainmiddle
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t1 a0 2
	set t0 10
	jump lessThan t1 t0 mainmiddle
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t1 a0 2
	set t0 10
	jump lessThan t1 t0 mainmiddle
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp -1
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	op lessThan t0 t0 10
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	op lessThan t0 t0 10
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	op add a0 a0 1
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 2
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra


time:3051279365
mainentry:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	jump always mainmiddle
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
mainmiddle:
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra
mid:
	set a0 t0
	op add t0 a0 1
	set t1 10
	jump lessThan t0 t1 mid
	set sp fp
	read fp cell fp
	set @counter ra


time:8528662610
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	op add t0 a0 16
	op add t4 t0 -1
	set t0 16
	op div t0 t4 t0
	op add t0 t0 1
	jump eq t3 zero "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	write t2 cell null
	set t1 t2
	op sll t3 zero 1
	op add t1 t1 t3
	set t3 3
	op add t1 t1 t3
	write zero cell t1
	set t1 t2
	set t3 t2
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t2 t3
	op sll t4 zero 1
	op add t2 t2 t4
	set t4 2
	op add t2 t2 t4
	read t2 cell t2
	op sll t4 t0 4
	set a1 zero
	op sll t4 t4 1
	op add a1 a1 t4
	set a2 a1
	op sll t4 zero 1
	op add a2 a2 t4
	set t4 3
	op add a2 a2 t4
	set t4 2
	op add a1 a1 t4
	set t4 -1
	op sll t4 t4 1
	op add a1 a1 t4
	set a0 a1
	op sll t4 zero 1
	op add a0 a0 t4
	set t4 2
	op add a0 a0 t4
	set t6 a1
	op sll t4 zero 1
	op add t6 t6 t4
	set t4 3
	op add t6 t6 t4
"?Mmalloc@@YAPEAXI@Z"21.i:
	set a3 t2
	op sll t4 zero 1
	op add a3 a3 t4
	set t4 3
	op add a3 a3 t4
	read t4 cell a3
	jump uge t4 t0 "?Mmalloc@@YAPEAXI@Z"27.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	set t3 t2
	jump eq t2 t5 "?Mmalloc@@YAPEAXI@Z"62.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t2 t3
	op sll t4 zero 1
	op add t2 t2 t4
	set t4 2
	op add t2 t2 t4
	read t2 cell t2
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump eq t4 t0 "?Mmalloc@@YAPEAXI@Z"33.i
	read t4 cell a3
	op sub t4 t4 t0
	write t4 cell a3
	op sll t4 t4 1
	op add t2 t2 t4
	set t4 t2
	op sll t5 zero 1
	op add t4 t4 t5
	set t5 3
	op add t4 t4 t5
	write t0 cell t4
	write t3 cell null
	set a0 t2
	set t0 2
	op add a0 a0 t0
	write t1 cell null
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t0 t2
	op sll t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t5 cell t0
	set t0 t3
	op sll t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	write t5 cell t0
	write t3 cell null
	set a0 t2
	set t0 2
	op add a0 a0 t0
	write t1 cell null
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell null
	write t0 cell a2
	set t2 t5
"?Mfree@@YAXPEAX@Z"8.i.i.i:
	op lessThan t4 a1 t2
	set t3 0
	jump notEqual t4 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t3 t3 1
	jump notEqual t3 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read a4 cell t6
	set t4 a1
	op sll t3 a4 1
	op add t4 t4 t3
	set a3 t2
	op sll t3 zero 1
	op add a3 a3 t3
	set t3 2
	op add a3 a3 t3
	read t3 cell a3
	jump eq t4 t3 "?Mfree@@YAXPEAX@Z"54.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write t3 cell a0
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t3 t2
	op sll t4 zero 1
	op add t3 t3 t4
	set t4 3
	op add t3 t3 t4
	read t4 cell t3
	op sll a4 t4 1
	op add t2 t2 a4
	jump eq t2 a1 "?Mfree@@YAXPEAX@Z"86.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a1 cell a3
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t5 cell null
	jump eq t5 zero "?Mmalloc@@YAPEAXI@Z"66.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t3 t5
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set a0 zero
	set t2 t5
	write t1 cell null
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t3 t2
	op sll a3 zero 1
	op add t3 t3 a3
	set a3 2
	op add t3 t3 a3
	read t3 cell t3
	op lessThan t3 a1 t3
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t3 t2
	op sll a3 zero 1
	op add t3 t3 a3
	set a3 2
	op add t3 t3 a3
	read t3 cell t3
	jump uge t2 t3 "?Mfree@@YAXPEAX@Z"27.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t2 t3
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"27.i.i.i:
	jump notEqual t4 zero "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"31.i.i.i:
	jump ult a1 t3 "?Mfree@@YAXPEAX@Z"43.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t4 t3
	op sll a5 zero 1
	op add t4 t4 a5
	set a5 3
	op add t4 t4 a5
	read t4 cell t4
	op add t4 a4 t4
	write t4 cell t6
	op sll t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	read t3 cell t3
	write t3 cell a0
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t2 cell t6
	op add t2 t4 t2
	write t2 cell t3
	read t2 cell a0
	write t2 cell a3
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
	.type	freep,@object
	.section	.bss
	.globl	freep
freep:
	.word	0
	.size	freep, 4

	.type	t2,@object
	.section	.bss
	.globl	base
base:
	.word	0
	.size	base, 4

	.type	heapcap,@object
	.section	.bss
	.globl	heapcap
heapcap:
	.word	0
	.size	heapcap, 4

	.type	llvm.global_ctors,@object
	.section	.bss
	.globl	llvm.global_ctors
llvm.global_ctors:
	.word	0
	.size	llvm.global_ctors, 4



time:8632855312
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub sp fp 1
	                              #start
	op add t0 a0 16
	op add t4 t0 -1
	set t0 16
	op div t0 t4 t0
	op add t0 t0 1
	jump eq t3 zero "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	                              #ra temp back
	                              #sp and fp
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	write t2 cell null
	set t1 t2
	op sll t3 zero 1
	op add t1 t1 t3
	set t3 3
	op add t1 t1 t3
	write zero cell t1
	set t1 t2
	set t3 t2
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t2 t3
	op sll t4 zero 1
	op add t2 t2 t4
	set t4 2
	op add t2 t2 t4
	read t2 cell t2
	op sll t4 t0 4
	set t6 zero
	op sll t4 t4 1
	op add t6 t6 t4
	set a2 t6
	op sll t4 zero 1
	op add a2 a2 t4
	set t4 3
	op add a2 a2 t4
	set t4 2
	op add t6 t6 t4
	set t4 -1
	op sll t4 t4 1
	op add t6 t6 t4
	set a0 t6
	op sll t4 zero 1
	op add a0 a0 t4
	set t4 2
	op add a0 a0 t4
	set a1 t6
	op sll t4 zero 1
	op add a1 a1 t4
	set t4 3
	op add a1 a1 t4
"?Mmalloc@@YAPEAXI@Z"21.i:
	set a3 t2
	op sll t4 zero 1
	op add a3 a3 t4
	set t4 3
	op add a3 a3 t4
	read t4 cell a3
	jump uge t4 t0 "?Mmalloc@@YAPEAXI@Z"27.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	set t3 t2
	jump eq t2 t5 "?Mmalloc@@YAPEAXI@Z"62.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t2 t3
	op sll t4 zero 1
	op add t2 t2 t4
	set t4 2
	op add t2 t2 t4
	read t2 cell t2
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump eq t4 t0 "?Mmalloc@@YAPEAXI@Z"33.i
	read t4 cell a3
	op sub t4 t4 t0
	write t4 cell a3
	op sll t4 t4 1
	op add t2 t2 t4
	set t4 t2
	op sll t5 zero 1
	op add t4 t4 t5
	set t5 3
	op add t4 t4 t5
	write t0 cell t4
	write t3 cell null
	set a0 t2
	set t0 2
	op add a0 a0 t0
	write t1 cell null
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t0 t2
	op sll t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t5 cell t0
	set t0 t3
	op sll t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	write t5 cell t0
	write t3 cell null
	set a0 t2
	set t0 2
	op add a0 a0 t0
	write t1 cell null
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell null
	write t0 cell a2
	set t2 t5
"?Mfree@@YAXPEAX@Z"8.i.i.i:
	op lessThan t4 t6 t2
	set t3 0
	jump notEqual t4 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t3 t3 1
	jump notEqual t3 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read a4 cell a1
	set t4 t6
	op sll t3 a4 1
	op add t4 t4 t3
	set a3 t2
	op sll t3 zero 1
	op add a3 a3 t3
	set t3 2
	op add a3 a3 t3
	read t3 cell a3
	jump eq t4 t3 "?Mfree@@YAXPEAX@Z"54.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write t3 cell a0
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t3 t2
	op sll t4 zero 1
	op add t3 t3 t4
	set t4 3
	op add t3 t3 t4
	read t4 cell t3
	op sll a4 t4 1
	op add t2 t2 a4
	jump eq t2 t6 "?Mfree@@YAXPEAX@Z"86.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write t6 cell a3
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t5 cell null
	jump eq t5 zero "?Mmalloc@@YAPEAXI@Z"66.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t3 t5
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set a0 zero
	set t2 t5
	write t1 cell null
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t3 t2
	op sll a3 zero 1
	op add t3 t3 a3
	set a3 2
	op add t3 t3 a3
	read t3 cell t3
	op lessThan t3 t6 t3
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t3 t2
	op sll a3 zero 1
	op add t3 t3 a3
	set a3 2
	op add t3 t3 a3
	read t3 cell t3
	jump uge t2 t3 "?Mfree@@YAXPEAX@Z"27.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t2 t3
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"27.i.i.i:
	jump notEqual t4 zero "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"31.i.i.i:
	jump ult t6 t3 "?Mfree@@YAXPEAX@Z"43.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t4 t3
	op sll a5 zero 1
	op add t4 t4 a5
	set a5 3
	op add t4 t4 a5
	read t4 cell t4
	op add t4 a4 t4
	write t4 cell a1
	op sll t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	read t3 cell t3
	write t3 cell a0
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t2 cell a1
	op add t2 t4 t2
	write t2 cell t3
	read t2 cell a0
	write t2 cell a3
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
	.type	freep,@object
	.section	.bss
	.globl	freep
freep:
	.word	0
	.size	freep, 4

	.type	t2,@object
	.section	.bss
	.globl	base
base:
	.word	0
	.size	base, 4

	.type	heapcap,@object
	.section	.bss
	.globl	heapcap
heapcap:
	.word	0
	.size	heapcap, 4

	.type	llvm.global_ctors,@object
	.section	.bss
	.globl	llvm.global_ctors
llvm.global_ctors:
	.word	0
	.size	llvm.global_ctors, 4

