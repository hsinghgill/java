package SerializationExternalization;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	public static void main(String args[])
	{
	Employee p=new Employee();
	p.setId(100);
	p.setName("Harjinder");
	p.seteID(1500);
	p.setDesgination("Astt. Prof");
	FileOutputStream fout=null;
	ObjectOutputStream oout =null;
	try
	{
		fout=new FileOutputStream("D:/harjinderFile/person2.ser");
		oout=new ObjectOutputStream(fout);
		oout.writeObject(p);
		oout.flush();
	}
	catch(FileNotFoundException e )
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
			if(fout!=null)
			{
				oout.close();
				fout.close();
				oout=null;
				fout=null;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	}
}
class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int pid;
	
	public void setId(int pid)
	{
		this.pid=pid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		 return pid;
	}
	public String getName()
	{
		return name;
	}
}
class Employee extends Person
{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = -6533038072246044138L;
	private int eID;
	private String desgination;
	public void seteID(int eID)
	{
		this.eID=eID;
	}
	public void setDesgination(String desgination)
	{
		this.desgination=desgination;
	}
	public int getEid ()
	{
		 return eID;
	}
	public String getDesgination()
	{
		return desgination;
	}
	
}
