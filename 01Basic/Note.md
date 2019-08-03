### JAVA的运行原则
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