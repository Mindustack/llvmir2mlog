package org.mindustack.LLVMIR;// Generated from java-escape by ANTLR 4.11.1

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
     * Visit a parse tree produced by {@link LLVMIRParser#compilationUnit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCompilationUnit(LLVMIRParser.CompilationUnitContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#targetDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTargetDef(LLVMIRParser.TargetDefContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sourceFilename}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSourceFilename(LLVMIRParser.SourceFilenameContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#targetDataLayout}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTargetDataLayout(LLVMIRParser.TargetDataLayoutContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#targetTriple}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTargetTriple(LLVMIRParser.TargetTripleContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#topLevelEntity}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTopLevelEntity(LLVMIRParser.TopLevelEntityContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#moduleAsm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitModuleAsm(LLVMIRParser.ModuleAsmContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#typeDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeDef(LLVMIRParser.TypeDefContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#comdatDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComdatDef(LLVMIRParser.ComdatDefContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#globalDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGlobalDecl(LLVMIRParser.GlobalDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#globalDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGlobalDef(LLVMIRParser.GlobalDefContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#indirectSymbolDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndirectSymbolDef(LLVMIRParser.IndirectSymbolDefContext ctx);

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
     * Visit a parse tree produced by {@link LLVMIRParser#attrGroupDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAttrGroupDef(LLVMIRParser.AttrGroupDefContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#namedMetadataDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamedMetadataDef(LLVMIRParser.NamedMetadataDefContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#metadataDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMetadataDef(LLVMIRParser.MetadataDefContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#useListOrder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUseListOrder(LLVMIRParser.UseListOrderContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#useListOrderBB}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUseListOrderBB(LLVMIRParser.UseListOrderBBContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcHeader}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncHeader(LLVMIRParser.FuncHeaderContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#indirectSymbol}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndirectSymbol(LLVMIRParser.IndirectSymbolContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#callingConv}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCallingConv(LLVMIRParser.CallingConvContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#callingConvInt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCallingConvInt(LLVMIRParser.CallingConvIntContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcHdrField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncHdrField(LLVMIRParser.FuncHdrFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#gc}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGc(LLVMIRParser.GcContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#prefix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrefix(LLVMIRParser.PrefixContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#prologue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrologue(LLVMIRParser.PrologueContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#personality}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPersonality(LLVMIRParser.PersonalityContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#returnAttribute}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnAttribute(LLVMIRParser.ReturnAttributeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncBody(LLVMIRParser.FuncBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#basicBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBasicBlock(LLVMIRParser.BasicBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInstruction(LLVMIRParser.InstructionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#terminator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTerminator(LLVMIRParser.TerminatorContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#localDefTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLocalDefTerm(LLVMIRParser.LocalDefTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#valueTerminator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueTerminator(LLVMIRParser.ValueTerminatorContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#retTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRetTerm(LLVMIRParser.RetTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#brTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBrTerm(LLVMIRParser.BrTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#condBrTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCondBrTerm(LLVMIRParser.CondBrTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#switchTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSwitchTerm(LLVMIRParser.SwitchTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#indirectBrTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndirectBrTerm(LLVMIRParser.IndirectBrTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#resumeTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResumeTerm(LLVMIRParser.ResumeTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#catchRetTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCatchRetTerm(LLVMIRParser.CatchRetTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#cleanupRetTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCleanupRetTerm(LLVMIRParser.CleanupRetTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#unreachableTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnreachableTerm(LLVMIRParser.UnreachableTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#invokeTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInvokeTerm(LLVMIRParser.InvokeTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#callBrTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCallBrTerm(LLVMIRParser.CallBrTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#catchSwitchTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCatchSwitchTerm(LLVMIRParser.CatchSwitchTermContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#label}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLabel(LLVMIRParser.LabelContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#case}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCase(LLVMIRParser.CaseContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#unwindTarget}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnwindTarget(LLVMIRParser.UnwindTargetContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#handlers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHandlers(LLVMIRParser.HandlersContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#metadataNode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMetadataNode(LLVMIRParser.MetadataNodeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiExpression(LLVMIRParser.DiExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diExpressionField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiExpressionField(LLVMIRParser.DiExpressionFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#globalField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGlobalField(LLVMIRParser.GlobalFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#section}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSection(LLVMIRParser.SectionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#comdat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComdat(LLVMIRParser.ComdatContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#partition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartition(LLVMIRParser.PartitionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstant(LLVMIRParser.ConstantContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#boolConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBoolConst(LLVMIRParser.BoolConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#intConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntConst(LLVMIRParser.IntConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#floatConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloatConst(LLVMIRParser.FloatConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#nullConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNullConst(LLVMIRParser.NullConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#noneConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoneConst(LLVMIRParser.NoneConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#structConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStructConst(LLVMIRParser.StructConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#arrayConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayConst(LLVMIRParser.ArrayConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#vectorConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVectorConst(LLVMIRParser.VectorConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#zeroInitializerConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitZeroInitializerConst(LLVMIRParser.ZeroInitializerConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#undefConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUndefConst(LLVMIRParser.UndefConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#poisonConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPoisonConst(LLVMIRParser.PoisonConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#blockAddressConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlockAddressConst(LLVMIRParser.BlockAddressConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#dsoLocalEquivalentConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDsoLocalEquivalentConst(LLVMIRParser.DsoLocalEquivalentConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#noCFIConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoCFIConst(LLVMIRParser.NoCFIConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#constantExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstantExpr(LLVMIRParser.ConstantExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#typeConst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeConst(LLVMIRParser.TypeConstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#metadataAttachment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMetadataAttachment(LLVMIRParser.MetadataAttachmentContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#mdNode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMdNode(LLVMIRParser.MdNodeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#mdTuple}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMdTuple(LLVMIRParser.MdTupleContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#metadata}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMetadata(LLVMIRParser.MetadataContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diArgList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiArgList(LLVMIRParser.DiArgListContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#typeValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeValue(LLVMIRParser.TypeValueContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValue(LLVMIRParser.ValueContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#inlineAsm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInlineAsm(LLVMIRParser.InlineAsmContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#mdString}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMdString(LLVMIRParser.MdStringContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#mdFieldOrInt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMdFieldOrInt(LLVMIRParser.MdFieldOrIntContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diSPFlag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiSPFlag(LLVMIRParser.DiSPFlagContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcAttribute}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncAttribute(LLVMIRParser.FuncAttributeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(LLVMIRParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#params}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParams(LLVMIRParser.ParamsContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#param}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParam(LLVMIRParser.ParamContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#paramAttribute}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParamAttribute(LLVMIRParser.ParamAttributeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#attrString}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAttrString(LLVMIRParser.AttrStringContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#attrPair}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAttrPair(LLVMIRParser.AttrPairContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#align}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlign(LLVMIRParser.AlignContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#alignPair}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlignPair(LLVMIRParser.AlignPairContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#alignStack}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlignStack(LLVMIRParser.AlignStackContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#alignStackPair}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlignStackPair(LLVMIRParser.AlignStackPairContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#allocKind}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAllocKind(LLVMIRParser.AllocKindContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#allocSize}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAllocSize(LLVMIRParser.AllocSizeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#unwindTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnwindTable(LLVMIRParser.UnwindTableContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#vectorScaleRange}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVectorScaleRange(LLVMIRParser.VectorScaleRangeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#byRefAttr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitByRefAttr(LLVMIRParser.ByRefAttrContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#byval}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitByval(LLVMIRParser.ByvalContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#dereferenceable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDereferenceable(LLVMIRParser.DereferenceableContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#elementType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElementType(LLVMIRParser.ElementTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#inAlloca}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInAlloca(LLVMIRParser.InAllocaContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#paramAttr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParamAttr(LLVMIRParser.ParamAttrContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#preallocated}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPreallocated(LLVMIRParser.PreallocatedContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#structRetAttr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStructRetAttr(LLVMIRParser.StructRetAttrContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#firstClassType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFirstClassType(LLVMIRParser.FirstClassTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#concreteType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConcreteType(LLVMIRParser.ConcreteTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#intType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntType(LLVMIRParser.IntTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#floatType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloatType(LLVMIRParser.FloatTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#pointerType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPointerType(LLVMIRParser.PointerTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#vectorType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVectorType(LLVMIRParser.VectorTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#labelType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLabelType(LLVMIRParser.LabelTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#arrayType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayType(LLVMIRParser.ArrayTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#structType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStructType(LLVMIRParser.StructTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#namedType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamedType(LLVMIRParser.NamedTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#mmxType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMmxType(LLVMIRParser.MmxTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#tokenType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTokenType(LLVMIRParser.TokenTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#opaquePointerType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOpaquePointerType(LLVMIRParser.OpaquePointerTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#addrSpace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddrSpace(LLVMIRParser.AddrSpaceContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#threadLocal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitThreadLocal(LLVMIRParser.ThreadLocalContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#metadataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMetadataType(LLVMIRParser.MetadataTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#bitCastExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitCastExpr(LLVMIRParser.BitCastExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#getElementPtrExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGetElementPtrExpr(LLVMIRParser.GetElementPtrExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#gepIndex}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGepIndex(LLVMIRParser.GepIndexContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#addrSpaceCastExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddrSpaceCastExpr(LLVMIRParser.AddrSpaceCastExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#intToPtrExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntToPtrExpr(LLVMIRParser.IntToPtrExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#iCmpExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitICmpExpr(LLVMIRParser.ICmpExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fCmpExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFCmpExpr(LLVMIRParser.FCmpExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#selectExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectExpr(LLVMIRParser.SelectExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#truncExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTruncExpr(LLVMIRParser.TruncExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#zExtExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitZExtExpr(LLVMIRParser.ZExtExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sExtExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSExtExpr(LLVMIRParser.SExtExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fpTruncExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFpTruncExpr(LLVMIRParser.FpTruncExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fpExtExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFpExtExpr(LLVMIRParser.FpExtExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fpToUiExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFpToUiExpr(LLVMIRParser.FpToUiExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fpToSiExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFpToSiExpr(LLVMIRParser.FpToSiExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#uiToFpExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUiToFpExpr(LLVMIRParser.UiToFpExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#siToFpExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSiToFpExpr(LLVMIRParser.SiToFpExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#ptrToIntExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPtrToIntExpr(LLVMIRParser.PtrToIntExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#extractElementExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtractElementExpr(LLVMIRParser.ExtractElementExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#insertElementExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInsertElementExpr(LLVMIRParser.InsertElementExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#shuffleVectorExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShuffleVectorExpr(LLVMIRParser.ShuffleVectorExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#shlExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShlExpr(LLVMIRParser.ShlExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#lShrExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLShrExpr(LLVMIRParser.LShrExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#aShrExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAShrExpr(LLVMIRParser.AShrExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#andExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAndExpr(LLVMIRParser.AndExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#orExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrExpr(LLVMIRParser.OrExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#xorExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitXorExpr(LLVMIRParser.XorExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#addExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddExpr(LLVMIRParser.AddExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#subExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubExpr(LLVMIRParser.SubExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#mulExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMulExpr(LLVMIRParser.MulExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fNegExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFNegExpr(LLVMIRParser.FNegExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#localDefInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLocalDefInst(LLVMIRParser.LocalDefInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#valueInstruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueInstruction(LLVMIRParser.ValueInstructionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#storeInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStoreInst(LLVMIRParser.StoreInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#syncScope}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSyncScope(LLVMIRParser.SyncScopeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fenceInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFenceInst(LLVMIRParser.FenceInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fNegInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFNegInst(LLVMIRParser.FNegInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#addInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddInst(LLVMIRParser.AddInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fAddInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFAddInst(LLVMIRParser.FAddInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#subInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubInst(LLVMIRParser.SubInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fSubInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFSubInst(LLVMIRParser.FSubInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#mulInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMulInst(LLVMIRParser.MulInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fMulInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFMulInst(LLVMIRParser.FMulInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#uDivInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUDivInst(LLVMIRParser.UDivInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sDivInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSDivInst(LLVMIRParser.SDivInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fDivInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFDivInst(LLVMIRParser.FDivInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#uRemInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitURemInst(LLVMIRParser.URemInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sRemInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSRemInst(LLVMIRParser.SRemInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fRemInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFRemInst(LLVMIRParser.FRemInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#shlInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShlInst(LLVMIRParser.ShlInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#lShrInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLShrInst(LLVMIRParser.LShrInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#aShrInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAShrInst(LLVMIRParser.AShrInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#andInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAndInst(LLVMIRParser.AndInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#orInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrInst(LLVMIRParser.OrInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#xorInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitXorInst(LLVMIRParser.XorInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#extractElementInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtractElementInst(LLVMIRParser.ExtractElementInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#insertElementInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInsertElementInst(LLVMIRParser.InsertElementInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#shuffleVectorInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShuffleVectorInst(LLVMIRParser.ShuffleVectorInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#extractValueInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtractValueInst(LLVMIRParser.ExtractValueInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#insertValueInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInsertValueInst(LLVMIRParser.InsertValueInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#allocaInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAllocaInst(LLVMIRParser.AllocaInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#loadInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadInst(LLVMIRParser.LoadInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#cmpXchgInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCmpXchgInst(LLVMIRParser.CmpXchgInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#atomicRMWInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtomicRMWInst(LLVMIRParser.AtomicRMWInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#getElementPtrInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGetElementPtrInst(LLVMIRParser.GetElementPtrInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#truncInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTruncInst(LLVMIRParser.TruncInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#zExtInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitZExtInst(LLVMIRParser.ZExtInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sExtInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSExtInst(LLVMIRParser.SExtInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fpTruncInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFpTruncInst(LLVMIRParser.FpTruncInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fpExtInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFpExtInst(LLVMIRParser.FpExtInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fpToUiInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFpToUiInst(LLVMIRParser.FpToUiInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fpToSiInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFpToSiInst(LLVMIRParser.FpToSiInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#uiToFpInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUiToFpInst(LLVMIRParser.UiToFpInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#siToFpInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSiToFpInst(LLVMIRParser.SiToFpInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#ptrToIntInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPtrToIntInst(LLVMIRParser.PtrToIntInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#intToPtrInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntToPtrInst(LLVMIRParser.IntToPtrInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#bitCastInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitCastInst(LLVMIRParser.BitCastInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#addrSpaceCastInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddrSpaceCastInst(LLVMIRParser.AddrSpaceCastInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#iCmpInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitICmpInst(LLVMIRParser.ICmpInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fCmpInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFCmpInst(LLVMIRParser.FCmpInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#phiInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPhiInst(LLVMIRParser.PhiInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#selectInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectInst(LLVMIRParser.SelectInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#freezeInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFreezeInst(LLVMIRParser.FreezeInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#callInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCallInst(LLVMIRParser.CallInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#vaargInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVaargInst(LLVMIRParser.VaargInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#landingPadInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLandingPadInst(LLVMIRParser.LandingPadInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#catchPadInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCatchPadInst(LLVMIRParser.CatchPadInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#cleanupPadInst}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCleanupPadInst(LLVMIRParser.CleanupPadInstContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#inc}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInc(LLVMIRParser.IncContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#operandBundle}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOperandBundle(LLVMIRParser.OperandBundleContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#clause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClause(LLVMIRParser.ClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#args}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgs(LLVMIRParser.ArgsContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#arg}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArg(LLVMIRParser.ArgContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#exceptionArg}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExceptionArg(LLVMIRParser.ExceptionArgContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#exceptionPad}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExceptionPad(LLVMIRParser.ExceptionPadContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#externalLinkage}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExternalLinkage(LLVMIRParser.ExternalLinkageContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#internalLinkage}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInternalLinkage(LLVMIRParser.InternalLinkageContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#linkage}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLinkage(LLVMIRParser.LinkageContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#preemption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPreemption(LLVMIRParser.PreemptionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#visibility}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVisibility(LLVMIRParser.VisibilityContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#dllStorageClass}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDllStorageClass(LLVMIRParser.DllStorageClassContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#tlsModel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTlsModel(LLVMIRParser.TlsModelContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#unnamedAddr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnnamedAddr(LLVMIRParser.UnnamedAddrContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#externallyInitialized}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExternallyInitialized(LLVMIRParser.ExternallyInitializedContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#immutable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImmutable(LLVMIRParser.ImmutableContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#funcAttr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncAttr(LLVMIRParser.FuncAttrContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#distinct}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDistinct(LLVMIRParser.DistinctContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#inBounds}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInBounds(LLVMIRParser.InBoundsContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#returnAttr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnAttr(LLVMIRParser.ReturnAttrContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#overflowFlag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOverflowFlag(LLVMIRParser.OverflowFlagContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#iPred}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIPred(LLVMIRParser.IPredContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fPred}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFPred(LLVMIRParser.FPredContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#atomicOrdering}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtomicOrdering(LLVMIRParser.AtomicOrderingContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#callingConvEnum}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCallingConvEnum(LLVMIRParser.CallingConvEnumContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fastMathFlag}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFastMathFlag(LLVMIRParser.FastMathFlagContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#atomicOp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtomicOp(LLVMIRParser.AtomicOpContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#floatKind}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloatKind(LLVMIRParser.FloatKindContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#specializedMDNode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSpecializedMDNode(LLVMIRParser.SpecializedMDNodeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diBasicType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiBasicType(LLVMIRParser.DiBasicTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diCommonBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiCommonBlock(LLVMIRParser.DiCommonBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diCompileUnit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiCompileUnit(LLVMIRParser.DiCompileUnitContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diCompositeType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiCompositeType(LLVMIRParser.DiCompositeTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diCompositeTypeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiCompositeTypeField(LLVMIRParser.DiCompositeTypeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diDerivedType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiDerivedType(LLVMIRParser.DiDerivedTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diDerivedTypeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiDerivedTypeField(LLVMIRParser.DiDerivedTypeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diEnumerator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiEnumerator(LLVMIRParser.DiEnumeratorContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diEnumeratorField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiEnumeratorField(LLVMIRParser.DiEnumeratorFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diFile}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiFile(LLVMIRParser.DiFileContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diFileField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiFileField(LLVMIRParser.DiFileFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diGlobalVariable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiGlobalVariable(LLVMIRParser.DiGlobalVariableContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diGlobalVariableField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiGlobalVariableField(LLVMIRParser.DiGlobalVariableFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diGlobalVariableExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiGlobalVariableExpression(LLVMIRParser.DiGlobalVariableExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diGlobalVariableExpressionField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiGlobalVariableExpressionField(LLVMIRParser.DiGlobalVariableExpressionFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diImportedEntity}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiImportedEntity(LLVMIRParser.DiImportedEntityContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diImportedEntityField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiImportedEntityField(LLVMIRParser.DiImportedEntityFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLabel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLabel(LLVMIRParser.DiLabelContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLabelField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLabelField(LLVMIRParser.DiLabelFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLexicalBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLexicalBlock(LLVMIRParser.DiLexicalBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLexicalBlockField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLexicalBlockField(LLVMIRParser.DiLexicalBlockFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLexicalBlockFile}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLexicalBlockFile(LLVMIRParser.DiLexicalBlockFileContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLexicalBlockFileField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLexicalBlockFileField(LLVMIRParser.DiLexicalBlockFileFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLocalVariable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLocalVariable(LLVMIRParser.DiLocalVariableContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLocalVariableField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLocalVariableField(LLVMIRParser.DiLocalVariableFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLocation(LLVMIRParser.DiLocationContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diLocationField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiLocationField(LLVMIRParser.DiLocationFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diMacro}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiMacro(LLVMIRParser.DiMacroContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diMacroField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiMacroField(LLVMIRParser.DiMacroFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diMacroFile}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiMacroFile(LLVMIRParser.DiMacroFileContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diMacroFileField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiMacroFileField(LLVMIRParser.DiMacroFileFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diModule}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiModule(LLVMIRParser.DiModuleContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diModuleField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiModuleField(LLVMIRParser.DiModuleFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diNamespace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiNamespace(LLVMIRParser.DiNamespaceContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diNamespaceField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiNamespaceField(LLVMIRParser.DiNamespaceFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diObjCProperty}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiObjCProperty(LLVMIRParser.DiObjCPropertyContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diObjCPropertyField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiObjCPropertyField(LLVMIRParser.DiObjCPropertyFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diStringType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiStringType(LLVMIRParser.DiStringTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diStringTypeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiStringTypeField(LLVMIRParser.DiStringTypeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diSubprogram}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiSubprogram(LLVMIRParser.DiSubprogramContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diSubprogramField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiSubprogramField(LLVMIRParser.DiSubprogramFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diSubrange}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiSubrange(LLVMIRParser.DiSubrangeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diSubrangeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiSubrangeField(LLVMIRParser.DiSubrangeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diSubroutineType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiSubroutineType(LLVMIRParser.DiSubroutineTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diTemplateTypeParameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiTemplateTypeParameter(LLVMIRParser.DiTemplateTypeParameterContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diTemplateValueParameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiTemplateValueParameter(LLVMIRParser.DiTemplateValueParameterContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#genericDiNode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGenericDiNode(LLVMIRParser.GenericDiNodeContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diTemplateTypeParameterField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiTemplateTypeParameterField(LLVMIRParser.DiTemplateTypeParameterFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diCompileUnitField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiCompileUnitField(LLVMIRParser.DiCompileUnitFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diCommonBlockField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiCommonBlockField(LLVMIRParser.DiCommonBlockFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diBasicTypeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiBasicTypeField(LLVMIRParser.DiBasicTypeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#genericDINodeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGenericDINodeField(LLVMIRParser.GenericDINodeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#tagField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTagField(LLVMIRParser.TagFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#headerField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHeaderField(LLVMIRParser.HeaderFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#operandsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOperandsField(LLVMIRParser.OperandsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diTemplateValueParameterField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiTemplateValueParameterField(LLVMIRParser.DiTemplateValueParameterFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#nameField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNameField(LLVMIRParser.NameFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#typeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeField(LLVMIRParser.TypeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#defaultedField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefaultedField(LLVMIRParser.DefaultedFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#valueField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueField(LLVMIRParser.ValueFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#mdField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMdField(LLVMIRParser.MdFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diSubroutineTypeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiSubroutineTypeField(LLVMIRParser.DiSubroutineTypeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#flagsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFlagsField(LLVMIRParser.FlagsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#diFlags}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiFlags(LLVMIRParser.DiFlagsContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#ccField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCcField(LLVMIRParser.CcFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#alignField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlignField(LLVMIRParser.AlignFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#allocatedField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAllocatedField(LLVMIRParser.AllocatedFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#annotationsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnnotationsField(LLVMIRParser.AnnotationsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#argField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgField(LLVMIRParser.ArgFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#associatedField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssociatedField(LLVMIRParser.AssociatedFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#attributesField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAttributesField(LLVMIRParser.AttributesFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#baseTypeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBaseTypeField(LLVMIRParser.BaseTypeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#checksumField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitChecksumField(LLVMIRParser.ChecksumFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#checksumkindField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitChecksumkindField(LLVMIRParser.ChecksumkindFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#columnField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnField(LLVMIRParser.ColumnFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#configMacrosField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConfigMacrosField(LLVMIRParser.ConfigMacrosFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#containingTypeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitContainingTypeField(LLVMIRParser.ContainingTypeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#countField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCountField(LLVMIRParser.CountFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#debugInfoForProfilingField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDebugInfoForProfilingField(LLVMIRParser.DebugInfoForProfilingFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#declarationField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDeclarationField(LLVMIRParser.DeclarationFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#directoryField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDirectoryField(LLVMIRParser.DirectoryFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#discriminatorField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiscriminatorField(LLVMIRParser.DiscriminatorFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#dataLocationField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDataLocationField(LLVMIRParser.DataLocationFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#discriminatorIntField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiscriminatorIntField(LLVMIRParser.DiscriminatorIntFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#dwarfAddressSpaceField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDwarfAddressSpaceField(LLVMIRParser.DwarfAddressSpaceFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#dwoIdField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDwoIdField(LLVMIRParser.DwoIdFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#elementsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElementsField(LLVMIRParser.ElementsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#emissionKindField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEmissionKindField(LLVMIRParser.EmissionKindFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#encodingField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEncodingField(LLVMIRParser.EncodingFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#entityField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEntityField(LLVMIRParser.EntityFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#enumsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEnumsField(LLVMIRParser.EnumsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#exportSymbolsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExportSymbolsField(LLVMIRParser.ExportSymbolsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#exprField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExprField(LLVMIRParser.ExprFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#extraDataField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtraDataField(LLVMIRParser.ExtraDataFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#fileField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFileField(LLVMIRParser.FileFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#filenameField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFilenameField(LLVMIRParser.FilenameFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#flagsStringField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFlagsStringField(LLVMIRParser.FlagsStringFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#getterField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGetterField(LLVMIRParser.GetterFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#globalsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGlobalsField(LLVMIRParser.GlobalsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#identifierField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierField(LLVMIRParser.IdentifierFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#importsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportsField(LLVMIRParser.ImportsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#includePathField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIncludePathField(LLVMIRParser.IncludePathFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#inlinedAtField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInlinedAtField(LLVMIRParser.InlinedAtFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#isDeclField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsDeclField(LLVMIRParser.IsDeclFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#isDefinitionField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsDefinitionField(LLVMIRParser.IsDefinitionFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#isImplicitCodeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsImplicitCodeField(LLVMIRParser.IsImplicitCodeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#isLocalField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsLocalField(LLVMIRParser.IsLocalFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#isOptimizedField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsOptimizedField(LLVMIRParser.IsOptimizedFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#isUnsignedField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsUnsignedField(LLVMIRParser.IsUnsignedFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#apiNotesField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitApiNotesField(LLVMIRParser.ApiNotesFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#languageField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLanguageField(LLVMIRParser.LanguageFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#lineField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLineField(LLVMIRParser.LineFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#linkageNameField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLinkageNameField(LLVMIRParser.LinkageNameFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#lowerBoundField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLowerBoundField(LLVMIRParser.LowerBoundFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#macrosField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMacrosField(LLVMIRParser.MacrosFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#nameTableKindField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNameTableKindField(LLVMIRParser.NameTableKindFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#nodesField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNodesField(LLVMIRParser.NodesFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#offsetField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOffsetField(LLVMIRParser.OffsetFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#producerField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProducerField(LLVMIRParser.ProducerFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#rangesBaseAddressField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRangesBaseAddressField(LLVMIRParser.RangesBaseAddressFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#rankField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRankField(LLVMIRParser.RankFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#retainedNodesField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRetainedNodesField(LLVMIRParser.RetainedNodesFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#retainedTypesField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRetainedTypesField(LLVMIRParser.RetainedTypesFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#runtimeLangField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRuntimeLangField(LLVMIRParser.RuntimeLangFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#runtimeVersionField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRuntimeVersionField(LLVMIRParser.RuntimeVersionFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#scopeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitScopeField(LLVMIRParser.ScopeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#scopeLineField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitScopeLineField(LLVMIRParser.ScopeLineFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sdkField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSdkField(LLVMIRParser.SdkFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#setterField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetterField(LLVMIRParser.SetterFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sizeField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSizeField(LLVMIRParser.SizeFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sourceField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSourceField(LLVMIRParser.SourceFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#spFlagsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSpFlagsField(LLVMIRParser.SpFlagsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#splitDebugFilenameField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSplitDebugFilenameField(LLVMIRParser.SplitDebugFilenameFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#splitDebugInliningField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSplitDebugInliningField(LLVMIRParser.SplitDebugInliningFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#strideField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStrideField(LLVMIRParser.StrideFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#stringLengthField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringLengthField(LLVMIRParser.StringLengthFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#stringLengthExpressionField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringLengthExpressionField(LLVMIRParser.StringLengthExpressionFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#stringLocationExpressionField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringLocationExpressionField(LLVMIRParser.StringLocationExpressionFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#sysrootField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSysrootField(LLVMIRParser.SysrootFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#targetFuncNameField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTargetFuncNameField(LLVMIRParser.TargetFuncNameFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#templateParamsField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTemplateParamsField(LLVMIRParser.TemplateParamsFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#thisAdjustmentField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitThisAdjustmentField(LLVMIRParser.ThisAdjustmentFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#thrownTypesField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitThrownTypesField(LLVMIRParser.ThrownTypesFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#typeMacinfoField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeMacinfoField(LLVMIRParser.TypeMacinfoFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#typesField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypesField(LLVMIRParser.TypesFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#unitField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnitField(LLVMIRParser.UnitFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#upperBoundField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUpperBoundField(LLVMIRParser.UpperBoundFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#valueIntField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueIntField(LLVMIRParser.ValueIntFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#valueStringField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueStringField(LLVMIRParser.ValueStringFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#varField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarField(LLVMIRParser.VarFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#virtualIndexField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVirtualIndexField(LLVMIRParser.VirtualIndexFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#virtualityField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVirtualityField(LLVMIRParser.VirtualityFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link LLVMIRParser#vtableHolderField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVtableHolderField(LLVMIRParser.VtableHolderFieldContext ctx);
}