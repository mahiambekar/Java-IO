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
        CharArrayWriter fout = new CharArrayWriter();
        fout.write(arr);
        FileWriter f1 = new FileWriter("text.txt");
        fout.writeTo(f1);
        f1.close();
	       

		

	}
}
