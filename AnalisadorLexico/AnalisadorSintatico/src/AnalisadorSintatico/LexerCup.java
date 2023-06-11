/* The following code was generated by JFlex 1.4.3 on 10/06/2023 13:19 */

package AnalisadorSintatico;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/06/2023 13:19 from the specification file
 * <tt>C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/src/AnalisadorSintatico/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  5,  4,  0,  0,  5,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     6, 51, 53,  3,  0, 24,  0,  0, 30, 31, 24, 22,  0, 23,  0,  0, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 25, 52, 32, 52,  0, 
     0, 48,  1, 36, 46, 47, 38,  1,  1, 34,  1,  1, 45, 39, 35, 37, 
    49,  1, 50, 43,  1, 44,  1,  1,  1,  1,  1, 26,  0, 27,  0,  1, 
     0, 15, 13, 40, 19, 10, 20,  1,  1, 41,  1,  1, 14,  9,  7, 12, 
    33, 42, 11, 21, 16,  8, 18,  1, 17,  1,  1, 28,  0, 29,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\2\5\1\2"+
    "\1\6\10\2\3\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\5\2\1\1\1\20\1\1\1\0"+
    "\1\21\2\2\1\22\1\2\1\6\5\2\1\23\2\2"+
    "\1\24\1\25\1\20\7\2\1\0\1\26\5\2\1\27"+
    "\5\2\1\30\4\2\1\31\14\2\1\32\11\2\1\33"+
    "\1\2\1\34\1\2\1\35\10\2\1\36\3\2\1\37"+
    "\6\2\1\40\6\2\1\41\5\2\1\42\5\2\1\43"+
    "\2\2\1\44\3\2\1\45\1\46\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u032a"+
    "\0\u0360\0\u0396\0\u03cc\0\u0402\0\66\0\66\0\66\0\66"+
    "\0\66\0\66\0\66\0\66\0\u0438\0\u046e\0\u04a4\0\u04da"+
    "\0\u0510\0\u0546\0\u0438\0\u0438\0\u057c\0\330\0\330\0\u05b2"+
    "\0\u05e8\0\154\0\u061e\0\154\0\u0654\0\u068a\0\u06c0\0\u06f6"+
    "\0\u072c\0\154\0\u0762\0\u0798\0\u07ce\0\66\0\66\0\u0804"+
    "\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0912\0\u0948\0\u057c\0\66"+
    "\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\154\0\u0a8c\0\u0ac2"+
    "\0\u0af8\0\u0b2e\0\u0b64\0\154\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c"+
    "\0\154\0\u0c72\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a\0\u0d80\0\u0db6"+
    "\0\u0dec\0\u0e22\0\u0e58\0\u0e8e\0\u0ec4\0\154\0\u0efa\0\u0f30"+
    "\0\u0f66\0\u0f9c\0\u0fd2\0\u1008\0\u103e\0\u1074\0\u10aa\0\154"+
    "\0\u10e0\0\154\0\u1116\0\154\0\u114c\0\u1182\0\u11b8\0\u11ee"+
    "\0\u1224\0\u125a\0\u1290\0\u12c6\0\154\0\u12fc\0\u1332\0\u1368"+
    "\0\154\0\u139e\0\u13d4\0\u140a\0\u1440\0\u1476\0\u14ac\0\154"+
    "\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0\0\154\0\u1626"+
    "\0\u165c\0\u1692\0\u16c8\0\u16fe\0\154\0\u1734\0\u176a\0\u17a0"+
    "\0\u17d6\0\u180c\0\154\0\u1842\0\u1878\0\154\0\u18ae\0\u18e4"+
    "\0\u191a\0\154\0\154\0\154";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\2\3\1\12\1\3\1\13\1\14\1\3\1\15\1\16"+
    "\1\3\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\3\1\40\1\3\1\41\1\3\1\42"+
    "\12\3\1\43\1\44\1\45\67\0\2\3\4\0\17\3"+
    "\13\0\22\3\5\0\1\4\63\0\3\46\1\47\62\46"+
    "\4\0\1\6\1\0\1\6\64\0\2\7\63\0\1\6"+
    "\1\7\1\10\60\0\2\3\4\0\1\3\1\50\15\3"+
    "\13\0\22\3\4\0\2\3\4\0\1\51\1\3\1\52"+
    "\7\3\1\53\4\3\13\0\22\3\4\0\2\3\4\0"+
    "\1\3\1\54\15\3\13\0\22\3\4\0\2\3\4\0"+
    "\1\3\1\55\3\3\1\56\11\3\13\0\22\3\4\0"+
    "\2\3\4\0\11\3\1\57\5\3\13\0\22\3\4\0"+
    "\2\3\4\0\3\3\1\60\13\3\13\0\22\3\4\0"+
    "\2\3\4\0\3\3\1\61\13\3\13\0\22\3\4\0"+
    "\2\3\4\0\3\3\1\62\13\3\13\0\22\3\4\0"+
    "\2\3\4\0\10\3\1\63\6\3\13\0\22\3\4\0"+
    "\2\3\4\0\1\3\1\64\1\3\1\65\13\3\13\0"+
    "\22\3\31\0\1\66\41\0\1\4\24\0\1\66\76\0"+
    "\1\67\26\0\2\3\4\0\5\3\1\70\2\3\1\71"+
    "\6\3\13\0\22\3\4\0\2\3\4\0\17\3\13\0"+
    "\2\3\1\72\2\3\1\73\14\3\4\0\2\3\4\0"+
    "\17\3\13\0\4\3\1\74\15\3\4\0\2\3\4\0"+
    "\17\3\13\0\1\3\1\75\20\3\4\0\2\3\4\0"+
    "\5\3\1\76\11\3\13\0\22\3\3\0\65\77\1\100"+
    "\1\0\2\3\4\0\2\3\1\101\14\3\13\0\22\3"+
    "\4\0\2\3\4\0\17\3\13\0\11\3\1\102\10\3"+
    "\4\0\2\3\4\0\11\3\1\103\5\3\13\0\22\3"+
    "\4\0\2\3\4\0\16\3\1\104\13\0\22\3\4\0"+
    "\2\3\4\0\5\3\1\105\11\3\13\0\22\3\4\0"+
    "\2\3\4\0\3\3\1\106\13\3\13\0\22\3\4\0"+
    "\2\3\4\0\12\3\1\107\4\3\13\0\22\3\4\0"+
    "\2\3\4\0\4\3\1\110\12\3\13\0\22\3\4\0"+
    "\2\3\4\0\7\3\1\111\7\3\13\0\22\3\4\0"+
    "\2\3\4\0\6\3\1\112\10\3\13\0\22\3\4\0"+
    "\2\3\4\0\1\113\16\3\13\0\22\3\4\0\2\3"+
    "\4\0\4\3\1\114\12\3\13\0\22\3\4\0\2\3"+
    "\4\0\4\3\1\115\12\3\13\0\22\3\4\0\2\3"+
    "\4\0\17\3\13\0\1\3\1\116\20\3\4\0\2\3"+
    "\4\0\17\3\13\0\12\3\1\117\7\3\4\0\2\3"+
    "\4\0\17\3\13\0\6\3\1\120\13\3\4\0\2\3"+
    "\4\0\17\3\13\0\6\3\1\121\13\3\4\0\2\3"+
    "\4\0\1\122\1\3\1\123\14\3\13\0\22\3\4\0"+
    "\2\3\4\0\3\3\1\124\13\3\13\0\22\3\4\0"+
    "\2\3\4\0\1\3\1\125\15\3\13\0\22\3\4\0"+
    "\2\3\4\0\4\3\1\126\12\3\13\0\22\3\4\0"+
    "\2\3\4\0\17\3\13\0\7\3\1\127\12\3\4\0"+
    "\2\3\4\0\7\3\1\130\7\3\13\0\22\3\4\0"+
    "\2\3\4\0\11\3\1\131\5\3\13\0\22\3\4\0"+
    "\2\3\4\0\14\3\1\132\2\3\13\0\22\3\4\0"+
    "\2\3\4\0\16\3\1\133\13\0\22\3\4\0\2\3"+
    "\4\0\16\3\1\134\13\0\22\3\4\0\2\3\4\0"+
    "\10\3\1\135\6\3\13\0\22\3\4\0\2\3\4\0"+
    "\10\3\1\136\6\3\13\0\22\3\4\0\2\3\4\0"+
    "\17\3\13\0\3\3\1\137\16\3\4\0\2\3\4\0"+
    "\17\3\13\0\13\3\1\140\6\3\4\0\2\3\4\0"+
    "\17\3\13\0\20\3\1\141\1\3\4\0\2\3\4\0"+
    "\17\3\13\0\7\3\1\142\12\3\4\0\2\3\4\0"+
    "\17\3\13\0\1\143\21\3\4\0\2\3\4\0\4\3"+
    "\1\131\12\3\13\0\22\3\4\0\2\3\4\0\10\3"+
    "\1\144\6\3\13\0\22\3\4\0\2\3\4\0\10\3"+
    "\1\145\6\3\13\0\22\3\4\0\2\3\4\0\10\3"+
    "\1\146\6\3\13\0\22\3\4\0\2\3\4\0\3\3"+
    "\1\147\13\3\13\0\22\3\4\0\2\3\4\0\5\3"+
    "\1\150\11\3\13\0\22\3\4\0\2\3\4\0\10\3"+
    "\1\151\6\3\13\0\22\3\4\0\2\3\4\0\5\3"+
    "\1\152\11\3\13\0\22\3\4\0\2\3\4\0\11\3"+
    "\1\153\5\3\13\0\22\3\4\0\2\3\4\0\5\3"+
    "\1\154\11\3\13\0\22\3\4\0\2\3\4\0\17\3"+
    "\13\0\1\3\1\155\20\3\4\0\2\3\4\0\17\3"+
    "\13\0\14\3\1\156\5\3\4\0\2\3\4\0\17\3"+
    "\13\0\1\3\1\157\20\3\4\0\2\3\4\0\10\3"+
    "\1\160\6\3\13\0\22\3\4\0\2\3\4\0\4\3"+
    "\1\161\3\3\1\162\6\3\13\0\22\3\4\0\2\3"+
    "\4\0\1\163\16\3\13\0\22\3\4\0\2\3\4\0"+
    "\17\3\13\0\10\3\1\164\11\3\4\0\2\3\4\0"+
    "\4\3\1\165\12\3\13\0\22\3\4\0\2\3\4\0"+
    "\10\3\1\166\6\3\13\0\22\3\4\0\2\3\4\0"+
    "\14\3\1\167\2\3\13\0\22\3\4\0\2\3\4\0"+
    "\17\3\13\0\10\3\1\170\11\3\4\0\2\3\4\0"+
    "\17\3\13\0\4\3\1\171\15\3\4\0\2\3\4\0"+
    "\17\3\13\0\15\3\1\172\4\3\4\0\2\3\4\0"+
    "\17\3\13\0\14\3\1\173\5\3\4\0\2\3\4\0"+
    "\11\3\1\174\5\3\13\0\22\3\4\0\2\3\4\0"+
    "\17\3\13\0\10\3\1\175\11\3\4\0\2\3\4\0"+
    "\4\3\1\176\12\3\13\0\22\3\4\0\2\3\4\0"+
    "\11\3\1\177\5\3\13\0\22\3\4\0\2\3\4\0"+
    "\4\3\1\200\12\3\13\0\22\3\4\0\2\3\4\0"+
    "\1\131\16\3\13\0\22\3\4\0\2\3\4\0\3\3"+
    "\1\152\13\3\13\0\22\3\4\0\2\3\4\0\11\3"+
    "\1\201\5\3\13\0\22\3\4\0\2\3\4\0\17\3"+
    "\13\0\16\3\1\202\3\3\4\0\2\3\4\0\17\3"+
    "\13\0\17\3\1\203\2\3\4\0\2\3\4\0\3\3"+
    "\1\204\13\3\13\0\22\3\4\0\2\3\4\0\2\3"+
    "\1\205\14\3\13\0\22\3\4\0\2\3\4\0\10\3"+
    "\1\206\6\3\13\0\22\3\4\0\2\3\4\0\5\3"+
    "\1\207\11\3\13\0\22\3\4\0\2\3\4\0\1\3"+
    "\1\210\15\3\13\0\22\3\4\0\2\3\4\0\17\3"+
    "\13\0\6\3\1\211\13\3\4\0\2\3\4\0\17\3"+
    "\13\0\15\3\1\212\4\3\4\0\2\3\4\0\1\213"+
    "\16\3\13\0\22\3\4\0\2\3\4\0\3\3\1\214"+
    "\13\3\13\0\22\3\4\0\2\3\4\0\4\3\1\215"+
    "\12\3\13\0\22\3\4\0\2\3\4\0\17\3\13\0"+
    "\10\3\1\216\11\3\4\0\2\3\4\0\17\3\13\0"+
    "\1\3\1\217\20\3\4\0\2\3\4\0\17\3\13\0"+
    "\4\3\1\220\15\3\4\0\2\3\4\0\10\3\1\221"+
    "\6\3\13\0\22\3\4\0\2\3\4\0\1\222\16\3"+
    "\13\0\22\3\4\0\2\3\4\0\4\3\1\223\12\3"+
    "\13\0\22\3\4\0\2\3\4\0\17\3\13\0\2\3"+
    "\1\224\17\3\4\0\2\3\4\0\17\3\13\0\21\3"+
    "\1\225\4\0\2\3\4\0\4\3\1\226\12\3\13\0"+
    "\22\3\4\0\2\3\4\0\11\3\1\227\5\3\13\0"+
    "\22\3\4\0\2\3\4\0\17\3\13\0\17\3\1\230"+
    "\2\3\4\0\2\3\4\0\17\3\13\0\16\3\1\231"+
    "\3\3\4\0\2\3\4\0\5\3\1\232\11\3\13\0"+
    "\22\3\4\0\2\3\4\0\17\3\13\0\12\3\1\233"+
    "\7\3\4\0\2\3\4\0\17\3\13\0\12\3\1\234"+
    "\7\3\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6480];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\22\1\10\11\11\1\1\0\17\1\2\11"+
    "\7\1\1\0\1\11\134\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 39: 
          { return new Symbol(sym.COMPILADORES, yychar, yyline, yytext());
          }
        case 40: break;
        case 5: 
          { /* ignore whitespace */
          }
        case 41: break;
        case 34: 
          { return new Symbol(sym.COMPARAR, yychar, yyline, yytext());
          }
        case 42: break;
        case 14: 
          { return new Symbol(sym.FECHA_PARENTESES, yychar, yyline, yytext());
          }
        case 43: break;
        case 28: 
          { return new Symbol(sym.VAL_BOOLEANO, yychar, yyline, yytext());
          }
        case 44: break;
        case 1: 
          { return new Symbol(sym.ERRO, yychar, yyline, yytext());
          }
        case 45: break;
        case 6: 
          { return new Symbol(sym.OP_LOGICO, yychar, yyline, yytext());
          }
        case 46: break;
        case 25: 
          { return new Symbol(sym.FIM, yychar, yyline, yytext());
          }
        case 47: break;
        case 18: 
          { return new Symbol(sym.EM, yychar, yyline, yytext());
          }
        case 48: break;
        case 7: 
          { return new Symbol(sym.OP_ARITIMETICOS, yychar, yyline, yytext());
          }
        case 49: break;
        case 3: 
          { return new Symbol(sym.VAL_INTEIRO, yychar, yyline, yytext());
          }
        case 50: break;
        case 38: 
          { return new Symbol(sym.IFSULDEMINAS, yychar, yyline, yytext());
          }
        case 51: break;
        case 10: 
          { return new Symbol(sym.FECHA_COLCHETES, yychar, yyline, yytext());
          }
        case 52: break;
        case 31: 
          { return new Symbol(sym.INICIO, yychar, yyline, yytext());
          }
        case 53: break;
        case 33: 
          { return new Symbol(sym.ENQUANTO, yychar, yyline, yytext());
          }
        case 54: break;
        case 4: 
          { /* ignore  line break */
          }
        case 55: break;
        case 17: 
          { /* ignore comments */
          }
        case 56: break;
        case 12: 
          { return new Symbol(sym.FECHA_CHAVES, yychar, yyline, yytext());
          }
        case 57: break;
        case 30: 
          { return new Symbol(sym.BUSCAR, yychar, yyline, yytext());
          }
        case 58: break;
        case 20: 
          { return new Symbol(sym.COND_SE, yychar, yyline, yytext());
          }
        case 59: break;
        case 21: 
          { return new Symbol(sym.OP_INCREMENTO, yychar, yyline, yytext());
          }
        case 60: break;
        case 36: 
          { return new Symbol(sym.CONCATENAR, yychar, yyline, yytext());
          }
        case 61: break;
        case 37: 
          { return new Symbol(sym.COMPRIMENTO, yychar, yyline, yytext());
          }
        case 62: break;
        case 26: 
          { return new Symbol(sym.PARA, yychar, yyline, yytext());
          }
        case 63: break;
        case 15: 
          { return new Symbol(sym.OP_ATRIBUICAO, yychar, yyline, yytext());
          }
        case 64: break;
        case 24: 
          { return new Symbol(sym.POR, yychar, yyline, yytext());
          }
        case 65: break;
        case 29: 
          { return new Symbol(sym.COND_SENAO, yychar, yyline, yytext());
          }
        case 66: break;
        case 13: 
          { return new Symbol(sym.ABRE_PARENTESES, yychar, yyline, yytext());
          }
        case 67: break;
        case 27: 
          { return new Symbol(sym.TIPO_VAR, yychar, yyline, yytext());
          }
        case 68: break;
        case 9: 
          { return new Symbol(sym.ABRE_COLCHETES, yychar, yyline, yytext());
          }
        case 69: break;
        case 11: 
          { return new Symbol(sym.ABRE_CHAVES, yychar, yyline, yytext());
          }
        case 70: break;
        case 8: 
          { return new Symbol(sym.PONTO_VIRGULA, yychar, yyline, yytext());
          }
        case 71: break;
        case 32: 
          { return new Symbol(sym.EXTRAIR, yychar, yyline, yytext());
          }
        case 72: break;
        case 19: 
          { return new Symbol(sym.DE, yychar, yyline, yytext());
          }
        case 73: break;
        case 35: 
          { return new Symbol(sym.SUBSTITUIR, yychar, yyline, yytext());
          }
        case 74: break;
        case 23: 
          { return new Symbol(sym.ATE, yychar, yyline, yytext());
          }
        case 75: break;
        case 22: 
          { return new Symbol(sym.VAL_TEXTO, yychar, yyline, yytext());
          }
        case 76: break;
        case 16: 
          { return new Symbol(sym.OP_RELACIONAL, yychar, yyline, yytext());
          }
        case 77: break;
        case 2: 
          { return new Symbol(sym.VAR, yychar, yyline, yytext());
          }
        case 78: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
