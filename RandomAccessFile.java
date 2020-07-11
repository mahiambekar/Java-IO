/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.Date;
public class Main
{
	public static void main(String[] args) throws Exception {
	    RandomAccessFile f = new RandomAccessFile("test.txt", "rws");
        f.seek(4);
        int x;
        do {
            x = f.read();
            System.out.println((char) x);
        } while (x != -1);
        System.out.println("Second time read....");
        do {
            x = f.read();
            System.out.println((char) x);
        } while (x != -1);
        f.close();
                
		
	}
}
