package Mymavenproject;
class First
{
		String a="white";
	
}
class Second extends First
{
	String a="Black";

public void display()
{
	System.out.println(a);
	System.out.println(super.a);
}
}

public class Supervariable {

	public static void main(String[] args) 
	{
		Second obj=new Second();
		obj.display();

	}

}

