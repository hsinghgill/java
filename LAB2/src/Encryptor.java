
import javax.swing.*;
public class Encryptor {
  public String cipherText;
  private String plainText;
  private int shift;
  
  public Encryptor() {
    plainText = null;
    shift = 0;
  }
public static void main(String [] args) {

  // encryption block
  Encryptor e  = new Encryptor();
  String strCipherText = e.Encrypt();
  System.out.println("Encrypted text");
  System.out.println(strCipherText);
  
  // decrypt block
  Encryptor d  = new Encryptor();

  // cipher text becomes the input text to the Decrypt method
  //e.cipherText = strCipherText;

  String strPlainText = e.Decrypt();
  System.out.println("Decproted text");
  System.out.println(strPlainText);
   
  System.exit(0);
}

public String Encrypt()
{
  plainText = 
  ((String)JOptionPane.showInputDialog("enter words " +    
  "to encrypt")).toLowerCase().trim();

  shift = 
  Integer.parseInt(JOptionPane.showInputDialog("enter offset"));

  int offset = 0;
  int newOffset = 0;
  String alphabet = "abcdefghijklmnopqrstuvwxyz";
  StringBuffer sb = new StringBuffer();
  int index = plainText.length();
  for(int i = 0; i < index; i++)
  {
    String temp = "" + plainText.charAt(i);
    offset = alphabet.indexOf(temp);
    offset += shift;
    if(offset > 25)
    {
      newOffset = offset % 26;
      sb.append(alphabet.charAt(newOffset));
    }
    else
    {
      sb.append(alphabet.charAt(offset));
    }
  }
  return sb.toString();
}
public String Decrypt() 
{
	cipherText= ((String)JOptionPane.showInputDialog("enter words " +    
	  		 "to decrypt")).toLowerCase().trim();

	//plainText = cipherText;
  shift = 
  Integer.parseInt(JOptionPane.showInputDialog("enter offset"));

  int offset = 0;
  int newOffset = 0;
  String alphabet = "abcdefghijklmnopqrstuvwxyz";
  StringBuffer sb1 = new StringBuffer();
  int index = cipherText.length();
  for(int i = 0; i < index; i++)
  {
    String temp = "" +cipherText.charAt(i);
    offset = alphabet.indexOf(temp);
    offset = offset-shift;
    if(offset < 0)
    {
      newOffset = offset +26;
      sb1.append(alphabet.charAt(newOffset));
    }
    else
    {
      sb1.append(alphabet.charAt(offset));
    }
  }
  return sb1.toString();
}
}
