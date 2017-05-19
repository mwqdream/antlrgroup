// Generated from tools\Expr.g4 by ANTLR 4.7

package tools;
import java.util.*;

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
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, CLEAR=8, ID=9, DOUBLE=10, 
		NEWLINE=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "CLEAR", "ID", "DOUBLE", 
		"INT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MUL", "DIV", "ADD", "SUB", "CLEAR", "ID", "DOUBLE", 
		"NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\n\63\n\n\r\n\16\n\64"+
		"\3\13\5\138\n\13\3\13\3\13\3\13\6\13=\n\13\r\13\16\13>\3\13\5\13B\n\13"+
		"\3\13\5\13E\n\13\3\f\3\f\3\f\7\fJ\n\f\f\f\16\fM\13\f\5\fO\n\f\3\r\5\r"+
		"R\n\r\3\r\3\r\3\16\6\16W\n\16\r\16\16\16X\3\16\3\16\2\2\17\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\r\33\16\3\2\13\4\2EEee\4\2"+
		"NNnn\4\2GGgg\4\2CCcc\4\2TTtt\4\2C\\c|\3\2\62;\3\2\63;\4\2\13\13\"\"\2"+
		"c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2"+
		"\2\2\r\'\3\2\2\2\17)\3\2\2\2\21+\3\2\2\2\23\62\3\2\2\2\25D\3\2\2\2\27"+
		"N\3\2\2\2\31Q\3\2\2\2\33V\3\2\2\2\35\36\7?\2\2\36\4\3\2\2\2\37 \7*\2\2"+
		" \6\3\2\2\2!\"\7+\2\2\"\b\3\2\2\2#$\7,\2\2$\n\3\2\2\2%&\7\61\2\2&\f\3"+
		"\2\2\2\'(\7-\2\2(\16\3\2\2\2)*\7/\2\2*\20\3\2\2\2+,\t\2\2\2,-\t\3\2\2"+
		"-.\t\4\2\2./\t\5\2\2/\60\t\6\2\2\60\22\3\2\2\2\61\63\t\7\2\2\62\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\24\3\2\2\2\668\7/\2"+
		"\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\27\f\2:<\7\60\2\2;=\t\b\2\2"+
		"<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?E\3\2\2\2@B\7/\2\2A@\3\2\2\2"+
		"AB\3\2\2\2BC\3\2\2\2CE\5\27\f\2D\67\3\2\2\2DA\3\2\2\2E\26\3\2\2\2FO\7"+
		"\62\2\2GK\t\t\2\2HJ\t\b\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO"+
		"\3\2\2\2MK\3\2\2\2NF\3\2\2\2NG\3\2\2\2O\30\3\2\2\2PR\7\17\2\2QP\3\2\2"+
		"\2QR\3\2\2\2RS\3\2\2\2ST\7\f\2\2T\32\3\2\2\2UW\t\n\2\2VU\3\2\2\2WX\3\2"+
		"\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\16\2\2[\34\3\2\2\2\f\2\64\67>A"+
		"DKNQX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}