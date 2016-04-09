// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.StubBasedPsiElement;
import org.apache.commons.lang.math.IntRange;
import org.elixir_lang.psi.stub.UnmatchedQualifiedNoParenthesesCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirUnmatchedQualifiedNoParenthesesCall extends ElixirUnmatchedExpression, QualifiedNoParenthesesCall<UnmatchedQualifiedNoParenthesesCall>, StubBasedPsiElement<UnmatchedQualifiedNoParenthesesCall> {

  @Nullable
  ElixirDoBlock getDoBlock();

  @NotNull
  ElixirDotInfixOperator getDotInfixOperator();

  @NotNull
  ElixirNoParenthesesOneArgument getNoParenthesesOneArgument();

  @NotNull
  ElixirRelativeIdentifier getRelativeIdentifier();

  @NotNull
  ElixirUnmatchedExpression getUnmatchedExpression();

  @Nullable
  String functionName();

  PsiElement functionNameElement();

  boolean hasDoBlockOrKeyword();

  @Nullable
  String getName();

  PsiElement getNameIdentifier();

  @Nullable
  PsiReference getReference();

  boolean isCalling(String resolvedModuleName, String resolvedFunctionName);

  boolean isCalling(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity);

  boolean isCallingMacro(String resolvedModuleName, String resolvedFunctionName);

  boolean isCallingMacro(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity);

  @NotNull
  String moduleName();

  @NotNull
  PsiElement[] primaryArguments();

  @Nullable
  Integer primaryArity();

  @NotNull
  OtpErlangObject quote();

  @NotNull
  int resolvedFinalArity();

  @NotNull
  IntRange resolvedFinalArityRange();

  @NotNull
  String resolvedFunctionName();

  @NotNull
  String resolvedModuleName();

  @Nullable
  Integer resolvedPrimaryArity();

  @Nullable
  Integer resolvedSecondaryArity();

  @Nullable
  PsiElement[] secondaryArguments();

  @Nullable
  Integer secondaryArity();

  @NotNull
  PsiElement setName(String newName);

}
