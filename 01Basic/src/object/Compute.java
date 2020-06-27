package object;

public class Compute {
	
	private static int plus = 0;
	private static double plusd = 0;
	private static int minus = 0;
	private static double minusd = 0;
	private static int mutiple = 0;
	private static double mutipled = 0;
	private static int delive = 0;
	private static double delived = 0;
	public static void makePluse(int a,int b) {
		plus = a + b;
	}
	public static void makePluse(double a,double b) {
		plusd = a + b;
	}
	public static int getPlus() {
		return plus;
	}
	public static double getPlusd() {
		return plusd;
	}
	public static int getMinus() {
		return minus;
	}
	public static double getMinusd() {
		return minusd;
	}
	public static int getMutiple() {
		return mutiple;
	}
	public static double getMutipled() {
		return mutipled;
	}
	public static int getDelive() {
		return delive;
	}
	public static double getDelived() {
		return delived;
	}
	
}
