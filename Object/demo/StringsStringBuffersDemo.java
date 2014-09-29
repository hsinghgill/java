package Java.core.Object.demo;

import java.util.StringTokenizer;

public class StringsStringBuffersDemo {
	public static void main(String args[])
	{
    String str= new String("harjinder,singh, gill,paramjit,jasbir");
    StringTokenizer token= new  StringTokenizer(str,",");
    
    while(token.hasMoreTokens())
    {
    	String tok= token.nextToken();
    	System.out.println(tok);
    }
   String[] splitArray = str.split(",");
   for(int i=0; i<splitArray.length;i++)
   {
	   System.out.println(splitArray[i]);
   }
   
    /*String str2= new String("harjinder");
    String str3="harjinder";
    String str4="harjinder";
    System.out.println( str==str2);
    System.out.println( str2==str3);
    System.out.println( str3==str4);*/
    }
}
