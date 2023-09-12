package Mymavenproject;
class One
{
	public void car()
	{
		System.out.println("running");
	}
}
class Two
{
	public void dog()
	{
		System.out.println("barking");
	}
}
class Three extends One
{
	public void book()
	{
		System.out.println("writing");
	}
}
public class Heirarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Three obj=new Three();
obj.book();
obj.car();
Two obj1=new Two();
obj1.dog();

	}

}

