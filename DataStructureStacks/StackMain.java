package JavaCore.DataStructureStacks;

public class StackMain {

  public static void main(String args[])
  {
	   ArrayStack  stk=new  ArrayStack (5);
	  
		  stk.push("harjinder");
		  System.out.println(stk.top());
		  stk.push("harjinder1");
		  System.out.println(stk.top());
		  stk.push("harjinder2");
		  stk.push("harjinder3");
		  stk.push("harjinder");
		  stk.push("harjinder");
		  stk.push("harjinder1");
		  stk.push("harjinder2");
		  stk.push("harjinder3");
		  stk.push("harjinder");
		  stk.push("harjinder");
		  System.out.println(stk.top());
		  System.out.println(stk.size());
		  stk.pop();
		  stk.pop();
		  stk.pop();
		  System.out.println(stk.size());
		  stk.pop();
		  stk.pop();
		  stk.pop();stk.pop();
		  stk.pop();
		  stk.pop();
		 
	 
	  
	  System.out.println(stk.size());
	 
  }
}
