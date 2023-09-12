package Mymavenproject;

public class Singleinhertance1 extends Singleinhertance 
{
public void walk()
{
	System.out.println("walking");
}
	public static void main(String[] args) {
		Singleinhertance1 obj=new Singleinhertance1();
		obj.walk();
		obj.run();
		

	}

}
