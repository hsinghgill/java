package Collections;

import java.util.ArrayList;
//import java.util.Arraylist;

public class CollectionDemoList {
	public static void main(String args[])
	{
		ArrayList list1= new ArrayList ();
		ArrayList  list2= new ArrayList ();
		list1.add(10);
		list1.add(20);
		list1.add(20);
		list1.add(20);
		list1.add(20);
		list1.add(20);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		list2.add(3);
		list2.add(20);
		list1.add(list1.size(), "harjidner");
		list2.addAll(1,list1);
	
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.size());//will give size of collection
		System.out.println(list1.isEmpty());//will give true if empty , false if not
		System.out.println(list1.get(2));
		list1.set(2,"GILL");
		System.out.println(list1);
		System.out.println(list2.containsAll(list1));
		list1.remove(4);//to remove at index
		//list1.remove(20);//to remove at index
		list1.remove("harjidner");//to remove element
		list1.trimToSize();// to trim the capacity to the size of the list1
		
		System.out.println(list1);
	
		System.out.println(list2.subList(2, 7));

}
}
