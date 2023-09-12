package Mymavenproject;
class Constructor1
{
	Constructor1()
	{
		System.out.println("coming");
	}
}
class Constructor2 extends Constructor1
{
	Constructor2()
	{
		
		System.out.println("going");
	}
}
public class Superconstructor {
	public static void main(String args[])
	{
		Constructor2 obj=new Constructor2();
}
}
