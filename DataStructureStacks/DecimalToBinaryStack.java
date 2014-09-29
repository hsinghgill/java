package JavaCore.DataStructureStacks;

import java.util.Scanner;

public class DecimalToBinaryStack {
 	
 public static void main(String argd[])
 {
	 System.out.println("enter the decimal to convert");
	 Scanner in= new Scanner(System.in);
	 int number= in.nextInt();
	 System.out.println("enter the decimal to convert" + deciamrtoBanry(number));
	 
	
 }
 
 public static String deciamrtoBanry(int decimal)
 
 { 
	 StringBuilder sb= new StringBuilder();
	 ArrayStack stk = new ArrayStack(20);
	 if(decimal==0)
	 {
		sb.append(0); 
	 }
	 else
	 {	 
	 while(decimal!=0)
	 {
		 sb.append(decimal%2);
		 decimal=decimal/2;
	 }
	 }
	return sb.toString();
	
 }
}

