// Generated from D:/Coding/Intellij/Compilatori-e-Interpreti/grammar\FOOL.g4 by ANTLR 4.7
package parser;

    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, COLON=2, COMMA=3, EQ=4, LEQ=5, GEQ=6, GREATER=7, LESS=8, AND=9, 
		OR=10, NOT=11, ASM=12, PLUS=13, MINUS=14, TIMES=15, DIV=16, TRUE=17, FALSE=18, 
		LPAR=19, RPAR=20, CLPAR=21, CRPAR=22, IF=23, THEN=24, ELSE=25, LET=26, 
		IN=27, VAR=28, FUN=29, INT=30, BOOL=31, CLASS=32, EXTENDS=33, THIS=34, 
		NEW=35, DOT=36, VOID=37, INTEGER=38, ID=39, WS=40, LINECOMENTS=41, BLOCKCOMENTS=42, 
		ERR=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMIC", "COLON", "COMMA", "EQ", "LEQ", "GEQ", "GREATER", "LESS", "AND", 
		"OR", "NOT", "ASM", "PLUS", "MINUS", "TIMES", "DIV", "TRUE", "FALSE", 
		"LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", "ELSE", "LET", "IN", "VAR", 
		"FUN", "INT", "BOOL", "CLASS", "EXTENDS", "THIS", "NEW", "DOT", "VOID", 
		"DIGIT", "INTEGER", "CHAR", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
		"ERR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'=='", "'<='", "'>='", "'>'", "'<'", "'&&'", 
		"'||'", "'!'", "'='", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", 
		"'('", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", "'let'", "'in'", 
		"'var'", "'fun'", "'int'", "'bool'", "'class'", "'extends'", "'this'", 
		"'new'", "'.'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMIC", "COLON", "COMMA", "EQ", "LEQ", "GEQ", "GREATER", "LESS", 
		"AND", "OR", "NOT", "ASM", "PLUS", "MINUS", "TIMES", "DIV", "TRUE", "FALSE", 
		"LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", "ELSE", "LET", "IN", "VAR", 
		"FUN", "INT", "BOOL", "CLASS", "EXTENDS", "THIS", "NEW", "DOT", "VOID", 
		"INTEGER", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", "ERR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	   public ArrayList<String> lexicalErrors = new ArrayList<>();


	public FOOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FOOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 44:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 lexicalErrors.add("Invalid char: " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3(\6(\u00dc"+
		"\n(\r(\16(\u00dd\3)\3)\3*\3*\3*\7*\u00e5\n*\f*\16*\u00e8\13*\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\7,\u00f2\n,\f,\16,\u00f5\13,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\7-\u0102\n-\f-\16-\u0105\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\2\2"+
		"/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M\2O(Q\2S)U*W+Y,[-\3\2\b\4\2C\\c|\5\2\13\f\17\17\"\""+
		"\4\2\f\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61\2\u0115\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2O\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3"+
		"]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13f\3\2\2\2\ri\3\2\2\2\17l"+
		"\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33"+
		"z\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0082\3\2\2\2%\u0087"+
		"\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2+\u0091\3\2\2\2-\u0093\3\2\2\2"+
		"/\u0095\3\2\2\2\61\u0098\3\2\2\2\63\u009d\3\2\2\2\65\u00a2\3\2\2\2\67"+
		"\u00a6\3\2\2\29\u00a9\3\2\2\2;\u00ad\3\2\2\2=\u00b1\3\2\2\2?\u00b5\3\2"+
		"\2\2A\u00ba\3\2\2\2C\u00c0\3\2\2\2E\u00c8\3\2\2\2G\u00cd\3\2\2\2I\u00d1"+
		"\3\2\2\2K\u00d3\3\2\2\2M\u00d8\3\2\2\2O\u00db\3\2\2\2Q\u00df\3\2\2\2S"+
		"\u00e1\3\2\2\2U\u00e9\3\2\2\2W\u00ed\3\2\2\2Y\u00f8\3\2\2\2[\u010b\3\2"+
		"\2\2]^\7=\2\2^\4\3\2\2\2_`\7<\2\2`\6\3\2\2\2ab\7.\2\2b\b\3\2\2\2cd\7?"+
		"\2\2de\7?\2\2e\n\3\2\2\2fg\7>\2\2gh\7?\2\2h\f\3\2\2\2ij\7@\2\2jk\7?\2"+
		"\2k\16\3\2\2\2lm\7@\2\2m\20\3\2\2\2no\7>\2\2o\22\3\2\2\2pq\7(\2\2qr\7"+
		"(\2\2r\24\3\2\2\2st\7~\2\2tu\7~\2\2u\26\3\2\2\2vw\7#\2\2w\30\3\2\2\2x"+
		"y\7?\2\2y\32\3\2\2\2z{\7-\2\2{\34\3\2\2\2|}\7/\2\2}\36\3\2\2\2~\177\7"+
		",\2\2\177 \3\2\2\2\u0080\u0081\7\61\2\2\u0081\"\3\2\2\2\u0082\u0083\7"+
		"v\2\2\u0083\u0084\7t\2\2\u0084\u0085\7w\2\2\u0085\u0086\7g\2\2\u0086$"+
		"\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c&\3\2\2\2\u008d\u008e\7*\2\2\u008e"+
		"(\3\2\2\2\u008f\u0090\7+\2\2\u0090*\3\2\2\2\u0091\u0092\7}\2\2\u0092,"+
		"\3\2\2\2\u0093\u0094\7\177\2\2\u0094.\3\2\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7h\2\2\u0097\60\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7j\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7p\2\2\u009c\62\3\2\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\64\3\2\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7v\2\2\u00a5\66\3\2\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a88\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7t\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\u00af\7w\2\2\u00af\u00b0\7p\2\2\u00b0<\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7v\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7n\2\2\u00b9@\3\2\2\2\u00ba"+
		"\u00bb\7e\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7u\2\2"+
		"\u00be\u00bf\7u\2\2\u00bfB\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7z\2"+
		"\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6"+
		"\7f\2\2\u00c6\u00c7\7u\2\2\u00c7D\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca"+
		"\7j\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7u\2\2\u00ccF\3\2\2\2\u00cd\u00ce"+
		"\7p\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7y\2\2\u00d0H\3\2\2\2\u00d1\u00d2"+
		"\7\60\2\2\u00d2J\3\2\2\2\u00d3\u00d4\7x\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6"+
		"\7k\2\2\u00d6\u00d7\7f\2\2\u00d7L\3\2\2\2\u00d8\u00d9\4\62;\2\u00d9N\3"+
		"\2\2\2\u00da\u00dc\5M\'\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00deP\3\2\2\2\u00df\u00e0\t\2\2\2"+
		"\u00e0R\3\2\2\2\u00e1\u00e6\5Q)\2\u00e2\u00e5\5Q)\2\u00e3\u00e5\5M\'\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7T\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\t\3\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b+\2\2\u00ecV\3\2\2\2\u00ed"+
		"\u00ee\7\61\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\n"+
		"\4\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\b,"+
		"\2\2\u00f7X\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\7,\2\2\u00fa\u0103"+
		"\3\2\2\2\u00fb\u0102\n\5\2\2\u00fc\u00fd\7\61\2\2\u00fd\u0102\n\6\2\2"+
		"\u00fe\u00ff\7,\2\2\u00ff\u0102\n\7\2\2\u0100\u0102\5Y-\2\u0101\u00fb"+
		"\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7,\2\2\u0107\u0108\7\61\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\b-\2\2\u010aZ\3\2\2\2\u010b\u010c\13\2\2\2"+
		"\u010c\u010d\b.\3\2\u010d\u010e\3\2\2\2\u010e\u010f\b.\4\2\u010f\\\3\2"+
		"\2\2\t\2\u00dd\u00e4\u00e6\u00f3\u0101\u0103\5\b\2\2\3.\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}