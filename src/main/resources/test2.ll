define i4 @main(i4 %s) {
0:


 %se=call i4 @g( )

 ret i4 %se
}

define i4 @g() {
2:
   %15= call i4 @g()
%14= call i4 @g()
%18= call i4 @g()
	ret i4 1
}
