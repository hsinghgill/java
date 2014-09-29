package Collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
	public static void main(String args[])
	{

	ArrayList  list1= new ArrayList ();
	//list1.add(10);
	//list1.add(20);
	//list1.add(20);
	list1.add("20");
	list1.add("harjider");
	list1.add("Gill");
	list1.add("singh");
	//list1.add(3);
	//list1.add(3);
	//list1.add(3);
	//list1.add(3);
	System.out.println(list1);
	Collections.sort(list1);//sort in accending order of the elements
	
	System.out.println(list1);
	Collections.reverse(list1);
	System.out.println(list1);
}
}