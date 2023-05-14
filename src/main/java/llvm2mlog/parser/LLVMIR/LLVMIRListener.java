package llvm2mlog.parser.LLVMIR;// Generated from java-escape by ANTLR 4.11.1

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LLVMIRParser}.
 */
public interface LLVMIRListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link LLVMIRParser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void enterCompilationUnit(LLVMIRParser.CompilationUnitContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void exitCompilationUnit(LLVMIRParser.CompilationUnitContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#targetDef}.
     *
     * @param ctx the parse tree
     */
    void enterTargetDef(LLVMIRParser.TargetDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#targetDef}.
     *
     * @param ctx the parse tree
     */
    void exitTargetDef(LLVMIRParser.TargetDefContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sourceFilename}.
     *
     * @param ctx the parse tree
     */
    void enterSourceFilename(LLVMIRParser.SourceFilenameContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sourceFilename}.
     *
     * @param ctx the parse tree
     */
    void exitSourceFilename(LLVMIRParser.SourceFilenameContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#targetDataLayout}.
     *
     * @param ctx the parse tree
     */
    void enterTargetDataLayout(LLVMIRParser.TargetDataLayoutContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#targetDataLayout}.
     *
     * @param ctx the parse tree
     */
    void exitTargetDataLayout(LLVMIRParser.TargetDataLayoutContext ctx);

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
     * Enter a parse tree produced by {@link LLVMIRParser#topLevelEntity}.
     *
     * @param ctx the parse tree
     */
    void enterTopLevelEntity(LLVMIRParser.TopLevelEntityContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#topLevelEntity}.
     *
     * @param ctx the parse tree
     */
    void exitTopLevelEntity(LLVMIRParser.TopLevelEntityContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#moduleAsm}.
     *
     * @param ctx the parse tree
     */
    void enterModuleAsm(LLVMIRParser.ModuleAsmContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#moduleAsm}.
     *
     * @param ctx the parse tree
     */
    void exitModuleAsm(LLVMIRParser.ModuleAsmContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#typeDef}.
     *
     * @param ctx the parse tree
     */
    void enterTypeDef(LLVMIRParser.TypeDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#typeDef}.
     *
     * @param ctx the parse tree
     */
    void exitTypeDef(LLVMIRParser.TypeDefContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#comdatDef}.
     *
     * @param ctx the parse tree
     */
    void enterComdatDef(LLVMIRParser.ComdatDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#comdatDef}.
     *
     * @param ctx the parse tree
     */
    void exitComdatDef(LLVMIRParser.ComdatDefContext ctx);

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
     * Enter a parse tree produced by {@link LLVMIRParser#globalDef}.
     *
     * @param ctx the parse tree
     */
    void enterGlobalDef(LLVMIRParser.GlobalDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#globalDef}.
     *
     * @param ctx the parse tree
     */
    void exitGlobalDef(LLVMIRParser.GlobalDefContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#indirectSymbolDef}.
     *
     * @param ctx the parse tree
     */
    void enterIndirectSymbolDef(LLVMIRParser.IndirectSymbolDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#indirectSymbolDef}.
     *
     * @param ctx the parse tree
     */
    void exitIndirectSymbolDef(LLVMIRParser.IndirectSymbolDefContext ctx);

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
     * Enter a parse tree produced by {@link LLVMIRParser#attrGroupDef}.
     *
     * @param ctx the parse tree
     */
    void enterAttrGroupDef(LLVMIRParser.AttrGroupDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#attrGroupDef}.
     *
     * @param ctx the parse tree
     */
    void exitAttrGroupDef(LLVMIRParser.AttrGroupDefContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#namedMetadataDef}.
     *
     * @param ctx the parse tree
     */
    void enterNamedMetadataDef(LLVMIRParser.NamedMetadataDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#namedMetadataDef}.
     *
     * @param ctx the parse tree
     */
    void exitNamedMetadataDef(LLVMIRParser.NamedMetadataDefContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#metadataDef}.
     *
     * @param ctx the parse tree
     */
    void enterMetadataDef(LLVMIRParser.MetadataDefContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#metadataDef}.
     *
     * @param ctx the parse tree
     */
    void exitMetadataDef(LLVMIRParser.MetadataDefContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#useListOrder}.
     *
     * @param ctx the parse tree
     */
    void enterUseListOrder(LLVMIRParser.UseListOrderContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#useListOrder}.
     *
     * @param ctx the parse tree
     */
    void exitUseListOrder(LLVMIRParser.UseListOrderContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#useListOrderBB}.
     *
     * @param ctx the parse tree
     */
    void enterUseListOrderBB(LLVMIRParser.UseListOrderBBContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#useListOrderBB}.
     *
     * @param ctx the parse tree
     */
    void exitUseListOrderBB(LLVMIRParser.UseListOrderBBContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcHeader}.
     *
     * @param ctx the parse tree
     */
    void enterFuncHeader(LLVMIRParser.FuncHeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcHeader}.
     *
     * @param ctx the parse tree
     */
    void exitFuncHeader(LLVMIRParser.FuncHeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#indirectSymbol}.
     *
     * @param ctx the parse tree
     */
    void enterIndirectSymbol(LLVMIRParser.IndirectSymbolContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#indirectSymbol}.
     *
     * @param ctx the parse tree
     */
    void exitIndirectSymbol(LLVMIRParser.IndirectSymbolContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#callingConv}.
     *
     * @param ctx the parse tree
     */
    void enterCallingConv(LLVMIRParser.CallingConvContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#callingConv}.
     *
     * @param ctx the parse tree
     */
    void exitCallingConv(LLVMIRParser.CallingConvContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#callingConvInt}.
     *
     * @param ctx the parse tree
     */
    void enterCallingConvInt(LLVMIRParser.CallingConvIntContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#callingConvInt}.
     *
     * @param ctx the parse tree
     */
    void exitCallingConvInt(LLVMIRParser.CallingConvIntContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcHdrField}.
     *
     * @param ctx the parse tree
     */
    void enterFuncHdrField(LLVMIRParser.FuncHdrFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcHdrField}.
     *
     * @param ctx the parse tree
     */
    void exitFuncHdrField(LLVMIRParser.FuncHdrFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#gc}.
     *
     * @param ctx the parse tree
     */
    void enterGc(LLVMIRParser.GcContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#gc}.
     *
     * @param ctx the parse tree
     */
    void exitGc(LLVMIRParser.GcContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#prefix}.
     *
     * @param ctx the parse tree
     */
    void enterPrefix(LLVMIRParser.PrefixContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#prefix}.
     *
     * @param ctx the parse tree
     */
    void exitPrefix(LLVMIRParser.PrefixContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#prologue}.
     *
     * @param ctx the parse tree
     */
    void enterPrologue(LLVMIRParser.PrologueContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#prologue}.
     *
     * @param ctx the parse tree
     */
    void exitPrologue(LLVMIRParser.PrologueContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#personality}.
     *
     * @param ctx the parse tree
     */
    void enterPersonality(LLVMIRParser.PersonalityContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#personality}.
     *
     * @param ctx the parse tree
     */
    void exitPersonality(LLVMIRParser.PersonalityContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#returnAttribute}.
     *
     * @param ctx the parse tree
     */
    void enterReturnAttribute(LLVMIRParser.ReturnAttributeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#returnAttribute}.
     *
     * @param ctx the parse tree
     */
    void exitReturnAttribute(LLVMIRParser.ReturnAttributeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcBody}.
     *
     * @param ctx the parse tree
     */
    void enterFuncBody(LLVMIRParser.FuncBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcBody}.
     *
     * @param ctx the parse tree
     */
    void exitFuncBody(LLVMIRParser.FuncBodyContext ctx);

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
     * Enter a parse tree produced by {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterInstruction(LLVMIRParser.InstructionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitInstruction(LLVMIRParser.InstructionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#terminator}.
     *
     * @param ctx the parse tree
     */
    void enterTerminator(LLVMIRParser.TerminatorContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#terminator}.
     *
     * @param ctx the parse tree
     */
    void exitTerminator(LLVMIRParser.TerminatorContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#localDefTerm}.
     *
     * @param ctx the parse tree
     */
    void enterLocalDefTerm(LLVMIRParser.LocalDefTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#localDefTerm}.
     *
     * @param ctx the parse tree
     */
    void exitLocalDefTerm(LLVMIRParser.LocalDefTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#valueTerminator}.
     *
     * @param ctx the parse tree
     */
    void enterValueTerminator(LLVMIRParser.ValueTerminatorContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#valueTerminator}.
     *
     * @param ctx the parse tree
     */
    void exitValueTerminator(LLVMIRParser.ValueTerminatorContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#retTerm}.
     *
     * @param ctx the parse tree
     */
    void enterRetTerm(LLVMIRParser.RetTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#retTerm}.
     *
     * @param ctx the parse tree
     */
    void exitRetTerm(LLVMIRParser.RetTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#brTerm}.
     *
     * @param ctx the parse tree
     */
    void enterBrTerm(LLVMIRParser.BrTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#brTerm}.
     *
     * @param ctx the parse tree
     */
    void exitBrTerm(LLVMIRParser.BrTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#condBrTerm}.
     *
     * @param ctx the parse tree
     */
    void enterCondBrTerm(LLVMIRParser.CondBrTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#condBrTerm}.
     *
     * @param ctx the parse tree
     */
    void exitCondBrTerm(LLVMIRParser.CondBrTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#switchTerm}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchTerm(LLVMIRParser.SwitchTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#switchTerm}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchTerm(LLVMIRParser.SwitchTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#indirectBrTerm}.
     *
     * @param ctx the parse tree
     */
    void enterIndirectBrTerm(LLVMIRParser.IndirectBrTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#indirectBrTerm}.
     *
     * @param ctx the parse tree
     */
    void exitIndirectBrTerm(LLVMIRParser.IndirectBrTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#resumeTerm}.
     *
     * @param ctx the parse tree
     */
    void enterResumeTerm(LLVMIRParser.ResumeTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#resumeTerm}.
     *
     * @param ctx the parse tree
     */
    void exitResumeTerm(LLVMIRParser.ResumeTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#catchRetTerm}.
     *
     * @param ctx the parse tree
     */
    void enterCatchRetTerm(LLVMIRParser.CatchRetTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#catchRetTerm}.
     *
     * @param ctx the parse tree
     */
    void exitCatchRetTerm(LLVMIRParser.CatchRetTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#cleanupRetTerm}.
     *
     * @param ctx the parse tree
     */
    void enterCleanupRetTerm(LLVMIRParser.CleanupRetTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#cleanupRetTerm}.
     *
     * @param ctx the parse tree
     */
    void exitCleanupRetTerm(LLVMIRParser.CleanupRetTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#unreachableTerm}.
     *
     * @param ctx the parse tree
     */
    void enterUnreachableTerm(LLVMIRParser.UnreachableTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#unreachableTerm}.
     *
     * @param ctx the parse tree
     */
    void exitUnreachableTerm(LLVMIRParser.UnreachableTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#invokeTerm}.
     *
     * @param ctx the parse tree
     */
    void enterInvokeTerm(LLVMIRParser.InvokeTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#invokeTerm}.
     *
     * @param ctx the parse tree
     */
    void exitInvokeTerm(LLVMIRParser.InvokeTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#callBrTerm}.
     *
     * @param ctx the parse tree
     */
    void enterCallBrTerm(LLVMIRParser.CallBrTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#callBrTerm}.
     *
     * @param ctx the parse tree
     */
    void exitCallBrTerm(LLVMIRParser.CallBrTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#catchSwitchTerm}.
     *
     * @param ctx the parse tree
     */
    void enterCatchSwitchTerm(LLVMIRParser.CatchSwitchTermContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#catchSwitchTerm}.
     *
     * @param ctx the parse tree
     */
    void exitCatchSwitchTerm(LLVMIRParser.CatchSwitchTermContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#label}.
     *
     * @param ctx the parse tree
     */
    void enterLabel(LLVMIRParser.LabelContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#label}.
     *
     * @param ctx the parse tree
     */
    void exitLabel(LLVMIRParser.LabelContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#case}.
     *
     * @param ctx the parse tree
     */
    void enterCase(LLVMIRParser.CaseContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#case}.
     *
     * @param ctx the parse tree
     */
    void exitCase(LLVMIRParser.CaseContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#unwindTarget}.
     *
     * @param ctx the parse tree
     */
    void enterUnwindTarget(LLVMIRParser.UnwindTargetContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#unwindTarget}.
     *
     * @param ctx the parse tree
     */
    void exitUnwindTarget(LLVMIRParser.UnwindTargetContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#handlers}.
     *
     * @param ctx the parse tree
     */
    void enterHandlers(LLVMIRParser.HandlersContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#handlers}.
     *
     * @param ctx the parse tree
     */
    void exitHandlers(LLVMIRParser.HandlersContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#metadataNode}.
     *
     * @param ctx the parse tree
     */
    void enterMetadataNode(LLVMIRParser.MetadataNodeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#metadataNode}.
     *
     * @param ctx the parse tree
     */
    void exitMetadataNode(LLVMIRParser.MetadataNodeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diExpression}.
     *
     * @param ctx the parse tree
     */
    void enterDiExpression(LLVMIRParser.DiExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diExpression}.
     *
     * @param ctx the parse tree
     */
    void exitDiExpression(LLVMIRParser.DiExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diExpressionField}.
     *
     * @param ctx the parse tree
     */
    void enterDiExpressionField(LLVMIRParser.DiExpressionFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diExpressionField}.
     *
     * @param ctx the parse tree
     */
    void exitDiExpressionField(LLVMIRParser.DiExpressionFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#globalField}.
     *
     * @param ctx the parse tree
     */
    void enterGlobalField(LLVMIRParser.GlobalFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#globalField}.
     *
     * @param ctx the parse tree
     */
    void exitGlobalField(LLVMIRParser.GlobalFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#section}.
     *
     * @param ctx the parse tree
     */
    void enterSection(LLVMIRParser.SectionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#section}.
     *
     * @param ctx the parse tree
     */
    void exitSection(LLVMIRParser.SectionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#comdat}.
     *
     * @param ctx the parse tree
     */
    void enterComdat(LLVMIRParser.ComdatContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#comdat}.
     *
     * @param ctx the parse tree
     */
    void exitComdat(LLVMIRParser.ComdatContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#partition}.
     *
     * @param ctx the parse tree
     */
    void enterPartition(LLVMIRParser.PartitionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#partition}.
     *
     * @param ctx the parse tree
     */
    void exitPartition(LLVMIRParser.PartitionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterConstant(LLVMIRParser.ConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitConstant(LLVMIRParser.ConstantContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#boolConst}.
     *
     * @param ctx the parse tree
     */
    void enterBoolConst(LLVMIRParser.BoolConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#boolConst}.
     *
     * @param ctx the parse tree
     */
    void exitBoolConst(LLVMIRParser.BoolConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#intConst}.
     *
     * @param ctx the parse tree
     */
    void enterIntConst(LLVMIRParser.IntConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#intConst}.
     *
     * @param ctx the parse tree
     */
    void exitIntConst(LLVMIRParser.IntConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#floatConst}.
     *
     * @param ctx the parse tree
     */
    void enterFloatConst(LLVMIRParser.FloatConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#floatConst}.
     *
     * @param ctx the parse tree
     */
    void exitFloatConst(LLVMIRParser.FloatConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#nullConst}.
     *
     * @param ctx the parse tree
     */
    void enterNullConst(LLVMIRParser.NullConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#nullConst}.
     *
     * @param ctx the parse tree
     */
    void exitNullConst(LLVMIRParser.NullConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#noneConst}.
     *
     * @param ctx the parse tree
     */
    void enterNoneConst(LLVMIRParser.NoneConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#noneConst}.
     *
     * @param ctx the parse tree
     */
    void exitNoneConst(LLVMIRParser.NoneConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#structConst}.
     *
     * @param ctx the parse tree
     */
    void enterStructConst(LLVMIRParser.StructConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#structConst}.
     *
     * @param ctx the parse tree
     */
    void exitStructConst(LLVMIRParser.StructConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#arrayConst}.
     *
     * @param ctx the parse tree
     */
    void enterArrayConst(LLVMIRParser.ArrayConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#arrayConst}.
     *
     * @param ctx the parse tree
     */
    void exitArrayConst(LLVMIRParser.ArrayConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#vectorConst}.
     *
     * @param ctx the parse tree
     */
    void enterVectorConst(LLVMIRParser.VectorConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#vectorConst}.
     *
     * @param ctx the parse tree
     */
    void exitVectorConst(LLVMIRParser.VectorConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#zeroInitializerConst}.
     *
     * @param ctx the parse tree
     */
    void enterZeroInitializerConst(LLVMIRParser.ZeroInitializerConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#zeroInitializerConst}.
     *
     * @param ctx the parse tree
     */
    void exitZeroInitializerConst(LLVMIRParser.ZeroInitializerConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#undefConst}.
     *
     * @param ctx the parse tree
     */
    void enterUndefConst(LLVMIRParser.UndefConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#undefConst}.
     *
     * @param ctx the parse tree
     */
    void exitUndefConst(LLVMIRParser.UndefConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#poisonConst}.
     *
     * @param ctx the parse tree
     */
    void enterPoisonConst(LLVMIRParser.PoisonConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#poisonConst}.
     *
     * @param ctx the parse tree
     */
    void exitPoisonConst(LLVMIRParser.PoisonConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#blockAddressConst}.
     *
     * @param ctx the parse tree
     */
    void enterBlockAddressConst(LLVMIRParser.BlockAddressConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#blockAddressConst}.
     *
     * @param ctx the parse tree
     */
    void exitBlockAddressConst(LLVMIRParser.BlockAddressConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#dsoLocalEquivalentConst}.
     *
     * @param ctx the parse tree
     */
    void enterDsoLocalEquivalentConst(LLVMIRParser.DsoLocalEquivalentConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#dsoLocalEquivalentConst}.
     *
     * @param ctx the parse tree
     */
    void exitDsoLocalEquivalentConst(LLVMIRParser.DsoLocalEquivalentConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#noCFIConst}.
     *
     * @param ctx the parse tree
     */
    void enterNoCFIConst(LLVMIRParser.NoCFIConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#noCFIConst}.
     *
     * @param ctx the parse tree
     */
    void exitNoCFIConst(LLVMIRParser.NoCFIConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#constantExpr}.
     *
     * @param ctx the parse tree
     */
    void enterConstantExpr(LLVMIRParser.ConstantExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#constantExpr}.
     *
     * @param ctx the parse tree
     */
    void exitConstantExpr(LLVMIRParser.ConstantExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#typeConst}.
     *
     * @param ctx the parse tree
     */
    void enterTypeConst(LLVMIRParser.TypeConstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#typeConst}.
     *
     * @param ctx the parse tree
     */
    void exitTypeConst(LLVMIRParser.TypeConstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#metadataAttachment}.
     *
     * @param ctx the parse tree
     */
    void enterMetadataAttachment(LLVMIRParser.MetadataAttachmentContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#metadataAttachment}.
     *
     * @param ctx the parse tree
     */
    void exitMetadataAttachment(LLVMIRParser.MetadataAttachmentContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#mdNode}.
     *
     * @param ctx the parse tree
     */
    void enterMdNode(LLVMIRParser.MdNodeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#mdNode}.
     *
     * @param ctx the parse tree
     */
    void exitMdNode(LLVMIRParser.MdNodeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#mdTuple}.
     *
     * @param ctx the parse tree
     */
    void enterMdTuple(LLVMIRParser.MdTupleContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#mdTuple}.
     *
     * @param ctx the parse tree
     */
    void exitMdTuple(LLVMIRParser.MdTupleContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#metadata}.
     *
     * @param ctx the parse tree
     */
    void enterMetadata(LLVMIRParser.MetadataContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#metadata}.
     *
     * @param ctx the parse tree
     */
    void exitMetadata(LLVMIRParser.MetadataContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diArgList}.
     *
     * @param ctx the parse tree
     */
    void enterDiArgList(LLVMIRParser.DiArgListContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diArgList}.
     *
     * @param ctx the parse tree
     */
    void exitDiArgList(LLVMIRParser.DiArgListContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#typeValue}.
     *
     * @param ctx the parse tree
     */
    void enterTypeValue(LLVMIRParser.TypeValueContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#typeValue}.
     *
     * @param ctx the parse tree
     */
    void exitTypeValue(LLVMIRParser.TypeValueContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#value}.
     *
     * @param ctx the parse tree
     */
    void enterValue(LLVMIRParser.ValueContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#value}.
     *
     * @param ctx the parse tree
     */
    void exitValue(LLVMIRParser.ValueContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#inlineAsm}.
     *
     * @param ctx the parse tree
     */
    void enterInlineAsm(LLVMIRParser.InlineAsmContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#inlineAsm}.
     *
     * @param ctx the parse tree
     */
    void exitInlineAsm(LLVMIRParser.InlineAsmContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#mdString}.
     *
     * @param ctx the parse tree
     */
    void enterMdString(LLVMIRParser.MdStringContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#mdString}.
     *
     * @param ctx the parse tree
     */
    void exitMdString(LLVMIRParser.MdStringContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#mdFieldOrInt}.
     *
     * @param ctx the parse tree
     */
    void enterMdFieldOrInt(LLVMIRParser.MdFieldOrIntContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#mdFieldOrInt}.
     *
     * @param ctx the parse tree
     */
    void exitMdFieldOrInt(LLVMIRParser.MdFieldOrIntContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diSPFlag}.
     *
     * @param ctx the parse tree
     */
    void enterDiSPFlag(LLVMIRParser.DiSPFlagContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diSPFlag}.
     *
     * @param ctx the parse tree
     */
    void exitDiSPFlag(LLVMIRParser.DiSPFlagContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcAttribute}.
     *
     * @param ctx the parse tree
     */
    void enterFuncAttribute(LLVMIRParser.FuncAttributeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcAttribute}.
     *
     * @param ctx the parse tree
     */
    void exitFuncAttribute(LLVMIRParser.FuncAttributeContext ctx);

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
     * Enter a parse tree produced by {@link LLVMIRParser#params}.
     *
     * @param ctx the parse tree
     */
    void enterParams(LLVMIRParser.ParamsContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#params}.
     *
     * @param ctx the parse tree
     */
    void exitParams(LLVMIRParser.ParamsContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#param}.
     *
     * @param ctx the parse tree
     */
    void enterParam(LLVMIRParser.ParamContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#param}.
     *
     * @param ctx the parse tree
     */
    void exitParam(LLVMIRParser.ParamContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#paramAttribute}.
     *
     * @param ctx the parse tree
     */
    void enterParamAttribute(LLVMIRParser.ParamAttributeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#paramAttribute}.
     *
     * @param ctx the parse tree
     */
    void exitParamAttribute(LLVMIRParser.ParamAttributeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#attrString}.
     *
     * @param ctx the parse tree
     */
    void enterAttrString(LLVMIRParser.AttrStringContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#attrString}.
     *
     * @param ctx the parse tree
     */
    void exitAttrString(LLVMIRParser.AttrStringContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#attrPair}.
     *
     * @param ctx the parse tree
     */
    void enterAttrPair(LLVMIRParser.AttrPairContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#attrPair}.
     *
     * @param ctx the parse tree
     */
    void exitAttrPair(LLVMIRParser.AttrPairContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#align}.
     *
     * @param ctx the parse tree
     */
    void enterAlign(LLVMIRParser.AlignContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#align}.
     *
     * @param ctx the parse tree
     */
    void exitAlign(LLVMIRParser.AlignContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#alignPair}.
     *
     * @param ctx the parse tree
     */
    void enterAlignPair(LLVMIRParser.AlignPairContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#alignPair}.
     *
     * @param ctx the parse tree
     */
    void exitAlignPair(LLVMIRParser.AlignPairContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#alignStack}.
     *
     * @param ctx the parse tree
     */
    void enterAlignStack(LLVMIRParser.AlignStackContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#alignStack}.
     *
     * @param ctx the parse tree
     */
    void exitAlignStack(LLVMIRParser.AlignStackContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#alignStackPair}.
     *
     * @param ctx the parse tree
     */
    void enterAlignStackPair(LLVMIRParser.AlignStackPairContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#alignStackPair}.
     *
     * @param ctx the parse tree
     */
    void exitAlignStackPair(LLVMIRParser.AlignStackPairContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#allocKind}.
     *
     * @param ctx the parse tree
     */
    void enterAllocKind(LLVMIRParser.AllocKindContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#allocKind}.
     *
     * @param ctx the parse tree
     */
    void exitAllocKind(LLVMIRParser.AllocKindContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#allocSize}.
     *
     * @param ctx the parse tree
     */
    void enterAllocSize(LLVMIRParser.AllocSizeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#allocSize}.
     *
     * @param ctx the parse tree
     */
    void exitAllocSize(LLVMIRParser.AllocSizeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#unwindTable}.
     *
     * @param ctx the parse tree
     */
    void enterUnwindTable(LLVMIRParser.UnwindTableContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#unwindTable}.
     *
     * @param ctx the parse tree
     */
    void exitUnwindTable(LLVMIRParser.UnwindTableContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#vectorScaleRange}.
     *
     * @param ctx the parse tree
     */
    void enterVectorScaleRange(LLVMIRParser.VectorScaleRangeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#vectorScaleRange}.
     *
     * @param ctx the parse tree
     */
    void exitVectorScaleRange(LLVMIRParser.VectorScaleRangeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#byRefAttr}.
     *
     * @param ctx the parse tree
     */
    void enterByRefAttr(LLVMIRParser.ByRefAttrContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#byRefAttr}.
     *
     * @param ctx the parse tree
     */
    void exitByRefAttr(LLVMIRParser.ByRefAttrContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#byval}.
     *
     * @param ctx the parse tree
     */
    void enterByval(LLVMIRParser.ByvalContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#byval}.
     *
     * @param ctx the parse tree
     */
    void exitByval(LLVMIRParser.ByvalContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#dereferenceable}.
     *
     * @param ctx the parse tree
     */
    void enterDereferenceable(LLVMIRParser.DereferenceableContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#dereferenceable}.
     *
     * @param ctx the parse tree
     */
    void exitDereferenceable(LLVMIRParser.DereferenceableContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#elementType}.
     *
     * @param ctx the parse tree
     */
    void enterElementType(LLVMIRParser.ElementTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#elementType}.
     *
     * @param ctx the parse tree
     */
    void exitElementType(LLVMIRParser.ElementTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#inAlloca}.
     *
     * @param ctx the parse tree
     */
    void enterInAlloca(LLVMIRParser.InAllocaContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#inAlloca}.
     *
     * @param ctx the parse tree
     */
    void exitInAlloca(LLVMIRParser.InAllocaContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#paramAttr}.
     *
     * @param ctx the parse tree
     */
    void enterParamAttr(LLVMIRParser.ParamAttrContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#paramAttr}.
     *
     * @param ctx the parse tree
     */
    void exitParamAttr(LLVMIRParser.ParamAttrContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#preallocated}.
     *
     * @param ctx the parse tree
     */
    void enterPreallocated(LLVMIRParser.PreallocatedContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#preallocated}.
     *
     * @param ctx the parse tree
     */
    void exitPreallocated(LLVMIRParser.PreallocatedContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#structRetAttr}.
     *
     * @param ctx the parse tree
     */
    void enterStructRetAttr(LLVMIRParser.StructRetAttrContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#structRetAttr}.
     *
     * @param ctx the parse tree
     */
    void exitStructRetAttr(LLVMIRParser.StructRetAttrContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#firstClassType}.
     *
     * @param ctx the parse tree
     */
    void enterFirstClassType(LLVMIRParser.FirstClassTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#firstClassType}.
     *
     * @param ctx the parse tree
     */
    void exitFirstClassType(LLVMIRParser.FirstClassTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#concreteType}.
     *
     * @param ctx the parse tree
     */
    void enterConcreteType(LLVMIRParser.ConcreteTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#concreteType}.
     *
     * @param ctx the parse tree
     */
    void exitConcreteType(LLVMIRParser.ConcreteTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#intType}.
     *
     * @param ctx the parse tree
     */
    void enterIntType(LLVMIRParser.IntTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#intType}.
     *
     * @param ctx the parse tree
     */
    void exitIntType(LLVMIRParser.IntTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#floatType}.
     *
     * @param ctx the parse tree
     */
    void enterFloatType(LLVMIRParser.FloatTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#floatType}.
     *
     * @param ctx the parse tree
     */
    void exitFloatType(LLVMIRParser.FloatTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#pointerType}.
     *
     * @param ctx the parse tree
     */
    void enterPointerType(LLVMIRParser.PointerTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#pointerType}.
     *
     * @param ctx the parse tree
     */
    void exitPointerType(LLVMIRParser.PointerTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#vectorType}.
     *
     * @param ctx the parse tree
     */
    void enterVectorType(LLVMIRParser.VectorTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#vectorType}.
     *
     * @param ctx the parse tree
     */
    void exitVectorType(LLVMIRParser.VectorTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#labelType}.
     *
     * @param ctx the parse tree
     */
    void enterLabelType(LLVMIRParser.LabelTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#labelType}.
     *
     * @param ctx the parse tree
     */
    void exitLabelType(LLVMIRParser.LabelTypeContext ctx);

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
     * Enter a parse tree produced by {@link LLVMIRParser#structType}.
     *
     * @param ctx the parse tree
     */
    void enterStructType(LLVMIRParser.StructTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#structType}.
     *
     * @param ctx the parse tree
     */
    void exitStructType(LLVMIRParser.StructTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#namedType}.
     *
     * @param ctx the parse tree
     */
    void enterNamedType(LLVMIRParser.NamedTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#namedType}.
     *
     * @param ctx the parse tree
     */
    void exitNamedType(LLVMIRParser.NamedTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#mmxType}.
     *
     * @param ctx the parse tree
     */
    void enterMmxType(LLVMIRParser.MmxTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#mmxType}.
     *
     * @param ctx the parse tree
     */
    void exitMmxType(LLVMIRParser.MmxTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#tokenType}.
     *
     * @param ctx the parse tree
     */
    void enterTokenType(LLVMIRParser.TokenTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#tokenType}.
     *
     * @param ctx the parse tree
     */
    void exitTokenType(LLVMIRParser.TokenTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#opaquePointerType}.
     *
     * @param ctx the parse tree
     */
    void enterOpaquePointerType(LLVMIRParser.OpaquePointerTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#opaquePointerType}.
     *
     * @param ctx the parse tree
     */
    void exitOpaquePointerType(LLVMIRParser.OpaquePointerTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#addrSpace}.
     *
     * @param ctx the parse tree
     */
    void enterAddrSpace(LLVMIRParser.AddrSpaceContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#addrSpace}.
     *
     * @param ctx the parse tree
     */
    void exitAddrSpace(LLVMIRParser.AddrSpaceContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#threadLocal}.
     *
     * @param ctx the parse tree
     */
    void enterThreadLocal(LLVMIRParser.ThreadLocalContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#threadLocal}.
     *
     * @param ctx the parse tree
     */
    void exitThreadLocal(LLVMIRParser.ThreadLocalContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#metadataType}.
     *
     * @param ctx the parse tree
     */
    void enterMetadataType(LLVMIRParser.MetadataTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#metadataType}.
     *
     * @param ctx the parse tree
     */
    void exitMetadataType(LLVMIRParser.MetadataTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#bitCastExpr}.
     *
     * @param ctx the parse tree
     */
    void enterBitCastExpr(LLVMIRParser.BitCastExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#bitCastExpr}.
     *
     * @param ctx the parse tree
     */
    void exitBitCastExpr(LLVMIRParser.BitCastExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#getElementPtrExpr}.
     *
     * @param ctx the parse tree
     */
    void enterGetElementPtrExpr(LLVMIRParser.GetElementPtrExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#getElementPtrExpr}.
     *
     * @param ctx the parse tree
     */
    void exitGetElementPtrExpr(LLVMIRParser.GetElementPtrExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#gepIndex}.
     *
     * @param ctx the parse tree
     */
    void enterGepIndex(LLVMIRParser.GepIndexContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#gepIndex}.
     *
     * @param ctx the parse tree
     */
    void exitGepIndex(LLVMIRParser.GepIndexContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#addrSpaceCastExpr}.
     *
     * @param ctx the parse tree
     */
    void enterAddrSpaceCastExpr(LLVMIRParser.AddrSpaceCastExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#addrSpaceCastExpr}.
     *
     * @param ctx the parse tree
     */
    void exitAddrSpaceCastExpr(LLVMIRParser.AddrSpaceCastExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#intToPtrExpr}.
     *
     * @param ctx the parse tree
     */
    void enterIntToPtrExpr(LLVMIRParser.IntToPtrExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#intToPtrExpr}.
     *
     * @param ctx the parse tree
     */
    void exitIntToPtrExpr(LLVMIRParser.IntToPtrExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#iCmpExpr}.
     *
     * @param ctx the parse tree
     */
    void enterICmpExpr(LLVMIRParser.ICmpExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#iCmpExpr}.
     *
     * @param ctx the parse tree
     */
    void exitICmpExpr(LLVMIRParser.ICmpExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fCmpExpr}.
     *
     * @param ctx the parse tree
     */
    void enterFCmpExpr(LLVMIRParser.FCmpExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fCmpExpr}.
     *
     * @param ctx the parse tree
     */
    void exitFCmpExpr(LLVMIRParser.FCmpExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#selectExpr}.
     *
     * @param ctx the parse tree
     */
    void enterSelectExpr(LLVMIRParser.SelectExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#selectExpr}.
     *
     * @param ctx the parse tree
     */
    void exitSelectExpr(LLVMIRParser.SelectExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#truncExpr}.
     *
     * @param ctx the parse tree
     */
    void enterTruncExpr(LLVMIRParser.TruncExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#truncExpr}.
     *
     * @param ctx the parse tree
     */
    void exitTruncExpr(LLVMIRParser.TruncExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#zExtExpr}.
     *
     * @param ctx the parse tree
     */
    void enterZExtExpr(LLVMIRParser.ZExtExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#zExtExpr}.
     *
     * @param ctx the parse tree
     */
    void exitZExtExpr(LLVMIRParser.ZExtExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sExtExpr}.
     *
     * @param ctx the parse tree
     */
    void enterSExtExpr(LLVMIRParser.SExtExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sExtExpr}.
     *
     * @param ctx the parse tree
     */
    void exitSExtExpr(LLVMIRParser.SExtExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fpTruncExpr}.
     *
     * @param ctx the parse tree
     */
    void enterFpTruncExpr(LLVMIRParser.FpTruncExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fpTruncExpr}.
     *
     * @param ctx the parse tree
     */
    void exitFpTruncExpr(LLVMIRParser.FpTruncExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fpExtExpr}.
     *
     * @param ctx the parse tree
     */
    void enterFpExtExpr(LLVMIRParser.FpExtExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fpExtExpr}.
     *
     * @param ctx the parse tree
     */
    void exitFpExtExpr(LLVMIRParser.FpExtExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fpToUiExpr}.
     *
     * @param ctx the parse tree
     */
    void enterFpToUiExpr(LLVMIRParser.FpToUiExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fpToUiExpr}.
     *
     * @param ctx the parse tree
     */
    void exitFpToUiExpr(LLVMIRParser.FpToUiExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fpToSiExpr}.
     *
     * @param ctx the parse tree
     */
    void enterFpToSiExpr(LLVMIRParser.FpToSiExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fpToSiExpr}.
     *
     * @param ctx the parse tree
     */
    void exitFpToSiExpr(LLVMIRParser.FpToSiExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#uiToFpExpr}.
     *
     * @param ctx the parse tree
     */
    void enterUiToFpExpr(LLVMIRParser.UiToFpExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#uiToFpExpr}.
     *
     * @param ctx the parse tree
     */
    void exitUiToFpExpr(LLVMIRParser.UiToFpExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#siToFpExpr}.
     *
     * @param ctx the parse tree
     */
    void enterSiToFpExpr(LLVMIRParser.SiToFpExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#siToFpExpr}.
     *
     * @param ctx the parse tree
     */
    void exitSiToFpExpr(LLVMIRParser.SiToFpExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#ptrToIntExpr}.
     *
     * @param ctx the parse tree
     */
    void enterPtrToIntExpr(LLVMIRParser.PtrToIntExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#ptrToIntExpr}.
     *
     * @param ctx the parse tree
     */
    void exitPtrToIntExpr(LLVMIRParser.PtrToIntExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#extractElementExpr}.
     *
     * @param ctx the parse tree
     */
    void enterExtractElementExpr(LLVMIRParser.ExtractElementExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#extractElementExpr}.
     *
     * @param ctx the parse tree
     */
    void exitExtractElementExpr(LLVMIRParser.ExtractElementExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#insertElementExpr}.
     *
     * @param ctx the parse tree
     */
    void enterInsertElementExpr(LLVMIRParser.InsertElementExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#insertElementExpr}.
     *
     * @param ctx the parse tree
     */
    void exitInsertElementExpr(LLVMIRParser.InsertElementExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#shuffleVectorExpr}.
     *
     * @param ctx the parse tree
     */
    void enterShuffleVectorExpr(LLVMIRParser.ShuffleVectorExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#shuffleVectorExpr}.
     *
     * @param ctx the parse tree
     */
    void exitShuffleVectorExpr(LLVMIRParser.ShuffleVectorExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#shlExpr}.
     *
     * @param ctx the parse tree
     */
    void enterShlExpr(LLVMIRParser.ShlExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#shlExpr}.
     *
     * @param ctx the parse tree
     */
    void exitShlExpr(LLVMIRParser.ShlExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#lShrExpr}.
     *
     * @param ctx the parse tree
     */
    void enterLShrExpr(LLVMIRParser.LShrExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#lShrExpr}.
     *
     * @param ctx the parse tree
     */
    void exitLShrExpr(LLVMIRParser.LShrExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#aShrExpr}.
     *
     * @param ctx the parse tree
     */
    void enterAShrExpr(LLVMIRParser.AShrExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#aShrExpr}.
     *
     * @param ctx the parse tree
     */
    void exitAShrExpr(LLVMIRParser.AShrExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#andExpr}.
     *
     * @param ctx the parse tree
     */
    void enterAndExpr(LLVMIRParser.AndExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#andExpr}.
     *
     * @param ctx the parse tree
     */
    void exitAndExpr(LLVMIRParser.AndExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#orExpr}.
     *
     * @param ctx the parse tree
     */
    void enterOrExpr(LLVMIRParser.OrExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#orExpr}.
     *
     * @param ctx the parse tree
     */
    void exitOrExpr(LLVMIRParser.OrExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#xorExpr}.
     *
     * @param ctx the parse tree
     */
    void enterXorExpr(LLVMIRParser.XorExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#xorExpr}.
     *
     * @param ctx the parse tree
     */
    void exitXorExpr(LLVMIRParser.XorExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#addExpr}.
     *
     * @param ctx the parse tree
     */
    void enterAddExpr(LLVMIRParser.AddExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#addExpr}.
     *
     * @param ctx the parse tree
     */
    void exitAddExpr(LLVMIRParser.AddExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#subExpr}.
     *
     * @param ctx the parse tree
     */
    void enterSubExpr(LLVMIRParser.SubExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#subExpr}.
     *
     * @param ctx the parse tree
     */
    void exitSubExpr(LLVMIRParser.SubExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#mulExpr}.
     *
     * @param ctx the parse tree
     */
    void enterMulExpr(LLVMIRParser.MulExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#mulExpr}.
     *
     * @param ctx the parse tree
     */
    void exitMulExpr(LLVMIRParser.MulExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fNegExpr}.
     *
     * @param ctx the parse tree
     */
    void enterFNegExpr(LLVMIRParser.FNegExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fNegExpr}.
     *
     * @param ctx the parse tree
     */
    void exitFNegExpr(LLVMIRParser.FNegExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#localDefInst}.
     *
     * @param ctx the parse tree
     */
    void enterLocalDefInst(LLVMIRParser.LocalDefInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#localDefInst}.
     *
     * @param ctx the parse tree
     */
    void exitLocalDefInst(LLVMIRParser.LocalDefInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#valueInstruction}.
     *
     * @param ctx the parse tree
     */
    void enterValueInstruction(LLVMIRParser.ValueInstructionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#valueInstruction}.
     *
     * @param ctx the parse tree
     */
    void exitValueInstruction(LLVMIRParser.ValueInstructionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#storeInst}.
     *
     * @param ctx the parse tree
     */
    void enterStoreInst(LLVMIRParser.StoreInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#storeInst}.
     *
     * @param ctx the parse tree
     */
    void exitStoreInst(LLVMIRParser.StoreInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#syncScope}.
     *
     * @param ctx the parse tree
     */
    void enterSyncScope(LLVMIRParser.SyncScopeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#syncScope}.
     *
     * @param ctx the parse tree
     */
    void exitSyncScope(LLVMIRParser.SyncScopeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fenceInst}.
     *
     * @param ctx the parse tree
     */
    void enterFenceInst(LLVMIRParser.FenceInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fenceInst}.
     *
     * @param ctx the parse tree
     */
    void exitFenceInst(LLVMIRParser.FenceInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fNegInst}.
     *
     * @param ctx the parse tree
     */
    void enterFNegInst(LLVMIRParser.FNegInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fNegInst}.
     *
     * @param ctx the parse tree
     */
    void exitFNegInst(LLVMIRParser.FNegInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#addInst}.
     *
     * @param ctx the parse tree
     */
    void enterAddInst(LLVMIRParser.AddInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#addInst}.
     *
     * @param ctx the parse tree
     */
    void exitAddInst(LLVMIRParser.AddInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fAddInst}.
     *
     * @param ctx the parse tree
     */
    void enterFAddInst(LLVMIRParser.FAddInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fAddInst}.
     *
     * @param ctx the parse tree
     */
    void exitFAddInst(LLVMIRParser.FAddInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#subInst}.
     *
     * @param ctx the parse tree
     */
    void enterSubInst(LLVMIRParser.SubInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#subInst}.
     *
     * @param ctx the parse tree
     */
    void exitSubInst(LLVMIRParser.SubInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fSubInst}.
     *
     * @param ctx the parse tree
     */
    void enterFSubInst(LLVMIRParser.FSubInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fSubInst}.
     *
     * @param ctx the parse tree
     */
    void exitFSubInst(LLVMIRParser.FSubInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#mulInst}.
     *
     * @param ctx the parse tree
     */
    void enterMulInst(LLVMIRParser.MulInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#mulInst}.
     *
     * @param ctx the parse tree
     */
    void exitMulInst(LLVMIRParser.MulInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fMulInst}.
     *
     * @param ctx the parse tree
     */
    void enterFMulInst(LLVMIRParser.FMulInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fMulInst}.
     *
     * @param ctx the parse tree
     */
    void exitFMulInst(LLVMIRParser.FMulInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#uDivInst}.
     *
     * @param ctx the parse tree
     */
    void enterUDivInst(LLVMIRParser.UDivInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#uDivInst}.
     *
     * @param ctx the parse tree
     */
    void exitUDivInst(LLVMIRParser.UDivInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sDivInst}.
     *
     * @param ctx the parse tree
     */
    void enterSDivInst(LLVMIRParser.SDivInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sDivInst}.
     *
     * @param ctx the parse tree
     */
    void exitSDivInst(LLVMIRParser.SDivInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fDivInst}.
     *
     * @param ctx the parse tree
     */
    void enterFDivInst(LLVMIRParser.FDivInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fDivInst}.
     *
     * @param ctx the parse tree
     */
    void exitFDivInst(LLVMIRParser.FDivInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#uRemInst}.
     *
     * @param ctx the parse tree
     */
    void enterURemInst(LLVMIRParser.URemInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#uRemInst}.
     *
     * @param ctx the parse tree
     */
    void exitURemInst(LLVMIRParser.URemInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sRemInst}.
     *
     * @param ctx the parse tree
     */
    void enterSRemInst(LLVMIRParser.SRemInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sRemInst}.
     *
     * @param ctx the parse tree
     */
    void exitSRemInst(LLVMIRParser.SRemInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fRemInst}.
     *
     * @param ctx the parse tree
     */
    void enterFRemInst(LLVMIRParser.FRemInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fRemInst}.
     *
     * @param ctx the parse tree
     */
    void exitFRemInst(LLVMIRParser.FRemInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#shlInst}.
     *
     * @param ctx the parse tree
     */
    void enterShlInst(LLVMIRParser.ShlInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#shlInst}.
     *
     * @param ctx the parse tree
     */
    void exitShlInst(LLVMIRParser.ShlInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#lShrInst}.
     *
     * @param ctx the parse tree
     */
    void enterLShrInst(LLVMIRParser.LShrInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#lShrInst}.
     *
     * @param ctx the parse tree
     */
    void exitLShrInst(LLVMIRParser.LShrInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#aShrInst}.
     *
     * @param ctx the parse tree
     */
    void enterAShrInst(LLVMIRParser.AShrInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#aShrInst}.
     *
     * @param ctx the parse tree
     */
    void exitAShrInst(LLVMIRParser.AShrInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#andInst}.
     *
     * @param ctx the parse tree
     */
    void enterAndInst(LLVMIRParser.AndInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#andInst}.
     *
     * @param ctx the parse tree
     */
    void exitAndInst(LLVMIRParser.AndInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#orInst}.
     *
     * @param ctx the parse tree
     */
    void enterOrInst(LLVMIRParser.OrInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#orInst}.
     *
     * @param ctx the parse tree
     */
    void exitOrInst(LLVMIRParser.OrInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#xorInst}.
     *
     * @param ctx the parse tree
     */
    void enterXorInst(LLVMIRParser.XorInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#xorInst}.
     *
     * @param ctx the parse tree
     */
    void exitXorInst(LLVMIRParser.XorInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#extractElementInst}.
     *
     * @param ctx the parse tree
     */
    void enterExtractElementInst(LLVMIRParser.ExtractElementInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#extractElementInst}.
     *
     * @param ctx the parse tree
     */
    void exitExtractElementInst(LLVMIRParser.ExtractElementInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#insertElementInst}.
     *
     * @param ctx the parse tree
     */
    void enterInsertElementInst(LLVMIRParser.InsertElementInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#insertElementInst}.
     *
     * @param ctx the parse tree
     */
    void exitInsertElementInst(LLVMIRParser.InsertElementInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#shuffleVectorInst}.
     *
     * @param ctx the parse tree
     */
    void enterShuffleVectorInst(LLVMIRParser.ShuffleVectorInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#shuffleVectorInst}.
     *
     * @param ctx the parse tree
     */
    void exitShuffleVectorInst(LLVMIRParser.ShuffleVectorInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#extractValueInst}.
     *
     * @param ctx the parse tree
     */
    void enterExtractValueInst(LLVMIRParser.ExtractValueInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#extractValueInst}.
     *
     * @param ctx the parse tree
     */
    void exitExtractValueInst(LLVMIRParser.ExtractValueInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#insertValueInst}.
     *
     * @param ctx the parse tree
     */
    void enterInsertValueInst(LLVMIRParser.InsertValueInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#insertValueInst}.
     *
     * @param ctx the parse tree
     */
    void exitInsertValueInst(LLVMIRParser.InsertValueInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#allocaInst}.
     *
     * @param ctx the parse tree
     */
    void enterAllocaInst(LLVMIRParser.AllocaInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#allocaInst}.
     *
     * @param ctx the parse tree
     */
    void exitAllocaInst(LLVMIRParser.AllocaInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#loadInst}.
     *
     * @param ctx the parse tree
     */
    void enterLoadInst(LLVMIRParser.LoadInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#loadInst}.
     *
     * @param ctx the parse tree
     */
    void exitLoadInst(LLVMIRParser.LoadInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#cmpXchgInst}.
     *
     * @param ctx the parse tree
     */
    void enterCmpXchgInst(LLVMIRParser.CmpXchgInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#cmpXchgInst}.
     *
     * @param ctx the parse tree
     */
    void exitCmpXchgInst(LLVMIRParser.CmpXchgInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#atomicRMWInst}.
     *
     * @param ctx the parse tree
     */
    void enterAtomicRMWInst(LLVMIRParser.AtomicRMWInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#atomicRMWInst}.
     *
     * @param ctx the parse tree
     */
    void exitAtomicRMWInst(LLVMIRParser.AtomicRMWInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#getElementPtrInst}.
     *
     * @param ctx the parse tree
     */
    void enterGetElementPtrInst(LLVMIRParser.GetElementPtrInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#getElementPtrInst}.
     *
     * @param ctx the parse tree
     */
    void exitGetElementPtrInst(LLVMIRParser.GetElementPtrInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#truncInst}.
     *
     * @param ctx the parse tree
     */
    void enterTruncInst(LLVMIRParser.TruncInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#truncInst}.
     *
     * @param ctx the parse tree
     */
    void exitTruncInst(LLVMIRParser.TruncInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#zExtInst}.
     *
     * @param ctx the parse tree
     */
    void enterZExtInst(LLVMIRParser.ZExtInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#zExtInst}.
     *
     * @param ctx the parse tree
     */
    void exitZExtInst(LLVMIRParser.ZExtInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sExtInst}.
     *
     * @param ctx the parse tree
     */
    void enterSExtInst(LLVMIRParser.SExtInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sExtInst}.
     *
     * @param ctx the parse tree
     */
    void exitSExtInst(LLVMIRParser.SExtInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fpTruncInst}.
     *
     * @param ctx the parse tree
     */
    void enterFpTruncInst(LLVMIRParser.FpTruncInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fpTruncInst}.
     *
     * @param ctx the parse tree
     */
    void exitFpTruncInst(LLVMIRParser.FpTruncInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fpExtInst}.
     *
     * @param ctx the parse tree
     */
    void enterFpExtInst(LLVMIRParser.FpExtInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fpExtInst}.
     *
     * @param ctx the parse tree
     */
    void exitFpExtInst(LLVMIRParser.FpExtInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fpToUiInst}.
     *
     * @param ctx the parse tree
     */
    void enterFpToUiInst(LLVMIRParser.FpToUiInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fpToUiInst}.
     *
     * @param ctx the parse tree
     */
    void exitFpToUiInst(LLVMIRParser.FpToUiInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fpToSiInst}.
     *
     * @param ctx the parse tree
     */
    void enterFpToSiInst(LLVMIRParser.FpToSiInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fpToSiInst}.
     *
     * @param ctx the parse tree
     */
    void exitFpToSiInst(LLVMIRParser.FpToSiInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#uiToFpInst}.
     *
     * @param ctx the parse tree
     */
    void enterUiToFpInst(LLVMIRParser.UiToFpInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#uiToFpInst}.
     *
     * @param ctx the parse tree
     */
    void exitUiToFpInst(LLVMIRParser.UiToFpInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#siToFpInst}.
     *
     * @param ctx the parse tree
     */
    void enterSiToFpInst(LLVMIRParser.SiToFpInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#siToFpInst}.
     *
     * @param ctx the parse tree
     */
    void exitSiToFpInst(LLVMIRParser.SiToFpInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#ptrToIntInst}.
     *
     * @param ctx the parse tree
     */
    void enterPtrToIntInst(LLVMIRParser.PtrToIntInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#ptrToIntInst}.
     *
     * @param ctx the parse tree
     */
    void exitPtrToIntInst(LLVMIRParser.PtrToIntInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#intToPtrInst}.
     *
     * @param ctx the parse tree
     */
    void enterIntToPtrInst(LLVMIRParser.IntToPtrInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#intToPtrInst}.
     *
     * @param ctx the parse tree
     */
    void exitIntToPtrInst(LLVMIRParser.IntToPtrInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#bitCastInst}.
     *
     * @param ctx the parse tree
     */
    void enterBitCastInst(LLVMIRParser.BitCastInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#bitCastInst}.
     *
     * @param ctx the parse tree
     */
    void exitBitCastInst(LLVMIRParser.BitCastInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#addrSpaceCastInst}.
     *
     * @param ctx the parse tree
     */
    void enterAddrSpaceCastInst(LLVMIRParser.AddrSpaceCastInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#addrSpaceCastInst}.
     *
     * @param ctx the parse tree
     */
    void exitAddrSpaceCastInst(LLVMIRParser.AddrSpaceCastInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#iCmpInst}.
     *
     * @param ctx the parse tree
     */
    void enterICmpInst(LLVMIRParser.ICmpInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#iCmpInst}.
     *
     * @param ctx the parse tree
     */
    void exitICmpInst(LLVMIRParser.ICmpInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fCmpInst}.
     *
     * @param ctx the parse tree
     */
    void enterFCmpInst(LLVMIRParser.FCmpInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fCmpInst}.
     *
     * @param ctx the parse tree
     */
    void exitFCmpInst(LLVMIRParser.FCmpInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#phiInst}.
     *
     * @param ctx the parse tree
     */
    void enterPhiInst(LLVMIRParser.PhiInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#phiInst}.
     *
     * @param ctx the parse tree
     */
    void exitPhiInst(LLVMIRParser.PhiInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#selectInst}.
     *
     * @param ctx the parse tree
     */
    void enterSelectInst(LLVMIRParser.SelectInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#selectInst}.
     *
     * @param ctx the parse tree
     */
    void exitSelectInst(LLVMIRParser.SelectInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#freezeInst}.
     *
     * @param ctx the parse tree
     */
    void enterFreezeInst(LLVMIRParser.FreezeInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#freezeInst}.
     *
     * @param ctx the parse tree
     */
    void exitFreezeInst(LLVMIRParser.FreezeInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#callInst}.
     *
     * @param ctx the parse tree
     */
    void enterCallInst(LLVMIRParser.CallInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#callInst}.
     *
     * @param ctx the parse tree
     */
    void exitCallInst(LLVMIRParser.CallInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#vaargInst}.
     *
     * @param ctx the parse tree
     */
    void enterVaargInst(LLVMIRParser.VaargInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#vaargInst}.
     *
     * @param ctx the parse tree
     */
    void exitVaargInst(LLVMIRParser.VaargInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#landingPadInst}.
     *
     * @param ctx the parse tree
     */
    void enterLandingPadInst(LLVMIRParser.LandingPadInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#landingPadInst}.
     *
     * @param ctx the parse tree
     */
    void exitLandingPadInst(LLVMIRParser.LandingPadInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#catchPadInst}.
     *
     * @param ctx the parse tree
     */
    void enterCatchPadInst(LLVMIRParser.CatchPadInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#catchPadInst}.
     *
     * @param ctx the parse tree
     */
    void exitCatchPadInst(LLVMIRParser.CatchPadInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#cleanupPadInst}.
     *
     * @param ctx the parse tree
     */
    void enterCleanupPadInst(LLVMIRParser.CleanupPadInstContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#cleanupPadInst}.
     *
     * @param ctx the parse tree
     */
    void exitCleanupPadInst(LLVMIRParser.CleanupPadInstContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#inc}.
     *
     * @param ctx the parse tree
     */
    void enterInc(LLVMIRParser.IncContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#inc}.
     *
     * @param ctx the parse tree
     */
    void exitInc(LLVMIRParser.IncContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#operandBundle}.
     *
     * @param ctx the parse tree
     */
    void enterOperandBundle(LLVMIRParser.OperandBundleContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#operandBundle}.
     *
     * @param ctx the parse tree
     */
    void exitOperandBundle(LLVMIRParser.OperandBundleContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#clause}.
     *
     * @param ctx the parse tree
     */
    void enterClause(LLVMIRParser.ClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#clause}.
     *
     * @param ctx the parse tree
     */
    void exitClause(LLVMIRParser.ClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#args}.
     *
     * @param ctx the parse tree
     */
    void enterArgs(LLVMIRParser.ArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#args}.
     *
     * @param ctx the parse tree
     */
    void exitArgs(LLVMIRParser.ArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#arg}.
     *
     * @param ctx the parse tree
     */
    void enterArg(LLVMIRParser.ArgContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#arg}.
     *
     * @param ctx the parse tree
     */
    void exitArg(LLVMIRParser.ArgContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#exceptionArg}.
     *
     * @param ctx the parse tree
     */
    void enterExceptionArg(LLVMIRParser.ExceptionArgContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#exceptionArg}.
     *
     * @param ctx the parse tree
     */
    void exitExceptionArg(LLVMIRParser.ExceptionArgContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#exceptionPad}.
     *
     * @param ctx the parse tree
     */
    void enterExceptionPad(LLVMIRParser.ExceptionPadContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#exceptionPad}.
     *
     * @param ctx the parse tree
     */
    void exitExceptionPad(LLVMIRParser.ExceptionPadContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#externalLinkage}.
     *
     * @param ctx the parse tree
     */
    void enterExternalLinkage(LLVMIRParser.ExternalLinkageContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#externalLinkage}.
     *
     * @param ctx the parse tree
     */
    void exitExternalLinkage(LLVMIRParser.ExternalLinkageContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#internalLinkage}.
     *
     * @param ctx the parse tree
     */
    void enterInternalLinkage(LLVMIRParser.InternalLinkageContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#internalLinkage}.
     *
     * @param ctx the parse tree
     */
    void exitInternalLinkage(LLVMIRParser.InternalLinkageContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#linkage}.
     *
     * @param ctx the parse tree
     */
    void enterLinkage(LLVMIRParser.LinkageContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#linkage}.
     *
     * @param ctx the parse tree
     */
    void exitLinkage(LLVMIRParser.LinkageContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#preemption}.
     *
     * @param ctx the parse tree
     */
    void enterPreemption(LLVMIRParser.PreemptionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#preemption}.
     *
     * @param ctx the parse tree
     */
    void exitPreemption(LLVMIRParser.PreemptionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#visibility}.
     *
     * @param ctx the parse tree
     */
    void enterVisibility(LLVMIRParser.VisibilityContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#visibility}.
     *
     * @param ctx the parse tree
     */
    void exitVisibility(LLVMIRParser.VisibilityContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#dllStorageClass}.
     *
     * @param ctx the parse tree
     */
    void enterDllStorageClass(LLVMIRParser.DllStorageClassContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#dllStorageClass}.
     *
     * @param ctx the parse tree
     */
    void exitDllStorageClass(LLVMIRParser.DllStorageClassContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#tlsModel}.
     *
     * @param ctx the parse tree
     */
    void enterTlsModel(LLVMIRParser.TlsModelContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#tlsModel}.
     *
     * @param ctx the parse tree
     */
    void exitTlsModel(LLVMIRParser.TlsModelContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#unnamedAddr}.
     *
     * @param ctx the parse tree
     */
    void enterUnnamedAddr(LLVMIRParser.UnnamedAddrContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#unnamedAddr}.
     *
     * @param ctx the parse tree
     */
    void exitUnnamedAddr(LLVMIRParser.UnnamedAddrContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#externallyInitialized}.
     *
     * @param ctx the parse tree
     */
    void enterExternallyInitialized(LLVMIRParser.ExternallyInitializedContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#externallyInitialized}.
     *
     * @param ctx the parse tree
     */
    void exitExternallyInitialized(LLVMIRParser.ExternallyInitializedContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#immutable}.
     *
     * @param ctx the parse tree
     */
    void enterImmutable(LLVMIRParser.ImmutableContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#immutable}.
     *
     * @param ctx the parse tree
     */
    void exitImmutable(LLVMIRParser.ImmutableContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#funcAttr}.
     *
     * @param ctx the parse tree
     */
    void enterFuncAttr(LLVMIRParser.FuncAttrContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#funcAttr}.
     *
     * @param ctx the parse tree
     */
    void exitFuncAttr(LLVMIRParser.FuncAttrContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#distinct}.
     *
     * @param ctx the parse tree
     */
    void enterDistinct(LLVMIRParser.DistinctContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#distinct}.
     *
     * @param ctx the parse tree
     */
    void exitDistinct(LLVMIRParser.DistinctContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#inBounds}.
     *
     * @param ctx the parse tree
     */
    void enterInBounds(LLVMIRParser.InBoundsContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#inBounds}.
     *
     * @param ctx the parse tree
     */
    void exitInBounds(LLVMIRParser.InBoundsContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#returnAttr}.
     *
     * @param ctx the parse tree
     */
    void enterReturnAttr(LLVMIRParser.ReturnAttrContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#returnAttr}.
     *
     * @param ctx the parse tree
     */
    void exitReturnAttr(LLVMIRParser.ReturnAttrContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#overflowFlag}.
     *
     * @param ctx the parse tree
     */
    void enterOverflowFlag(LLVMIRParser.OverflowFlagContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#overflowFlag}.
     *
     * @param ctx the parse tree
     */
    void exitOverflowFlag(LLVMIRParser.OverflowFlagContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#iPred}.
     *
     * @param ctx the parse tree
     */
    void enterIPred(LLVMIRParser.IPredContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#iPred}.
     *
     * @param ctx the parse tree
     */
    void exitIPred(LLVMIRParser.IPredContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fPred}.
     *
     * @param ctx the parse tree
     */
    void enterFPred(LLVMIRParser.FPredContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fPred}.
     *
     * @param ctx the parse tree
     */
    void exitFPred(LLVMIRParser.FPredContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#atomicOrdering}.
     *
     * @param ctx the parse tree
     */
    void enterAtomicOrdering(LLVMIRParser.AtomicOrderingContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#atomicOrdering}.
     *
     * @param ctx the parse tree
     */
    void exitAtomicOrdering(LLVMIRParser.AtomicOrderingContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#callingConvEnum}.
     *
     * @param ctx the parse tree
     */
    void enterCallingConvEnum(LLVMIRParser.CallingConvEnumContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#callingConvEnum}.
     *
     * @param ctx the parse tree
     */
    void exitCallingConvEnum(LLVMIRParser.CallingConvEnumContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fastMathFlag}.
     *
     * @param ctx the parse tree
     */
    void enterFastMathFlag(LLVMIRParser.FastMathFlagContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fastMathFlag}.
     *
     * @param ctx the parse tree
     */
    void exitFastMathFlag(LLVMIRParser.FastMathFlagContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#atomicOp}.
     *
     * @param ctx the parse tree
     */
    void enterAtomicOp(LLVMIRParser.AtomicOpContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#atomicOp}.
     *
     * @param ctx the parse tree
     */
    void exitAtomicOp(LLVMIRParser.AtomicOpContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#floatKind}.
     *
     * @param ctx the parse tree
     */
    void enterFloatKind(LLVMIRParser.FloatKindContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#floatKind}.
     *
     * @param ctx the parse tree
     */
    void exitFloatKind(LLVMIRParser.FloatKindContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#specializedMDNode}.
     *
     * @param ctx the parse tree
     */
    void enterSpecializedMDNode(LLVMIRParser.SpecializedMDNodeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#specializedMDNode}.
     *
     * @param ctx the parse tree
     */
    void exitSpecializedMDNode(LLVMIRParser.SpecializedMDNodeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diBasicType}.
     *
     * @param ctx the parse tree
     */
    void enterDiBasicType(LLVMIRParser.DiBasicTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diBasicType}.
     *
     * @param ctx the parse tree
     */
    void exitDiBasicType(LLVMIRParser.DiBasicTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diCommonBlock}.
     *
     * @param ctx the parse tree
     */
    void enterDiCommonBlock(LLVMIRParser.DiCommonBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diCommonBlock}.
     *
     * @param ctx the parse tree
     */
    void exitDiCommonBlock(LLVMIRParser.DiCommonBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diCompileUnit}.
     *
     * @param ctx the parse tree
     */
    void enterDiCompileUnit(LLVMIRParser.DiCompileUnitContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diCompileUnit}.
     *
     * @param ctx the parse tree
     */
    void exitDiCompileUnit(LLVMIRParser.DiCompileUnitContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diCompositeType}.
     *
     * @param ctx the parse tree
     */
    void enterDiCompositeType(LLVMIRParser.DiCompositeTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diCompositeType}.
     *
     * @param ctx the parse tree
     */
    void exitDiCompositeType(LLVMIRParser.DiCompositeTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diCompositeTypeField}.
     *
     * @param ctx the parse tree
     */
    void enterDiCompositeTypeField(LLVMIRParser.DiCompositeTypeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diCompositeTypeField}.
     *
     * @param ctx the parse tree
     */
    void exitDiCompositeTypeField(LLVMIRParser.DiCompositeTypeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diDerivedType}.
     *
     * @param ctx the parse tree
     */
    void enterDiDerivedType(LLVMIRParser.DiDerivedTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diDerivedType}.
     *
     * @param ctx the parse tree
     */
    void exitDiDerivedType(LLVMIRParser.DiDerivedTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diDerivedTypeField}.
     *
     * @param ctx the parse tree
     */
    void enterDiDerivedTypeField(LLVMIRParser.DiDerivedTypeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diDerivedTypeField}.
     *
     * @param ctx the parse tree
     */
    void exitDiDerivedTypeField(LLVMIRParser.DiDerivedTypeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diEnumerator}.
     *
     * @param ctx the parse tree
     */
    void enterDiEnumerator(LLVMIRParser.DiEnumeratorContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diEnumerator}.
     *
     * @param ctx the parse tree
     */
    void exitDiEnumerator(LLVMIRParser.DiEnumeratorContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diEnumeratorField}.
     *
     * @param ctx the parse tree
     */
    void enterDiEnumeratorField(LLVMIRParser.DiEnumeratorFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diEnumeratorField}.
     *
     * @param ctx the parse tree
     */
    void exitDiEnumeratorField(LLVMIRParser.DiEnumeratorFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diFile}.
     *
     * @param ctx the parse tree
     */
    void enterDiFile(LLVMIRParser.DiFileContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diFile}.
     *
     * @param ctx the parse tree
     */
    void exitDiFile(LLVMIRParser.DiFileContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diFileField}.
     *
     * @param ctx the parse tree
     */
    void enterDiFileField(LLVMIRParser.DiFileFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diFileField}.
     *
     * @param ctx the parse tree
     */
    void exitDiFileField(LLVMIRParser.DiFileFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diGlobalVariable}.
     *
     * @param ctx the parse tree
     */
    void enterDiGlobalVariable(LLVMIRParser.DiGlobalVariableContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diGlobalVariable}.
     *
     * @param ctx the parse tree
     */
    void exitDiGlobalVariable(LLVMIRParser.DiGlobalVariableContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diGlobalVariableField}.
     *
     * @param ctx the parse tree
     */
    void enterDiGlobalVariableField(LLVMIRParser.DiGlobalVariableFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diGlobalVariableField}.
     *
     * @param ctx the parse tree
     */
    void exitDiGlobalVariableField(LLVMIRParser.DiGlobalVariableFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diGlobalVariableExpression}.
     *
     * @param ctx the parse tree
     */
    void enterDiGlobalVariableExpression(LLVMIRParser.DiGlobalVariableExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diGlobalVariableExpression}.
     *
     * @param ctx the parse tree
     */
    void exitDiGlobalVariableExpression(LLVMIRParser.DiGlobalVariableExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diGlobalVariableExpressionField}.
     *
     * @param ctx the parse tree
     */
    void enterDiGlobalVariableExpressionField(LLVMIRParser.DiGlobalVariableExpressionFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diGlobalVariableExpressionField}.
     *
     * @param ctx the parse tree
     */
    void exitDiGlobalVariableExpressionField(LLVMIRParser.DiGlobalVariableExpressionFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diImportedEntity}.
     *
     * @param ctx the parse tree
     */
    void enterDiImportedEntity(LLVMIRParser.DiImportedEntityContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diImportedEntity}.
     *
     * @param ctx the parse tree
     */
    void exitDiImportedEntity(LLVMIRParser.DiImportedEntityContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diImportedEntityField}.
     *
     * @param ctx the parse tree
     */
    void enterDiImportedEntityField(LLVMIRParser.DiImportedEntityFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diImportedEntityField}.
     *
     * @param ctx the parse tree
     */
    void exitDiImportedEntityField(LLVMIRParser.DiImportedEntityFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLabel}.
     *
     * @param ctx the parse tree
     */
    void enterDiLabel(LLVMIRParser.DiLabelContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLabel}.
     *
     * @param ctx the parse tree
     */
    void exitDiLabel(LLVMIRParser.DiLabelContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLabelField}.
     *
     * @param ctx the parse tree
     */
    void enterDiLabelField(LLVMIRParser.DiLabelFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLabelField}.
     *
     * @param ctx the parse tree
     */
    void exitDiLabelField(LLVMIRParser.DiLabelFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLexicalBlock}.
     *
     * @param ctx the parse tree
     */
    void enterDiLexicalBlock(LLVMIRParser.DiLexicalBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLexicalBlock}.
     *
     * @param ctx the parse tree
     */
    void exitDiLexicalBlock(LLVMIRParser.DiLexicalBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLexicalBlockField}.
     *
     * @param ctx the parse tree
     */
    void enterDiLexicalBlockField(LLVMIRParser.DiLexicalBlockFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLexicalBlockField}.
     *
     * @param ctx the parse tree
     */
    void exitDiLexicalBlockField(LLVMIRParser.DiLexicalBlockFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLexicalBlockFile}.
     *
     * @param ctx the parse tree
     */
    void enterDiLexicalBlockFile(LLVMIRParser.DiLexicalBlockFileContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLexicalBlockFile}.
     *
     * @param ctx the parse tree
     */
    void exitDiLexicalBlockFile(LLVMIRParser.DiLexicalBlockFileContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLexicalBlockFileField}.
     *
     * @param ctx the parse tree
     */
    void enterDiLexicalBlockFileField(LLVMIRParser.DiLexicalBlockFileFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLexicalBlockFileField}.
     *
     * @param ctx the parse tree
     */
    void exitDiLexicalBlockFileField(LLVMIRParser.DiLexicalBlockFileFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLocalVariable}.
     *
     * @param ctx the parse tree
     */
    void enterDiLocalVariable(LLVMIRParser.DiLocalVariableContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLocalVariable}.
     *
     * @param ctx the parse tree
     */
    void exitDiLocalVariable(LLVMIRParser.DiLocalVariableContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLocalVariableField}.
     *
     * @param ctx the parse tree
     */
    void enterDiLocalVariableField(LLVMIRParser.DiLocalVariableFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLocalVariableField}.
     *
     * @param ctx the parse tree
     */
    void exitDiLocalVariableField(LLVMIRParser.DiLocalVariableFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLocation}.
     *
     * @param ctx the parse tree
     */
    void enterDiLocation(LLVMIRParser.DiLocationContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLocation}.
     *
     * @param ctx the parse tree
     */
    void exitDiLocation(LLVMIRParser.DiLocationContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diLocationField}.
     *
     * @param ctx the parse tree
     */
    void enterDiLocationField(LLVMIRParser.DiLocationFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diLocationField}.
     *
     * @param ctx the parse tree
     */
    void exitDiLocationField(LLVMIRParser.DiLocationFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diMacro}.
     *
     * @param ctx the parse tree
     */
    void enterDiMacro(LLVMIRParser.DiMacroContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diMacro}.
     *
     * @param ctx the parse tree
     */
    void exitDiMacro(LLVMIRParser.DiMacroContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diMacroField}.
     *
     * @param ctx the parse tree
     */
    void enterDiMacroField(LLVMIRParser.DiMacroFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diMacroField}.
     *
     * @param ctx the parse tree
     */
    void exitDiMacroField(LLVMIRParser.DiMacroFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diMacroFile}.
     *
     * @param ctx the parse tree
     */
    void enterDiMacroFile(LLVMIRParser.DiMacroFileContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diMacroFile}.
     *
     * @param ctx the parse tree
     */
    void exitDiMacroFile(LLVMIRParser.DiMacroFileContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diMacroFileField}.
     *
     * @param ctx the parse tree
     */
    void enterDiMacroFileField(LLVMIRParser.DiMacroFileFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diMacroFileField}.
     *
     * @param ctx the parse tree
     */
    void exitDiMacroFileField(LLVMIRParser.DiMacroFileFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diModule}.
     *
     * @param ctx the parse tree
     */
    void enterDiModule(LLVMIRParser.DiModuleContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diModule}.
     *
     * @param ctx the parse tree
     */
    void exitDiModule(LLVMIRParser.DiModuleContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diModuleField}.
     *
     * @param ctx the parse tree
     */
    void enterDiModuleField(LLVMIRParser.DiModuleFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diModuleField}.
     *
     * @param ctx the parse tree
     */
    void exitDiModuleField(LLVMIRParser.DiModuleFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diNamespace}.
     *
     * @param ctx the parse tree
     */
    void enterDiNamespace(LLVMIRParser.DiNamespaceContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diNamespace}.
     *
     * @param ctx the parse tree
     */
    void exitDiNamespace(LLVMIRParser.DiNamespaceContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diNamespaceField}.
     *
     * @param ctx the parse tree
     */
    void enterDiNamespaceField(LLVMIRParser.DiNamespaceFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diNamespaceField}.
     *
     * @param ctx the parse tree
     */
    void exitDiNamespaceField(LLVMIRParser.DiNamespaceFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diObjCProperty}.
     *
     * @param ctx the parse tree
     */
    void enterDiObjCProperty(LLVMIRParser.DiObjCPropertyContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diObjCProperty}.
     *
     * @param ctx the parse tree
     */
    void exitDiObjCProperty(LLVMIRParser.DiObjCPropertyContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diObjCPropertyField}.
     *
     * @param ctx the parse tree
     */
    void enterDiObjCPropertyField(LLVMIRParser.DiObjCPropertyFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diObjCPropertyField}.
     *
     * @param ctx the parse tree
     */
    void exitDiObjCPropertyField(LLVMIRParser.DiObjCPropertyFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diStringType}.
     *
     * @param ctx the parse tree
     */
    void enterDiStringType(LLVMIRParser.DiStringTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diStringType}.
     *
     * @param ctx the parse tree
     */
    void exitDiStringType(LLVMIRParser.DiStringTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diStringTypeField}.
     *
     * @param ctx the parse tree
     */
    void enterDiStringTypeField(LLVMIRParser.DiStringTypeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diStringTypeField}.
     *
     * @param ctx the parse tree
     */
    void exitDiStringTypeField(LLVMIRParser.DiStringTypeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diSubprogram}.
     *
     * @param ctx the parse tree
     */
    void enterDiSubprogram(LLVMIRParser.DiSubprogramContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diSubprogram}.
     *
     * @param ctx the parse tree
     */
    void exitDiSubprogram(LLVMIRParser.DiSubprogramContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diSubprogramField}.
     *
     * @param ctx the parse tree
     */
    void enterDiSubprogramField(LLVMIRParser.DiSubprogramFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diSubprogramField}.
     *
     * @param ctx the parse tree
     */
    void exitDiSubprogramField(LLVMIRParser.DiSubprogramFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diSubrange}.
     *
     * @param ctx the parse tree
     */
    void enterDiSubrange(LLVMIRParser.DiSubrangeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diSubrange}.
     *
     * @param ctx the parse tree
     */
    void exitDiSubrange(LLVMIRParser.DiSubrangeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diSubrangeField}.
     *
     * @param ctx the parse tree
     */
    void enterDiSubrangeField(LLVMIRParser.DiSubrangeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diSubrangeField}.
     *
     * @param ctx the parse tree
     */
    void exitDiSubrangeField(LLVMIRParser.DiSubrangeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diSubroutineType}.
     *
     * @param ctx the parse tree
     */
    void enterDiSubroutineType(LLVMIRParser.DiSubroutineTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diSubroutineType}.
     *
     * @param ctx the parse tree
     */
    void exitDiSubroutineType(LLVMIRParser.DiSubroutineTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diTemplateTypeParameter}.
     *
     * @param ctx the parse tree
     */
    void enterDiTemplateTypeParameter(LLVMIRParser.DiTemplateTypeParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diTemplateTypeParameter}.
     *
     * @param ctx the parse tree
     */
    void exitDiTemplateTypeParameter(LLVMIRParser.DiTemplateTypeParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diTemplateValueParameter}.
     *
     * @param ctx the parse tree
     */
    void enterDiTemplateValueParameter(LLVMIRParser.DiTemplateValueParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diTemplateValueParameter}.
     *
     * @param ctx the parse tree
     */
    void exitDiTemplateValueParameter(LLVMIRParser.DiTemplateValueParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#genericDiNode}.
     *
     * @param ctx the parse tree
     */
    void enterGenericDiNode(LLVMIRParser.GenericDiNodeContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#genericDiNode}.
     *
     * @param ctx the parse tree
     */
    void exitGenericDiNode(LLVMIRParser.GenericDiNodeContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diTemplateTypeParameterField}.
     *
     * @param ctx the parse tree
     */
    void enterDiTemplateTypeParameterField(LLVMIRParser.DiTemplateTypeParameterFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diTemplateTypeParameterField}.
     *
     * @param ctx the parse tree
     */
    void exitDiTemplateTypeParameterField(LLVMIRParser.DiTemplateTypeParameterFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diCompileUnitField}.
     *
     * @param ctx the parse tree
     */
    void enterDiCompileUnitField(LLVMIRParser.DiCompileUnitFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diCompileUnitField}.
     *
     * @param ctx the parse tree
     */
    void exitDiCompileUnitField(LLVMIRParser.DiCompileUnitFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diCommonBlockField}.
     *
     * @param ctx the parse tree
     */
    void enterDiCommonBlockField(LLVMIRParser.DiCommonBlockFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diCommonBlockField}.
     *
     * @param ctx the parse tree
     */
    void exitDiCommonBlockField(LLVMIRParser.DiCommonBlockFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diBasicTypeField}.
     *
     * @param ctx the parse tree
     */
    void enterDiBasicTypeField(LLVMIRParser.DiBasicTypeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diBasicTypeField}.
     *
     * @param ctx the parse tree
     */
    void exitDiBasicTypeField(LLVMIRParser.DiBasicTypeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#genericDINodeField}.
     *
     * @param ctx the parse tree
     */
    void enterGenericDINodeField(LLVMIRParser.GenericDINodeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#genericDINodeField}.
     *
     * @param ctx the parse tree
     */
    void exitGenericDINodeField(LLVMIRParser.GenericDINodeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#tagField}.
     *
     * @param ctx the parse tree
     */
    void enterTagField(LLVMIRParser.TagFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#tagField}.
     *
     * @param ctx the parse tree
     */
    void exitTagField(LLVMIRParser.TagFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#headerField}.
     *
     * @param ctx the parse tree
     */
    void enterHeaderField(LLVMIRParser.HeaderFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#headerField}.
     *
     * @param ctx the parse tree
     */
    void exitHeaderField(LLVMIRParser.HeaderFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#operandsField}.
     *
     * @param ctx the parse tree
     */
    void enterOperandsField(LLVMIRParser.OperandsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#operandsField}.
     *
     * @param ctx the parse tree
     */
    void exitOperandsField(LLVMIRParser.OperandsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diTemplateValueParameterField}.
     *
     * @param ctx the parse tree
     */
    void enterDiTemplateValueParameterField(LLVMIRParser.DiTemplateValueParameterFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diTemplateValueParameterField}.
     *
     * @param ctx the parse tree
     */
    void exitDiTemplateValueParameterField(LLVMIRParser.DiTemplateValueParameterFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#nameField}.
     *
     * @param ctx the parse tree
     */
    void enterNameField(LLVMIRParser.NameFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#nameField}.
     *
     * @param ctx the parse tree
     */
    void exitNameField(LLVMIRParser.NameFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#typeField}.
     *
     * @param ctx the parse tree
     */
    void enterTypeField(LLVMIRParser.TypeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#typeField}.
     *
     * @param ctx the parse tree
     */
    void exitTypeField(LLVMIRParser.TypeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#defaultedField}.
     *
     * @param ctx the parse tree
     */
    void enterDefaultedField(LLVMIRParser.DefaultedFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#defaultedField}.
     *
     * @param ctx the parse tree
     */
    void exitDefaultedField(LLVMIRParser.DefaultedFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#valueField}.
     *
     * @param ctx the parse tree
     */
    void enterValueField(LLVMIRParser.ValueFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#valueField}.
     *
     * @param ctx the parse tree
     */
    void exitValueField(LLVMIRParser.ValueFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#mdField}.
     *
     * @param ctx the parse tree
     */
    void enterMdField(LLVMIRParser.MdFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#mdField}.
     *
     * @param ctx the parse tree
     */
    void exitMdField(LLVMIRParser.MdFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diSubroutineTypeField}.
     *
     * @param ctx the parse tree
     */
    void enterDiSubroutineTypeField(LLVMIRParser.DiSubroutineTypeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diSubroutineTypeField}.
     *
     * @param ctx the parse tree
     */
    void exitDiSubroutineTypeField(LLVMIRParser.DiSubroutineTypeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#flagsField}.
     *
     * @param ctx the parse tree
     */
    void enterFlagsField(LLVMIRParser.FlagsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#flagsField}.
     *
     * @param ctx the parse tree
     */
    void exitFlagsField(LLVMIRParser.FlagsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#diFlags}.
     *
     * @param ctx the parse tree
     */
    void enterDiFlags(LLVMIRParser.DiFlagsContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#diFlags}.
     *
     * @param ctx the parse tree
     */
    void exitDiFlags(LLVMIRParser.DiFlagsContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#ccField}.
     *
     * @param ctx the parse tree
     */
    void enterCcField(LLVMIRParser.CcFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#ccField}.
     *
     * @param ctx the parse tree
     */
    void exitCcField(LLVMIRParser.CcFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#alignField}.
     *
     * @param ctx the parse tree
     */
    void enterAlignField(LLVMIRParser.AlignFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#alignField}.
     *
     * @param ctx the parse tree
     */
    void exitAlignField(LLVMIRParser.AlignFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#allocatedField}.
     *
     * @param ctx the parse tree
     */
    void enterAllocatedField(LLVMIRParser.AllocatedFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#allocatedField}.
     *
     * @param ctx the parse tree
     */
    void exitAllocatedField(LLVMIRParser.AllocatedFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#annotationsField}.
     *
     * @param ctx the parse tree
     */
    void enterAnnotationsField(LLVMIRParser.AnnotationsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#annotationsField}.
     *
     * @param ctx the parse tree
     */
    void exitAnnotationsField(LLVMIRParser.AnnotationsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#argField}.
     *
     * @param ctx the parse tree
     */
    void enterArgField(LLVMIRParser.ArgFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#argField}.
     *
     * @param ctx the parse tree
     */
    void exitArgField(LLVMIRParser.ArgFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#associatedField}.
     *
     * @param ctx the parse tree
     */
    void enterAssociatedField(LLVMIRParser.AssociatedFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#associatedField}.
     *
     * @param ctx the parse tree
     */
    void exitAssociatedField(LLVMIRParser.AssociatedFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#attributesField}.
     *
     * @param ctx the parse tree
     */
    void enterAttributesField(LLVMIRParser.AttributesFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#attributesField}.
     *
     * @param ctx the parse tree
     */
    void exitAttributesField(LLVMIRParser.AttributesFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#baseTypeField}.
     *
     * @param ctx the parse tree
     */
    void enterBaseTypeField(LLVMIRParser.BaseTypeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#baseTypeField}.
     *
     * @param ctx the parse tree
     */
    void exitBaseTypeField(LLVMIRParser.BaseTypeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#checksumField}.
     *
     * @param ctx the parse tree
     */
    void enterChecksumField(LLVMIRParser.ChecksumFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#checksumField}.
     *
     * @param ctx the parse tree
     */
    void exitChecksumField(LLVMIRParser.ChecksumFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#checksumkindField}.
     *
     * @param ctx the parse tree
     */
    void enterChecksumkindField(LLVMIRParser.ChecksumkindFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#checksumkindField}.
     *
     * @param ctx the parse tree
     */
    void exitChecksumkindField(LLVMIRParser.ChecksumkindFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#columnField}.
     *
     * @param ctx the parse tree
     */
    void enterColumnField(LLVMIRParser.ColumnFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#columnField}.
     *
     * @param ctx the parse tree
     */
    void exitColumnField(LLVMIRParser.ColumnFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#configMacrosField}.
     *
     * @param ctx the parse tree
     */
    void enterConfigMacrosField(LLVMIRParser.ConfigMacrosFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#configMacrosField}.
     *
     * @param ctx the parse tree
     */
    void exitConfigMacrosField(LLVMIRParser.ConfigMacrosFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#containingTypeField}.
     *
     * @param ctx the parse tree
     */
    void enterContainingTypeField(LLVMIRParser.ContainingTypeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#containingTypeField}.
     *
     * @param ctx the parse tree
     */
    void exitContainingTypeField(LLVMIRParser.ContainingTypeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#countField}.
     *
     * @param ctx the parse tree
     */
    void enterCountField(LLVMIRParser.CountFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#countField}.
     *
     * @param ctx the parse tree
     */
    void exitCountField(LLVMIRParser.CountFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#debugInfoForProfilingField}.
     *
     * @param ctx the parse tree
     */
    void enterDebugInfoForProfilingField(LLVMIRParser.DebugInfoForProfilingFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#debugInfoForProfilingField}.
     *
     * @param ctx the parse tree
     */
    void exitDebugInfoForProfilingField(LLVMIRParser.DebugInfoForProfilingFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#declarationField}.
     *
     * @param ctx the parse tree
     */
    void enterDeclarationField(LLVMIRParser.DeclarationFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#declarationField}.
     *
     * @param ctx the parse tree
     */
    void exitDeclarationField(LLVMIRParser.DeclarationFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#directoryField}.
     *
     * @param ctx the parse tree
     */
    void enterDirectoryField(LLVMIRParser.DirectoryFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#directoryField}.
     *
     * @param ctx the parse tree
     */
    void exitDirectoryField(LLVMIRParser.DirectoryFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#discriminatorField}.
     *
     * @param ctx the parse tree
     */
    void enterDiscriminatorField(LLVMIRParser.DiscriminatorFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#discriminatorField}.
     *
     * @param ctx the parse tree
     */
    void exitDiscriminatorField(LLVMIRParser.DiscriminatorFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#dataLocationField}.
     *
     * @param ctx the parse tree
     */
    void enterDataLocationField(LLVMIRParser.DataLocationFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#dataLocationField}.
     *
     * @param ctx the parse tree
     */
    void exitDataLocationField(LLVMIRParser.DataLocationFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#discriminatorIntField}.
     *
     * @param ctx the parse tree
     */
    void enterDiscriminatorIntField(LLVMIRParser.DiscriminatorIntFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#discriminatorIntField}.
     *
     * @param ctx the parse tree
     */
    void exitDiscriminatorIntField(LLVMIRParser.DiscriminatorIntFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#dwarfAddressSpaceField}.
     *
     * @param ctx the parse tree
     */
    void enterDwarfAddressSpaceField(LLVMIRParser.DwarfAddressSpaceFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#dwarfAddressSpaceField}.
     *
     * @param ctx the parse tree
     */
    void exitDwarfAddressSpaceField(LLVMIRParser.DwarfAddressSpaceFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#dwoIdField}.
     *
     * @param ctx the parse tree
     */
    void enterDwoIdField(LLVMIRParser.DwoIdFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#dwoIdField}.
     *
     * @param ctx the parse tree
     */
    void exitDwoIdField(LLVMIRParser.DwoIdFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#elementsField}.
     *
     * @param ctx the parse tree
     */
    void enterElementsField(LLVMIRParser.ElementsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#elementsField}.
     *
     * @param ctx the parse tree
     */
    void exitElementsField(LLVMIRParser.ElementsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#emissionKindField}.
     *
     * @param ctx the parse tree
     */
    void enterEmissionKindField(LLVMIRParser.EmissionKindFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#emissionKindField}.
     *
     * @param ctx the parse tree
     */
    void exitEmissionKindField(LLVMIRParser.EmissionKindFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#encodingField}.
     *
     * @param ctx the parse tree
     */
    void enterEncodingField(LLVMIRParser.EncodingFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#encodingField}.
     *
     * @param ctx the parse tree
     */
    void exitEncodingField(LLVMIRParser.EncodingFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#entityField}.
     *
     * @param ctx the parse tree
     */
    void enterEntityField(LLVMIRParser.EntityFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#entityField}.
     *
     * @param ctx the parse tree
     */
    void exitEntityField(LLVMIRParser.EntityFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#enumsField}.
     *
     * @param ctx the parse tree
     */
    void enterEnumsField(LLVMIRParser.EnumsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#enumsField}.
     *
     * @param ctx the parse tree
     */
    void exitEnumsField(LLVMIRParser.EnumsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#exportSymbolsField}.
     *
     * @param ctx the parse tree
     */
    void enterExportSymbolsField(LLVMIRParser.ExportSymbolsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#exportSymbolsField}.
     *
     * @param ctx the parse tree
     */
    void exitExportSymbolsField(LLVMIRParser.ExportSymbolsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#exprField}.
     *
     * @param ctx the parse tree
     */
    void enterExprField(LLVMIRParser.ExprFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#exprField}.
     *
     * @param ctx the parse tree
     */
    void exitExprField(LLVMIRParser.ExprFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#extraDataField}.
     *
     * @param ctx the parse tree
     */
    void enterExtraDataField(LLVMIRParser.ExtraDataFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#extraDataField}.
     *
     * @param ctx the parse tree
     */
    void exitExtraDataField(LLVMIRParser.ExtraDataFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#fileField}.
     *
     * @param ctx the parse tree
     */
    void enterFileField(LLVMIRParser.FileFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#fileField}.
     *
     * @param ctx the parse tree
     */
    void exitFileField(LLVMIRParser.FileFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#filenameField}.
     *
     * @param ctx the parse tree
     */
    void enterFilenameField(LLVMIRParser.FilenameFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#filenameField}.
     *
     * @param ctx the parse tree
     */
    void exitFilenameField(LLVMIRParser.FilenameFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#flagsStringField}.
     *
     * @param ctx the parse tree
     */
    void enterFlagsStringField(LLVMIRParser.FlagsStringFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#flagsStringField}.
     *
     * @param ctx the parse tree
     */
    void exitFlagsStringField(LLVMIRParser.FlagsStringFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#getterField}.
     *
     * @param ctx the parse tree
     */
    void enterGetterField(LLVMIRParser.GetterFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#getterField}.
     *
     * @param ctx the parse tree
     */
    void exitGetterField(LLVMIRParser.GetterFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#globalsField}.
     *
     * @param ctx the parse tree
     */
    void enterGlobalsField(LLVMIRParser.GlobalsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#globalsField}.
     *
     * @param ctx the parse tree
     */
    void exitGlobalsField(LLVMIRParser.GlobalsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#identifierField}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierField(LLVMIRParser.IdentifierFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#identifierField}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierField(LLVMIRParser.IdentifierFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#importsField}.
     *
     * @param ctx the parse tree
     */
    void enterImportsField(LLVMIRParser.ImportsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#importsField}.
     *
     * @param ctx the parse tree
     */
    void exitImportsField(LLVMIRParser.ImportsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#includePathField}.
     *
     * @param ctx the parse tree
     */
    void enterIncludePathField(LLVMIRParser.IncludePathFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#includePathField}.
     *
     * @param ctx the parse tree
     */
    void exitIncludePathField(LLVMIRParser.IncludePathFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#inlinedAtField}.
     *
     * @param ctx the parse tree
     */
    void enterInlinedAtField(LLVMIRParser.InlinedAtFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#inlinedAtField}.
     *
     * @param ctx the parse tree
     */
    void exitInlinedAtField(LLVMIRParser.InlinedAtFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#isDeclField}.
     *
     * @param ctx the parse tree
     */
    void enterIsDeclField(LLVMIRParser.IsDeclFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#isDeclField}.
     *
     * @param ctx the parse tree
     */
    void exitIsDeclField(LLVMIRParser.IsDeclFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#isDefinitionField}.
     *
     * @param ctx the parse tree
     */
    void enterIsDefinitionField(LLVMIRParser.IsDefinitionFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#isDefinitionField}.
     *
     * @param ctx the parse tree
     */
    void exitIsDefinitionField(LLVMIRParser.IsDefinitionFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#isImplicitCodeField}.
     *
     * @param ctx the parse tree
     */
    void enterIsImplicitCodeField(LLVMIRParser.IsImplicitCodeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#isImplicitCodeField}.
     *
     * @param ctx the parse tree
     */
    void exitIsImplicitCodeField(LLVMIRParser.IsImplicitCodeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#isLocalField}.
     *
     * @param ctx the parse tree
     */
    void enterIsLocalField(LLVMIRParser.IsLocalFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#isLocalField}.
     *
     * @param ctx the parse tree
     */
    void exitIsLocalField(LLVMIRParser.IsLocalFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#isOptimizedField}.
     *
     * @param ctx the parse tree
     */
    void enterIsOptimizedField(LLVMIRParser.IsOptimizedFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#isOptimizedField}.
     *
     * @param ctx the parse tree
     */
    void exitIsOptimizedField(LLVMIRParser.IsOptimizedFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#isUnsignedField}.
     *
     * @param ctx the parse tree
     */
    void enterIsUnsignedField(LLVMIRParser.IsUnsignedFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#isUnsignedField}.
     *
     * @param ctx the parse tree
     */
    void exitIsUnsignedField(LLVMIRParser.IsUnsignedFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#apiNotesField}.
     *
     * @param ctx the parse tree
     */
    void enterApiNotesField(LLVMIRParser.ApiNotesFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#apiNotesField}.
     *
     * @param ctx the parse tree
     */
    void exitApiNotesField(LLVMIRParser.ApiNotesFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#languageField}.
     *
     * @param ctx the parse tree
     */
    void enterLanguageField(LLVMIRParser.LanguageFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#languageField}.
     *
     * @param ctx the parse tree
     */
    void exitLanguageField(LLVMIRParser.LanguageFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#lineField}.
     *
     * @param ctx the parse tree
     */
    void enterLineField(LLVMIRParser.LineFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#lineField}.
     *
     * @param ctx the parse tree
     */
    void exitLineField(LLVMIRParser.LineFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#linkageNameField}.
     *
     * @param ctx the parse tree
     */
    void enterLinkageNameField(LLVMIRParser.LinkageNameFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#linkageNameField}.
     *
     * @param ctx the parse tree
     */
    void exitLinkageNameField(LLVMIRParser.LinkageNameFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#lowerBoundField}.
     *
     * @param ctx the parse tree
     */
    void enterLowerBoundField(LLVMIRParser.LowerBoundFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#lowerBoundField}.
     *
     * @param ctx the parse tree
     */
    void exitLowerBoundField(LLVMIRParser.LowerBoundFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#macrosField}.
     *
     * @param ctx the parse tree
     */
    void enterMacrosField(LLVMIRParser.MacrosFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#macrosField}.
     *
     * @param ctx the parse tree
     */
    void exitMacrosField(LLVMIRParser.MacrosFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#nameTableKindField}.
     *
     * @param ctx the parse tree
     */
    void enterNameTableKindField(LLVMIRParser.NameTableKindFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#nameTableKindField}.
     *
     * @param ctx the parse tree
     */
    void exitNameTableKindField(LLVMIRParser.NameTableKindFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#nodesField}.
     *
     * @param ctx the parse tree
     */
    void enterNodesField(LLVMIRParser.NodesFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#nodesField}.
     *
     * @param ctx the parse tree
     */
    void exitNodesField(LLVMIRParser.NodesFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#offsetField}.
     *
     * @param ctx the parse tree
     */
    void enterOffsetField(LLVMIRParser.OffsetFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#offsetField}.
     *
     * @param ctx the parse tree
     */
    void exitOffsetField(LLVMIRParser.OffsetFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#producerField}.
     *
     * @param ctx the parse tree
     */
    void enterProducerField(LLVMIRParser.ProducerFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#producerField}.
     *
     * @param ctx the parse tree
     */
    void exitProducerField(LLVMIRParser.ProducerFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#rangesBaseAddressField}.
     *
     * @param ctx the parse tree
     */
    void enterRangesBaseAddressField(LLVMIRParser.RangesBaseAddressFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#rangesBaseAddressField}.
     *
     * @param ctx the parse tree
     */
    void exitRangesBaseAddressField(LLVMIRParser.RangesBaseAddressFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#rankField}.
     *
     * @param ctx the parse tree
     */
    void enterRankField(LLVMIRParser.RankFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#rankField}.
     *
     * @param ctx the parse tree
     */
    void exitRankField(LLVMIRParser.RankFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#retainedNodesField}.
     *
     * @param ctx the parse tree
     */
    void enterRetainedNodesField(LLVMIRParser.RetainedNodesFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#retainedNodesField}.
     *
     * @param ctx the parse tree
     */
    void exitRetainedNodesField(LLVMIRParser.RetainedNodesFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#retainedTypesField}.
     *
     * @param ctx the parse tree
     */
    void enterRetainedTypesField(LLVMIRParser.RetainedTypesFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#retainedTypesField}.
     *
     * @param ctx the parse tree
     */
    void exitRetainedTypesField(LLVMIRParser.RetainedTypesFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#runtimeLangField}.
     *
     * @param ctx the parse tree
     */
    void enterRuntimeLangField(LLVMIRParser.RuntimeLangFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#runtimeLangField}.
     *
     * @param ctx the parse tree
     */
    void exitRuntimeLangField(LLVMIRParser.RuntimeLangFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#runtimeVersionField}.
     *
     * @param ctx the parse tree
     */
    void enterRuntimeVersionField(LLVMIRParser.RuntimeVersionFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#runtimeVersionField}.
     *
     * @param ctx the parse tree
     */
    void exitRuntimeVersionField(LLVMIRParser.RuntimeVersionFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#scopeField}.
     *
     * @param ctx the parse tree
     */
    void enterScopeField(LLVMIRParser.ScopeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#scopeField}.
     *
     * @param ctx the parse tree
     */
    void exitScopeField(LLVMIRParser.ScopeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#scopeLineField}.
     *
     * @param ctx the parse tree
     */
    void enterScopeLineField(LLVMIRParser.ScopeLineFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#scopeLineField}.
     *
     * @param ctx the parse tree
     */
    void exitScopeLineField(LLVMIRParser.ScopeLineFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sdkField}.
     *
     * @param ctx the parse tree
     */
    void enterSdkField(LLVMIRParser.SdkFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sdkField}.
     *
     * @param ctx the parse tree
     */
    void exitSdkField(LLVMIRParser.SdkFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#setterField}.
     *
     * @param ctx the parse tree
     */
    void enterSetterField(LLVMIRParser.SetterFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#setterField}.
     *
     * @param ctx the parse tree
     */
    void exitSetterField(LLVMIRParser.SetterFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sizeField}.
     *
     * @param ctx the parse tree
     */
    void enterSizeField(LLVMIRParser.SizeFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sizeField}.
     *
     * @param ctx the parse tree
     */
    void exitSizeField(LLVMIRParser.SizeFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sourceField}.
     *
     * @param ctx the parse tree
     */
    void enterSourceField(LLVMIRParser.SourceFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sourceField}.
     *
     * @param ctx the parse tree
     */
    void exitSourceField(LLVMIRParser.SourceFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#spFlagsField}.
     *
     * @param ctx the parse tree
     */
    void enterSpFlagsField(LLVMIRParser.SpFlagsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#spFlagsField}.
     *
     * @param ctx the parse tree
     */
    void exitSpFlagsField(LLVMIRParser.SpFlagsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#splitDebugFilenameField}.
     *
     * @param ctx the parse tree
     */
    void enterSplitDebugFilenameField(LLVMIRParser.SplitDebugFilenameFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#splitDebugFilenameField}.
     *
     * @param ctx the parse tree
     */
    void exitSplitDebugFilenameField(LLVMIRParser.SplitDebugFilenameFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#splitDebugInliningField}.
     *
     * @param ctx the parse tree
     */
    void enterSplitDebugInliningField(LLVMIRParser.SplitDebugInliningFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#splitDebugInliningField}.
     *
     * @param ctx the parse tree
     */
    void exitSplitDebugInliningField(LLVMIRParser.SplitDebugInliningFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#strideField}.
     *
     * @param ctx the parse tree
     */
    void enterStrideField(LLVMIRParser.StrideFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#strideField}.
     *
     * @param ctx the parse tree
     */
    void exitStrideField(LLVMIRParser.StrideFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#stringLengthField}.
     *
     * @param ctx the parse tree
     */
    void enterStringLengthField(LLVMIRParser.StringLengthFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#stringLengthField}.
     *
     * @param ctx the parse tree
     */
    void exitStringLengthField(LLVMIRParser.StringLengthFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#stringLengthExpressionField}.
     *
     * @param ctx the parse tree
     */
    void enterStringLengthExpressionField(LLVMIRParser.StringLengthExpressionFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#stringLengthExpressionField}.
     *
     * @param ctx the parse tree
     */
    void exitStringLengthExpressionField(LLVMIRParser.StringLengthExpressionFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#stringLocationExpressionField}.
     *
     * @param ctx the parse tree
     */
    void enterStringLocationExpressionField(LLVMIRParser.StringLocationExpressionFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#stringLocationExpressionField}.
     *
     * @param ctx the parse tree
     */
    void exitStringLocationExpressionField(LLVMIRParser.StringLocationExpressionFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#sysrootField}.
     *
     * @param ctx the parse tree
     */
    void enterSysrootField(LLVMIRParser.SysrootFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#sysrootField}.
     *
     * @param ctx the parse tree
     */
    void exitSysrootField(LLVMIRParser.SysrootFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#targetFuncNameField}.
     *
     * @param ctx the parse tree
     */
    void enterTargetFuncNameField(LLVMIRParser.TargetFuncNameFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#targetFuncNameField}.
     *
     * @param ctx the parse tree
     */
    void exitTargetFuncNameField(LLVMIRParser.TargetFuncNameFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#templateParamsField}.
     *
     * @param ctx the parse tree
     */
    void enterTemplateParamsField(LLVMIRParser.TemplateParamsFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#templateParamsField}.
     *
     * @param ctx the parse tree
     */
    void exitTemplateParamsField(LLVMIRParser.TemplateParamsFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#thisAdjustmentField}.
     *
     * @param ctx the parse tree
     */
    void enterThisAdjustmentField(LLVMIRParser.ThisAdjustmentFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#thisAdjustmentField}.
     *
     * @param ctx the parse tree
     */
    void exitThisAdjustmentField(LLVMIRParser.ThisAdjustmentFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#thrownTypesField}.
     *
     * @param ctx the parse tree
     */
    void enterThrownTypesField(LLVMIRParser.ThrownTypesFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#thrownTypesField}.
     *
     * @param ctx the parse tree
     */
    void exitThrownTypesField(LLVMIRParser.ThrownTypesFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#typeMacinfoField}.
     *
     * @param ctx the parse tree
     */
    void enterTypeMacinfoField(LLVMIRParser.TypeMacinfoFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#typeMacinfoField}.
     *
     * @param ctx the parse tree
     */
    void exitTypeMacinfoField(LLVMIRParser.TypeMacinfoFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#typesField}.
     *
     * @param ctx the parse tree
     */
    void enterTypesField(LLVMIRParser.TypesFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#typesField}.
     *
     * @param ctx the parse tree
     */
    void exitTypesField(LLVMIRParser.TypesFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#unitField}.
     *
     * @param ctx the parse tree
     */
    void enterUnitField(LLVMIRParser.UnitFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#unitField}.
     *
     * @param ctx the parse tree
     */
    void exitUnitField(LLVMIRParser.UnitFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#upperBoundField}.
     *
     * @param ctx the parse tree
     */
    void enterUpperBoundField(LLVMIRParser.UpperBoundFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#upperBoundField}.
     *
     * @param ctx the parse tree
     */
    void exitUpperBoundField(LLVMIRParser.UpperBoundFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#valueIntField}.
     *
     * @param ctx the parse tree
     */
    void enterValueIntField(LLVMIRParser.ValueIntFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#valueIntField}.
     *
     * @param ctx the parse tree
     */
    void exitValueIntField(LLVMIRParser.ValueIntFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#valueStringField}.
     *
     * @param ctx the parse tree
     */
    void enterValueStringField(LLVMIRParser.ValueStringFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#valueStringField}.
     *
     * @param ctx the parse tree
     */
    void exitValueStringField(LLVMIRParser.ValueStringFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#varField}.
     *
     * @param ctx the parse tree
     */
    void enterVarField(LLVMIRParser.VarFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#varField}.
     *
     * @param ctx the parse tree
     */
    void exitVarField(LLVMIRParser.VarFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#virtualIndexField}.
     *
     * @param ctx the parse tree
     */
    void enterVirtualIndexField(LLVMIRParser.VirtualIndexFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#virtualIndexField}.
     *
     * @param ctx the parse tree
     */
    void exitVirtualIndexField(LLVMIRParser.VirtualIndexFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#virtualityField}.
     *
     * @param ctx the parse tree
     */
    void enterVirtualityField(LLVMIRParser.VirtualityFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#virtualityField}.
     *
     * @param ctx the parse tree
     */
    void exitVirtualityField(LLVMIRParser.VirtualityFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link LLVMIRParser#vtableHolderField}.
     *
     * @param ctx the parse tree
     */
    void enterVtableHolderField(LLVMIRParser.VtableHolderFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link LLVMIRParser#vtableHolderField}.
     *
     * @param ctx the parse tree
     */
    void exitVtableHolderField(LLVMIRParser.VtableHolderFieldContext ctx);
}