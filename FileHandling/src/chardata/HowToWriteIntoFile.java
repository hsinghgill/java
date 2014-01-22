package chardata;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class HowToWriteIntoFile {

	public static void main(String arg[])
	{
		File f=new File("D:/harjinderFile/harjinder.txt");
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter(f,true);
			bw=new BufferedWriter(fw);
			bw.write("\nharjinder \n singh \n gill");
			bw.flush();
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
				if(fw!=null)
				{
					bw.close();
					fw.close();
					fw=null;
					bw=null;
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
