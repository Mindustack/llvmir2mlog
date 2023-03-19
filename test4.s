	.text
	.file	"test4.cpp"
	.globl	_Z6malloci              # -- Begin function _Z6malloci
	.p2align	4, 0x90
	.type	_Z6malloci,@function
_Z6malloci:                             # @_Z6malloci
	.cfi_startproc
# %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$48, %rsp
	movl	%edi, -28(%rbp)
	movl	-28(%rbp), %eax
	addl	$8, %eax
	subl	$1, %eax
	cltd
	movl	$8, %ecx
	idivl	%ecx
	addl	$1, %eax
	movl	%eax, -12(%rbp)
	movq	_ZL5freep, %rax
	movq	%rax, -24(%rbp)
	cmpq	$0, %rax
	jne	.LBB0_2
# %bb.1:
	movabsq	$_ZL4base, %rax
	movq	%rax, -24(%rbp)
	movq	%rax, _ZL5freep
	movq	%rax, _ZL4base
	movl	$0, _ZL4base+8
.LBB0_2:
	movq	-24(%rbp), %rax
	movq	(%rax), %rax
	movq	%rax, -8(%rbp)
.LBB0_3:                                # =>This Inner Loop Header: Depth=1
	movq	-8(%rbp), %rax
	movl	8(%rax), %eax
	cmpl	-12(%rbp), %eax
	jl	.LBB0_8
# %bb.4:
	movq	-8(%rbp), %rax
	movl	8(%rax), %eax
	cmpl	-12(%rbp), %eax
	jne	.LBB0_6
# %bb.5:
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	movq	-24(%rbp), %rcx
	movq	%rax, (%rcx)
	jmp	.LBB0_7
.LBB0_6:
	movl	-12(%rbp), %eax
	movq	-8(%rbp), %rcx
	movl	8(%rcx), %edx
	subl	%eax, %edx
	movl	%edx, 8(%rcx)
	movq	-8(%rbp), %rax
	movl	8(%rax), %eax
	movq	-8(%rbp), %rcx
	cltq
	shlq	$4, %rax
	addq	%rax, %rcx
	movq	%rcx, -8(%rbp)
	movl	-12(%rbp), %eax
	movq	-8(%rbp), %rcx
	movl	%eax, 8(%rcx)
.LBB0_7:
	movq	-24(%rbp), %rax
	movq	%rax, _ZL5freep
	movq	-8(%rbp), %rax
	addq	$16, %rax
	movq	%rax, -40(%rbp)
	jmp	.LBB0_14
.LBB0_8:                                #   in Loop: Header=BB0_3 Depth=1
	movq	-8(%rbp), %rax
	cmpq	_ZL5freep, %rax
	jne	.LBB0_12
# %bb.9:                                #   in Loop: Header=BB0_3 Depth=1
	movl	-12(%rbp), %edi
	callq	_Z8morecorei
	movq	%rax, -8(%rbp)
	cmpq	$0, %rax
	jne	.LBB0_11
# %bb.10:
	movq	$0, -40(%rbp)
	jmp	.LBB0_14
.LBB0_11:                               #   in Loop: Header=BB0_3 Depth=1
	jmp	.LBB0_12
.LBB0_12:                               #   in Loop: Header=BB0_3 Depth=1
	jmp	.LBB0_13
.LBB0_13:                               #   in Loop: Header=BB0_3 Depth=1
	movq	-8(%rbp), %rax
	movq	%rax, -24(%rbp)
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	movq	%rax, -8(%rbp)
	jmp	.LBB0_3
.LBB0_14:
	movq	-40(%rbp), %rax
	addq	$48, %rsp
	popq	%rbp
	.cfi_def_cfa %rsp, 8
	retq
.Lfunc_end0:
	.size	_Z6malloci, .Lfunc_end0-_Z6malloci
	.cfi_endproc
                                        # -- End function
	.globl	_Z4freePv               # -- Begin function _Z4freePv
	.p2align	4, 0x90
	.type	_Z4freePv,@function
_Z4freePv:                              # @_Z4freePv
	.cfi_startproc
# %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	movq	%rdi, -24(%rbp)
	movq	-24(%rbp), %rax
	addq	$-16, %rax
	movq	%rax, -16(%rbp)
	movq	_ZL5freep, %rax
	movq	%rax, -8(%rbp)
.LBB1_1:                                # =>This Inner Loop Header: Depth=1
	xorl	%eax, %eax
	movq	-16(%rbp), %rcx
	cmpq	-8(%rbp), %rcx
	jbe	.LBB1_3
# %bb.2:                                #   in Loop: Header=BB1_1 Depth=1
	movq	-16(%rbp), %rax
	movq	-8(%rbp), %rcx
	cmpq	(%rcx), %rax
	setb	%al
.LBB1_3:                                #   in Loop: Header=BB1_1 Depth=1
	xorb	$-1, %al
	testb	$1, %al
	jne	.LBB1_4
	jmp	.LBB1_10
.LBB1_4:                                #   in Loop: Header=BB1_1 Depth=1
	movq	-8(%rbp), %rax
	movq	-8(%rbp), %rcx
	cmpq	(%rcx), %rax
	jb	.LBB1_8
# %bb.5:                                #   in Loop: Header=BB1_1 Depth=1
	movq	-16(%rbp), %rax
	cmpq	-8(%rbp), %rax
	ja	.LBB1_7
# %bb.6:                                #   in Loop: Header=BB1_1 Depth=1
	movq	-16(%rbp), %rax
	movq	-8(%rbp), %rcx
	cmpq	(%rcx), %rax
	jae	.LBB1_8
.LBB1_7:
	jmp	.LBB1_11
.LBB1_8:                                #   in Loop: Header=BB1_1 Depth=1
	jmp	.LBB1_9
.LBB1_9:                                #   in Loop: Header=BB1_1 Depth=1
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	movq	%rax, -8(%rbp)
	jmp	.LBB1_1
.LBB1_10:                               # %.loopexit
	jmp	.LBB1_11
.LBB1_11:
	movq	-16(%rbp), %rax
	movq	-16(%rbp), %rcx
	movslq	8(%rcx), %rcx
	shlq	$4, %rcx
	addq	%rcx, %rax
	movq	-8(%rbp), %rcx
	cmpq	(%rcx), %rax
	jne	.LBB1_13
# %bb.12:
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	movl	8(%rax), %eax
	movq	-16(%rbp), %rcx
	addl	8(%rcx), %eax
	movl	%eax, 8(%rcx)
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	movq	(%rax), %rax
	movq	-16(%rbp), %rcx
	movq	%rax, (%rcx)
	jmp	.LBB1_14
.LBB1_13:
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	movq	-16(%rbp), %rcx
	movq	%rax, (%rcx)
.LBB1_14:
	movq	-8(%rbp), %rax
	movq	-8(%rbp), %rcx
	movslq	8(%rcx), %rcx
	shlq	$4, %rcx
	addq	%rcx, %rax
	cmpq	-16(%rbp), %rax
	jne	.LBB1_16
# %bb.15:
	movq	-16(%rbp), %rax
	movl	8(%rax), %eax
	movq	-8(%rbp), %rcx
	addl	8(%rcx), %eax
	movl	%eax, 8(%rcx)
	movq	-16(%rbp), %rax
	movq	(%rax), %rax
	movq	-8(%rbp), %rcx
	movq	%rax, (%rcx)
	jmp	.LBB1_17
.LBB1_16:
	movq	-16(%rbp), %rax
	movq	-8(%rbp), %rcx
	movq	%rax, (%rcx)
.LBB1_17:
	movq	-8(%rbp), %rax
	movq	%rax, _ZL5freep
	popq	%rbp
	.cfi_def_cfa %rsp, 8
	retq
.Lfunc_end1:
	.size	_Z4freePv, .Lfunc_end1-_Z4freePv
	.cfi_endproc
                                        # -- End function
	.type	_ZL5freep,@object       # @_ZL5freep
	.local	_ZL5freep
	.comm	_ZL5freep,8,8
	.type	_ZL4base,@object        # @_ZL4base
	.local	_ZL4base
	.comm	_ZL4base,16,8
	.ident	"clang version 10.0.0-4ubuntu1 "
	.section	".note.GNU-stack","",@progbits
