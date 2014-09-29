package Java.core;

import java.text.DecimalFormat;

import java.util.Scanner;
public class Newton {

public static float Compute(float num)

{

float squareRoot;

float x;
x=num/2;
float temp;
//float temp1;
do

{
	
squareRoot=x-((x*x-num)/2*x);
temp=x;
x=squareRoot;

//System.out.println("a");
}while(Math.abs(x-temp)>0.01);

return squareRoot ;

}

public static void main(String []args){

Scanner sc= new Scanner(System.in);

//DecimalFormat fourDecimal= new DecimalFormat("0.0000");

float number=0;

System.out.println("Program find the square root by :Newtons method");

System.out.println("Please enter the number");

number= sc.nextFloat();

System.out.println("The square root of " + number + " is "+ Compute(number));

sc.close();
}

}
