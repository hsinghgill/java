package javacore.exception.demo;

public class Expectionhandlingbasics {
	//static String n;
	//static A a1;
	//static int i1=a1.i;
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Bankmanager manager = new Bankmanager();
		try
		{
		manager.verifyCardDetails("qwqw");
		manager.authenticateuserInfo("121212","sas");
		manager.verifyAvailableAmountInAccount(50000);
		manager.verifylimitPerDayForUser(2700);
		manager.withDrawAmount();
	    }
		catch( InvalidCardException e)
		{
			e.printStackTrace();
		 System.out.println("please re-enter the card");
		} 
		catch( InvalidPassCodeException e)
		{
			e.printStackTrace();
		 System.out.println("Invalid card");
		}
		catch(  AvailableAmountException  e)
		{
			e.printStackTrace();
			System.out.println("Amount requested is more than available");
		}
		catch( IndexOutOfBoundsException e)
		{
		 System.out.println("Amount requested is more than limit");
		}
	
		/*A a=new B();
		try {
			a.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    /*try {
			a.test1();
		}
	    catch (CloneNotSupportedException e)
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    catch (ClassNotFoundException e)
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    catch (NullPointerException e)
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("HArjiner");
		//System.out.println(i1);
		//System.out.println("HArjiner2");
		/* // A a=new B();
		int i=10;
		

		 //System.out.println("HArjiner");
		try {
		  
			i=20;
			//int i=arr[-1];
			//String arg=args[0];
			//System.out.println("HArjiner1" + arg);
		}
	
	catch(NullPointerException ex)
	{
		ex.printStackTrace();
		System.out.println("HArjiner2");
		
	}
	catch(ClassCastException ex)
	{
		ex.printStackTrace();
		System.out.println("HArjiner3");	
	}
		catch(ArithmeticException  ex)
		{
			ex.printStackTrace();
			System.out.println("HArjiner3");	
		}
		catch(ArrayIndexOutOfBoundsException  ex)
		{
			ex.printStackTrace();
			System.out.println("HArjiner3");	
		}
   //System.out.println("end");
   finally
   {
   	System.out.println("HArjiner2");
   	System.out.println(i=30);
   }

}
}*/}
	}
class Bankmanager
{
	public void  verifyCardDetails(String cardNumber)
	{
		if (cardNumber.length()==0)
		{
			throw new InvalidCardException("User Invalid");
		}
	}
	public void authenticateuserInfo(String cardNumber, String passCode)
	{
		if (passCode.length()==0)
		{
			throw new InvalidPassCodeException("User Invalid");
		}
	}
	public void verifyAvailableAmountInAccount (double amountRequested)
	{
		if(amountRequested>5000)
		{
			throw new  AvailableAmountException ("amount req is greater than avaiable");
			
		}
	}
	
	public void verifylimitPerDayForUser(double amountRequested)
	{
		if(amountRequested>2500)
		{
			throw new IndexOutOfBoundsException("amount req is greater than avaiable");
			
		}
	}
	
	public void withDrawAmount()
	{
		
	}
}



class InvalidCardException extends RuntimeException
{
	
	public InvalidCardException (String message)
	{
		super(message);
	}
}
class InvalidPassCodeException extends RuntimeException
{
	
	public InvalidPassCodeException (String message)
	{
		super(message);
	}
}
class AvailableAmountException extends RuntimeException
{
	
	public  AvailableAmountException  (String message)
	{
		super(message);
	}
}










	/* public void test1() throws CloneNotSupportedException ,ClassNotFoundException,NullPointerException
	 {
		test2();
	 }
	 public void test2() throws CloneNotSupportedException ,ClassNotFoundException,NullPointerException
	 {
		test3();
	 }
	 public void test3() throws CloneNotSupportedException ,ClassNotFoundException,NullPointerException
	 {
		String str=null;
		//int i=str.length();
		Class.forName("javacore.exception.demo.a"); 
		
	protected  void test() throws NullPointerException
	{
		System.ou.println("HArjiner2");
	}
}
class B extends A
{
	public void test() throws Exception
	{
		 String str =null;
		int i=str.length();
		System.out.println("HArjiner2");
	}
}*/
