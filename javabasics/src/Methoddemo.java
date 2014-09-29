
public class Methoddemo 
{

	static int i=20;
	public static void main(String args[])
	{
	 System.out.println("length 1213121 " + args.length);
	 Person p=new Person(1,2,"harjinder");
	 Person p2=new Person(1,22,"arjinder");
	 Person p3=new Person(1,2,"harjinder");
	 Person p4=new Person(1,2,"harjinder");
	
	 
	 
	}
	
}

class Person
{
	 int id ;
	String name;
	int age;
	static int count;
	public static void main(String args[])
	{
	   Methoddemo.main(new String[] {});
	}
	Person(int id, int age, String name)
	{
		 this.id=id;
		 this.age=age;
		 this.name=name;
		//count++;
	}
	Person()
	{
		count++;
	}
	void printValues ()
	{
		System.out.println(this.id);
		System.out.println(this.age);
		System.out.println(this.name);
		
	}
	{
		
	}
}
