# chapter1
## day1
学习使用Antlr第一天--Edit by Mwq-Mengweiqiao

今天初次安装并使用了Antlr，完成了第一章的学习，Antlr的学习之路开始了！

### About install:

1. Download http://antlr.org/download/antlr-4.7-complete.jar.

2. Add antlr-4.7-complete.jar to CLASSPATH(add The file .jar not the parent dir to CLASSPATH)

3. in the same fold,create dir /bin and Create batch commands for ANTLR Tool, TestRig

 /bin/antlr4.bat:
 ```
 java org.antlr.v4.Tool %*
 ```

 /bin/grun.bat:  
 ```
 java org.antlr.v4.gui.TestRig %*
 ```

 Then add /bin to PATH

### Have a try:

1. create a new file Hello.g4 and type into some code
 ```
grammar Hello;
r : 'hello' ID ;
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip;
 ```

2. run antlr and compile:
```
antlr4 Hello.g4
javac *.java
```
3. test:
```
grun Hello r -tokens  #start TestRig on grammar Hello at rule r
#grun Hello r -tree   #show a tree
#grun Hello r -gui    #show gui
hello world           #input for the recognizer that you type
EOF                   #type Ctrl+Z on windows
```
