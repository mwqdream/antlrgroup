# 问题
## Chapter4
1. 可以通过import导入lexer grammar,是否可以导入parser grammar，可否导入多个grammar？
2. section4.2中clear命令的实现
3. section4.3中处理import语句的实现
4. 关于语义谓词

# 解决--mycode
## Chapter4
1. 一个g4文件可以声明为grammar、lexer grammar、parser grammar三种，统一通过import G1(,G2,...)导入(注：import这条命令只可以出现一次,有些死板...)，测试代码为mycode1/main.g4
```
antlr4 main.g4
javac main*.java
grun main prog --gui
a=10
b=5
c=a+b
c
```
2. clear命令实现
  * 方法一：通过chapter10中添加actions的方法（详见我们的工作myCalc)
  * 方法二：在EvalVisitor.java中重载相关函数（代码mycode2）
```
antlr4 -no-listener -visitor LabeledExpr.g4
javac Calc.java LabeledExpr*.java
java Calc
a=10
b=6
c=a+b
c
clear
c
```

# 我们的工作myCalc
* 用grammar actions的方法构建计算器
* 浮点数运算，实现了clear，阶乘，幂运算
```
antlr4 -no-listener tools\Expr.g4
javac -d . tools\*.java
java tools.Calc

```
