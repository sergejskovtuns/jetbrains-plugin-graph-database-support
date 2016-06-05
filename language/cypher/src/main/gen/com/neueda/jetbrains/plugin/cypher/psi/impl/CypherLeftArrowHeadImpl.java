// This is a generated file. Not intended for manual editing.
package com.neueda.jetbrains.plugin.cypher.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.neueda.jetbrains.plugin.cypher.psi.*;

public class CypherLeftArrowHeadImpl extends ASTWrapperPsiElement implements CypherLeftArrowHead {

  public CypherLeftArrowHeadImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CypherVisitor visitor) {
    visitor.visitLeftArrowHead(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) accept((CypherVisitor)visitor);
    else super.accept(visitor);
  }

}