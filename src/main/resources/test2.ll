define i4 @main(i4 %s) {
0:


 %se=call i4 @g()

 ret i4 %se
}

define i4 @g() {
2:
	%1 = add i4 0, 0
	%2 = add i4 1, 1
	%3 = add i4 2, 2
	%4 = add i4 3, 3
	%5 = add i4 4, 4
	%6 = add i4 5, 5
	%7 = add i4 6, 6
	%8 = add i4 7, 7
	%9 = add i4 -8, -8
	%10 = add i4 -7, -7
	%11 = add i4 -6, -6
	%12 = add i4 -5, -5
	%13 = add i4 -4, -4
	%14 = add i4 -3, -3
	%15 = add i4 -2, -2
	%16 = add i4 -1, -1
	ret i4 %16
}
