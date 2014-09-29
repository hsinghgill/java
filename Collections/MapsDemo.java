package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String args[])
	{
		Map  map= new HashMap();
		map.put("a", 100);
		map.put(3.14, 1300);
		map.put(new Address("harjinder","singh"), 1300);
		//System.out.println(map);
		map.put(new Address("harjinder","singh"), 1300);
		map.put(new Address("harjinder","singh"), 1300);
		map.put(null, 1300);
		Address add=new Address("harjinder","singh");
		System.out.println(map.containsValue(add));
		map.put(new Address("harjinder","singh"), null);
		//System.out.println(map);
		//Integer s=(Integer) map.get("a");
		//Float i=(Float) map.get(3.14);
		map.put("c", 500);
		map.put("c", 50);
		//map.clear();
		//System.out.println(map.isEmpty());
	}
}
class Address
{
	String doorNumber;
	String streetNumber;
	public Address(String doorNumber,String streetNumber)
	{
		this.doorNumber= doorNumber;
		this.streetNumber=streetNumber;
	}
	public String toString()
	{
		return doorNumber + ": "+ streetNumber;
	}
	public boolean equals(Object obj)
              {
		        Address a= (Address)obj;
				return this.doorNumber.equals(a.doorNumber) && this.streetNumber.equals(a.streetNumber);
              }
	public int hashCode()
	{
		return doorNumber.hashCode()+streetNumber.hashCode();
	}
}