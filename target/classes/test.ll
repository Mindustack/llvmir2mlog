

define void @f() {
0:
	%a = alloca [4 x i8]
	%4 = getelementptr [4 x i8], [4 x i8]* %a, i64 0
	ret void
}