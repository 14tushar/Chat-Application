import java.io.*;
import java.net.*;
import java.util.Scanner;

public class tusharclient1
{
 public static void main(String args[])
 {
  Socket socket;
  String hostname;
  Scanner sc= new Scanner(System.in);
  try
  {
   socket=new Socket("localhost",13);
   while(true)
   {
   System.out.print("Reply: ");
   String a=sc.nextLine();
   PrintStream out=new PrintStream(socket.getOutputStream());
   out.println(a);
   DataInputStream in=new DataInputStream(socket.getInputStream());
   String str=in.readLine();
   System.out.println(str);
   }
  }
  catch(UnknownHostException u)
  {
   System.err.println(u);
  }
  catch(IOException ie)
  {
   System.err.println(ie);
  }
 }
}