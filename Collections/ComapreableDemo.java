package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComapreableDemo
{
	public static void main(String args[])
	{
		ArrayList<Person> set= new ArrayList<Person>();
		//set.add(10);
		//set.add(10);
		//set.add(null);
		set.add(new Person(11,"harjidner1"));
		set.add(new Person(33,"harjidner2"));
		set.add(new Person(23,"harjidner3"));
		set.add(new Person(14,"harjidner4"));
		System.out.println(set);
		Collections.sort(set, getPersonCompared());
		System.out.println(set);
	}
		public static  Comparator  getPersonCompared()// annynomous inner class if we need to just implement the interface
		{
			return new Comparator ()
					{
				public int compare(Object obj1, Object obj2) {// different from comapareTo method of the Comparable interface 
					// as it has two objects 
					//System.out.println("inside comapre");
			         Person p1= (Person)obj1;
			         Person p2= (Person)obj2; 
					return p1.id-p2.id;
					}
		            };
		}

    }
	


class    // implements Comparable<Object> 
{
	
	int id;
	String name;
	Person(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return this.id + ":" + this.name;
	}
	
public boolean equals(Object obj)
	{
		Person p= (Person)obj;
		return p.id==this.id && p.name.equals(this.name);
	}
	public int hashCode()
	{
		int hashValue=0;
		hashValue=hashValue+Integer.toString(id).hashCode();
		hashValue=hashValue + name.hashCode();
		return hashValue;
	}
	//@Override
	/*public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person )
		{
			Person p=(Person)obj;
			return this.id-p.id;//for id ,for primitives
			//return this.name.compareTo(p.name);// for object use the compareTo method in that class itself
		}
		return 0;
	}*/
	
	
	
}

class PersonComparator  implements Comparator<Object> 
{

	@Override
	public int compare(Object obj1, Object obj2) {
		//System.out.println("inside comapre");
         Person p1= (Person)obj1;
         Person p2= (Person)obj2; 
		return p1.id-p2.id;
	
	}

	
}
