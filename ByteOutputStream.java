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
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(arr);
        FileOutputStream fout = new FileOutputStream("test.txt");
        bout.writeTo(fout);
        fout.close();
		
	}
}
