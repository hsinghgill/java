package JavaCore.DataStructureStacks;

import java.util.Scanner;

public class FindingOutdelimeterMatching {
	
	public static void main(String str[])
	{
	ArrayStack charStack= new ArrayStack();
	System.out.println("enter the string");
     Scanner in= new Scanner(System.in);
     char[] ch=new  char[50];
	ch= in.nextLine().toCharArray();
	 
	for(int i=0; i<ch.length;i++)
	{
		char c= ch[i];
		switch(c)
		{
		case '(' :
		case '{':
		case '[':
			charStack.push(c);
			break;
		case ')':
		case '}':
		case ']':
			  if(!charStack.isEmpty())
			  {
				  char charCompare= (char) charStack.pop();
				  if(c==')' && charCompare !='('||c=='[' && charCompare !=']'||c=='}' && charCompare !='{')
				  {
					  System.out.println("Strng mismatch" +c +" at " + i);
					//  break;
				  }
				  else
				  {

					  System.out.println("Strng mismatch" +c +" at " + i);
					 
				  }
				  break;
			  }
		default:
			break;
				
		}
	}
	if(charStack.isEmpty())
		System.out.println("delimetrers matched");
	
	}

}
