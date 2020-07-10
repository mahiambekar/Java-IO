import java.io.*;
import java.util.Date;

public class Main
{
	public static void main(String[] args) {
                  FileInputStream f1=new FileInputStream(text.txt)   
                  int x;
                  System.out.println(f1.available());
                  f1.skip(3);
                  do{
                       x=f1.read(); 
                       System.out.println((char)x);
                  } while (x!=-1);
                  f1.close();
        }
}
