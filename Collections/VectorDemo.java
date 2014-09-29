package Collections;

import java.awt.List;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
	public static void main(String args[])
	{
 Vector list1=new Vector(); 
  list1=(Vector) Collections.synchronizedList(list1);
	}
}
