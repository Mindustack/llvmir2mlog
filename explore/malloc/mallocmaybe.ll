; ModuleID = 'malloc_free'

; 定义模块 malloc_free

@format_str = private constant [4 x i8] c"%d\0A\00" ; 格式化字符串常量，用于输出

; 定义系统调用编号
@SYS_BRK = 45
@SYS_WRITE = 4
@STDERR = 2

; 定义函数 malloc，接收一个整数参数 size
define i8* @malloc(i32 %size) {
  ; 分配��返回一块大小为 size 字节的内存空间
  
  %num_bytes = mul i32 %size, 1            ; 计算需要分配的字节数
  %aligned_bytes = add i32 %num_bytes, 15  ; 加上对齐所需的额外字节数，避免内存泄漏和潜在的安全问题
  %page_size = getpagesize()              ; 获取页面大小
  %brk_addr = syscall i64(@SYS_BRK, i64 0) ; 调用系统 brk 函数获取当前堆顶地址
  %end_addr = add i64 %brk_addr, %aligned_bytes ; 计算分配后的堆顶地址
  %new_end_addr = and i64 %end_addr, ~%page_size | %page_size - 1 ; 对齐到页面边界
  %diff = sub i64 %new_end_addr, %brk_addr  ; 计算需要增加的堆大小
  %result_ptr = call i8* @sbrk(i64 %diff)   ; 调用自定义的 sbrk 函数扩容堆，并返回新分配块的起始地址
  
  ret i8* %result_ptr                       ; 返回对齐后的指针
}

; 定义函数 free，接收一个指向分配的内存空间的指针参数
define void @free(i8* %ptr) {
  ; 释放 malloc 分配的内存空间
  
  ret void                                 ; 直接返回，因为本示例中的 free 函数不做任何操作
}

; 定义系统调用版本的 sbrk 函数
define i8* @sbrk(i64 %increment) {
  %result = syscall i64(@SYS_BRK, i64 0)      ; 获取当前堆顶地址
  %new_result = add i64 %result, %increment  ; 计算新的堆顶地址
  %status = syscall i64(@SYS_BRK, %new_result) ; 扩容堆到新的堆顶地址
  %cmp = icmp eq i64 %status, %new_result     ; 判断是否分配成功
  br i1 %cmp, label %success, label %failure  ; 如果分配成功，则跳转到 success 标签处；否则跳转到 failure 标签处

success:
  ret i8* %new_result                         ; 返回新的堆顶地址

failure:
  %error_str = getelementptr inbounds [19 x i8], [19 x i8]* @str_error, i32 0, i32 0 ; 获取错误信息字符串
  call void @write(i32(STDERR), i8* %error_str, i64 19) ; 调用 write 函数输出错误信息到标准错误输出
  ret i8* null                                ; 分配失败，返回空指针
}

; 定义系统调用版本的 write 函数，输出错误信息到标准错误输出
define void @write(i32 %fd, i8* %buf, i64 %count) {
  syscall i64(@SYS_WRITE, i64 %fd, i8* %buf, i64 %count)
}
