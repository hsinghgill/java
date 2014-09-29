package Collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class SetDemo {
public static void  main(String args[])
	{
	
		//Set set= new HashSet();
		
		Set set= new HashSet();
		set.add(10);
		set.add(10);
		set.add(null);
		set.add(null);
		//set.add(new Person1(11,"harjidner1"));
		//set.add(new Person1(12,"harjidner2"));
		//set.add(new Person1(13,"harjidner3"));
		//set.add(new Person1(14,"harjidner4"));
		//
		System.out.println(set);
		//Iterator it= set.iterator();
	
		/*ListIterator list= set.listIterator();
		
		while (list.hasNext())
		{
			//.remove();
			Person p=(Person) list.next();
			//list.add(new Person(100,"fudu"));
			System.out.println(p);
			
		}
		while (list.hasPrevious())
		{
			//.remove();
			Person p=(Person) list.previous();
			System.out.println(p);
			
		}
		
		System.out.println(set);
	}*/

}
}
class Person1{
	
	int id;
	String name;
	Person1(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return this.id + ":" + this.name;
	}
/*	
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
	}*/
}
