

define i32 @main(i32 %x){
entry:
    br label %middle
middle:

    %y = phi i32 [ %x, %entry ], [ %x2, %middle ]

    %x2 = add i32 %y, 1

    %condition = icmp slt i32 %x2, 10
	br i1 %condition, label %middle, label %exit

exit:
    ret i32 %y
}
