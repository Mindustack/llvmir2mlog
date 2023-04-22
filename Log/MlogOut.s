

time:17347748035
write 65535.0 cell 0
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	set a7 s0
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
	set t1 a0
	op sub sp fp 1
	read t0 cell a6
	set t1 t1
	op add t1 t1 16
	op add t2 t1 -1
	set t1 16
	op div t1 t2 t1
	op add t1 t1 1
	set t3 t1
	read t1 cell a6
	set t4 t0
	set t1 t1
	jump eq t1 zero "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	read t0 cell a6
	set t0 t0
	op sll t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell a6
	set t4 t0
	read t1 cell a6
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t0 t1
	op sll t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t2 t3
	op sll t5 t2 4
	set t2 zero
	op sll t5 t5 1
	op add t2 t2 t5
	set a2 t2
	op sll t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t2 t2
	set t5 2
	op sll t5 t5 0
	op add t2 t2 t5
	set a3 t2
	set t2 -1
	op sll t2 t2 1
	op add a3 a3 t2
	set a4 a3
	op sll t2 zero 1
	op add a4 a4 t2
	set t2 2
	op add a4 a4 t2
	set a5 a3
	op sll t2 zero 1
	op add a5 a5 t2
	set t2 3
	op add a5 a5 t2
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op sll t2 zero 1
	op add t5 t5 t2
	set t2 3
	op add t5 t5 t2
	read t2 cell t5
	jump uge t2 t3 "?Mmalloc@@YAPEAXI@Z"27.i
	jump always "?Mmalloc@@YAPEAXI@Z"58.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump eq t2 t3 "?Mmalloc@@YAPEAXI@Z"33.i
	jump always "?Mmalloc@@YAPEAXI@Z"39.i
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t2 t0
	op sll t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t5 cell t2
	set t2 t1
	op sll t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	write t5 cell t2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"39.i:
	read t2 cell t5
	op sub t2 t2 t3
	write t2 cell t5
	set t2 t2
	set t0 t0
	op sll t2 t2 1
	op add t0 t0 t2
	set t2 t0
	op sll t5 zero 1
	op add t2 t2 t5
	set t5 3
	op add t2 t2 t5
	write t3 cell t2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"54.i:
	write t1 cell a6
	set t1 t0
	set t2 2
	op sll t2 t2 0
	op add t1 t1 t2
	set t1 t1
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t2 cell a6
	set t1 t0
	jump eq t0 t2 "?Mmalloc@@YAPEAXI@Z"62.i
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write t3 cell a2
	set t0 t2
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t2
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t2
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op sll t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"74.i:
	write t4 cell a6
	set a0 t1
	set a0 a0
	set s0 a7
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
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"8.i.i.i:
	op greaterThan t1 t0 a3
	set t5 0
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t6 t0
	op sll t5 zero 1
	op add t6 t6 t5
	set t5 2
	op add t6 t6 t5
	read t5 cell t6
	op lessThan t5 a3 t5
	set t5 t5
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t5 t5 1
	jump notEqual t5 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t6 t0
	op sll t5 zero 1
	op add t6 t6 t5
	set t5 2
	op add t6 t6 t5
	read t5 cell t6
	jump uge t0 t5 "?Mfree@@YAXPEAX@Z"27.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"27.i.i.i:
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"37.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"31.i.i.i
"?Mfree@@YAXPEAX@Z"31.i.i.i:
	jump ult a3 t5 "?Mfree@@YAXPEAX@Z"37.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"37.i.i.i:
	jump always "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t0 t5
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read a0 cell a5
	set t1 a0
	set t5 a3
	op sll t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op sll t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump eq t5 a1 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op sll t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op sll t6 zero 1
	op add t5 t5 t6
	set t6 2
	op add t5 t5 t6
	read t5 cell t5
	write t5 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write a1 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t6 t0
	op sll t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	set t5 t5
	set t0 t0
	op sll a0 t5 1
	op add t0 t0 a0
	jump eq t0 a3 "?Mfree@@YAXPEAX@Z"86.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"99.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t0 cell a5
	op add t0 t5 t0
	write t0 cell t6
	read t0 cell a4
	write t0 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a3 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t2 cell a6
	jump eq t2 zero "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i


time:17384892254
set fp 64
set sp fp
write 65535.0 cell 0
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	set a7 s0
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
	set t1 a0
	op sub sp fp 1
	read t0 cell a6
	set t1 t1
	op add t1 t1 16
	op add t2 t1 -1
	set t1 16
	op div t1 t2 t1
	op add t1 t1 1
	set t3 t1
	read t1 cell a6
	set t4 t0
	set t1 t1
	jump eq t1 zero "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	read t0 cell a6
	set t0 t0
	op sll t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell a6
	set t4 t0
	read t1 cell a6
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t0 t1
	op sll t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t2 t3
	op sll t5 t2 4
	set t2 zero
	op sll t5 t5 1
	op add t2 t2 t5
	set a2 t2
	op sll t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t2 t2
	set t5 2
	op sll t5 t5 0
	op add t2 t2 t5
	set a3 t2
	set t2 -1
	op sll t2 t2 1
	op add a3 a3 t2
	set a4 a3
	op sll t2 zero 1
	op add a4 a4 t2
	set t2 2
	op add a4 a4 t2
	set a5 a3
	op sll t2 zero 1
	op add a5 a5 t2
	set t2 3
	op add a5 a5 t2
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op sll t2 zero 1
	op add t5 t5 t2
	set t2 3
	op add t5 t5 t2
	read t2 cell t5
	jump uge t2 t3 "?Mmalloc@@YAPEAXI@Z"27.i
	jump always "?Mmalloc@@YAPEAXI@Z"58.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump eq t2 t3 "?Mmalloc@@YAPEAXI@Z"33.i
	jump always "?Mmalloc@@YAPEAXI@Z"39.i
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t2 t0
	op sll t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t5 cell t2
	set t2 t1
	op sll t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	write t5 cell t2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"39.i:
	read t2 cell t5
	op sub t2 t2 t3
	write t2 cell t5
	set t2 t2
	set t0 t0
	op sll t2 t2 1
	op add t0 t0 t2
	set t2 t0
	op sll t5 zero 1
	op add t2 t2 t5
	set t5 3
	op add t2 t2 t5
	write t3 cell t2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"54.i:
	write t1 cell a6
	set t1 t0
	set t2 2
	op sll t2 t2 0
	op add t1 t1 t2
	set t1 t1
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t2 cell a6
	set t1 t0
	jump eq t0 t2 "?Mmalloc@@YAPEAXI@Z"62.i
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write t3 cell a2
	set t0 t2
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t2
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t2
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op sll t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"74.i:
	write t4 cell a6
	set a0 t1
	set a0 a0
	set s0 a7
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
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"8.i.i.i:
	op greaterThan t1 t0 a3
	set t5 0
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t6 t0
	op sll t5 zero 1
	op add t6 t6 t5
	set t5 2
	op add t6 t6 t5
	read t5 cell t6
	op lessThan t5 a3 t5
	set t5 t5
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t5 t5 1
	jump notEqual t5 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t6 t0
	op sll t5 zero 1
	op add t6 t6 t5
	set t5 2
	op add t6 t6 t5
	read t5 cell t6
	jump uge t0 t5 "?Mfree@@YAXPEAX@Z"27.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"27.i.i.i:
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"37.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"31.i.i.i
"?Mfree@@YAXPEAX@Z"31.i.i.i:
	jump ult a3 t5 "?Mfree@@YAXPEAX@Z"37.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"37.i.i.i:
	jump always "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t0 t5
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read a0 cell a5
	set t1 a0
	set t5 a3
	op sll t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op sll t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump eq t5 a1 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op sll t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op sll t6 zero 1
	op add t5 t5 t6
	set t6 2
	op add t5 t5 t6
	read t5 cell t5
	write t5 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write a1 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t6 t0
	op sll t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	set t5 t5
	set t0 t0
	op sll a0 t5 1
	op add t0 t0 a0
	jump eq t0 a3 "?Mfree@@YAXPEAX@Z"86.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"99.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t0 cell a5
	op add t0 t5 t0
	write t0 cell t6
	read t0 cell a4
	write t0 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a3 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t2 cell a6
	jump eq t2 zero "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i


time:17549392973
set fp 64
set sp fp
write 65535.0 cell 0
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	set a7 s0
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
	set t1 a0
	op sub sp fp 1
	read t0 cell a6
	set t1 t1
	op add t1 t1 16
	op add t2 t1 -1
	set t1 16
	op div t1 t2 t1
	op add t1 t1 1
	set a0 t1
	read t1 cell a6
	set a1 t0
	set t1 t1
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	read t0 cell a6
	set t0 t0
	op sll t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell a6
	set a1 t0
	read t1 cell a6
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t0 t1
	op sll t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t2 a0
	op sll t3 t2 4
	set t2 zero
	op sll t3 t3 1
	op add t2 t2 t3
	set a4 t2
	op sll t3 zero 1
	op add a4 a4 t3
	set t3 3
	op add a4 a4 t3
	set t2 t2
	set t3 2
	op sll t3 t3 0
	op add t2 t2 t3
	set a5 t2
	set t2 -1
	op sll t2 t2 1
	op add a5 a5 t2
	set a3 a5
	op sll t2 zero 1
	op add a3 a3 t2
	set t2 2
	op add a3 a3 t2
	set a2 a5
	op sll t2 zero 1
	op add a2 a2 t2
	set t2 3
	op add a2 a2 t2
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t3 t0
	op sll t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	jump uge t2 a0 "?Mmalloc@@YAPEAXI@Z"27.i
	jump always "?Mmalloc@@YAPEAXI@Z"58.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal a0 t2 "?Mmalloc@@YAPEAXI@Z"33.i
	jump always "?Mmalloc@@YAPEAXI@Z"39.i
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t2 t0
	op sll t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t4 cell t2
	set t2 t1
	op sll t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	write t4 cell t2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"39.i:
	read t2 cell t3
	op sub t2 t2 a0
	write t2 cell t3
	set t2 t2
	set t0 t0
	op sll t2 t2 1
	op add t0 t0 t2
	set t2 t0
	op sll t3 zero 1
	op add t2 t2 t3
	set t3 3
	op add t2 t2 t3
	write a0 cell t2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"54.i:
	write t1 cell a6
	set t1 t0
	set t2 2
	op sll t2 t2 0
	op add t1 t1 t2
	set t1 t1
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t6 cell a6
	set t1 t0
	jump equal t6 t0 "?Mmalloc@@YAPEAXI@Z"62.i
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write a0 cell a4
	set t0 t6
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t6
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t6
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op sll t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"74.i:
	write a1 cell a6
	set a0 t1
	set a0 a0
	set s0 a7
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
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"8.i.i.i:
	op greaterThan t1 t0 a5
	set t2 0
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t3 t0
	op sll t2 zero 1
	op add t3 t3 t2
	set t2 2
	op add t3 t3 t2
	read t2 cell t3
	op lessThan t2 a5 t2
	set t2 t2
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t2 t2 1
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t3 t0
	op sll t2 zero 1
	op add t3 t3 t2
	set t2 2
	op add t3 t3 t2
	read t2 cell t3
	jump uge t0 t2 "?Mfree@@YAXPEAX@Z"27.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"27.i.i.i:
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"37.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"31.i.i.i
"?Mfree@@YAXPEAX@Z"31.i.i.i:
	jump ult a5 t2 "?Mfree@@YAXPEAX@Z"37.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"37.i.i.i:
	jump always "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t0 t2
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read t4 cell a2
	set t1 t4
	set t2 a5
	op sll t1 t1 1
	op add t2 t2 t1
	set t1 t0
	op sll t3 zero 1
	op add t1 t1 t3
	set t3 2
	op add t1 t1 t3
	read t5 cell t1
	jump equal t5 t2 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t3 t5
	op sll t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	op add t2 t4 t2
	write t2 cell a2
	set t2 t5
	op sll t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t2 cell t2
	write t2 cell a3
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write t5 cell a3
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t3 t0
	op sll t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	set t2 t2
	set t0 t0
	op sll t4 t2 1
	op add t0 t0 t4
	jump equal a5 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"99.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t0 cell a2
	op add t0 t2 t0
	write t0 cell t3
	read t0 cell a3
	write t0 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a5 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t6 cell a6
	jump equal zero t6 "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i
