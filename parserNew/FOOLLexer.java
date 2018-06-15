// Generated from D:/Coding/Intellij/Compilatori-e-Interpreti/grammar\FOOL.g4 by ANTLR 4.7
package parserNew;

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
		IN=27, VAR=28, FUN=29, INT=30, BOOL=31, INTEGER=32, ID=33, WS=34, LINECOMENTS=35, 
		BLOCKCOMENTS=36, ERR=37;
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
		"FUN", "INT", "BOOL", "DIGIT", "INTEGER", "CHAR", "ID", "WS", "LINECOMENTS", 
		"BLOCKCOMENTS", "ERR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'=='", "'<='", "'>='", "'>'", "'<'", "'&&'", 
		"'||'", "'!'", "'='", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", 
		"'('", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", "'let'", "'in'", 
		"'var'", "'fun'", "'int'", "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMIC", "COLON", "COMMA", "EQ", "LEQ", "GEQ", "GREATER", "LESS", 
		"AND", "OR", "NOT", "ASM", "PLUS", "MINUS", "TIMES", "DIV", "TRUE", "FALSE", 
		"LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", "ELSE", "LET", "IN", "VAR", 
		"FUN", "INT", "BOOL", "INTEGER", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
		"ERR"
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


	   public ArrayList<String> errors = new ArrayList<>();


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
		case 38:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 errors.add("Invalid char: " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\""+
		"\6\"\u00b2\n\"\r\"\16\"\u00b3\3#\3#\3$\3$\3$\7$\u00bb\n$\f$\16$\u00be"+
		"\13$\3%\3%\3%\3%\3&\3&\3&\3&\7&\u00c8\n&\f&\16&\u00cb\13&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u00d8\n\'\f\'\16\'\u00db\13\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\"E\2G#I$K%M&O\'\3\2\b\4\2"+
		"C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61\2\u00eb"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2C\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13"+
		"Z\3\2\2\2\r]\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25g\3\2\2\2\27"+
		"j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v"+
		"\3\2\2\2%{\3\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u0085\3\2\2\2-\u0087"+
		"\3\2\2\2/\u0089\3\2\2\2\61\u008c\3\2\2\2\63\u0091\3\2\2\2\65\u0096\3\2"+
		"\2\2\67\u009a\3\2\2\29\u009d\3\2\2\2;\u00a1\3\2\2\2=\u00a5\3\2\2\2?\u00a9"+
		"\3\2\2\2A\u00ae\3\2\2\2C\u00b1\3\2\2\2E\u00b5\3\2\2\2G\u00b7\3\2\2\2I"+
		"\u00bf\3\2\2\2K\u00c3\3\2\2\2M\u00ce\3\2\2\2O\u00e1\3\2\2\2QR\7=\2\2R"+
		"\4\3\2\2\2ST\7<\2\2T\6\3\2\2\2UV\7.\2\2V\b\3\2\2\2WX\7?\2\2XY\7?\2\2Y"+
		"\n\3\2\2\2Z[\7>\2\2[\\\7?\2\2\\\f\3\2\2\2]^\7@\2\2^_\7?\2\2_\16\3\2\2"+
		"\2`a\7@\2\2a\20\3\2\2\2bc\7>\2\2c\22\3\2\2\2de\7(\2\2ef\7(\2\2f\24\3\2"+
		"\2\2gh\7~\2\2hi\7~\2\2i\26\3\2\2\2jk\7#\2\2k\30\3\2\2\2lm\7?\2\2m\32\3"+
		"\2\2\2no\7-\2\2o\34\3\2\2\2pq\7/\2\2q\36\3\2\2\2rs\7,\2\2s \3\2\2\2tu"+
		"\7\61\2\2u\"\3\2\2\2vw\7v\2\2wx\7t\2\2xy\7w\2\2yz\7g\2\2z$\3\2\2\2{|\7"+
		"h\2\2|}\7c\2\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080&\3\2\2\2\u0081"+
		"\u0082\7*\2\2\u0082(\3\2\2\2\u0083\u0084\7+\2\2\u0084*\3\2\2\2\u0085\u0086"+
		"\7}\2\2\u0086,\3\2\2\2\u0087\u0088\7\177\2\2\u0088.\3\2\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7h\2\2\u008b\60\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e"+
		"\7j\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090\62\3\2\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095"+
		"\64\3\2\2\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\u0099\7v\2\2\u0099"+
		"\66\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c8\3\2\2\2\u009d"+
		"\u009e\7x\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0:\3\2\2\2\u00a1"+
		"\u00a2\7h\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7p\2\2\u00a4<\3\2\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8>\3\2\2\2\u00a9"+
		"\u00aa\7d\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7n\2\2"+
		"\u00ad@\3\2\2\2\u00ae\u00af\4\62;\2\u00afB\3\2\2\2\u00b0\u00b2\5A!\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4D\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6F\3\2\2\2\u00b7\u00bc\5E"+
		"#\2\u00b8\u00bb\5E#\2\u00b9\u00bb\5A!\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"H\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\t\3\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\u00c2\b%\2\2\u00c2J\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5\7"+
		"\61\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\n\4\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b&\2\2\u00cdL\3\2\2\2\u00ce\u00cf"+
		"\7\61\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d9\3\2\2\2\u00d1\u00d8\n\5\2\2\u00d2"+
		"\u00d3\7\61\2\2\u00d3\u00d8\n\6\2\2\u00d4\u00d5\7,\2\2\u00d5\u00d8\n\7"+
		"\2\2\u00d6\u00d8\5M\'\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7,\2\2\u00dd\u00de\7\61\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\'"+
		"\2\2\u00e0N\3\2\2\2\u00e1\u00e2\13\2\2\2\u00e2\u00e3\b(\3\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\b(\4\2\u00e5P\3\2\2\2\t\2\u00b3\u00ba\u00bc\u00c9"+
		"\u00d7\u00d9\5\b\2\2\3(\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}