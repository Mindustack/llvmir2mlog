

define i32 @main(i32 %x){

entry:
    %x1 = add i32 %x, 1
    br label %middle

middle:

    %y = phi i32 [ %x1, %entry ], [ %x2, %middle ]

    %x2 = add i32 %y, 2

    %2 = icmp slt i32 %x2, 10
	br i1 %2, label %entry, label %exit

exit:

    ret i32 %y


}




