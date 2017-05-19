/** Grammar from tour chapter augmented with actions */
grammar Expr;

@header {
package tools;
import java.util.*;
}

@parser::members {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Double> memory = new HashMap<String, Double>();

    double eval(double left, int op, double right) {
        switch ( op ) {
            case MUL : return left * right;
            case DIV : return left / right;
            case ADD : return left + right;
            case SUB : return left - right;
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
}

stat:   e NEWLINE           {System.out.println($e.v);}
    |   ID '=' e NEWLINE    {memory.put($ID.text, $e.v);}
    |   CLEAR               {vclear();}
    |   NEWLINE
    ;

e returns [double v]
    : a=e op=('*'|'/') b=e  {$v = eval($a.v, $op.type, $b.v);}
    | a=e op=('+'|'-') b=e  {$v = eval($a.v, $op.type, $b.v);}
    | DOUBLE                {$v = visitDouble($DOUBLE.text);}
    | ID
      {
      String id = $ID.text;
      $v = memory.containsKey(id) ? memory.get(id) : 0.0;
      }
    | '(' e ')'             {$v = $e.v;}
    ;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

CLEAR : [Cc][Ll][Ee][Aa][Rr] ;

ID  :   [a-zA-Z]+ ;      // match identifiers
DOUBLE
    :  '-'? INT '.' [0-9]+
    |  '-'? INT
    ;
fragment INT :   '0' | [1-9][0-9]* ;         // integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
