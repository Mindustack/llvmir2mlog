f0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	    f_LabelForTail:
	write s0 cell sp
	op add tf 1 sp
	write ra cell tf
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	                              #start
	op add t0 zero 0
	op add t0 t0 6
	op add s0 t0 4
	                              #call start
	                              #pass param
	set a0 0
	set a1 1
	set a2 0
	set a3 1
	set a4 0
	set a5 1
	set a6 0
	set a7 1
	op sub t0 sp 2
	write zero cell t0
	op sub t0 sp 3
	set t1 1
	write t1 cell t0
	op sub t0 sp 4
	write zero cell t0
	op sub t0 sp 5
	write t1 cell t0
	op add ra @counter 2
	jump always b0
	                              #call end
	op add t0 s0 5
	op add t0 t0 13
	read s0 cell sp
	                              #ra temp back
	op add tf 1 sp
	read ra cell tf
	                              #sp and fp
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
b0:
	op add sp sp -1
	write fp cell sp
	set fp sp
	    b_LabelForTail:
	                              #move arguments 0~7 to reg
	                              #load arguments in mem to reg
	op sub t0 sp 1
	op sub t0 sp 2
	op sub t0 sp 3
	op sub t0 sp 4
	read t0 cell t0
	                              #start
	                              #ra temp back
	                              #sp and fp
	set sp fp
	read fp cell fp
	op add sp sp 1
	set @counter ra
