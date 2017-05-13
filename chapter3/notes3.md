# chapter3
***
本章通过一个简单的ANTLR项目来学习ANTLR的基础用法：
* Java语言由.java得到.class文件时将short类型数组翻译为字符串来避免相关的限制
* 本章所要完成的项目就是简单的实现上述目的
在本章末尾，对项目流程进行了总结。

## day1--3.1 The ANTLR Tool,Runtime,and Generated Code
本节对ANTLR的相关概念进行介绍，展示了语言应用构建的第一步--创建语法规则，并对之运行ANTLR：
* 通过ArrayInit.g4代码介绍了.g4代码的基本编写方法
* 运行ANTLR生成相关文件(.java,.tokens),并对相关文件作用进行介绍

在本节末，作者声称"ANTLR Grammars Are Stronger Than Regular Expressions",关于这一点，就先相信一下吧。

## day2--3.2 Testing the Generated Parser
本节没什么新内容，就是用-tokens模式、-tree模式和-gui模式测试了一下上节生成的语法分析器

## day3--3.3 Integrating a Generated Parser into a Java Program
本节讲述的内容是如何将生成的语法分析器整合到Java程序中，通过Test.java的例子进行详细介绍：

## day4--3.4 Building a Language Application
本节讲述的是如何构建一个可实现数组翻译为字符串功能的语言应用程序：
* First，figure out how to convert each input token or phrase to an output string
* Then, code the translator,这意味着我们要通过重载一部分方法(与具体目的相关的一部分方法，如特定结点的enter、exit方法等)来编写继承了ArrayInitBaseListener接口类的回调函数类ShortToUnicodeString
* 编写语言应用程序Translate来实现预期目的（启动树遍历器walker,对分析树tree进行遍历，并以ShortToUnicodeString作为回调函数)

## day5--本章总结
构建语言应用程序基本流程为(以名称ArrayInit为例，相关细节见代码)：
* 编写ArrayInit.g4代码
* 运行ANTLR生成相关文件，（编译后）进行测试
```
antlr4 ArrayInit.g4
javac *.java
grun ArrayInit init -tokens //测试模式三种：--token，--tree,--gui
{99,3,451}
EOF                         //Ctrl+Z on windows
```
* 编写回调函数类ShortToUnicodeString.java实现翻译功能（该类继承自ArrayInitBaseListener接口类）
* 编写应用程序类Translate.java,完成应用程序构建(并进行编译、调试、测试)：
```
javac ArrayInit*.java Translate.java
java Translate
{99,3,451}
EOF
```
