
public class InherianceDemo {
	public static void main(String args[])
	{
		// new Person2(10);
		// new Person2();
		// new Pemanentemployee(10);
		 
		Employee emp=new Employee(1000,"harjiner",1000,121202);
		//double i=10;
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(emp.salary);
		//e1.test((int)i);
		//emp.salary;
	}


}
 class Person2
 {
	 int id;
	 String name;
	 int salary;
	 ///Person2 p=new Person2();
	Person2 (int id, String name, int salary)
	 
	 {
		this.id=id;
		this.name=name;
		this.salary=salary;
		 //System.out.println("test method1") ;
		
	 }
	
 }
 
 class Employee extends Person2
 {
	 int age;
	
    Employee (int id, String name,int salary, int age)
	 
	 {
    	super(id,name,salary);
    	this.age=age;
	 }
 }
   
 