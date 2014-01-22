package chardata;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class HowToReadFrom {
	public static void main(String args[])
	{
		File f=new File("D:/harjinderFile/harjinder.txt");
		FileReader fr=null;
		BufferedReader br=null;
	try
	{
		fr=new FileReader(f);
		br=new BufferedReader(fr);
		String str=null;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
	}
	catch(IOException e)
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
			if(fr!=null)
			{
				br.close();
				fr.close();
				fr=null;
				br=null;
				f=null;
			}
		}
		catch(IOException e)
			{
				e.printStackTrace();
			}
			
	}
	System.out.println("End of file");
	}

}
