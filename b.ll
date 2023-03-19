define void @main (){

    LoopHeader:

    %s = add  i32 0,1
    br label %Loop
    Loop:       ; Infinite loop that counts from 0 on up...
  %indvar = phi i32 [ %s, %LoopHeader ], [ %nextindvar, %Loop ]
  %nextindvar = add i32 %indvar, 1
  br label %Loop



}