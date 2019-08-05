# JAVA笔记01
### JAVA的运行原则
* Java运行时需在控制台，项目位置，输入“java 包名.类名”
* 即使打开包所在的文件夹，也不可以直接输入类名
* 不在包中的类只输入类名即可
```
D:\DATA\Java\NoteForJava\01Basic\bin>java helloworld
错误: 找不到或无法加载主类 helloworld
原因: java.lang.ClassNotFoundException: helloworld

D:\DATA\Java\NoteForJava\01Basic\bin>java io.helloworld
Hello World!

D:\DATA\Java\NoteForJava\01Basic\bin>cd io

D:\DATA\Java\NoteForJava\01Basic\bin\io>java helloworld
错误: 找不到或无法加载主类 helloworld
原因: java.lang.NoClassDefFoundError: io/helloworld (wrong name: helloworld)

D:\DATA\Java\NoteForJava\01Basic\bin\io>java io.helloworld
错误: 找不到或无法加载主类 io.helloworld
原因: java.lang.ClassNotFoundException: io.helloworld
```
### JAVA程序结构
