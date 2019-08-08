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
* Java的所有程序都由类组成
* 类包含属性（变量）和方法
* 属性只能确定值，方法才可以运行。
* 一个.java文件可以包含多个类，但只有一个类可以是public权限，且其名称要与文件名相同
* 同包内（相同目录下），所有类名不可重复
* 在Java类的方法中main方法可以作为程序的入口，要求其访问权限为public，且为static方法
```
class name{
    (class) Cname;//属性
    public static main(){//主方法

    }
    fuction(){//方法

    }
}
```
#### Java标准输出
>System.out.print(x);

* System是一个jdk中的标准类
* out为System类的一个属性，他是标准输出流对象
* print()为out对象的输出方法，将x输出