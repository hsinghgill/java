package Java.core;

public class MultithreadingDemo {
    public static void  main(String args[])
    {
    	MyThread t1= new MyThread();
    	MyThread t2= new MyThread();
    	t1.setName("harjinder");
    	t2.setName("Gill");
    	t1.start();
    	t2.start();
    }
	
}
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<=1000;i++)
		{
			System.out.println(Thread.currentThread().getName() + "::"+Thread.currentThread().getName()+":" +i);
			
		}
	}
}
