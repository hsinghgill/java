package InternatilzationsDemo;

import java.text.NumberFormat;
import java.util.Locale;

public class DateDemo {
  public static void main(String args[])
  {
	
	  NumberFormat nfuk= NumberFormat.getInstance(Locale.UK);
	  NumberFormat nfus= NumberFormat.getInstance(Locale.US);
	  NumberFormat nffrance= NumberFormat.getInstance(Locale.FRANCE);
	  NumberFormat nfGerman= NumberFormat.getInstance(Locale.GERMAN);
	  System.out.println(nfuk.format(1234567));
	  System.out.println(nfus.format(1234567));
	  System.out.println(nffrance.format(1234567));
	  System.out.println( nfGerman.format(1234567));
	  NumberFormat nfukc= NumberFormat.getCurrencyInstance(Locale.UK);
	  NumberFormat nfusc= NumberFormat.getCurrencyInstance(Locale.US);
	  NumberFormat nffrancec= NumberFormat.getCurrencyInstance(Locale.FRANCE);
	  NumberFormat nfGermanc= NumberFormat.getCurrencyInstance(Locale.GERMANY);
	  System.out.println(nfukc.format(1234567));
	  System.out.println(nfusc.format(1234567));
	  System.out.println(nffrancec.format(1234567));
	  System.out.println( nfGermanc.format(1234567));
	  /* Calendar cl1= new GregorianCalendar();
	  cl1.add(Calendar.HOUR, 10);
	  Locale l= new Locale("en","uk");
	  DateFormat df0= new SimpleDateFormat("DD-MM-YY");
	  DateFormat df= DateFormat.getDateInstance(DateFormat.SHORT,l);
	  DateFormat df1= DateFormat.getDateInstance(DateFormat.SHORT,Locale.UK);
	  Calendar cl= Calendar.getInstance();
	  String str=df.format(new Date());
	  String str2=df1.format(new Date());
	 // String str0=df0.format(new Date());
	  Date d=null;
	  try
	  {
		 d= df0.parse("20-01-1988");
	  }
	  catch(ParseException EX)
	  {
		  EX.printStackTrace();
	  }
	//  cl.roll(Calendar.DATE,20);
	  System.out.println("harjinder"+ str);
	  System.out.println("harjinder"+ str2);
	//  System.out.println("harjinder"+ str0);
	  System.out.println("harjinder"+ d);*/
  }
  


}
