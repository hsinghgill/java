
public class EncpasulationDemo {

	 public static void main(String args[])
	 {
		 Person1 p =new Person1();
		 p.setId(100);
		 p.setName("harjinder");
		 
		 System.out.println(" id of persom  "+ p.getId());
		 System.out.println(" id of persom  "+ p.getName());
}
}
class Person1
{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
}