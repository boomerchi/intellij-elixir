// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ElixirInterpolation extends PsiElement {

  @NotNull
  List<ElixirAtom> getAtomList();

  @NotNull
  List<ElixirCharList> getCharListList();

  @NotNull
  List<ElixirCharListHeredoc> getCharListHeredocList();

  @NotNull
  List<ElixirHatOperation> getHatOperationList();

  @NotNull
  List<ElixirMultiplicationOperation> getMultiplicationOperationList();

  @NotNull
  List<ElixirSigil> getSigilList();

  @NotNull
  List<ElixirString> getStringList();

  @NotNull
  List<ElixirStringHeredoc> getStringHeredocList();

  @NotNull
  List<ElixirUnaryOperation> getUnaryOperationList();

}
