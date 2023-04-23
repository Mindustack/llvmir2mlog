
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


time:5705992078
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvarfreep

		#globlvarbase

		#globlvarheapcap

		#globlvarllvm.global_ctors


		# -- Start functionmain
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
	op shl t1 zero 1
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
	op shl t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t2 a0
	op shl t3 t2 4
	set t2 zero
	op shl t3 t3 1
	op add t2 t2 t3
	set a2 t2
	op shl t3 zero 1
	op add a2 a2 t3
	set t3 3
	op add a2 a2 t3
	set t2 t2
	set t3 2
	op shl t3 t3 0
	op add t2 t2 t3
	set a3 t2
	set t2 -1
	op shl t2 t2 1
	op add a3 a3 t2
	set a4 a3
	op shl t2 zero 1
	op add a4 a4 t2
	set t2 3
	op add a4 a4 t2
	set a5 a3
	op shl t2 zero 1
	op add a5 a5 t2
	set t2 2
	op add a5 a5 t2
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t3 t0
	op shl t2 zero 1
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
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t4 cell t2
	set t2 t1
	op shl t3 zero 1
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
	op shl t2 t2 1
	op add t0 t0 t2
	set t2 t0
	op shl t3 zero 1
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
	op shl t2 t2 0
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
	write a0 cell a2
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
	op shl t2 zero 1
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
	op greaterThan t1 t0 a3
	set t2 0
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t3 t0
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 2
	op add t3 t3 t2
	read t2 cell t3
	op lessThan t2 a3 t2
	set t2 t2
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t2 t2 1
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t3 t0
	op shl t2 zero 1
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
	jump ult a3 t2 "?Mfree@@YAXPEAX@Z"37.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"37.i.i.i:
	jump always "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t0 t2
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read t4 cell a4
	set t1 t4
	set t2 a3
	op shl t1 t1 1
	op add t2 t2 t1
	set t1 t0
	op shl t3 zero 1
	op add t1 t1 t3
	set t3 2
	op add t1 t1 t3
	read t5 cell t1
	jump equal t5 t2 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t3 t5
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	op add t2 t4 t2
	write t2 cell a4
	set t2 t5
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t2 cell t2
	write t2 cell a5
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write t5 cell a5
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t3 t0
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	set t2 t2
	set t0 t0
	op shl t4 t2 1
	op add t0 t0 t4
	jump equal a3 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"99.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t0 cell a4
	op add t0 t2 t0
	write t0 cell t3
	read t0 cell a5
	write t0 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a3 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t6 cell a6
	jump equal zero t6 "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i
		# -- End function


time:5801744362
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	op add tf -1 fp
	write ra cell tf
	set a0 a0
	op sub sp fp 2
	set a0 a0
	op add ra @counter 2
	jump always "?Mmalloc@@YAPEAXI@Z"0
	set a0 a0
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
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function
		# -- Start function "?Mfree@@YAXPEAX@Z"
"?Mfree@@YAXPEAX@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	set a0 a0
	op sub sp fp 1
	read t3 cell freep
	set a0 a0
	set t0 -1
	op shl t0 t0 1
	op add a0 a0 t0
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8
	op add sp sp 1
"?Mfree@@YAXPEAX@Z"8:
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	jump always "?Mfree@@YAXPEAX@Z"18
"?Mfree@@YAXPEAX@Z"12:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	op lessThan t1 a0 t1
	set t1 t1
	jump always "?Mfree@@YAXPEAX@Z"18
"?Mfree@@YAXPEAX@Z"18:
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	jump always "?Mfree@@YAXPEAX@Z"43
"?Mfree@@YAXPEAX@Z"21:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	jump uge t0 t1 "?Mfree@@YAXPEAX@Z"27
	jump always "?Mfree@@YAXPEAX@Z"38
"?Mfree@@YAXPEAX@Z"27:
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"37
	jump always "?Mfree@@YAXPEAX@Z"31
"?Mfree@@YAXPEAX@Z"31:
	jump ult a0 t1 "?Mfree@@YAXPEAX@Z"37
	jump always "?Mfree@@YAXPEAX@Z"38
"?Mfree@@YAXPEAX@Z"37:
	jump always "?Mfree@@YAXPEAX@Z"43
"?Mfree@@YAXPEAX@Z"38:
	set t0 t1
	jump always "?Mfree@@YAXPEAX@Z"8
"?Mfree@@YAXPEAX@Z"43:
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set t1 t1
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	jump always "?Mfree@@YAXPEAX@Z"71
"?Mfree@@YAXPEAX@Z"54:
	set t2 t2
	op shl a1 zero 1
	op add t2 t2 a1
	set a1 3
	op add t2 t2 a1
	read t2 cell t2
	op add t1 t1 t2
	write t1 cell t6
	read t1 cell t5
	set t1 t1
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a1 cell t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write a1 cell t1
	jump always "?Mfree@@YAXPEAX@Z"77
"?Mfree@@YAXPEAX@Z"71:
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	jump always "?Mfree@@YAXPEAX@Z"77
"?Mfree@@YAXPEAX@Z"77:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	set t2 t2
	set t0 t0
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	jump always "?Mfree@@YAXPEAX@Z"99
"?Mfree@@YAXPEAX@Z"86:
	read t0 cell t6
	op add t0 t2 t0
	write t0 cell t1
	set a0 a0
	op shl t0 zero 1
	op add a0 a0 t0
	set t0 2
	op add a0 a0 t0
	read t0 cell a0
	write t0 cell t5
	jump always "?Mfree@@YAXPEAX@Z"103
"?Mfree@@YAXPEAX@Z"99:
	write a0 cell t5
	jump always "?Mfree@@YAXPEAX@Z"103
"?Mfree@@YAXPEAX@Z"103:
	write t3 cell freep
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
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function
		# -- Start function "?Mmalloc@@YAPEAXI@Z"
"?Mmalloc@@YAPEAXI@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -3 fp
	write s0 cell tf
	op add tf -2 fp
	write s1 cell tf
	op add tf -1 fp
	write s2 cell tf
	set s3 s3
	set s4 s4
	set s5 s5
	set s6 s6
	set s7 s7
	set s8 s8
	set s9 s9
	set s10 s10
	set s11 s11
	op add tf -4 fp
	write ra cell tf
	set a0 a0
	op sub sp fp 5
	read t1 cell s2
	set a0 a0
	op add t0 a0 16
	op add t2 t0 -1
	set t0 16
	op div t0 t2 t0
	op add t0 t0 1
	set s0 t0
	read t0 cell freep
	set s1 t1
	set t0 t0
	jump equal zero t0 "?Mmalloc@@YAPEAXI@Z"16
	jump always "?Mmalloc@@YAPEAXI@Z"17
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16:
	read t0 cell s2
	write t0 cell freep
	read t0 cell s2
	set t0 t0
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell s2
	set s1 t0
	read t0 cell s2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"17
"?Mmalloc@@YAPEAXI@Z"17:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	set a0 a0
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"21:
	set t2 a0
	op shl t1 zero 1
	op add t2 t2 t1
	set t1 3
	op add t2 t2 t1
	read t1 cell t2
	jump uge t1 s0 "?Mmalloc@@YAPEAXI@Z"27
	jump always "?Mmalloc@@YAPEAXI@Z"58
"?Mmalloc@@YAPEAXI@Z"27:
	jump equal s0 t1 "?Mmalloc@@YAPEAXI@Z"33
	jump always "?Mmalloc@@YAPEAXI@Z"39
"?Mmalloc@@YAPEAXI@Z"33:
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read t3 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write t3 cell t1
	set a0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"54
"?Mmalloc@@YAPEAXI@Z"39:
	read t1 cell t2
	op sub t1 t1 s0
	write t1 cell t2
	set t1 t1
	set a0 a0
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write s0 cell t1
	set a0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"54
"?Mmalloc@@YAPEAXI@Z"54:
	write t0 cell freep
	set t0 a0
	set t1 2
	op shl t1 t1 0
	op add t0 t0 t1
	set t0 t0
	set a0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"74
"?Mmalloc@@YAPEAXI@Z"58:
	read t1 cell freep
	set t0 a0
	jump equal t1 a0 "?Mmalloc@@YAPEAXI@Z"62
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"62:
	set a0 s0
	op add ra @counter 2
	jump always "?Mmorecore@@YAPEATheader@@I@Z"0
	set a0 a0
	jump equal zero a0 "?Mmalloc@@YAPEAXI@Z"66
	jump always "?Mmalloc@@YAPEAXI@Z"67
"?Mmalloc@@YAPEAXI@Z"66:
	set t0 zero
	set a0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"74
"?Mmalloc@@YAPEAXI@Z"67:
	set t0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"68:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	set a0 a0
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"74:
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	set s3 s3
	set s4 s4
	set s5 s5
	set s6 s6
	set s7 s7
	set s8 s8
	set s9 s9
	set s10 s10
	set s11 s11
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function
		# -- Start function "?Mmorecore@@YAPEATheader@@I@Z"
"?Mmorecore@@YAPEATheader@@I@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	op add tf -1 fp
	write ra cell tf
	set t0 a0
	op sub sp fp 3
	write zero cell t0
	set t0 t0
	op shl t1 t0 4
	set a0 zero
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write t0 cell t1
	set a0 a0
	set t0 2
	op shl t0 t0 0
	op add a0 a0 t0
	set a0 a0
	op add ra @counter 2
	jump always "?Mfree@@YAXPEAX@Z"0
	op add tf -2 fp
		read t0 cell tf
	read a0 cell t0
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
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function
		# -- Start function "??__Eheapcap@@YAXXZ"
"??__Eheapcap@@YAXXZ"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	op sub sp fp 1
	write zero cell t0
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
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function
		# -- Start function _GLOBAL__sub_I_test4.cpp
_GLOBAL__sub_I_test4.cpp0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "??__Eheapcap@@YAXXZ"0
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
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function


time:5831903495
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	op add tf -1 fp
	write ra cell tf
	set a0 a0
	op sub sp fp 2
	set a0 a0
	op add ra @counter 2
	jump always "?Mmalloc@@YAPEAXI@Z"0
	set a0 a0
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
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "?Mfree@@YAXPEAX@Z"
"?Mfree@@YAXPEAX@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	set a0 a0
	op sub sp fp 1
	read t3 cell freep
	set a0 a0
	set t0 -1
	op shl t0 t0 1
	op add a0 a0 t0
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8
	op add sp sp 1
"?Mfree@@YAXPEAX@Z"8:
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	jump always "?Mfree@@YAXPEAX@Z"18
"?Mfree@@YAXPEAX@Z"12:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	op lessThan t1 a0 t1
	set t1 t1
	jump always "?Mfree@@YAXPEAX@Z"18
"?Mfree@@YAXPEAX@Z"18:
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	jump always "?Mfree@@YAXPEAX@Z"43
"?Mfree@@YAXPEAX@Z"21:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	jump uge t0 t1 "?Mfree@@YAXPEAX@Z"27
	jump always "?Mfree@@YAXPEAX@Z"38
"?Mfree@@YAXPEAX@Z"27:
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"37
	jump always "?Mfree@@YAXPEAX@Z"31
"?Mfree@@YAXPEAX@Z"31:
	jump ult a0 t1 "?Mfree@@YAXPEAX@Z"37
	jump always "?Mfree@@YAXPEAX@Z"38
"?Mfree@@YAXPEAX@Z"37:
	jump always "?Mfree@@YAXPEAX@Z"43
"?Mfree@@YAXPEAX@Z"38:
	set t0 t1
	jump always "?Mfree@@YAXPEAX@Z"8
"?Mfree@@YAXPEAX@Z"43:
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set t1 t1
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	jump always "?Mfree@@YAXPEAX@Z"71
"?Mfree@@YAXPEAX@Z"54:
	set t2 t2
	op shl a1 zero 1
	op add t2 t2 a1
	set a1 3
	op add t2 t2 a1
	read t2 cell t2
	op add t1 t1 t2
	write t1 cell t6
	read t1 cell t5
	set t1 t1
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a1 cell t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write a1 cell t1
	jump always "?Mfree@@YAXPEAX@Z"77
"?Mfree@@YAXPEAX@Z"71:
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	jump always "?Mfree@@YAXPEAX@Z"77
"?Mfree@@YAXPEAX@Z"77:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	set t2 t2
	set t0 t0
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	jump always "?Mfree@@YAXPEAX@Z"99
"?Mfree@@YAXPEAX@Z"86:
	read t0 cell t6
	op add t0 t2 t0
	write t0 cell t1
	set a0 a0
	op shl t0 zero 1
	op add a0 a0 t0
	set t0 2
	op add a0 a0 t0
	read t0 cell a0
	write t0 cell t5
	jump always "?Mfree@@YAXPEAX@Z"103
"?Mfree@@YAXPEAX@Z"99:
	write a0 cell t5
	jump always "?Mfree@@YAXPEAX@Z"103
"?Mfree@@YAXPEAX@Z"103:
	write t3 cell freep
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
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmalloc@@YAPEAXI@Z"
"?Mmalloc@@YAPEAXI@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -3 fp
	write s0 cell tf
	op add tf -2 fp
	write s1 cell tf
	op add tf -1 fp
	write s2 cell tf
	set s3 s3
	set s4 s4
	set s5 s5
	set s6 s6
	set s7 s7
	set s8 s8
	set s9 s9
	set s10 s10
	set s11 s11
	op add tf -4 fp
	write ra cell tf
	set a0 a0
	op sub sp fp 5
	read t1 cell s2
	set a0 a0
	op add t0 a0 16
	op add t2 t0 -1
	set t0 16
	op div t0 t2 t0
	op add t0 t0 1
	set s0 t0
	read t0 cell freep
	set s1 t1
	set t0 t0
	jump equal zero t0 "?Mmalloc@@YAPEAXI@Z"16
	jump always "?Mmalloc@@YAPEAXI@Z"17
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16:
	read t0 cell s2
	write t0 cell freep
	read t0 cell s2
	set t0 t0
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell s2
	set s1 t0
	read t0 cell s2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"17
"?Mmalloc@@YAPEAXI@Z"17:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	set a0 a0
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"21:
	set t2 a0
	op shl t1 zero 1
	op add t2 t2 t1
	set t1 3
	op add t2 t2 t1
	read t1 cell t2
	jump uge t1 s0 "?Mmalloc@@YAPEAXI@Z"27
	jump always "?Mmalloc@@YAPEAXI@Z"58
"?Mmalloc@@YAPEAXI@Z"27:
	jump equal s0 t1 "?Mmalloc@@YAPEAXI@Z"33
	jump always "?Mmalloc@@YAPEAXI@Z"39
"?Mmalloc@@YAPEAXI@Z"33:
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read t3 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write t3 cell t1
	set a0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"54
"?Mmalloc@@YAPEAXI@Z"39:
	read t1 cell t2
	op sub t1 t1 s0
	write t1 cell t2
	set t1 t1
	set a0 a0
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write s0 cell t1
	set a0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"54
"?Mmalloc@@YAPEAXI@Z"54:
	write t0 cell freep
	set t0 a0
	set t1 2
	op shl t1 t1 0
	op add t0 t0 t1
	set t0 t0
	set a0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"74
"?Mmalloc@@YAPEAXI@Z"58:
	read t1 cell freep
	set t0 a0
	jump equal t1 a0 "?Mmalloc@@YAPEAXI@Z"62
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"62:
	set a0 s0
	op add ra @counter 2
	jump always "?Mmorecore@@YAPEATheader@@I@Z"0
	set a0 a0
	jump equal zero a0 "?Mmalloc@@YAPEAXI@Z"66
	jump always "?Mmalloc@@YAPEAXI@Z"67
"?Mmalloc@@YAPEAXI@Z"66:
	set t0 zero
	set a0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"74
"?Mmalloc@@YAPEAXI@Z"67:
	set t0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"68:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	set a0 a0
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"74:
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	set s3 s3
	set s4 s4
	set s5 s5
	set s6 s6
	set s7 s7
	set s8 s8
	set s9 s9
	set s10 s10
	set s11 s11
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmorecore@@YAPEATheader@@I@Z"
"?Mmorecore@@YAPEATheader@@I@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	op add tf -1 fp
	write ra cell tf
	set t0 a0
	op sub sp fp 3
	write zero cell t0
	set t0 t0
	op shl t1 t0 4
	set a0 zero
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write t0 cell t1
	set a0 a0
	set t0 2
	op shl t0 t0 0
	op add a0 a0 t0
	set a0 a0
	op add ra @counter 2
	jump always "?Mfree@@YAXPEAX@Z"0
	op add tf -2 fp
		read t0 cell tf
	read a0 cell t0
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
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "??__Eheapcap@@YAXXZ"
"??__Eheapcap@@YAXXZ"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	op sub sp fp 1
	write zero cell t0
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
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function _GLOBAL__sub_I_test4.cpp
_GLOBAL__sub_I_test4.cpp0:
	op add sp sp -1
	write fp cell sp
	set fp sp
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
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "??__Eheapcap@@YAXXZ"0
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
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function



time:5867181048
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
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
	set t2 t0
	set t1 t1
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	read t0 cell a6
	set t0 t0
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell a6
	set t2 t0
	read t1 cell a6
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t0 t1
	op shl t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t0 cell t0
	set t3 t3
	op shl t5 t3 4
	set t4 zero
	op shl t5 t5 1
	op add t4 t4 t5
	set a2 t4
	op shl t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t4 t4
	set t5 2
	op shl t5 t5 0
	op add t4 t4 t5
	set a3 t4
	set t4 -1
	op shl t4 t4 1
	op add a3 a3 t4
	set a4 a3
	op shl t4 zero 1
	op add a4 a4 t4
	set t4 2
	op add a4 a4 t4
	set a5 a3
	op shl t4 zero 1
	op add a5 a5 t4
	set t4 3
	op add a5 a5 t4
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op shl t4 zero 1
	op add t5 t5 t4
	set t4 3
	op add t5 t5 t4
	read t4 cell t5
	jump uge t4 t3 "?Mmalloc@@YAPEAXI@Z"27.i
	jump always "?Mmalloc@@YAPEAXI@Z"58.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal t3 t4 "?Mmalloc@@YAPEAXI@Z"33.i
	jump always "?Mmalloc@@YAPEAXI@Z"39.i
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t3 t0
	op shl t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	read t5 cell t3
	set t3 t1
	op shl t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	write t5 cell t3
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"39.i:
	read t4 cell t5
	op sub t4 t4 t3
	write t4 cell t5
	set t4 t4
	set t0 t0
	op shl t4 t4 1
	op add t0 t0 t4
	set t4 t0
	op shl t5 zero 1
	op add t4 t4 t5
	set t5 3
	op add t4 t4 t5
	write t3 cell t4
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"54.i:
	write t1 cell a6
	set t1 t0
	set t3 2
	op shl t3 t3 0
	op add t1 t1 t3
	set t1 t1
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t4 cell a6
	set t1 t0
	jump equal t4 t0 "?Mmalloc@@YAPEAXI@Z"62.i
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write t3 cell a2
	set t0 t4
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t4
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t4
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op shl t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t0 cell t0
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"74.i:
	write t2 cell a6
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
	op shl t5 zero 1
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
	op shl t5 zero 1
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
	op shl t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op shl t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump equal a1 t5 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op shl t6 zero 1
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
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	set t5 t5
	set t0 t0
	op shl a0 t5 1
	op add t0 t0 a0
	jump equal a3 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
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
	write t4 cell a6
	jump equal zero t4 "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i
		# -- End function



time:6072560374
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
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
	set t2 t0
	set t1 t1
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	read t0 cell a6
	set t0 t0
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell a6
	set t2 t0
	read t1 cell a6
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t0 t1
	op shl t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t0 cell t0
	set t3 t3
	op shl t5 t3 4
	set t4 zero
	op shl t5 t5 1
	op add t4 t4 t5
	set a2 t4
	op shl t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t4 t4
	set t5 2
	op shl t5 t5 0
	op add t4 t4 t5
	set a3 t4
	set t4 -1
	op shl t4 t4 1
	op add a3 a3 t4
	set a4 a3
	op shl t4 zero 1
	op add a4 a4 t4
	set t4 2
	op add a4 a4 t4
	set a5 a3
	op shl t4 zero 1
	op add a5 a5 t4
	set t4 3
	op add a5 a5 t4
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op shl t4 zero 1
	op add t5 t5 t4
	set t4 3
	op add t5 t5 t4
	read t4 cell t5
	jump uge t4 t3 "?Mmalloc@@YAPEAXI@Z"27.i
	jump always "?Mmalloc@@YAPEAXI@Z"58.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal t3 t4 "?Mmalloc@@YAPEAXI@Z"33.i
	jump always "?Mmalloc@@YAPEAXI@Z"39.i
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t3 t0
	op shl t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	read t5 cell t3
	set t3 t1
	op shl t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	write t5 cell t3
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"39.i:
	read t4 cell t5
	op sub t4 t4 t3
	write t4 cell t5
	set t4 t4
	set t0 t0
	op shl t4 t4 1
	op add t0 t0 t4
	set t4 t0
	op shl t5 zero 1
	op add t4 t4 t5
	set t5 3
	op add t4 t4 t5
	write t3 cell t4
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"54.i:
	write t1 cell a6
	set t1 t0
	set t3 2
	op shl t3 t3 0
	op add t1 t1 t3
	set t1 t1
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t4 cell a6
	set t1 t0
	jump equal t4 t0 "?Mmalloc@@YAPEAXI@Z"62.i
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write t3 cell a2
	set t0 t4
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t4
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t4
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op shl t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t0 cell t0
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"74.i:
	write t2 cell a6
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
	op shl t5 zero 1
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
	op shl t5 zero 1
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
	op shl t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op shl t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump equal a1 t5 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op shl t6 zero 1
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
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	set t5 t5
	set t0 t0
	op shl a0 t5 1
	op add t0 t0 a0
	jump equal a3 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
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
	write t4 cell a6
	jump equal zero t4 "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i
		# -- End function



time:6321479926
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
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
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	read t0 cell a6
	set t0 t0
	op shl t1 zero 1
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
	op shl t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t2 t3
	op shl t5 t2 4
	set t2 zero
	op shl t5 t5 1
	op add t2 t2 t5
	set a2 t2
	op shl t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t2 t2
	set t5 2
	op shl t5 t5 0
	op add t2 t2 t5
	set a3 t2
	set t2 -1
	op shl t2 t2 1
	op add a3 a3 t2
	set a4 a3
	op shl t2 zero 1
	op add a4 a4 t2
	set t2 2
	op add a4 a4 t2
	set a5 a3
	op shl t2 zero 1
	op add a5 a5 t2
	set t2 3
	op add a5 a5 t2
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 3
	op add t5 t5 t2
	read t2 cell t5
	jump uge t2 t3 "?Mmalloc@@YAPEAXI@Z"27.i
	jump always "?Mmalloc@@YAPEAXI@Z"58.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal t3 t2 "?Mmalloc@@YAPEAXI@Z"33.i
	jump always "?Mmalloc@@YAPEAXI@Z"39.i
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t2 t0
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t5 cell t2
	set t2 t1
	op shl t3 zero 1
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
	op shl t2 t2 1
	op add t0 t0 t2
	set t2 t0
	op shl t5 zero 1
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
	op shl t2 t2 0
	op add t1 t1 t2
	set t1 t1
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t2 cell a6
	set t1 t0
	jump equal t2 t0 "?Mmalloc@@YAPEAXI@Z"62.i
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
	op shl t2 zero 1
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
	op shl t5 zero 1
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
	op shl t5 zero 1
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
	op shl t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op shl t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump equal a1 t5 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op shl t6 zero 1
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
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	set t5 t5
	set t0 t0
	op shl a0 t5 1
	op add t0 t0 a0
	jump equal a3 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
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
	jump equal zero t2 "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i
		# -- End function



time:6540176406
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
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
	op shl t1 zero 1
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
	op shl t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t2 a0
	op shl t3 t2 4
	set t2 zero
	op shl t3 t3 1
	op add t2 t2 t3
	set a3 t2
	op shl t3 zero 1
	op add a3 a3 t3
	set t3 3
	op add a3 a3 t3
	set t2 t2
	set t3 2
	op shl t3 t3 0
	op add t2 t2 t3
	set a5 t2
	set t2 -1
	op shl t2 t2 1
	op add a5 a5 t2
	set a4 a5
	op shl t2 zero 1
	op add a4 a4 t2
	set t2 2
	op add a4 a4 t2
	set a2 a5
	op shl t2 zero 1
	op add a2 a2 t2
	set t2 3
	op add a2 a2 t2
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t3 t0
	op shl t2 zero 1
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
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t4 cell t2
	set t2 t1
	op shl t3 zero 1
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
	op shl t2 t2 1
	op add t0 t0 t2
	set t2 t0
	op shl t3 zero 1
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
	op shl t2 t2 0
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
	write a0 cell a3
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
	op shl t2 zero 1
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
	op shl t2 zero 1
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
	op shl t2 zero 1
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
	op shl t1 t1 1
	op add t2 t2 t1
	set t1 t0
	op shl t3 zero 1
	op add t1 t1 t3
	set t3 2
	op add t1 t1 t3
	read t5 cell t1
	jump equal t5 t2 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t3 t5
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	op add t2 t4 t2
	write t2 cell a2
	set t2 t5
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t2 cell t2
	write t2 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write t5 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t3 t0
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	set t2 t2
	set t0 t0
	op shl t4 t2 1
	op add t0 t0 t4
	jump equal a5 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"99.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t0 cell a2
	op add t0 t2 t0
	write t0 cell t3
	read t0 cell a4
	write t0 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a5 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t6 cell a6
	jump equal zero t6 "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i
		# -- End function



time:6729735618
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
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
	set t2 t1
	read t1 cell a6
	set t4 t0
	set t1 t1
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	read t0 cell a6
	set t0 t0
	op shl t1 zero 1
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
	op shl t3 zero 1
	op add t0 t0 t3
	set t3 2
	op add t0 t0 t3
	read t0 cell t0
	set t2 t2
	op shl t5 t2 4
	set t3 zero
	op shl t5 t5 1
	op add t3 t3 t5
	set a2 t3
	op shl t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t3 t3
	set t5 2
	op shl t5 t5 0
	op add t3 t3 t5
	set a3 t3
	set t3 -1
	op shl t3 t3 1
	op add a3 a3 t3
	set a4 a3
	op shl t3 zero 1
	op add a4 a4 t3
	set t3 2
	op add a4 a4 t3
	set a5 a3
	op shl t3 zero 1
	op add a5 a5 t3
	set t3 3
	op add a5 a5 t3
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op shl t3 zero 1
	op add t5 t5 t3
	set t3 3
	op add t5 t5 t3
	read t3 cell t5
	jump uge t3 t2 "?Mmalloc@@YAPEAXI@Z"27.i
	jump always "?Mmalloc@@YAPEAXI@Z"58.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal t2 t3 "?Mmalloc@@YAPEAXI@Z"33.i
	jump always "?Mmalloc@@YAPEAXI@Z"39.i
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t2 t0
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t5 cell t2
	set t2 t1
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	write t5 cell t2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"39.i:
	read t3 cell t5
	op sub t3 t3 t2
	write t3 cell t5
	set t3 t3
	set t0 t0
	op shl t3 t3 1
	op add t0 t0 t3
	set t3 t0
	op shl t5 zero 1
	op add t3 t3 t5
	set t5 3
	op add t3 t3 t5
	write t2 cell t3
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"54.i:
	write t1 cell a6
	set t1 t0
	set t2 2
	op shl t2 t2 0
	op add t1 t1 t2
	set t1 t1
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t3 cell a6
	set t1 t0
	jump equal t3 t0 "?Mmalloc@@YAPEAXI@Z"62.i
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write t2 cell a2
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t3
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t3
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op shl t3 zero 1
	op add t0 t0 t3
	set t3 2
	op add t0 t0 t3
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
	op shl t5 zero 1
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
	op shl t5 zero 1
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
	op shl t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op shl t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump equal a1 t5 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op shl t6 zero 1
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
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	set t5 t5
	set t0 t0
	op shl a0 t5 1
	op add t0 t0 a0
	jump equal a3 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
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
	write t3 cell a6
	jump equal zero t3 "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i
		# -- End function



time:6737263976
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
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
	set t2 t1
	read t1 cell a6
	set t4 t0
	set t1 t1
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	read t0 cell a6
	set t0 t0
	op shl t1 zero 1
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
	op shl t3 zero 1
	op add t0 t0 t3
	set t3 2
	op add t0 t0 t3
	read t0 cell t0
	set t2 t2
	op shl t5 t2 4
	set t3 zero
	op shl t5 t5 1
	op add t3 t3 t5
	set a2 t3
	op shl t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t3 t3
	set t5 2
	op shl t5 t5 0
	op add t3 t3 t5
	set a3 t3
	set t3 -1
	op shl t3 t3 1
	op add a3 a3 t3
	set a4 a3
	op shl t3 zero 1
	op add a4 a4 t3
	set t3 2
	op add a4 a4 t3
	set a5 a3
	op shl t3 zero 1
	op add a5 a5 t3
	set t3 3
	op add a5 a5 t3
	set t0 t0
	set t1 t1
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op shl t3 zero 1
	op add t5 t5 t3
	set t3 3
	op add t5 t5 t3
	read t3 cell t5
	jump uge t3 t2 "?Mmalloc@@YAPEAXI@Z"27.i
	jump always "?Mmalloc@@YAPEAXI@Z"58.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal t2 t3 "?Mmalloc@@YAPEAXI@Z"33.i
	jump always "?Mmalloc@@YAPEAXI@Z"39.i
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t2 t0
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t5 cell t2
	set t2 t1
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	write t5 cell t2
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"39.i:
	read t3 cell t5
	op sub t3 t3 t2
	write t3 cell t5
	set t3 t3
	set t0 t0
	op shl t3 t3 1
	op add t0 t0 t3
	set t3 t0
	op shl t5 zero 1
	op add t3 t3 t5
	set t5 3
	op add t3 t3 t5
	write t2 cell t3
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"54.i
"?Mmalloc@@YAPEAXI@Z"54.i:
	write t1 cell a6
	set t1 t0
	set t2 2
	op shl t2 t2 0
	op add t1 t1 t2
	set t1 t1
	set t0 t0
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t3 cell a6
	set t1 t0
	jump equal t3 t0 "?Mmalloc@@YAPEAXI@Z"62.i
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write t2 cell a2
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t3
	jump always "?Mmalloc@@YAPEAXI@Z"74.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t3
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op shl t3 zero 1
	op add t0 t0 t3
	set t3 2
	op add t0 t0 t3
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
	op shl t5 zero 1
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
	op shl t5 zero 1
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
	op shl t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op shl t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump equal a1 t5 "?Mfree@@YAXPEAX@Z"54.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"71.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op shl t6 zero 1
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
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	set t5 t5
	set t0 t0
	op shl a0 t5 1
	op add t0 t0 a0
	jump equal a3 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
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
	write t3 cell a6
	jump equal zero t3 "?Mmalloc@@YAPEAXI@Z"66.i
	jump always "?Mmalloc@@YAPEAXI@Z"67.i
		# -- End function



time:6775218405
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	set a7 s0
	set t1 a0
	op sub sp fp 1
	read t0 cell a6
	op add t1 t1 16
	op add t2 t1 -1
	set t1 16
	op div t1 t2 t1
	op add t1 t1 1
	set t3 t1
	read t1 cell a6
	set t2 t0
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell a6
	set t2 t0
	read t1 cell a6
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t0 t1
	op shl t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t0 cell t0
	op shl t5 t3 4
	set t4 zero
	op shl t5 t5 1
	op add t4 t4 t5
	set a2 t4
	op shl t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t5 2
	op add t4 t4 t5
	set a3 t4
	set t4 -1
	op shl t4 t4 1
	op add a3 a3 t4
	set a4 a3
	op shl t4 zero 1
	op add a4 a4 t4
	set t4 2
	op add a4 a4 t4
	set a5 a3
	op shl t4 zero 1
	op add a5 a5 t4
	set t4 3
	op add a5 a5 t4
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op shl t4 zero 1
	op add t5 t5 t4
	set t4 3
	op add t5 t5 t4
	read t4 cell t5
	jump uge t4 t3 "?Mmalloc@@YAPEAXI@Z"27.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t4 cell a6
	set t1 t0
	jump equal t4 t0 "?Mmalloc@@YAPEAXI@Z"62.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op shl t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t0 cell t0
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal t3 t4 "?Mmalloc@@YAPEAXI@Z"33.i
	read t4 cell t5
	op sub t4 t4 t3
	write t4 cell t5
	op shl t4 t4 1
	op add t0 t0 t4
	set t4 t0
	op shl t5 zero 1
	op add t4 t4 t5
	set t5 3
	op add t4 t4 t5
	write t3 cell t4
	write t1 cell a6
	set t1 t0
	set t3 2
	op add t1 t1 t3
	write t2 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t3 t0
	op shl t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	read t5 cell t3
	set t3 t1
	op shl t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	write t5 cell t3
	write t1 cell a6
	set t1 t0
	set t3 2
	op add t1 t1 t3
	write t2 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write t3 cell a2
	set t0 t4
"?Mfree@@YAXPEAX@Z"8.i.i.i:
	op greaterThan t1 t0 a3
	set t5 0
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t5 t5 1
	jump notEqual t5 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read a0 cell a5
	set t1 a0
	set t5 a3
	op shl t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op shl t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump equal a1 t5 "?Mfree@@YAXPEAX@Z"54.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write a1 cell a4
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t6 t0
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op shl a0 t5 1
	op add t0 t0 a0
	jump equal a3 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a3 cell t1
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t4 cell a6
	jump equal zero t4 "?Mmalloc@@YAPEAXI@Z"66.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t4
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t4
	write t2 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t6 t0
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 2
	op add t6 t6 t5
	read t5 cell t6
	op lessThan t5 a3 t5
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t6 t0
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 2
	op add t6 t6 t5
	read t5 cell t6
	jump uge t0 t5 "?Mfree@@YAXPEAX@Z"27.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t0 t5
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"27.i.i.i:
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"31.i.i.i:
	jump ult a3 t5 "?Mfree@@YAXPEAX@Z"43.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op shl t6 zero 1
	op add t5 t5 t6
	set t6 2
	op add t5 t5 t6
	read t5 cell t5
	write t5 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t0 cell a5
	op add t0 t5 t0
	write t0 cell t6
	read t0 cell a4
	write t0 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
		# -- End function



time:6819042263
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	set a7 s0
	set t1 a0
	op sub sp fp 1
	read t0 cell a6
	op add t1 t1 16
	op add t2 t1 -1
	set t1 16
	op div t1 t2 t1
	op add t1 t1 1
	set t3 t1
	read t1 cell a6
	set t2 t0
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell a6
	set t2 t0
	read t1 cell a6
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t0 t1
	op shl t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t0 cell t0
	op shl t5 t3 4
	set t4 zero
	op shl t5 t5 1
	op add t4 t4 t5
	set a2 t4
	op shl t5 zero 1
	op add a2 a2 t5
	set t5 3
	op add a2 a2 t5
	set t5 2
	op add t4 t4 t5
	set a3 t4
	set t4 -1
	op shl t4 t4 1
	op add a3 a3 t4
	set a4 a3
	op shl t4 zero 1
	op add a4 a4 t4
	set t4 2
	op add a4 a4 t4
	set a5 a3
	op shl t4 zero 1
	op add a5 a5 t4
	set t4 3
	op add a5 a5 t4
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t5 t0
	op shl t4 zero 1
	op add t5 t5 t4
	set t4 3
	op add t5 t5 t4
	read t4 cell t5
	jump uge t4 t3 "?Mmalloc@@YAPEAXI@Z"27.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t4 cell a6
	set t1 t0
	jump equal t4 t0 "?Mmalloc@@YAPEAXI@Z"62.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op shl t4 zero 1
	op add t0 t0 t4
	set t4 2
	op add t0 t0 t4
	read t0 cell t0
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal t3 t4 "?Mmalloc@@YAPEAXI@Z"33.i
	read t4 cell t5
	op sub t4 t4 t3
	write t4 cell t5
	op shl t4 t4 1
	op add t0 t0 t4
	set t4 t0
	op shl t5 zero 1
	op add t4 t4 t5
	set t5 3
	op add t4 t4 t5
	write t3 cell t4
	write t1 cell a6
	set t1 t0
	set t3 2
	op add t1 t1 t3
	write t2 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t3 t0
	op shl t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	read t5 cell t3
	set t3 t1
	op shl t4 zero 1
	op add t3 t3 t4
	set t4 2
	op add t3 t3 t4
	write t5 cell t3
	write t1 cell a6
	set t1 t0
	set t3 2
	op add t1 t1 t3
	write t2 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write t3 cell a2
	set t0 t4
"?Mfree@@YAXPEAX@Z"8.i.i.i:
	op greaterThan t1 t0 a3
	set t5 0
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t5 t5 1
	jump notEqual t5 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read a0 cell a5
	set t1 a0
	set t5 a3
	op shl t1 t1 1
	op add t5 t5 t1
	set t1 t0
	op shl t6 zero 1
	op add t1 t1 t6
	set t6 2
	op add t1 t1 t6
	read a1 cell t1
	jump equal a1 t5 "?Mfree@@YAXPEAX@Z"54.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write a1 cell a4
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t6 t0
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op shl a0 t5 1
	op add t0 t0 a0
	jump equal a3 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a3 cell t1
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t4 cell a6
	jump equal zero t4 "?Mmalloc@@YAPEAXI@Z"66.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t4
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t4
	write t2 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t6 t0
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 2
	op add t6 t6 t5
	read t5 cell t6
	op lessThan t5 a3 t5
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t6 t0
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 2
	op add t6 t6 t5
	read t5 cell t6
	jump uge t0 t5 "?Mfree@@YAXPEAX@Z"27.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t0 t5
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"27.i.i.i:
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"31.i.i.i:
	jump ult a3 t5 "?Mfree@@YAXPEAX@Z"43.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t6 a1
	op shl t5 zero 1
	op add t6 t6 t5
	set t5 3
	op add t6 t6 t5
	read t5 cell t6
	op add t5 a0 t5
	write t5 cell a5
	set t5 a1
	op shl t6 zero 1
	op add t5 t5 t6
	set t6 2
	op add t5 t5 t6
	read t5 cell t5
	write t5 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t0 cell a5
	op add t0 t5 t0
	write t0 cell t6
	read t0 cell a4
	write t0 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
		# -- End function



time:6859423567
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "?Mmalloc@@YAPEAXI@Z"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "?Mfree@@YAXPEAX@Z"
"?Mfree@@YAXPEAX@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op sub sp fp 1
	read t3 cell freep
	set t0 -1
	op shl t0 t0 1
	op add a0 a0 t0
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8
	op add sp sp 1
"?Mfree@@YAXPEAX@Z"8:
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	op lessThan t1 a0 t1
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"21:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	jump uge t0 t1 "?Mfree@@YAXPEAX@Z"27
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"27:
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"37
	jump ult a0 t1 "?Mfree@@YAXPEAX@Z"37
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"37:
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"54:
	op shl a1 zero 1
	op add t2 t2 a1
	set a1 3
	op add t2 t2 a1
	read t2 cell t2
	op add t1 t1 t2
	write t1 cell t6
	read t1 cell t5
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a1 cell t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write a1 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"86:
	read t0 cell t6
	op add t0 t2 t0
	write t0 cell t1
	op shl t0 zero 1
	op add a0 a0 t0
	set t0 2
	op add a0 a0 t0
	read t0 cell a0
	write t0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmalloc@@YAPEAXI@Z"
"?Mmalloc@@YAPEAXI@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -3 fp
	write s0 cell tf
	op add tf -2 fp
	write s1 cell tf
	op add tf -1 fp
	write s2 cell tf
	op add tf -4 fp
	write ra cell tf
	op sub sp fp 5
	read t1 cell s2
	op add t0 a0 16
	op add t2 t0 -1
	set t0 16
	op div t0 t2 t0
	op add t0 t0 1
	set s0 t0
	read t0 cell freep
	set s1 t1
	jump equal zero t0 "?Mmalloc@@YAPEAXI@Z"16
	jump always "?Mmalloc@@YAPEAXI@Z"17
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16:
	read t0 cell s2
	write t0 cell freep
	read t0 cell s2
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell s2
	set s1 t0
	read t0 cell s2
"?Mmalloc@@YAPEAXI@Z"17:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
"?Mmalloc@@YAPEAXI@Z"21:
	set t2 a0
	op shl t1 zero 1
	op add t2 t2 t1
	set t1 3
	op add t2 t2 t1
	read t1 cell t2
	jump uge t1 s0 "?Mmalloc@@YAPEAXI@Z"27
"?Mmalloc@@YAPEAXI@Z"58:
	read t1 cell freep
	set t0 a0
	jump equal t1 a0 "?Mmalloc@@YAPEAXI@Z"62
"?Mmalloc@@YAPEAXI@Z"68:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"27:
	jump equal s0 t1 "?Mmalloc@@YAPEAXI@Z"33
	read t1 cell t2
	op sub t1 t1 s0
	write t1 cell t2
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write s0 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33:
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read t3 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write t3 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62:
	set a0 s0
	op add ra @counter 2
	jump always "?Mmorecore@@YAPEATheader@@I@Z"0
	jump equal zero a0 "?Mmalloc@@YAPEAXI@Z"66
"?Mmalloc@@YAPEAXI@Z"67:
	set t0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"66:
	set t0 zero
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmorecore@@YAPEATheader@@I@Z"
"?Mmorecore@@YAPEATheader@@I@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	set t0 a0
	op sub sp fp 3
	write zero cell t0
	op shl t1 t0 4
	set a0 zero
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write t0 cell t1
	set t0 2
	op add a0 a0 t0
	op add ra @counter 2
	jump always "?Mfree@@YAXPEAX@Z"0
	op add tf -2 fp
		read t0 cell tf
	read a0 cell t0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "??__Eheapcap@@YAXXZ"
"??__Eheapcap@@YAXXZ"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	write zero cell t0
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function _GLOBAL__sub_I_test4.cpp
_GLOBAL__sub_I_test4.cpp0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "??__Eheapcap@@YAXXZ"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function



time:7227134089
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "?Mmalloc@@YAPEAXI@Z"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "?Mfree@@YAXPEAX@Z"
"?Mfree@@YAXPEAX@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op sub sp fp 1
	read t3 cell freep
	set t0 -1
	op shl t0 t0 1
	op add a0 a0 t0
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8
	op add sp sp 1
"?Mfree@@YAXPEAX@Z"8:
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	op lessThan t1 a0 t1
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"21:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	jump uge t0 t1 "?Mfree@@YAXPEAX@Z"27
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"27:
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"37
	jump ult a0 t1 "?Mfree@@YAXPEAX@Z"37
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"37:
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"54:
	op shl a1 zero 1
	op add t2 t2 a1
	set a1 3
	op add t2 t2 a1
	read t2 cell t2
	op add t1 t1 t2
	write t1 cell t6
	read t1 cell t5
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a1 cell t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write a1 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"86:
	read t0 cell t6
	op add t0 t2 t0
	write t0 cell t1
	op shl t0 zero 1
	op add a0 a0 t0
	set t0 2
	op add a0 a0 t0
	read t0 cell a0
	write t0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmalloc@@YAPEAXI@Z"
"?Mmalloc@@YAPEAXI@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -3 fp
	write s0 cell tf
	op add tf -2 fp
	write s1 cell tf
	op add tf -1 fp
	write s2 cell tf
	op add tf -4 fp
	write ra cell tf
	op sub sp fp 5
	read t1 cell s2
	op add t0 a0 16
	op add t2 t0 -1
	set t0 16
	op div t0 t2 t0
	op add t0 t0 1
	set s0 t0
	read t0 cell freep
	set s1 t1
	jump equal zero t0 "?Mmalloc@@YAPEAXI@Z"16
	jump always "?Mmalloc@@YAPEAXI@Z"17
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16:
	read t0 cell s2
	write t0 cell freep
	read t0 cell s2
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell s2
	set s1 t0
	read t0 cell s2
"?Mmalloc@@YAPEAXI@Z"17:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
"?Mmalloc@@YAPEAXI@Z"21:
	set t2 a0
	op shl t1 zero 1
	op add t2 t2 t1
	set t1 3
	op add t2 t2 t1
	read t1 cell t2
	jump uge t1 s0 "?Mmalloc@@YAPEAXI@Z"27
"?Mmalloc@@YAPEAXI@Z"58:
	read t1 cell freep
	set t0 a0
	jump equal t1 a0 "?Mmalloc@@YAPEAXI@Z"62
"?Mmalloc@@YAPEAXI@Z"68:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"27:
	jump equal s0 t1 "?Mmalloc@@YAPEAXI@Z"33
	read t1 cell t2
	op sub t1 t1 s0
	write t1 cell t2
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write s0 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33:
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read t3 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write t3 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62:
	set a0 s0
	op add ra @counter 2
	jump always "?Mmorecore@@YAPEATheader@@I@Z"0
	jump equal zero a0 "?Mmalloc@@YAPEAXI@Z"66
"?Mmalloc@@YAPEAXI@Z"67:
	set t0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"66:
	set t0 zero
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmorecore@@YAPEATheader@@I@Z"
"?Mmorecore@@YAPEATheader@@I@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	set t0 a0
	op sub sp fp 3
	write zero cell t0
	op shl t1 t0 4
	set a0 zero
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write t0 cell t1
	set t0 2
	op add a0 a0 t0
	op add ra @counter 2
	jump always "?Mfree@@YAXPEAX@Z"0
	op add tf -2 fp
		read t0 cell tf
	read a0 cell t0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "??__Eheapcap@@YAXXZ"
"??__Eheapcap@@YAXXZ"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	write zero cell t0
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function _GLOBAL__sub_I_test4.cpp
_GLOBAL__sub_I_test4.cpp0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "??__Eheapcap@@YAXXZ"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function



time:7245816643
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "?Mmalloc@@YAPEAXI@Z"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "?Mfree@@YAXPEAX@Z"
"?Mfree@@YAXPEAX@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op sub sp fp 1
	read t3 cell freep
	set t0 -1
	op shl t0 t0 1
	op add a0 a0 t0
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8
	op add sp sp 1
"?Mfree@@YAXPEAX@Z"8:
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	op lessThan t1 a0 t1
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"21:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	jump uge t0 t1 "?Mfree@@YAXPEAX@Z"27
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"27:
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"37
	jump ult a0 t1 "?Mfree@@YAXPEAX@Z"37
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"37:
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"54:
	op shl a1 zero 1
	op add t2 t2 a1
	set a1 3
	op add t2 t2 a1
	read t2 cell t2
	op add t1 t1 t2
	write t1 cell t6
	read t1 cell t5
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a1 cell t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write a1 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"86:
	read t0 cell t6
	op add t0 t2 t0
	write t0 cell t1
	op shl t0 zero 1
	op add a0 a0 t0
	set t0 2
	op add a0 a0 t0
	read t0 cell a0
	write t0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmalloc@@YAPEAXI@Z"
"?Mmalloc@@YAPEAXI@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -3 fp
	write s0 cell tf
	op add tf -2 fp
	write s1 cell tf
	op add tf -1 fp
	write s2 cell tf
	op add tf -4 fp
	write ra cell tf
	op sub sp fp 5
	read t1 cell s2
	op add t0 a0 16
	op add t2 t0 -1
	set t0 16
	op div t0 t2 t0
	op add t0 t0 1
	set s0 t0
	read t0 cell freep
	set s1 t1
	jump equal zero t0 "?Mmalloc@@YAPEAXI@Z"16
	jump always "?Mmalloc@@YAPEAXI@Z"17
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16:
	read t0 cell s2
	write t0 cell freep
	read t0 cell s2
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell s2
	set s1 t0
	read t0 cell s2
"?Mmalloc@@YAPEAXI@Z"17:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
"?Mmalloc@@YAPEAXI@Z"21:
	set t2 a0
	op shl t1 zero 1
	op add t2 t2 t1
	set t1 3
	op add t2 t2 t1
	read t1 cell t2
	jump uge t1 s0 "?Mmalloc@@YAPEAXI@Z"27
"?Mmalloc@@YAPEAXI@Z"58:
	read t1 cell freep
	set t0 a0
	jump equal t1 a0 "?Mmalloc@@YAPEAXI@Z"62
"?Mmalloc@@YAPEAXI@Z"68:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"27:
	jump equal s0 t1 "?Mmalloc@@YAPEAXI@Z"33
	read t1 cell t2
	op sub t1 t1 s0
	write t1 cell t2
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write s0 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33:
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read t3 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write t3 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62:
	set a0 s0
	op add ra @counter 2
	jump always "?Mmorecore@@YAPEATheader@@I@Z"0
	jump equal zero a0 "?Mmalloc@@YAPEAXI@Z"66
"?Mmalloc@@YAPEAXI@Z"67:
	set t0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"66:
	set t0 zero
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmorecore@@YAPEATheader@@I@Z"
"?Mmorecore@@YAPEATheader@@I@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	set t0 a0
	op sub sp fp 3
	write zero cell t0
	op shl t1 t0 4
	set a0 zero
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write t0 cell t1
	set t0 2
	op add a0 a0 t0
	op add ra @counter 2
	jump always "?Mfree@@YAXPEAX@Z"0
	op add tf -2 fp
		read t0 cell tf
	read a0 cell t0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "??__Eheapcap@@YAXXZ"
"??__Eheapcap@@YAXXZ"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	write zero cell t0
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function _GLOBAL__sub_I_test4.cpp
_GLOBAL__sub_I_test4.cpp0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "??__Eheapcap@@YAXXZ"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

			# -- End Compile
			#		 total func:6
			#		 total block:23
			#		 total inst:448


time:7271926572
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "?Mmalloc@@YAPEAXI@Z"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "?Mfree@@YAXPEAX@Z"
"?Mfree@@YAXPEAX@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op sub sp fp 1
	read t3 cell freep
	set t0 -1
	op shl t0 t0 1
	op add a0 a0 t0
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8
	op add sp sp 1
"?Mfree@@YAXPEAX@Z"8:
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	op lessThan t1 a0 t1
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"21:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	jump uge t0 t1 "?Mfree@@YAXPEAX@Z"27
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"27:
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"37
	jump ult a0 t1 "?Mfree@@YAXPEAX@Z"37
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"37:
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"54:
	op shl a1 zero 1
	op add t2 t2 a1
	set a1 3
	op add t2 t2 a1
	read t2 cell t2
	op add t1 t1 t2
	write t1 cell t6
	read t1 cell t5
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a1 cell t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write a1 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"86:
	read t0 cell t6
	op add t0 t2 t0
	write t0 cell t1
	op shl t0 zero 1
	op add a0 a0 t0
	set t0 2
	op add a0 a0 t0
	read t0 cell a0
	write t0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmalloc@@YAPEAXI@Z"
"?Mmalloc@@YAPEAXI@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -3 fp
	write s0 cell tf
	op add tf -2 fp
	write s1 cell tf
	op add tf -1 fp
	write s2 cell tf
	op add tf -4 fp
	write ra cell tf
	op sub sp fp 5
	read t1 cell s2
	op add t0 a0 16
	op add t2 t0 -1
	set t0 16
	op div t0 t2 t0
	op add t0 t0 1
	set s0 t0
	read t0 cell freep
	set s1 t1
	jump equal zero t0 "?Mmalloc@@YAPEAXI@Z"16
	jump always "?Mmalloc@@YAPEAXI@Z"17
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16:
	read t0 cell s2
	write t0 cell freep
	read t0 cell s2
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell s2
	set s1 t0
	read t0 cell s2
"?Mmalloc@@YAPEAXI@Z"17:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
"?Mmalloc@@YAPEAXI@Z"21:
	set t2 a0
	op shl t1 zero 1
	op add t2 t2 t1
	set t1 3
	op add t2 t2 t1
	read t1 cell t2
	jump uge t1 s0 "?Mmalloc@@YAPEAXI@Z"27
"?Mmalloc@@YAPEAXI@Z"58:
	read t1 cell freep
	set t0 a0
	jump equal t1 a0 "?Mmalloc@@YAPEAXI@Z"62
"?Mmalloc@@YAPEAXI@Z"68:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"27:
	jump equal s0 t1 "?Mmalloc@@YAPEAXI@Z"33
	read t1 cell t2
	op sub t1 t1 s0
	write t1 cell t2
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write s0 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33:
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read t3 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write t3 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62:
	set a0 s0
	op add ra @counter 2
	jump always "?Mmorecore@@YAPEATheader@@I@Z"0
	jump equal zero a0 "?Mmalloc@@YAPEAXI@Z"66
"?Mmalloc@@YAPEAXI@Z"67:
	set t0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"66:
	set t0 zero
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmorecore@@YAPEATheader@@I@Z"
"?Mmorecore@@YAPEATheader@@I@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	set t0 a0
	op sub sp fp 3
	write zero cell t0
	op shl t1 t0 4
	set a0 zero
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write t0 cell t1
	set t0 2
	op add a0 a0 t0
	op add ra @counter 2
	jump always "?Mfree@@YAXPEAX@Z"0
	op add tf -2 fp
		read t0 cell tf
	read a0 cell t0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "??__Eheapcap@@YAXXZ"
"??__Eheapcap@@YAXXZ"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	write zero cell t0
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function _GLOBAL__sub_I_test4.cpp
_GLOBAL__sub_I_test4.cpp0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "??__Eheapcap@@YAXXZ"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

					# -- End Compile
					#		 total func:6
					#		 total block:23
					#		 total inst:448


time:7355280214
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "?Mmalloc@@YAPEAXI@Z"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "?Mfree@@YAXPEAX@Z"
"?Mfree@@YAXPEAX@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op sub sp fp 1
	read t3 cell freep
	set t0 -1
	op shl t0 t0 1
	op add a0 a0 t0
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8
	op add sp sp 1
"?Mfree@@YAXPEAX@Z"8:
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	op lessThan t1 a0 t1
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"21:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	jump uge t0 t1 "?Mfree@@YAXPEAX@Z"27
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"27:
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"37
	jump ult a0 t1 "?Mfree@@YAXPEAX@Z"37
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"37:
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"54:
	op shl a1 zero 1
	op add t2 t2 a1
	set a1 3
	op add t2 t2 a1
	read t2 cell t2
	op add t1 t1 t2
	write t1 cell t6
	read t1 cell t5
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a1 cell t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write a1 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"86:
	read t0 cell t6
	op add t0 t2 t0
	write t0 cell t1
	op shl t0 zero 1
	op add a0 a0 t0
	set t0 2
	op add a0 a0 t0
	read t0 cell a0
	write t0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmalloc@@YAPEAXI@Z"
"?Mmalloc@@YAPEAXI@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -3 fp
	write s0 cell tf
	op add tf -2 fp
	write s1 cell tf
	op add tf -1 fp
	write s2 cell tf
	op add tf -4 fp
	write ra cell tf
	op sub sp fp 5
	read t1 cell s2
	op add t0 a0 16
	op add t2 t0 -1
	set t0 16
	op div t0 t2 t0
	op add t0 t0 1
	set s0 t0
	read t0 cell freep
	set s1 t1
	jump equal zero t0 "?Mmalloc@@YAPEAXI@Z"16
	jump always "?Mmalloc@@YAPEAXI@Z"17
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16:
	read t0 cell s2
	write t0 cell freep
	read t0 cell s2
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell s2
	set s1 t0
	read t0 cell s2
"?Mmalloc@@YAPEAXI@Z"17:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
"?Mmalloc@@YAPEAXI@Z"21:
	set t2 a0
	op shl t1 zero 1
	op add t2 t2 t1
	set t1 3
	op add t2 t2 t1
	read t1 cell t2
	jump uge t1 s0 "?Mmalloc@@YAPEAXI@Z"27
"?Mmalloc@@YAPEAXI@Z"58:
	read t1 cell freep
	set t0 a0
	jump equal t1 a0 "?Mmalloc@@YAPEAXI@Z"62
"?Mmalloc@@YAPEAXI@Z"68:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"27:
	jump equal s0 t1 "?Mmalloc@@YAPEAXI@Z"33
	read t1 cell t2
	op sub t1 t1 s0
	write t1 cell t2
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write s0 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33:
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read t3 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write t3 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62:
	set a0 s0
	op add ra @counter 2
	jump always "?Mmorecore@@YAPEATheader@@I@Z"0
	jump equal zero a0 "?Mmalloc@@YAPEAXI@Z"66
"?Mmalloc@@YAPEAXI@Z"67:
	set t0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"66:
	set t0 zero
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmorecore@@YAPEATheader@@I@Z"
"?Mmorecore@@YAPEATheader@@I@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	set t0 a0
	op sub sp fp 3
	write zero cell t0
	op shl t1 t0 4
	set a0 zero
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write t0 cell t1
	set t0 2
	op add a0 a0 t0
	op add ra @counter 2
	jump always "?Mfree@@YAXPEAX@Z"0
	op add tf -2 fp
		read t0 cell tf
	read a0 cell t0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "??__Eheapcap@@YAXXZ"
"??__Eheapcap@@YAXXZ"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	write zero cell t0
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function _GLOBAL__sub_I_test4.cpp
_GLOBAL__sub_I_test4.cpp0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "??__Eheapcap@@YAXXZ"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

					# -- End Compile
					#		 total func:6
					#		 total block:23
					#		 total inst:448


time:7435466640
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	set a7 s0
	set t1 a0
	op sub sp fp 1
	read t0 cell a6
	op add t1 t1 16
	op add t2 t1 -1
	set t1 16
	op div t1 t2 t1
	op add t1 t1 1
	set a0 t1
	read t1 cell a6
	set a1 t0
	jump equal zero t1 "?Mmalloc@@YAPEAXI@Z"16.i
	jump always "?Mmalloc@@YAPEAXI@Z"17.i
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16.i:
	read t0 cell a6
	write t0 cell a6
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell a6
	set a1 t0
	read t1 cell a6
"?Mmalloc@@YAPEAXI@Z"17.i:
	set t0 t1
	op shl t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	set t2 a0
	op shl t3 t2 4
	set t2 zero
	op shl t3 t3 1
	op add t2 t2 t3
	set a3 t2
	op shl t3 zero 1
	op add a3 a3 t3
	set t3 3
	op add a3 a3 t3
	set t3 2
	op add t2 t2 t3
	set a5 t2
	set t2 -1
	op shl t2 t2 1
	op add a5 a5 t2
	set a4 a5
	op shl t2 zero 1
	op add a4 a4 t2
	set t2 2
	op add a4 a4 t2
	set a2 a5
	op shl t2 zero 1
	op add a2 a2 t2
	set t2 3
	op add a2 a2 t2
"?Mmalloc@@YAPEAXI@Z"21.i:
	set t3 t0
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	jump uge t2 a0 "?Mmalloc@@YAPEAXI@Z"27.i
"?Mmalloc@@YAPEAXI@Z"58.i:
	read t6 cell a6
	set t1 t0
	jump equal t6 t0 "?Mmalloc@@YAPEAXI@Z"62.i
"?Mmalloc@@YAPEAXI@Z"68.i:
	set t0 t1
	op shl t2 zero 1
	op add t0 t0 t2
	set t2 2
	op add t0 t0 t2
	read t0 cell t0
	jump always "?Mmalloc@@YAPEAXI@Z"21.i
"?Mmalloc@@YAPEAXI@Z"27.i:
	jump equal a0 t2 "?Mmalloc@@YAPEAXI@Z"33.i
	read t2 cell t3
	op sub t2 t2 a0
	write t2 cell t3
	op shl t2 t2 1
	op add t0 t0 t2
	set t2 t0
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 3
	op add t2 t2 t3
	write a0 cell t2
	write t1 cell a6
	set t1 t0
	set t2 2
	op add t1 t1 t2
	write a1 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33.i:
	set t2 t0
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t4 cell t2
	set t2 t1
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	write t4 cell t2
	write t1 cell a6
	set t1 t0
	set t2 2
	op add t1 t1 t2
	write a1 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62.i:
	write zero cell a6
	write a0 cell a3
	set t0 t6
"?Mfree@@YAXPEAX@Z"8.i.i.i:
	op greaterThan t1 t0 a5
	set t2 0
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"12.i.i.i
"?Mfree@@YAXPEAX@Z"18.i.i.i:
	op xor t2 t2 1
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"21.i.i.i
"?Mfree@@YAXPEAX@Z"43.i.i.i:
	read t4 cell a2
	set t1 t4
	set t2 a5
	op shl t1 t1 1
	op add t2 t2 t1
	set t1 t0
	op shl t3 zero 1
	op add t1 t1 t3
	set t3 2
	op add t1 t1 t3
	read t5 cell t1
	jump equal t5 t2 "?Mfree@@YAXPEAX@Z"54.i.i.i
"?Mfree@@YAXPEAX@Z"71.i.i.i:
	write t5 cell a4
"?Mfree@@YAXPEAX@Z"77.i.i.i:
	set t3 t0
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	op shl t4 t2 1
	op add t0 t0 t4
	jump equal a5 t0 "?Mfree@@YAXPEAX@Z"86.i.i.i
"?Mfree@@YAXPEAX@Z"99.i.i.i:
	write a5 cell t1
"?Mfree@@YAXPEAX@Z"103.i.i.i:
	write t6 cell a6
	jump equal zero t6 "?Mmalloc@@YAPEAXI@Z"66.i
"?Mmalloc@@YAPEAXI@Z"67.i:
	set t1 t6
	jump always "?Mmalloc@@YAPEAXI@Z"68.i
"?Mmalloc@@YAPEAXI@Z"66.i:
	set t1 zero
	set t0 t6
	write a1 cell a6
	set a0 t1
	set s0 a7
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12.i.i.i:
	set t3 t0
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 2
	op add t3 t3 t2
	read t2 cell t3
	op lessThan t2 a5 t2
	jump always "?Mfree@@YAXPEAX@Z"18.i.i.i
"?Mfree@@YAXPEAX@Z"21.i.i.i:
	set t3 t0
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 2
	op add t3 t3 t2
	read t2 cell t3
	jump uge t0 t2 "?Mfree@@YAXPEAX@Z"27.i.i.i
"?Mfree@@YAXPEAX@Z"38.i.i.i:
	set t0 t2
	jump always "?Mfree@@YAXPEAX@Z"8.i.i.i
"?Mfree@@YAXPEAX@Z"27.i.i.i:
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"43.i.i.i
"?Mfree@@YAXPEAX@Z"31.i.i.i:
	jump ult a5 t2 "?Mfree@@YAXPEAX@Z"43.i.i.i
	jump always "?Mfree@@YAXPEAX@Z"38.i.i.i
"?Mfree@@YAXPEAX@Z"54.i.i.i:
	set t3 t5
	op shl t2 zero 1
	op add t3 t3 t2
	set t2 3
	op add t3 t3 t2
	read t2 cell t3
	op add t2 t4 t2
	write t2 cell a2
	set t2 t5
	op shl t3 zero 1
	op add t2 t2 t3
	set t3 2
	op add t2 t2 t3
	read t2 cell t2
	write t2 cell a4
	jump always "?Mfree@@YAXPEAX@Z"77.i.i.i
"?Mfree@@YAXPEAX@Z"86.i.i.i:
	read t0 cell a2
	op add t0 t2 t0
	write t0 cell t3
	read t0 cell a4
	write t0 cell t1
	jump always "?Mfree@@YAXPEAX@Z"103.i.i.i
		# -- End function

					# -- End Compile
					#		 total func:1
					#		 total block:25
					#		 total inst:206


time:7553430502
# compiled by @Mindustack
set fp 64
set sp fp
write 65535.0 cell 0
		#globlvar freep

		#globlvar base

		#globlvar heapcap

		#globlvar llvm.global_ctors


		# -- Start function main
main0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "?Mmalloc@@YAPEAXI@Z"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "?Mfree@@YAXPEAX@Z"
"?Mfree@@YAXPEAX@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op sub sp fp 1
	read t3 cell freep
	set t0 -1
	op shl t0 t0 1
	op add a0 a0 t0
	set t0 t3
	jump always "?Mfree@@YAXPEAX@Z"8
	op add sp sp 1
"?Mfree@@YAXPEAX@Z"8:
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"12:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	op lessThan t1 a0 t1
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"21:
	set t1 t0
	op shl t5 zero 1
	op add t1 t1 t5
	set t5 2
	op add t1 t1 t5
	read t1 cell t1
	jump uge t0 t1 "?Mfree@@YAXPEAX@Z"27
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"27:
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"37
	jump ult a0 t1 "?Mfree@@YAXPEAX@Z"37
	set t0 t1
	op greaterThan t2 t0 a0
	set t1 0
	jump notEqual t2 zero "?Mfree@@YAXPEAX@Z"12
	op xor t1 t1 1
	jump notEqual t1 zero "?Mfree@@YAXPEAX@Z"21
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"37:
	set t6 a0
	op shl t1 zero 1
	op add t6 t6 t1
	set t1 3
	op add t6 t6 t1
	read t1 cell t6
	set a1 a0
	op shl t2 t1 1
	op add a1 a1 t2
	set t5 t0
	op shl t2 zero 1
	op add t5 t5 t2
	set t2 2
	op add t5 t5 t2
	read t2 cell t5
	jump equal t2 a1 "?Mfree@@YAXPEAX@Z"54
	set t1 a0
	op shl a1 zero 1
	op add t1 t1 a1
	set a1 2
	op add t1 t1 a1
	write t2 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"54:
	op shl a1 zero 1
	op add t2 t2 a1
	set a1 3
	op add t2 t2 a1
	read t2 cell t2
	op add t1 t1 t2
	write t1 cell t6
	read t1 cell t5
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a1 cell t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write a1 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	read t2 cell t1
	op shl a1 t2 1
	op add t0 t0 a1
	jump equal a0 t0 "?Mfree@@YAXPEAX@Z"86
	write a0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
"?Mfree@@YAXPEAX@Z"86:
	read t0 cell t6
	op add t0 t2 t0
	write t0 cell t1
	op shl t0 zero 1
	op add a0 a0 t0
	set t0 2
	op add a0 a0 t0
	read t0 cell a0
	write t0 cell t5
	write t3 cell freep
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmalloc@@YAPEAXI@Z"
"?Mmalloc@@YAPEAXI@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -3 fp
	write s0 cell tf
	op add tf -2 fp
	write s1 cell tf
	op add tf -1 fp
	write s2 cell tf
	op add tf -4 fp
	write ra cell tf
	op sub sp fp 5
	read t1 cell s2
	op add t0 a0 16
	op add t2 t0 -1
	set t0 16
	op div t0 t2 t0
	op add t0 t0 1
	set s0 t0
	read t0 cell freep
	set s1 t1
	jump equal zero t0 "?Mmalloc@@YAPEAXI@Z"16
	jump always "?Mmalloc@@YAPEAXI@Z"17
	op add sp sp 1
"?Mmalloc@@YAPEAXI@Z"16:
	read t0 cell s2
	write t0 cell freep
	read t0 cell s2
	op shl t1 zero 1
	op add t0 t0 t1
	set t1 3
	op add t0 t0 t1
	write zero cell t0
	read t0 cell s2
	set s1 t0
	read t0 cell s2
"?Mmalloc@@YAPEAXI@Z"17:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
"?Mmalloc@@YAPEAXI@Z"21:
	set t2 a0
	op shl t1 zero 1
	op add t2 t2 t1
	set t1 3
	op add t2 t2 t1
	read t1 cell t2
	jump uge t1 s0 "?Mmalloc@@YAPEAXI@Z"27
"?Mmalloc@@YAPEAXI@Z"58:
	read t1 cell freep
	set t0 a0
	jump equal t1 a0 "?Mmalloc@@YAPEAXI@Z"62
"?Mmalloc@@YAPEAXI@Z"68:
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read a0 cell t1
	jump always "?Mmalloc@@YAPEAXI@Z"21
"?Mmalloc@@YAPEAXI@Z"27:
	jump equal s0 t1 "?Mmalloc@@YAPEAXI@Z"33
	read t1 cell t2
	op sub t1 t1 s0
	write t1 cell t2
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write s0 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"33:
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	read t3 cell t1
	set t1 t0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 2
	op add t1 t1 t2
	write t3 cell t1
	write t0 cell freep
	set t0 a0
	set t1 2
	op add t0 t0 t1
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
"?Mmalloc@@YAPEAXI@Z"62:
	set a0 s0
	op add ra @counter 2
	jump always "?Mmorecore@@YAPEATheader@@I@Z"0
	jump equal zero a0 "?Mmalloc@@YAPEAXI@Z"66
"?Mmalloc@@YAPEAXI@Z"67:
	set t0 a0
	jump always "?Mmalloc@@YAPEAXI@Z"68
"?Mmalloc@@YAPEAXI@Z"66:
	set t0 zero
	write s1 cell s2
	set a0 t0
	op add tf -3 fp
		read s0 cell tf
	op add tf -2 fp
		read s1 cell tf
	op add tf -1 fp
		read s2 cell tf
	op add tf -4 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	set @counter ra
		# -- End function

		# -- Start function "?Mmorecore@@YAPEATheader@@I@Z"
"?Mmorecore@@YAPEATheader@@I@Z"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	set t0 a0
	op sub sp fp 3
	write zero cell t0
	op shl t1 t0 4
	set a0 zero
	op shl t1 t1 1
	op add a0 a0 t1
	set t1 a0
	op shl t2 zero 1
	op add t1 t1 t2
	set t2 3
	op add t1 t1 t2
	write t0 cell t1
	set t0 2
	op add a0 a0 t0
	op add ra @counter 2
	jump always "?Mfree@@YAXPEAX@Z"0
	op add tf -2 fp
		read t0 cell tf
	read a0 cell t0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function "??__Eheapcap@@YAXXZ"
"??__Eheapcap@@YAXXZ"0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	write zero cell t0
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

		# -- Start function _GLOBAL__sub_I_test4.cpp
_GLOBAL__sub_I_test4.cpp0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	op add tf -1 fp
	write ra cell tf
	op sub sp fp 2
	op add ra @counter 2
	jump always "??__Eheapcap@@YAXXZ"0
	op add tf -1 fp
		read ra cell tf
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
		# -- End function

					# -- End Compile
					#		 total func:6
					#		 total block:23
					#		 total inst:448
