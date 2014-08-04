// This is a generated file. Not intended for manual editing.
package org.elixir_lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.elixir_lang.psi.ElixirTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ElixirParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("org.elixir_lang.parser.ElixirParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_, 0);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return elixirFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // NUMBER (EOL NUMBER)* EOL?
  static boolean elixirFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elixirFile")) return false;
    if (!nextTokenIs(builder_, NUMBER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER);
    result_ = result_ && elixirFile_1(builder_, level_ + 1);
    result_ = result_ && elixirFile_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (EOL NUMBER)*
  private static boolean elixirFile_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elixirFile_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!elixirFile_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "elixirFile_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // EOL NUMBER
  private static boolean elixirFile_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elixirFile_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EOL, NUMBER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EOL?
  private static boolean elixirFile_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elixirFile_2")) return false;
    consumeToken(builder_, EOL);
    return true;
  }

}