// Generated from ../src/darksword/interpreter/generated/LLVMIR.g4 by ANTLR 4.7.2

package darksword.interpreter.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LLVMIRParser}.
 */
public interface LLVMIRListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link LLVMIRParser#rootLLVMIR}.
     *
     * @param ctx the parse tree
     */
    void enterRootLLVMIR(LLVMIRParser.RootLLVMIRContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#rootLLVMIR}.
     *
     * @param ctx the parse tree
     */
    void exitRootLLVMIR(LLVMIRParser.RootLLVMIRContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#targetInfo}.
     *
     * @param ctx the parse tree
     */
    void enterTargetInfo(LLVMIRParser.TargetInfoContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#targetInfo}.
     *
     * @param ctx the parse tree
     */
    void exitTargetInfo(LLVMIRParser.TargetInfoContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sourceFn}.
     *
     * @param ctx the parse tree
     */
    void enterSourceFn(LLVMIRParser.SourceFnContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sourceFn}.
     *
     * @param ctx the parse tree
     */
    void exitSourceFn(LLVMIRParser.SourceFnContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#dataLayout}.
     *
     * @param ctx the parse tree
     */
    void enterDataLayout(LLVMIRParser.DataLayoutContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#dataLayout}.
     *
     * @param ctx the parse tree
     */
    void exitDataLayout(LLVMIRParser.DataLayoutContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#targetTriple}.
     *
     * @param ctx the parse tree
     */
    void enterTargetTriple(LLVMIRParser.TargetTripleContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#targetTriple}.
     *
     * @param ctx the parse tree
     */
    void exitTargetTriple(LLVMIRParser.TargetTripleContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#initExp}.
     *
     * @param ctx the parse tree
     */
    void enterInitExp(LLVMIRParser.InitExpContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#initExp}.
     *
     * @param ctx the parse tree
     */
    void exitInitExp(LLVMIRParser.InitExpContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#globalDecl}.
     *
     * @param ctx the parse tree
     */
    void enterGlobalDecl(LLVMIRParser.GlobalDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#globalDecl}.
     *
     * @param ctx the parse tree
     */
    void exitGlobalDecl(LLVMIRParser.GlobalDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#classDecl}.
     *
     * @param ctx the parse tree
     */
    void enterClassDecl(LLVMIRParser.ClassDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#classDecl}.
     *
     * @param ctx the parse tree
     */
    void exitClassDecl(LLVMIRParser.ClassDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void enterFuncCall(LLVMIRParser.FuncCallContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void exitFuncCall(LLVMIRParser.FuncCallContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcInfo}.
     *
     * @param ctx the parse tree
     */
    void enterFuncInfo(LLVMIRParser.FuncInfoContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcInfo}.
     *
     * @param ctx the parse tree
     */
    void exitFuncInfo(LLVMIRParser.FuncInfoContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcDecl}.
     *
     * @param ctx the parse tree
     */
    void enterFuncDecl(LLVMIRParser.FuncDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcDecl}.
     *
     * @param ctx the parse tree
     */
    void exitFuncDecl(LLVMIRParser.FuncDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcDef}.
     *
     * @param ctx the parse tree
     */
    void enterFuncDef(LLVMIRParser.FuncDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcDef}.
     *
     * @param ctx the parse tree
     */
    void exitFuncDef(LLVMIRParser.FuncDefContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#basicBlock}.
     *
     * @param ctx the parse tree
     */
    void enterBasicBlock(LLVMIRParser.BasicBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#basicBlock}.
     *
     * @param ctx the parse tree
     */
    void exitBasicBlock(LLVMIRParser.BasicBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#instDest}.
     *
     * @param ctx the parse tree
     */
    void enterInstDest(LLVMIRParser.InstDestContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#instDest}.
     *
     * @param ctx the parse tree
     */
    void exitInstDest(LLVMIRParser.InstDestContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#gepOffset}.
     *
     * @param ctx the parse tree
     */
    void enterGepOffset(LLVMIRParser.GepOffsetContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#gepOffset}.
     *
     * @param ctx the parse tree
     */
    void exitGepOffset(LLVMIRParser.GepOffsetContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#phiBranch}.
     *
     * @param ctx the parse tree
     */
    void enterPhiBranch(LLVMIRParser.PhiBranchContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#phiBranch}.
     *
     * @param ctx the parse tree
     */
    void exitPhiBranch(LLVMIRParser.PhiBranchContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#cmpOp}.
     *
     * @param ctx the parse tree
     */
    void enterCmpOp(LLVMIRParser.CmpOpContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#cmpOp}.
     *
     * @param ctx the parse tree
     */
    void exitCmpOp(LLVMIRParser.CmpOpContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#binaryOp}.
     *
     * @param ctx the parse tree
     */
    void enterBinaryOp(LLVMIRParser.BinaryOpContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#binaryOp}.
     *
     * @param ctx the parse tree
     */
    void exitBinaryOp(LLVMIRParser.BinaryOpContext ctx);

    /**
     * Enter a parse tree produced by the {@code alloca}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterAlloca(LLVMIRParser.AllocaContext ctx);

    /**
     * Exit a parse tree produced by the {@code alloca}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitAlloca(LLVMIRParser.AllocaContext ctx);

    /**
     * Enter a parse tree produced by the {@code binary}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterBinary(LLVMIRParser.BinaryContext ctx);

    /**
     * Exit a parse tree produced by the {@code binary}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitBinary(LLVMIRParser.BinaryContext ctx);

    /**
     * Enter a parse tree produced by the {@code bitcast}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterBitcast(LLVMIRParser.BitcastContext ctx);

    /**
     * Exit a parse tree produced by the {@code bitcast}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitBitcast(LLVMIRParser.BitcastContext ctx);

    /**
     * Enter a parse tree produced by the {@code trunc}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterTrunc(LLVMIRParser.TruncContext ctx);

    /**
     * Exit a parse tree produced by the {@code trunc}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitTrunc(LLVMIRParser.TruncContext ctx);

    /**
     * Enter a parse tree produced by the {@code zext}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterZext(LLVMIRParser.ZextContext ctx);

    /**
     * Exit a parse tree produced by the {@code zext}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitZext(LLVMIRParser.ZextContext ctx);

    /**
     * Enter a parse tree produced by the {@code br}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterBr(LLVMIRParser.BrContext ctx);

    /**
     * Exit a parse tree produced by the {@code br}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitBr(LLVMIRParser.BrContext ctx);

    /**
     * Enter a parse tree produced by the {@code call}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterCall(LLVMIRParser.CallContext ctx);

    /**
     * Exit a parse tree produced by the {@code call}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitCall(LLVMIRParser.CallContext ctx);

    /**
     * Enter a parse tree produced by the {@code getelementptr}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterGetelementptr(LLVMIRParser.GetelementptrContext ctx);

    /**
     * Exit a parse tree produced by the {@code getelementptr}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitGetelementptr(LLVMIRParser.GetelementptrContext ctx);

    /**
     * Enter a parse tree produced by the {@code icmp}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterIcmp(LLVMIRParser.IcmpContext ctx);

    /**
     * Exit a parse tree produced by the {@code icmp}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitIcmp(LLVMIRParser.IcmpContext ctx);

    /**
     * Enter a parse tree produced by the {@code load}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterLoad(LLVMIRParser.LoadContext ctx);

    /**
     * Exit a parse tree produced by the {@code load}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitLoad(LLVMIRParser.LoadContext ctx);

    /**
     * Enter a parse tree produced by the {@code store}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterStore(LLVMIRParser.StoreContext ctx);

    /**
     * Exit a parse tree produced by the {@code store}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitStore(LLVMIRParser.StoreContext ctx);

    /**
     * Enter a parse tree produced by the {@code ret}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterRet(LLVMIRParser.RetContext ctx);

    /**
     * Exit a parse tree produced by the {@code ret}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitRet(LLVMIRParser.RetContext ctx);

    /**
     * Enter a parse tree produced by the {@code phi}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterPhi(LLVMIRParser.PhiContext ctx);

    /**
     * Exit a parse tree produced by the {@code phi}
     * labeled alternative in {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitPhi(LLVMIRParser.PhiContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtom(LLVMIRParser.AtomContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtom(LLVMIRParser.AtomContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#alignment}.
     *
     * @param ctx the parse tree
     */
    void enterAlignment(LLVMIRParser.AlignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#alignment}.
     *
     * @param ctx the parse tree
     */
    void exitAlignment(LLVMIRParser.AlignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(LLVMIRParser.TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(LLVMIRParser.TypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#arrayType}.
     *
     * @param ctx the parse tree
     */
    void enterArrayType(LLVMIRParser.ArrayTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#arrayType}.
     *
     * @param ctx the parse tree
     */
    void exitArrayType(LLVMIRParser.ArrayTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#basicType}.
     *
     * @param ctx the parse tree
     */
    void enterBasicType(LLVMIRParser.BasicTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#basicType}.
     *
     * @param ctx the parse tree
     */
    void exitBasicType(LLVMIRParser.BasicTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#integerConstant}.
     *
     * @param ctx the parse tree
     */
    void enterIntegerConstant(LLVMIRParser.IntegerConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#integerConstant}.
     *
     * @param ctx the parse tree
     */
    void exitIntegerConstant(LLVMIRParser.IntegerConstantContext ctx);
}