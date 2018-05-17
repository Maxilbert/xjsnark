package xjsnark.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x1fa6817026f92876L, "xjsnark.structure.AssignValue"))) {
        return Collections.<ConceptEditor>singletonList(new AssignValue_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x56922dce2d44475dL, "xjsnark.structure.BitsOp"))) {
        return Collections.<ConceptEditor>singletonList(new BitsOp_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x12cb358a1aa7c343L, "xjsnark.structure.BoundedLoop"))) {
        return Collections.<ConceptEditor>singletonList(new BoundedLoop_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x67fc252049b55c0dL, "xjsnark.structure.ConversionBetweenTypes"))) {
        return Collections.<ConceptEditor>singletonList(new ConversionBetweenTypes_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x5b75ac4214a75f6dL, "xjsnark.structure.CustomAssignmentExpression"))) {
        return Collections.<ConceptEditor>singletonList(new CustomAssignmentExpression_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1986fe0L, "xjsnark.structure.ExternalBlock"))) {
        return Collections.<ConceptEditor>singletonList(new ExternalBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad1L, "xjsnark.structure.FieldDefTable"))) {
        return Collections.<ConceptEditor>singletonList(new FieldDefTable_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x1fa6817026d685c6L, "xjsnark.structure.FieldInverseOp"))) {
        return Collections.<ConceptEditor>singletonList(new FieldInverseOp_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad2L, "xjsnark.structure.FieldRecord"))) {
        return Collections.<ConceptEditor>singletonList(new FieldRecord_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x6804d86d4aa4dbc1L, "xjsnark.structure.InitEmptyMemory"))) {
        return Collections.<ConceptEditor>singletonList(new InitEmptyMemory_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x1fa68170270e2608L, "xjsnark.structure.InitMemory"))) {
        return Collections.<ConceptEditor>singletonList(new InitMemory_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3ec6ba5L, "xjsnark.structure.InputBlock"))) {
        return Collections.<ConceptEditor>singletonList(new InputBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1829874L, "xjsnark.structure.JAndExpression"))) {
        return Collections.<ConceptEditor>singletonList(new JAndExpression_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x57892321212d3cd7L, "xjsnark.structure.JBooleanType"))) {
        return Collections.<ConceptEditor>singletonList(new JBooleanType_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x4bcdfddfee9be827L, "xjsnark.structure.JEqualsExpression"))) {
        return Collections.<ConceptEditor>singletonList(new JEqualsExpression_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x6804d86d4d430c5aL, "xjsnark.structure.JFieldConversion"))) {
        return Collections.<ConceptEditor>singletonList(new JFieldConversion_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType"))) {
        return Collections.<ConceptEditor>singletonList(new JFieldType_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x61502e94ec0554f2L, "xjsnark.structure.JIntegerConstant"))) {
        return Collections.<ConceptEditor>singletonList(new JIntegerConstant_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x72b1138add75e682L, "xjsnark.structure.JNotEqualsExpression"))) {
        return Collections.<ConceptEditor>singletonList(new JNotEqualsExpression_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c182aa15L, "xjsnark.structure.JNotExpression"))) {
        return Collections.<ConceptEditor>singletonList(new JNotExpression_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1829875L, "xjsnark.structure.JOrExpression"))) {
        return Collections.<ConceptEditor>singletonList(new JOrExpression_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x7cfe1585af18da2eL, "xjsnark.structure.JUnsignedBigIntegerDecimalConstant"))) {
        return Collections.<ConceptEditor>singletonList(new JUnsignedBigIntegerDecimalConstant_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x7cfe1585af18e156L, "xjsnark.structure.JUnsignedBigIntegerHexConstant"))) {
        return Collections.<ConceptEditor>singletonList(new JUnsignedBigIntegerHexConstant_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x7e3d44c18645a331L, "xjsnark.structure.JUnsignedIntegerConversion"))) {
        return Collections.<ConceptEditor>singletonList(new JUnsignedIntegerConversion_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType"))) {
        return Collections.<ConceptEditor>singletonList(new JUnsignedIntegerType_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x1fa6817027253167L, "xjsnark.structure.MemoryAccessExpression"))) {
        return Collections.<ConceptEditor>singletonList(new MemoryAccessExpression_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x1fa68170270e25b5L, "xjsnark.structure.MemoryType"))) {
        return Collections.<ConceptEditor>singletonList(new MemoryType_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x6804d86d41ebfc38L, "xjsnark.structure.MultiLineCommentClassMember"))) {
        return Collections.<ConceptEditor>singletonList(new MultiLineCommentClassMember_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fb13ebL, "xjsnark.structure.OutputBlock"))) {
        return Collections.<ConceptEditor>singletonList(new OutputBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x280cd37f8502b2fcL, "xjsnark.structure.PermutationResolver"))) {
        return Collections.<ConceptEditor>singletonList(new PermutationResolver_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x280cd37f850212aaL, "xjsnark.structure.PermutationVerifier"))) {
        return Collections.<ConceptEditor>singletonList(new PermutationVerifier_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x5afb038c89c7a471L, "xjsnark.structure.PostTestBlock"))) {
        return Collections.<ConceptEditor>singletonList(new PostTestBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x5afb038c89c7a42bL, "xjsnark.structure.PreTestBlock"))) {
        return Collections.<ConceptEditor>singletonList(new PreTestBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x64cb8fa51401373bL, "xjsnark.structure.ProgramDefinition"))) {
        return Collections.<ConceptEditor>singletonList(new ProgramDefinition_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x5dcbcfcfec8805fcL, "xjsnark.structure.RuntimeStructDefinition"))) {
        return Collections.<ConceptEditor>singletonList(new RuntimeStructDefinition_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x6804d86d41b80405L, "xjsnark.structure.SingleLineCommentClassMember"))) {
        return Collections.<ConceptEditor>singletonList(new SingleLineCommentClassMember_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x701def9dcb9d54fcL, "xjsnark.structure.StructDefinition"))) {
        return Collections.<ConceptEditor>singletonList(new StructDefinition_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x3d482b3147b16973L, "xjsnark.structure.TestBlock"))) {
        return Collections.<ConceptEditor>singletonList(new TestBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0xf685d8194f3163cL, "xjsnark.structure.UnaryBitwiseNegate"))) {
        return Collections.<ConceptEditor>singletonList(new UnaryBitwiseNegate_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1a5a40aL, "xjsnark.structure.ValueOp"))) {
        return Collections.<ConceptEditor>singletonList(new ValueOp_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x6804d86d4b818deaL, "xjsnark.structure.VerifiedWitnessBlock"))) {
        return Collections.<ConceptEditor>singletonList(new VerifiedWitnessBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x73bec06cafa7537cL, "xjsnark.structure.VerifyEqStatement"))) {
        return Collections.<ConceptEditor>singletonList(new VerifyEqStatement_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c116dbe1L, "xjsnark.structure.VerifyStatement"))) {
        return Collections.<ConceptEditor>singletonList(new VerifyStatement_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fc3a64L, "xjsnark.structure.WitnessBlock"))) {
        return Collections.<ConceptEditor>singletonList(new WitnessBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x170da68057fdff54L, "xjsnark.structure.xFieldDeclaration"))) {
        return Collections.<ConceptEditor>singletonList(new xFieldDeclaration_Editor());
      }
    }
    return Collections.<ConceptEditor>emptyList();
  }

  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, "jetbrains.mps.baseLanguage.structure.IVisible"))) {
        if ("xjsnark.editor.Component_Visibility".equals(editorComponentId)) {
          return Collections.<ConceptEditorComponent>singletonList(new Component_Visibility());
        }
      }
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }


}
