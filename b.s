	.text
	.file	"b.ll"
	.globl	main                    # -- Begin function main
	.p2align	4, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# %bb.0:                                # %LoopHeader
	movl	$1, %eax
	addl	$0, %eax
	movl	%eax, -4(%rsp)          # 4-byte Spill
.LBB0_1:                                # %Loop
                                        # =>This Inner Loop Header: Depth=1
	movl	-4(%rsp), %eax          # 4-byte Reload
	addl	$1, %eax
	movl	%eax, -4(%rsp)          # 4-byte Spill
	jmp	.LBB0_1
.Lfunc_end0:
	.size	main, .Lfunc_end0-main
	.cfi_endproc
                                        # -- End function
	.section	".note.GNU-stack","",@progbits
