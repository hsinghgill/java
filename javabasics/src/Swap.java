package javabasics;

import java.util.Scanner;

public class Swap {
	 public static void main(String args[])
	 {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the values"); 
		int n1=in.nextInt();
		int n2=in.nextInt();
		System.out.println("swap");
		swap(n1,n2);
		System.out.println("after swap" + n1+"  "+n2);
		
		
		
	 }
	 public static void  swap(int a, int b)
	 {
		int temp =a;
		a=b;
		b=temp;
		System.out.println("in swap" + a+"  "+b);
	 }
	 
}
