俺先考清华不迟





# llvmir2mlog

a primary but entensible compiler backend for LLVM-IR to Mindustry Logic in Java

main code from https://github.com/SiriusNEO/Masterball
# primary play

run at src/test/java/Main.java
input at src/main/resources/test2.ll
output at src/main/resources/out2

if you not have llvmmir here are src/main/resources/examples but i cant promise full support

# example

2023.3.4 00:34 dont mind it

## sourse

    define i4 @main(i4 %s) {
    0:

    %se=call i4 @g()

    ret i4 %se
    }

    define i4 @g() {
    2:
    %15= call i4 @g()

	ret i4 1

    }

## result

    0:

    op add sp sp -4 #栈下降
    write ra cell sp #保存返回地址

	op add ra @counter 2
	jump always 2       #call

	read ra cell sp     #还原
	op add sp sp 4      #上升

	set @counter ra     #返回

    2:

    op add sp sp -4
    write ra cell sp

	op add ra @counter 2
	jump always 2       #快乐迭代

	set a0 1            #返回值

	read ra cell sp
	op add sp sp 4

	set @counter ra

