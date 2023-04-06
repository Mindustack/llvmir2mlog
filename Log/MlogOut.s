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
