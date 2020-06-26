package object;

public class Vierable {
	public static int i = 10;
	public static long l = 15034578993765l;
	public static double d = 15.7777;
	public static float f = 3.1415f;
	public static char c = 'M';
	public static String s = "I love you more than three thousands years";
	public static void chageVierable() {
		i = i+15;
		l = 15;
		d = 2.718281828;
		f = f-15.777f;
		c = (char)(c+15);//char采用ASCII码，可以直接与int值做加法，得到int值
		//上一个语句运用了类型的强制转换，（类型名）其他类变量或对象，可以将其转为括号内的类型
		s = "You are more beautiful than the brightest fireworks";
	}
	public static void show() {
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(c);
		System.out.println(s);
	}
}
