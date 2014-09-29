
public class AbstractDemo1 {
	

		public static void mian(String args[])
		{
			Myshape shape=new Myrectangle();
			System.out.println(shape.calculateArea());
		}
	}

	abstract class Myshape
	{
		public abstract double calculateArea();
		
	}
	class Mycircle extends Myshape
	{
		private double radius;
		private static double pi=3.14;
		public double calculateArea()
		{
			return pi*radius*radius;
		}
	}
	class Myrectangle extends Myshape
	{
		private double length=10;
		private double breadth=20;
		public double calculateArea()
		{                                                        
			return length*breadth;
		}
	}


