package Mymavenproject;

class A
{
	public void write()
	{
		System.out.println("writing");
	}
}
class B extends A
{
	public void read()
	{
		System.out.println("reading");
	}
}
class C extends B
{
	public void look()
	{
		System.out.println("looking");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();
obj.look();
obj.read();
obj.write();
	}

}
