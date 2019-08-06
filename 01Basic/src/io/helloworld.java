package io;
/* 目的：实现控制台输出"Hello World!"，以此为例分析java程序的结构
 * 方法：在类中定义变量str，其内容为"Hello World!"，利用println()函数输出
 */
public class helloworld {
	public static String str = "Hello World!";//成员变量"Hello World!"
	public static void main(String[] arg){ //成员方法main()
		System.out.println(str);
	}
}
/* 分析：
 * Java中一切代码都要包含在“类”中
 * 类由成员变量和成员方法组成
 * 要求公有类名要与文件名相同
 * 成员方法main为程序的入口，在函数中可以添加语句实现功能
 * 在类中先定义了变量"Hello World!"
 * 之后用另一类的方法在本类的main中调用实现输出"Hello World!"
*/