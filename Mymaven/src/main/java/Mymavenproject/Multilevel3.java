package Mymavenproject;

public class Multilevel3 extends Multilevel2 {
public void run()
{
	System.out.println("running");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel3 obj=new Multilevel3();
		obj.ask();
		obj.run();
		obj.show();
		
	}

}
