package Mymavenproject;
class Constructor1
{
	Constructor1()
	{
		//super();
		System.out.println("coming");
	}
}
class Constructor2 extends Constructor1
{
	Constructor2()
	{
		//super();
		System.out.println("going");
	}
}
public class Superconstructor {
	public static void main(String args[])
	{
		Constructor2 obj=new Constructor2();
}
}
// super() is added in each class constructor automatically
//by compiler if there is no super() or this().