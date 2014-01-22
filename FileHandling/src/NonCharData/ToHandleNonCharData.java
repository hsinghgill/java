package NonCharData;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

 class ToHandleNonCharData {
	public static void main(String args[])
	{
		FileInputStream fin=null;
		BufferedInputStream bin=null;
		int i=0;
		try
		{
			fin=new FileInputStream("C:/Users/harjinder/Desktop/k.jpg");
			bin=new BufferedInputStream(fin);
			int b=0;
			while((b=bin.read())!=-1)
			{
				System.out.println(b);
				i++;
			}
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Catch1");
			e.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println("Catch2");
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(fin!=null)
				{
					bin.close();
					fin.close();
					fin=null;
					bin=null;
					
				}
			}
			catch(IOException e)
				{
					e.printStackTrace();
				}
				
		}
		System.out.println("End of file    " +i);
		
		
	}

}
