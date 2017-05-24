// Generated from tools2new\Expr.g4 by ANTLR 4.7

package tools2new;
import java.util.*;
import java.lang.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, POW=8, FAC=9, CLEAR=10, 
		ID=11, DOUBLE=12, NEWLINE=13, WS=14;
	public static final int
		RULE_stat = 0, RULE_e = 1;
	public static final String[] ruleNames = {
		"stat", "e"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    /** "memory" for our calculator; variable/value pairs go here */
	    Map<String, Double> memory = new HashMap<String, Double>();

	    double eval(double left, int op, double right) {
	        switch ( op ) {
	            case MUL : return left * right;
	            case DIV : return left / right;
	            case ADD : return left + right;
	            case SUB : return left - right;
	            case POW : return Math.pow(left,right);
	            case FAC : return vfac(left);
	        }
	        return 0;
	    }

	    void vclear(){
	        Set<String> keyset = memory.keySet();
	        for(String id : keyset){
	            memory.put(id,0.0);
	        }
	        System.out.println("success to clear all");
	    }

	    double visitDouble(String dtext){
	        return Double.valueOf(dtext);
	    }

	    double vfac(double left){
	        int res=1;
	        int temp=(new Double(left)).intValue();
	        if(temp>0){
	            for(int it=1;it<=temp;it++){
	                res=res*it;
	            }
	        }
	        return (new Integer(res)).doubleValue();
	    }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public EContext e;
		public Token ID;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode CLEAR() { return getToken(ExprParser.CLEAR, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				((StatContext)_localctx).e = e(0);
				setState(5);
				match(NEWLINE);
				System.out.println(((StatContext)_localctx).e.v);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				((StatContext)_localctx).ID = match(ID);
				setState(9);
				match(T__0);
				setState(10);
				((StatContext)_localctx).e = e(0);
				setState(11);
				match(NEWLINE);
				memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).e.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(CLEAR);
				vclear();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(16);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public double v;
		public EContext a;
		public Token op;
		public EContext b;
		public EContext e;
		public Token DOUBLE;
		public Token ID;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode DOUBLE() { return getToken(ExprParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				{
				setState(20);
				((EContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(21);
				match(T__1);
				setState(22);
				((EContext)_localctx).b = ((EContext)_localctx).e = e(0);
				setState(23);
				match(T__2);
				((EContext)_localctx).v =  eval(0,    (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), ((EContext)_localctx).b.v);
				}
				break;
			case DOUBLE:
				{
				setState(26);
				((EContext)_localctx).DOUBLE = match(DOUBLE);
				((EContext)_localctx).v =  visitDouble((((EContext)_localctx).DOUBLE!=null?((EContext)_localctx).DOUBLE.getText():null));
				}
				break;
			case ID:
				{
				setState(28);
				((EContext)_localctx).ID = match(ID);

				      String id = (((EContext)_localctx).ID!=null?((EContext)_localctx).ID.getText():null);
				      ((EContext)_localctx).v =  memory.containsKey(id) ? memory.get(id) : 0.0;
				      
				}
				break;
			case T__1:
				{
				setState(30);
				match(T__1);
				setState(31);
				((EContext)_localctx).e = e(0);
				setState(32);
				match(T__2);
				((EContext)_localctx).v =  ((EContext)_localctx).e.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(37);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(38);
						((EContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(39);
						((EContext)_localctx).b = ((EContext)_localctx).e = e(9);
						((EContext)_localctx).v =  eval(((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), ((EContext)_localctx).b.v);
						}
						break;
					case 2:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(42);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(43);
						((EContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						((EContext)_localctx).b = ((EContext)_localctx).e = e(8);
						((EContext)_localctx).v =  eval(((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), ((EContext)_localctx).b.v);
						}
						break;
					case 3:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(47);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(48);
						((EContext)_localctx).op = match(POW);
						setState(49);
						((EContext)_localctx).b = ((EContext)_localctx).e = e(6);
						((EContext)_localctx).v =  eval(((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), ((EContext)_localctx).b.v);
						}
						break;
					case 4:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(52);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(53);
						((EContext)_localctx).op = match(FAC);
						((EContext)_localctx).v =  eval(((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), 0.0);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20?\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3:\n\3\f\3\16\3=\13\3\3\3\2\3\4\4\2\4\2\4\3\2\b\t\3\2\6\7\2F\2\23"+
		"\3\2\2\2\4%\3\2\2\2\6\7\5\4\3\2\7\b\7\17\2\2\b\t\b\2\1\2\t\24\3\2\2\2"+
		"\n\13\7\r\2\2\13\f\7\3\2\2\f\r\5\4\3\2\r\16\7\17\2\2\16\17\b\2\1\2\17"+
		"\24\3\2\2\2\20\21\7\f\2\2\21\24\b\2\1\2\22\24\7\17\2\2\23\6\3\2\2\2\23"+
		"\n\3\2\2\2\23\20\3\2\2\2\23\22\3\2\2\2\24\3\3\2\2\2\25\26\b\3\1\2\26\27"+
		"\t\2\2\2\27\30\7\4\2\2\30\31\5\4\3\2\31\32\7\5\2\2\32\33\b\3\1\2\33&\3"+
		"\2\2\2\34\35\7\16\2\2\35&\b\3\1\2\36\37\7\r\2\2\37&\b\3\1\2 !\7\4\2\2"+
		"!\"\5\4\3\2\"#\7\5\2\2#$\b\3\1\2$&\3\2\2\2%\25\3\2\2\2%\34\3\2\2\2%\36"+
		"\3\2\2\2% \3\2\2\2&;\3\2\2\2\'(\f\n\2\2()\t\3\2\2)*\5\4\3\13*+\b\3\1\2"+
		"+:\3\2\2\2,-\f\t\2\2-.\t\2\2\2./\5\4\3\n/\60\b\3\1\2\60:\3\2\2\2\61\62"+
		"\f\7\2\2\62\63\7\n\2\2\63\64\5\4\3\b\64\65\b\3\1\2\65:\3\2\2\2\66\67\f"+
		"\6\2\2\678\7\13\2\28:\b\3\1\29\'\3\2\2\29,\3\2\2\29\61\3\2\2\29\66\3\2"+
		"\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=;\3\2\2\2\6\23%9;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}