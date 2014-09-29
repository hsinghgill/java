package Collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[])
	{
		ArrayList list= new
				 ArrayList();
		//list.add(10);
		//list.add(10);
		//list.add(null);
		list.add(new Person(11,"harjidner1"));
		list.add(new Person(22,"harjidner2"));
		list.add(new Person(13,"harjidner3"));
		list.add(new Person(14,"harjidner4"));
		Set set= new LinkedHashSet(list);
		System.out.println(set);
		Set set1= new TreeSet(getPersonCompared());
		set1.addAll(set);
		set.clear();
		set.addAll(set1);
		
		
		System.out.println(set);
		System.out.println(set1);
		//Collections.sort(set, getPersonCompared());
		//System.out.println(set);
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
class Person{
	
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
}