package javabasics;

import java.util.Scanner;

public class overloading {
 
	 public static void main(String args[])
	 {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the values"); 
		int n1=in.nextInt();
		int n2=in.nextInt();
		System.out.println("abc");
		System.out.println(abc(n1,n2));
		System.out.println("Enter the float values"); 
		float n3=in.nextFloat();
		float n4=in.nextFloat();
		System.out.println("overloaded abc");
		System.out.println(abc(n3,n4));
		
	 }
	 public static int abc(int a, int b)
	 {
		 return a+b;
	 }
	 public static float abc(float a, float b)
	 {
		 return a*b;
	 }
}