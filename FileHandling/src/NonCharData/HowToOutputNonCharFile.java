package NonCharData;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HowToOutputNonCharFile {
	public static void main(String args[])
	{
		FileInputStream fin=null;
		BufferedInputStream bin =null;
		FileOutputStream fout=null;
		BufferedOutputStream bout=null;
		int i=0;
		byte[] arr=new byte[100];
		try
		{
			fin=new FileInputStream("C:/Users/harjinder/Desktop/k1.jpg");
			bin=new BufferedInputStream(fin);
			fout=new FileOutputStream("C:/Users/harjinder/Desktop/k2.jpg");
			bout=new BufferedOutputStream(fout);
			int b=0;
			while((b=bin.read(arr))!=-1)
			{
				bout.write(b);
			}
			bout.flush();
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(bin!=null)
				{
					bin.close();
					fin.close();
					bin=null;
					fin=null;
					
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
		
}
