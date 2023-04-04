declare i32 @malloc(i32 %s)
declare i32 @b(i32 %s,i32 %se)
define void @f() {
0:
    ; %s = alloca [5 x i8]

	;%a = alloca [10 x [10 x i8]]
	;%4 = getelementptr [10 x [10 x i8]], [10 x [10 x i8]]* %a, i64 3,i64 2

   ; %a = alloca [200 x i8]
	;%4 = getelementptr [200 x i8], [200 x i8]* %a, i64 0, i64 5

    ;call void @malloc(i32 2)



   ; %s1=alloca i32

   ; br label %bar

   ; %s = load i32, i32* %s1
   ; %s = load i32, ptr %s1

    ;%se= add i32 %s,4
   ; %sde= add i32 %se,%s


    ;call void @b(i32 %se,i32 %sde)

   ; bar:

   ; %s12=alloca i32



   ; call void @f()


   %1 = add i4 0, 0
	%2 = add i4 %1, 1
	%3 = add i4 %2, 2
	%4 = add i4 %3, 3
	%5 = add i4 %4, 4




   call void @b(i32 0,i32 1,i32 0,i32 1,i32 0,i32 1,i32 0,i32 1,i32 0,i32 1,i32 0,i32 1)

   %6 = add i4 %5, 5

   ;call void @b(i32 0,i32 1,i32 0,i32 1,i32 0,i32 1,i32 0,i32 1,i32 0,i32 1,i32 0,i32 1)

	%7 = add i4 %6, 6
	%8 = add i4 %7, 7

	ret void
}

define void @b(i32 %a,i32 %b,i32 %c,i32 %d,i32 %e,i32 %f,i32 %g,i32 %h,i32 %i,i32 %j,i32 %k,i32 %l){
0:

   ; %sde= add i32 %se,%s


   ; call void @b(i32 %se,i32 %sde)

    ;%s2= mul i32 %se,%s
   ; call void @malloc(i32 %s2)
    ret void
}