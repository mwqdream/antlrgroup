# chapter10-Attributes and Actions
***
这一章对属性和动作的使用进行了详细介绍，主要通过计算器的例子进行讲解，同时作者也提到了后面的语义谓词与本章的结合。

我们的ANTLR项目就是基于本章的内容，通过Actions实现计算器的更多功能（阶乘、乘方、clear、浮点数、负数运算处理等），详细内容见项目报告。

## day1--10.1 Building a Calculator with Grammars Actions
1. 在规则之外使用动作，用法如：
* 指明package,语言,libraries的header部分

```
@header {
package mytool2;
import java.util.*;
import java.lang.*;
}

```
* 指明全局变量、常量、自定义函数的部分

```
@parser::members {
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
}
```
2. 将动作整合到规则中
* 基本用法：

```
stat:   e NEWLINE           {System.out.println($e.v);}
    |   ID '=' e NEWLINE    {memory.put($ID.text, $e.v);}
    |   NEWLINE
    ;
```
* 调用函数

```
e returns [double v]
    : a=e op=('*'|'/') b=e  {$v = eval($a.v, $op.type, $b.v);}
    | a=e op=('+'|'-') b=e  {$v = eval($a.v, $op.type, $b.v);}
    | a=e op='^' b=e        {$v = eval($a.v, $op.type, $b.v);}
    | a=e op='!'            {$v = eval($a.v, $op.type, 0.0); }
    | number                {$v = $number.v;}
    | ID
      {
      String id = $ID.text;
      $v = memory.containsKey(id) ? memory.get(id) : 0.0;
      }
    ;
```
3. 动作Actions工作的原理是ANTLR在生成的java代码中自动创建相应的memory、函数等，在生成的代码中为每一条规则生成相应的上下文对象。
4. 关于返回值的计算
* 对于integer值的获取，ANTLR默认提供了.int属性（ANTLR实现了visitInt函数来支持.int属性），代码如下：

```
@Override
public Integer visitInt(LabeledExprParser.IntContext ctx){
  return Integer.valueOf(ctx.INT().getText());
}

```
* 对于double值的获取，ANTLR没有提供默认实现，于是我自己写了visitDouble函数来提供对double值的获取，代码如下:

```
double visitDouble(String dtext){
    return Double.valueOf(dtext);
}
```
5. 构建交互式的计算器
* 通过创建缓冲区将每一行的输入（以Enter作为结束）作为一条表达式

```
BufferedReader br = new BufferedReader(new InputStreamReader(is));
String expr = br.readLine();              // get first expression
int line = 1;                             // track input expr line numbers
```
* 对每一条表达式进行输入流处理、词法分析得到tokens流、语法分析产生结果(显示指定不创建语法语法分析树)
* 示例代码：

```
ExprParser parser = new ExprParser(null); // share single parser instance
parser.setBuildParseTree(false);          // don't need trees

    while ( expr!=null ) {             // while we have more expressions
        // create new lexer and token stream for each line (expression)
        ANTLRInputStream input = new ANTLRInputStream(expr+"\n");
        ExprLexer lexer = new ExprLexer(input);
        lexer.setLine(line);           // notify lexer of input position
        lexer.setCharPositionInLine(0);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser.setInputStream(tokens); // notify parser of new token stream
        parser.stat();                 // start the parser
        expr = br.readLine();          // see if there's another line
        line++;
    }
}

```
## day2--10.2 Accessing Token and Rule Attributes
这一节提供了更多的Actions用法，包括局部变量locals[],重载初始化方法'@init{}',规则结束后的行为'@after{}'等，详细内容不再赘述。
