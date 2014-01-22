package SerializationExternalization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deexternalization {
	public static void main(String args[])
	{
		FileInputStream fin=null;
		ObjectInputStream oin=null;
		try
		{
			fin=new FileInputStream("D:/harjinderFile/person2.ser");
			oin=new ObjectInputStream(fin);
			Employee p=  (Employee) oin.readObject();
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getEid());
			System.out.println(p.getDesgination());
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fin!=null)
				{
				oin.close();
				fin.close();
				oin=null;
				fin=null;
				}
			}
			catch(IOException  e)
			{
				e.printStackTrace();
			}
		}
	}
}


