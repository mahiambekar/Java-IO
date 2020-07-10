import java.io.*;
import java.util.Date;

public class Main
{
	public static void main(String[] args) {
                  FileInputStream f1=new FileInputStream(text.txt);
                  FileOutputSteam f2=new FileOutputStream(text.txt);
                  int x;
                  do{
                      x=f1.read();
                      f2.write(x);
                  } while(x!=-1);
                  f1.close();
                  f2.close();
                  System.out.println("File copied");
        }
}
