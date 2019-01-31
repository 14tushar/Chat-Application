import java.io.*;
import java.net.*;
import java.util.Scanner;

public class tusharserver1
{
 public final static int port=13;

 public static void main(String args[])
 {
  ServerSocket serversocket;
  Socket socket;
  Scanner sc= new Scanner(System.in);
  try
  {
   serversocket=new ServerSocket(port);
   try
   {
    while(true)
    {
     socket=serversocket.accept();
     DataInputStream in=new DataInputStream(socket.getInputStream());
     String str=in.readLine();
     System.out.println(" B : "+str);
     System.out.print("Reply : ");
     String a="Tushar : "+sc.nextLine();
     PrintStream out=new PrintStream(socket.getOutputStream());
     out.println(a);
    }
   }
   catch(IOException ioe)
   {
    serversocket.close();
    System.out.println(ioe);
   }
  }
  catch(IOException ie)
  {
   System.err.println(ie);
  }
 }
}