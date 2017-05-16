# chapter4
***
本章通过多个实例来展现ANTLR的能力所在，从而对ANTLR有一个快速的浏览，
在1-4节通过四个主题的例子展示了ANTLR的特征，第5节是在词法分析层面对ANTLR的特征进行介绍

## day1--4.1 Matching an Arithmetic Expression Language
本节介绍的是算术表达式语言匹配的例子：
1. 通过可识别t.expr中类似算术表达式的Expr.g4代码的例子，向我们介绍了ANTLR语法规则的一些要点：
 * Grammars由大量rules组成，分为语法rules和词法rules两种
 * 语法rules以大写字母开头，词法规则以小写字母开头
 * 多个可选项以"|"分开;其他如"+","\*","?"我们都很熟悉了
 * WS rule中，"-> skip"要求词法分析器匹配并舍弃特定字符（如空格、回车、换行等）
 * 输入串中每一个字符都必须成功匹配（但匹配之后可以舍弃）
2. ANTLR有处理（大多数种类的）左递归的能力
3. 通过ExprJoyRide.java的例子，展示了如何使用输入文件来获取待匹配串，并对ANTLR生成的相关文件进行测试使用
4. Importing Grammars--这种用法很常见也很常用：
 * 可以将grammar分为lexer grammar和parser grammar作为模块"module"来管理，并通过import语句在需要的时候导入
 * 使用时只需用antlr4命令及javac命令处理主代码，ANTLR会将代码中指定的模块自动导入
5. 错误处理机制：
 * ANTLR能自动报告语法错误并从错误中恢复
 * ANTLR的错误处理机制具有很大的灵活性，并且用户可以修改错误处理方法、捕获识别异常甚至修改底层的错误处理策略

## day2--4.2 Building a Calculator Using a Visitor
本节主要讲的是用Visitor来构建一个计算器，相关的变化有：
1. g4文件中用"# symbol"来对每一个可选项进行标注，以便ANTLR生成相关代码并在java代码中访问每一个可选项
2. 同时为操作符定义token名字，这样他们可以作为java常量来访问
3. 采用visitor模式（指明-no-listener -visitor)
4. 编写LabeledExprBaseVisitor的子类EvalVisitor，重载所需函数
5. 编译执行测试代码：
```
antlr4 -no-listener -visitor LabeledExpr.g4
javac Calc.java LabeledExpr*.java
java Calc t.expr
```

## day3--4.3 Building a Translator with a Listener
这一节主要讲的是用Listener来构建翻译器：
1. 如果想构建一个工具来从一个已定义的java类的方法生成java接口，可以想到的方法有java的反射机制（第一次接触到反射机制是
有一次需要调用一个受到java保护的类，直接调用不被允许，后来发现了可以使用反射机制）和反编译工具，甚至可以尝试使用字节码库（如ASM。。。虽然这个完全没听说过）；而如果想要保留空格和注释，就now way了
2. Java.g4这份语法规则代码是作者参考oracle提供的java官方文档编写的（还好给了代码，不然。。。）
3. 对JavaBaseListener的部分方法进行重载，得到我们所需的ExtractInterfaceListener类
4. 编译执行测试代码：
```
antlr4 Java.g4
ls Java*.java
ls Extract*.java
javac Java*.java Extract*.java
java ExtractInterfaceTool Demo.java

```

## day4--4.4
```
antlr4 -no-listener Rows.g4   #don't need the Listener
javac Rows*.java Col.java
java Col 1 < t.rows
java Col 2 < t.rows
java Col 3 < t.rows
```

```
antlr4 -no-listener Data.g4
javac Data*.java
grun Data file -tree t.data
```

## day5--4.5















## 疑问和待处理
1. 可以通过import导入lexer grammar,是否可以导入parser grammar，可否导入多个grammar？
2. section4.2中clear命令的实现
3. section4.3中处理import语句的实现
