# chapter2-The Big Picture
***
## day1--2.1 Let's Get Meta!
今天看了2.1节，本节介绍了本书的一些知识基础：
* 分析器parser--识别语言的程序
* 关于parse，（语法）分析parse分为两个阶段：词法分析阶段（词法分析器lexer)和（词法）分析阶段（真正的语法分析器parser)
* 语法分析树的生成


## day2--2.2 Implementing Parsers
章节2.2介绍的是Antlr工具根据语法规则所生成的递归下降分析器：
* 递归下降分析方法是自顶向下（自上而下）分析方法的一种实现方法
* 以迷宫的例子让读者更容易理解递归下降分析过程（虽然没什么必要）
* Antlr自动控制自上而下分析过程每个决定所需的lookahead的数量
* 引入了二义性的问题

## day3--2.3 You Can't Put Too Much Water into a Nuclear Reactor
这一节内容很有趣，尤其是这几个作者给出的二义性的句子（。。。写完之后突然发现这句话有歧义了），颠覆了在英语课所学到的not...too结构的认识。
* For Whom No Thanks Is Too Much!竟然可以表示ungrateful,心疼那哥们的导师
* 本节主要对二义性问题进行介绍，展示了比较明显的二义性（如两个完全相同的可选项）和比较隐晦的二义性（通过f()的例子进行了详细分析）
* 二义性既出现于词法分析中，也出现在语法分析中，ANTLR对词法二义性的解决方法是采用最长匹配原则（通过begin与beginner的例子进行介绍）
* 语法二义性在现实中是无法避免的；C语言（以及其他带有指针*的程序设计语言）引入了一种歧义（可以通过上下文分析解决）

## day4--2.4 Build Language Applications Using Parse Trees
本章节的主要内容是关于如何使用语法分析树来构建语言应用程序，相关要点如下：
* 构建语言应用程序需要对输入的短语执行适当的代码=>最简单的方法就是在语法分析器自动生成的语法分析树上进行操作=>回到了java领域（不必学习更为深入的ANTLR语法知识）
* 通过一张图示对语法分析过程中的要素与ANTLR中的java类之间的对应关系（包括CharStream,Lexer,Token,Parser,ParseTree等，以及连接词法分析和语法分析的管道--TokenStream）
![diagrme][img241]
* 对RuleNode和TerminalNode(ParseTree的子类)进行了详细介绍
* 介绍了context对象的概念和相关内容
* 通过对分析树的遍历，我们可以对树节点进行我们所需要的操作（包括计算结果、更新数据结构、生成输出）；然而我们不必每次去写重复的树遍历代码，我们可以使用ANTLR自动生成的树遍历机制

### day5--2.5 Parse-Tree Listeners And Visitors
ANTLR通过内置的遍历器walker提供了两种树遍历机制Listener和Visitor，在本节的最后对语法分析相关的术语概念进行了总结。

关于Listeners：
* Listener是基于回调机制的（对事件的处理，一般的java语言或者python语言程序采用的都是回调机制；QT开发平台对事件的处理声称采用的是信号-槽机制--至少我们用QT的时候看起来似乎是这样的）
* 每一条rule都有相对应的enter和exit方法（回调机制的基础）
* 图示1：
![figure251][img251]
* 图示2：
![figure252][img252]
* Listener机制的美丽之处在于其是全自动的（我们不必去写分析树walker，同样listener也不必去明确地访问其子节点）

关于Visitors：
* Visitor用于访问操作指定的树节点（包括context node，terminalnode等），图示：
![figure253][img253]
* 使用方法：
```
ParseTree tree=...; //tree is result of parsing
MyVisitor v=new MyVisitor();
v.visit(tree);
```




[img241]: ../resource/img241.png "figure2-4-1"
[img251]: ../resource/img251.png "figure2-5-1"
[img252]: ../resource/img252.png "figure2-5-2"
[img253]: ../resource/img253.png "figure2-5-3"
