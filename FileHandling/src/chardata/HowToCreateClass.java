package chardata;
import java.io.File;
import java.io.IOException;

public class HowToCreateClass
{
	public static void main(String args[])
	{
		File f=new File("hello.txt");
		File dir=new File("harjinderFile");
		File dir1=new File("harjinderFile1","harjinder.txt");
		
		dir.mkdir();
		System.out.println("File is there??  "+f.exists());
		System.out.println("Dir is there??  "+dir.exists());
		
	try
	{
		boolean isFileCreated=f.createNewFile();
		System.out.println("File is created "+isFileCreated);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	System.out.println(f.setLastModified(0));
	System.out.println("File is there??  "+f.exists());
	System.out.println("path ??  "+f.getAbsolutePath());
	System.out.println("size ??  "+f.length());
	System.out.println("READ ??  "+f.canRead());
	System.out.println("Write ??  "+f.canWrite());
	System.out.println("hidden??  "+f.isHidden());
	System.out.println("file ??  "+f.isFile());
	System.out.println("Directory ??  "+f.isDirectory());
	System.out.println("Directory ??  "+dir.isDirectory());
	System.out.println("Directory ??  "+dir.getAbsolutePath());
	System.out.println("Directory ??  "+dir.getPath());
	System.out.println("Directory ??  "+dir1.isDirectory());
	System.out.println("Directory ??  "+dir1.getAbsolutePath());
	System.out.println("Directory ??  "+dir1.getPath());
	System.out.println("what is this"
			+ " ??  "+f.isAbsolute());
	

	}
	
}
