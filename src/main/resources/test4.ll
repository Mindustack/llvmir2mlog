

define void @f() {
0:
	%1 = icmp eq i32 1, 2
	br i1 %1, label %foo, label %baz

foo:
	%2 = icmp eq i32 1, 2
	br i1 %2, label %bar, label %baz

bar:
	br label %baz

baz:
	%3 = phi i32 [ 10, %foo ], [ 20, %bar ], [ 30, %baz ]
	ret void
}