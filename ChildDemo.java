package sample;

public class ChildDemo extends ParentDemo {
	String name="child Variable";
	
	public ChildDemo()
	{
		super();
		System.out.println("Child Constructor");
	}
	
	
	public  void getData()
	{
	System.out.println(name);
	System.out.println(super.name);
	System.out.println("I am child class");
	super.getData();	
	}
	
	public static void main(String[] args)
	{
		ChildDemo ch=new ChildDemo();
		ch.getData();
	}
}
