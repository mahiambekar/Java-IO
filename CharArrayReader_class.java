/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
	    String msg = "This is char io";
        char[] arr = msg.toCharArray();
        CharArrayReader f1 = new CharArrayReader(arr);
        int x;
        do {
            x = f1.read();
            if (x != -1) {
                System.out.println((char) x);
            }

        } while (x != -1);

		

	}
}
