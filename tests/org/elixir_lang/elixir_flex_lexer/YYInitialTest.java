package org.elixir_lang.elixir_flex_lexer;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.elixir_lang.ElixirFlexLexer;
import org.elixir_lang.psi.ElixirTypes;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by luke.imhoff on 9/1/14.
 */
@RunWith(Parameterized.class)
public class YYInitialTest extends TokenTest {
    /*
     * Constants
     */

    private static final int INITIAL_STATE = ElixirFlexLexer.YYINITIAL;

    /*
     * Constructors
     */

    public YYInitialTest(CharSequence charSequence, IElementType tokenType, int lexicalState, boolean consumeAll) {
        super(charSequence, tokenType, lexicalState, consumeAll);
    }

    /*
     * Methods
     */

    protected int initialState() {
        return INITIAL_STATE;
    }

    @Parameterized.Parameters(
            name = "\"{0}\" parses as {1} token and advances to state {2}"
    )
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][]{
                        { " ", TokenType.WHITE_SPACE, ElixirFlexLexer.YYINITIAL, true },
                        { "", null, INITIAL_STATE, true },
                        { "#", ElixirTypes.COMMENT, ElixirFlexLexer.YYINITIAL, true },
                        { "'", ElixirTypes.CHAR_LIST_PROMOTER, ElixirFlexLexer.GROUP, true },
                        { "'''", ElixirTypes.CHAR_LIST_HEREDOC_PROMOTER, ElixirFlexLexer.GROUP_HEREDOC_START, true },
                        { "001234567", ElixirTypes.NUMBER, ElixirFlexLexer.YYINITIAL, true },
                        { "0B10", ElixirTypes.NUMBER, ElixirFlexLexer.YYINITIAL, true },
                        { "0X0123456789abcdefABCDEF", ElixirTypes.NUMBER, ElixirFlexLexer.YYINITIAL, true },
                        { "0b10", ElixirTypes.NUMBER, ElixirFlexLexer.YYINITIAL, true },
                        { "0o01234567", ElixirTypes.NUMBER, ElixirFlexLexer.YYINITIAL, true },
                        { "0x0123456789abcdefABCDEF", ElixirTypes.NUMBER, ElixirFlexLexer.YYINITIAL, true },
                        { ":", ElixirTypes.COLON, ElixirFlexLexer.ATOM_START, true },
                        { ";", ElixirTypes.EOL, ElixirFlexLexer.YYINITIAL, true },
                        { "\"", ElixirTypes.STRING_PROMOTER, ElixirFlexLexer.GROUP, true },
                        { "\"\"\"",ElixirTypes.STRING_HEREDOC_PROMOTER,ElixirFlexLexer.GROUP_HEREDOC_START, true },
                        { "\\;", TokenType.BAD_CHARACTER, INITIAL_STATE, false },
                        { "\\\n", TokenType.WHITE_SPACE, INITIAL_STATE, true },
                        { "\\\r\n", TokenType.WHITE_SPACE, INITIAL_STATE, true },
                        { "\f", TokenType.WHITE_SPACE, ElixirFlexLexer.YYINITIAL, true },
                        { "\n", ElixirTypes.EOL, ElixirFlexLexer.YYINITIAL, true },
                        { "\r\n", ElixirTypes.EOL, INITIAL_STATE, true },
                        { "\t", TokenType.WHITE_SPACE, ElixirFlexLexer.YYINITIAL, true },
                        { "~", ElixirTypes.TILDE, ElixirFlexLexer.SIGIL, true }
                }
        );
    }
}