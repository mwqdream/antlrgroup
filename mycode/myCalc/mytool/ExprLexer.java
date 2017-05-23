// Generated from mytool\Expr.g4 by ANTLR 4.7

package mytool;
import java.util.*;
import java.lang.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, POW=8, FAC=9, CLEAR=10, 
		ID=11, DOUBLE=12, NEWLINE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "POW", "FAC", "CLEAR", 
		"ID", "DOUBLE", "INT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MUL", "DIV", "ADD", "SUB", "POW", "FAC", "CLEAR", 
		"ID", "DOUBLE", "NEWLINE", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\6\f;\n\f\r\f\16\f<\3\r\3\r\3\r\6\rB\n\r\r\r\16\rC\3"+
		"\r\5\rG\n\r\3\16\3\16\3\16\7\16L\n\16\f\16\16\16O\13\16\5\16Q\n\16\3\17"+
		"\5\17T\n\17\3\17\3\17\3\20\6\20Y\n\20\r\20\16\20Z\3\20\3\20\2\2\21\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\17\37\20"+
		"\3\2\13\4\2EEee\4\2NNnn\4\2GGgg\4\2CCcc\4\2TTtt\4\2C\\c|\3\2\62;\3\2\63"+
		";\4\2\13\13\"\"\2c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3"+
		"\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3"+
		"\2\2\2\23\61\3\2\2\2\25\63\3\2\2\2\27:\3\2\2\2\31F\3\2\2\2\33P\3\2\2\2"+
		"\35S\3\2\2\2\37X\3\2\2\2!\"\7?\2\2\"\4\3\2\2\2#$\7*\2\2$\6\3\2\2\2%&\7"+
		"+\2\2&\b\3\2\2\2\'(\7,\2\2(\n\3\2\2\2)*\7\61\2\2*\f\3\2\2\2+,\7-\2\2,"+
		"\16\3\2\2\2-.\7/\2\2.\20\3\2\2\2/\60\7`\2\2\60\22\3\2\2\2\61\62\7#\2\2"+
		"\62\24\3\2\2\2\63\64\t\2\2\2\64\65\t\3\2\2\65\66\t\4\2\2\66\67\t\5\2\2"+
		"\678\t\6\2\28\26\3\2\2\29;\t\7\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=\30\3\2\2\2>?\5\33\16\2?A\7\60\2\2@B\t\b\2\2A@\3\2\2\2BC\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EG\5\33\16\2F>\3\2\2\2FE\3\2\2\2G\32\3\2"+
		"\2\2HQ\7\62\2\2IM\t\t\2\2JL\t\b\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2PI\3\2\2\2Q\34\3\2\2\2RT\7\17\2\2"+
		"SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\f\2\2V\36\3\2\2\2WY\t\n\2\2XW\3\2\2"+
		"\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\20\2\2] \3\2\2\2\n\2"+
		"<CFMPSZ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}