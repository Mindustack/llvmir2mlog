define i32 @min(i32 %a, i32 %b) {
  %cmp = icmp slt i32 %a, %b
  %result1 = select i1 %cmp, i32 %a, i32 %b

  %cmp1 = icmp slt i32 %result1,i32 10
  %result = select i1 %cmp1, i32 %result1, i32 10
  ret i32 %result
}

define void @main(i32 %a, i32 %b) {
  call i32 @min(i32 %a,i32  %b)
  ret void
}