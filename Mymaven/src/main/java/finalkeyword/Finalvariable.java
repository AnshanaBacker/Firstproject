package finalkeyword;

public class Finalvariable {
final int a=5;
public void show()
{
	a=10;
	System.out.println(a);
}
public static void main(String args[])
{
	 Finalvariable obj=new  Finalvariable();
	 obj.show();
	
}
}
