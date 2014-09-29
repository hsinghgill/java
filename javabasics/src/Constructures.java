package javabasics;

public class Constructures
{
/*public static void main(String args[])
{
	System.out.println("before calling Cosntructure");
	new Person();
	new Person();
	new Person();
	new Person();
	new Person(10,11,"harjidner");
	System.out.println(new Person().count);
	/*Person p1=p2;
	Person p=p1;
	p2=new Person();
	
	p2.id=12;
	p2.age=102;
	p2.name="harjidner1";
	
	System.out.println(p.id);
	System.out.println(p.age);
	System.out.println(p.name);
	System.out.println(p1.id);
	System.out.println(p1.age);
	System.out.println(p1.name);
	System.out.println(p2.id);
	System.out.println(p2.age);
	System.out.println(p2.name);
}*/
public static void main(String args)
{
	
	System.out.println("overloaded");
	/*Person p1=p2;
	Person p=p1;
	p2=new Person();
	
	p2.id=12;
	p2.age=102;
	p2.name="harjidner1";
	
	System.out.println(p.id);
	System.out.println(p.age);
	System.out.println(p.name);
	System.out.println(p1.id);
	System.out.println(p1.age);
	System.out.println(p1.name);
	System.out.println(p2.id);
	System.out.println(p2.age);
	System.out.println(p2.name);*/
}
static {
	
	 System.out.println("static intializationmain"); 
}

	
}
 class Person
{
	int id;
	String name;
	 int age;
	 static int count;
	//private int k;
	 {
		 System.out.println("IIB2"); 
	 }
	public void test()
	{
		System.out.println("test");
	}
	
	public Person(int id, int age,String name) 
	{
	     this.id=id;
	     this.age=age;
	     this.name=name;
		System.out.println("Constructure");
	}
	{
		 System.out.println("IIB3"); 
	 }
	public Person() 
	{
	     
		System.out.println("Constructure2");
		
	}
	static {
		
		 System.out.println("static intialization"); 
		 count++;
	}
	
}
