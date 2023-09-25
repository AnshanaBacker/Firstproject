package abstraction;

public class Childinterface implements Parentinterface1,Parentinterface2 {

	public void show()
	{
		System.out.println("Anshana");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childinterface obj=new Childinterface();
		obj.show();
	}

}
