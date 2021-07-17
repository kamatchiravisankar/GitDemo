package sample;

public class ConstructorDemo {
	
	
	public ConstructorDemo(String name)
	{
		System.out.println("Parameterised");
	}
	
	public ConstructorDemo( )
	{
		System.out.println("I am constructor");
	}
	
	public ConstructorDemo(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obg=new ConstructorDemo("Kamatchi");
		ConstructorDemo obgc=new ConstructorDemo();
		ConstructorDemo sum=new ConstructorDemo(90,110);
		
	}

}
