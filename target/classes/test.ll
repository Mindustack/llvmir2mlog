declare i32 @malloc(i32 %s)

define void @f() {
0:
    ;%s = alloca [5 x i8]

	;%a = alloca [10 x [10 x i8]]
	;%4 = getelementptr [10 x [10 x i8]], [10 x [10 x i8]]* %a, i64 3,i64 2

    ;%a = alloca [200 x i8]
	;%4 = getelementptr [200 x i8], [200 x i8]* %a, i64 3

    call void @malloc(i32 2)

	ret void
}