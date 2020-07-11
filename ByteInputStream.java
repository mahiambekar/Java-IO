/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.Date;
public class Main
{
	public static void main(String[] args) {
	    String msg = "This is demo java.io";
        byte[] arr = msg.getBytes();
        ByteArrayInputStream bin = new ByteArrayInputStream(arr);
        int x;
        do {
            x = bin.read();
            if (x != -1) {
                System.out.println((char) x);
            }
        } while (x != -1);
		
	}
}
