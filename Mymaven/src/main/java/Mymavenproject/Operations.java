package Mymavenproject;

public class Operations {
	static float a=10;
	static float b=5;
	public static void add()
	{
		float c=a+b;
		System.out.println("sum is" +c);
	}
	public static void sub()
	{
		float c=a-b;
		System.out.println("difference is"+c);
	}
	public static void mul()
	{
		float c=a*b;
		System.out.println("Product is"+c);
	}
	public static void div()
	{
		float c=a/b;
		System.out.println("Division is"+c);
	}
	public static void main(String[] args) {
	add();
	sub();
	mul();
	div();

	}

}
