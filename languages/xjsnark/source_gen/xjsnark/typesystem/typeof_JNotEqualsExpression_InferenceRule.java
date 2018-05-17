package xjsnark.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_JNotEqualsExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_JNotEqualsExpression_InferenceRule() {
  }
  public void applyRule(final SNode jNotEqualsExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = jNotEqualsExpression;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7553992366092079099", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7553992366092079101", true), (SNode) _quotation_createNode_4w7j42_a0a0b(), _info_12389875345);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x72b1138add75e682L, "xjsnark.structure.JNotEqualsExpression");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_4w7j42_a0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x57892321212d3cd7L, "xjsnark.structure.JBooleanType"), null, null, false);
    return quotedNode_1;
  }
}
