# chapter6
***
这一章是前面章节中词法语法规则编写的一次实例演示，每一节提供了一种语言的简单的识别实现，没什么新的东西，就仔细的看了一下这几节的代码然后测试了一下这些例子

## 6.1 Parsing Comma-Separated Values
* 测试运行：

```
antlr4 CSV.g4
javac CSV*.java
grun CSV file -tokens data.csv
//redo with -gui and -tree

```
* 结果：
![figure610][img610]

## 6.2 Parsing JSON
* 测试运行：

```
antlr4 JSON.g4
javac JSON*.java
grun JSON json -gui t.json

```
* 结果：
![figure620][img620]

## 6.3 Parsing DOT
* 测试运行：

```
antlr4 DOT.g4
javac DOT*.java
grun DOT graph -gui t.dot

```
* 结果：
![figure630][img630]

## 6.4 Parsing Cymbol
* 测试运行：

```
antlr4 Cymbol.g4
javac Cymbol*.java
grun Cymbol file -gui t.cymbol

```
* 结果：
![figure640][img640]

## 6.5 Parsing R
* 测试运行：

```
antlr4 R.g4
javc R*.java
grun R prog -gui t.R
//javac TestR.java R*.java
//java TestR t.R

```
* 结果：
![figure650][img650]

## 疑问
1. section6.5 tree.inspect找不到符号,该函数是在java代码中使用gui模式展示语法分析结果，但是在当前版本中该函数可能被
替换为新的用法了，在网上搜了很多也查看了ANTLR的API文档，始终没有找到解决方法就先放弃了


[img610]: ../resource/img610.png "figure6-1-0"
[img620]: ../resource/img620.png "figure6-2-0"
[img630]: ../resource/img630.png "figure6-3-0"
[img640]: ../resource/img640.png "figure6-4-0"
[img650]: ../resource/img650.png "figure6-5-0"
