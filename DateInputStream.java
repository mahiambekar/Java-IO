/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.Date;
public class Main
{
	public static void main(String[] args)throws Exception {
	    FileInputStream fin = new FileInputStream("test.txt");
        DataInputStream din = new DataInputStream(fin);
        int a = din.readInt();
        double b = din.readDouble();
        boolean c = din.readBoolean();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        din.close();
		
	}
}
