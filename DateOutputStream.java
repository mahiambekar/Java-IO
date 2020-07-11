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
	    FileOutputStream fout = new FileOutputStream("test.txt");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeInt(100);
        dout.writeDouble(2.3);
        dout.writeBoolean(true);
        dout.close();
                System.out.println("File Saved");
                
		
	}
}
