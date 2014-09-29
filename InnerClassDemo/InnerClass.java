package InnerClassDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InnerClass {
   public static void main(String args[])
   {
	   
	   Pattern p = Pattern.compile("[/@/./A-Za-z0-9]*");
	   Matcher m= p.matcher("AahrAjidner123@.");
	   System.out.println(m.matches());
   }
	/*OuterClass o= new OuterClass();
	OuterClass.InnerClass oI= o.getInnerObject();
	System.out.println(oI.setB(10));
	//System.out.println(oI.a1=20);
	oI.test();
	
	new Thread( new Runnable()
	{

		
	public void run() {
			// TODO Auto-generated method stub
			System.out.println("run method will be executed ");
	}
	
   }).start();;
	}*/
}
class A implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

  class OuterClass{
   // protected  class InnerClass// instance inner class
	
	 protected  class InnerClass{
        int a;
		private int b;
		
	  void test()
		{
			System.out.println("you are in the inner class");
			class Local
			{
				public   void testLocal()
				{
					System.out.println("into the local method");
				}
			}
			Local i=new Local();
		}

		public int getB() {
			return b;
		}

		public int setB(int b) {
			this.b = b;
			return b;
		}
	}
	public InnerClass getInnerObject()
	{
		return new InnerClass1();
	}
	protected   class InnerClass1 extends  InnerClass{
        int a1;
		private int b1;
		
		

		public int getB() {
			return b1;
		}

		public int setB( int b1) {
			this.b1 = b1;
			return b1;
		}
	}
	
	
}
