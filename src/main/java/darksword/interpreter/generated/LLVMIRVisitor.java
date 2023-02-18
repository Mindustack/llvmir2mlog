// Generated from ../src/darksword/interpreter/generated/LLVMIR.g4 by ANTLR 4.7.2

package darksword.interpreter.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LLVMIRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface LLVMIRVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link LLVMIRParser#rootLLVMIR}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRootLLVMIR(LLVMIRParser.RootLLVMIRContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#targetInfo}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTargetInfo(LLVMIRParser.TargetInfoContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sourceFn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSourceFn(LLVMIRParser.SourceFnContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#dataLayout}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDataLayout(LLVMIRParser.DataLayoutContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#targetTriple}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTargetTriple(LLVMIRParser.TargetTripleContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#initExp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInitExp(LLVMIRParser.InitExpContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#globalDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGlobalDecl(LLVMIRParser.GlobalDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#classDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassDecl(LLVMIRParser.ClassDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncCall(LLVMIRParser.FuncCallContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcInfo}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncInfo(LLVMIRParser.FuncInfoContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncDecl(LLVMIRParser.FuncDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncDef(LLVMIRParser.FuncDefContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#basicBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBasicBlock(LLVMIRParser.BasicBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#instDest}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInstDest(LLVMIRParser.InstDestContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#gepOffset}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGepOffset(LLVMIRParser.GepOffsetContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#phiBranch}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPhiBranch(LLVMIRParser.PhiBranchContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#cmpOp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCmpOp(LLVMIRParser.CmpOpContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#binaryOp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBinaryOp(LLVMIRParser.BinaryOpContext ctx);

    /**
     * Visit a parse tree produced by the {@code alloca}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlloca(LLVMIRParser.AllocaContext ctx);

    /**
     * Visit a parse tree produced by the {@code binary}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBinary(LLVMIRParser.BinaryContext ctx);

    /**
     * Visit a parse tree produced by the {@code bitcast}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitcast(LLVMIRParser.BitcastContext ctx);

    /**
     * Visit a parse tree produced by the {@code trunc}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTrunc(LLVMIRParser.TruncContext ctx);

    /**
     * Visit a parse tree produced by the {@code zext}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitZext(LLVMIRParser.ZextContext ctx);

    /**
     * Visit a parse tree produced by the {@code br}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBr(LLVMIRParser.BrContext ctx);

    /**
     * Visit a parse tree produced by the {@code call}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCall(LLVMIRParser.CallContext ctx);

    /**
     * Visit a parse tree produced by the {@code getelementptr}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGetelementptr(LLVMIRParser.GetelementptrContext ctx);

    /**
     * Visit a parse tree produced by the {@code icmp}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIcmp(LLVMIRParser.IcmpContext ctx);

    /**
     * Visit a parse tree produced by the {@code load}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoad(LLVMIRParser.LoadContext ctx);

    /**
     * Visit a parse tree produced by the {@code store}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStore(LLVMIRParser.StoreContext ctx);

    /**
     * Visit a parse tree produced by the {@code ret}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRet(LLVMIRParser.RetContext ctx);

    /**
     * Visit a parse tree produced by the {@code phi}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPhi(LLVMIRParser.PhiContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#atom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtom(LLVMIRParser.AtomContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#alignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlignment(LLVMIRParser.AlignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(LLVMIRParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#arrayType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayType(LLVMIRParser.ArrayTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#basicType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBasicType(LLVMIRParser.BasicTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#integerConstant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntegerConstant(LLVMIRParser.IntegerConstantContext ctx);
}