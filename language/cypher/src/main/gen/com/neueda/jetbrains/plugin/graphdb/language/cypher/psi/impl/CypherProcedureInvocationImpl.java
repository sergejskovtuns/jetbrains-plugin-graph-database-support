// This is a generated file. Not intended for manual editing.
package com.neueda.jetbrains.plugin.graphdb.language.cypher.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.neueda.jetbrains.plugin.graphdb.language.cypher.psi.CypherTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.neueda.jetbrains.plugin.graphdb.language.cypher.psi.*;

public class CypherProcedureInvocationImpl extends ASTWrapperPsiElement implements CypherProcedureInvocation {

  public CypherProcedureInvocationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CypherVisitor visitor) {
    visitor.visitProcedureInvocation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) accept((CypherVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherProcedureArguments getProcedureArguments() {
    return findNotNullChildByClass(CypherProcedureArguments.class);
  }

  @Override
  @NotNull
  public CypherProcedureInvocationBody getProcedureInvocationBody() {
    return findNotNullChildByClass(CypherProcedureInvocationBody.class);
  }

  public String getFullName() {
    return CypherPsiImplUtil.getFullName(this);
  }

}
