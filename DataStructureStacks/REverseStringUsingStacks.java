package JavaCore.DataStructureStacks;

import java.util.Scanner;

public class REverseStringUsingStacks {
	public static void main(String args[])
	{
		StringBuilder sb= new StringBuilder();
		ArrayStack charStack= new ArrayStack(50);
		System.out.println("enter the string");
         Scanner in= new Scanner(System.in);
		String str= in.nextLine();
		
	//System.out.println("entered  string =    " +str);
		for(int i=0;i<str.length();i++)
		{
			System.out.println("entered  string "+ str.charAt(i));
			charStack.push(str.charAt(i));
		}
	
	       int i=0;
			while(!charStack.isEmpty())
			{
			sb.append(charStack.pop());
		    }
		
		System.out.println(sb.toString());
	}

}
