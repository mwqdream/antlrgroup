# chapter6
## day1--6.1 Parsing Comma-Separated Values
```
antlr4 CSV.g4
javac CSV*.java
grun CSV file -tokens data.csv
//redo with -gui and -tree

```

## day2--6.2
```
antlr4 JSON.g4
javac JSON*.java
grun JSON json -gui t.json

```

## day3--6.3
```
antlr4 DOT.g4
javac DOT*.java
grun DOT graph -gui t.dot

```

## day4--6.4
```
antlr4 Cymbol.g4
javac Cymbol*.java
grun Cymbol file -gui t.cymbol

```

## day5--6.5
```
antlr4 R.g4
javc R*.java
grun R prog -gui t.R
//javac TestR.java R*.java
//java TestR t.R

```

## 疑问
1. section6.5 tree.inspect找不到符号
