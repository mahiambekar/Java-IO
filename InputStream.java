/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.Date;
public class Main
{
	public static void main(String[] args) throws Exception;
		FileInputStream f1 = new FileInputStream("Demo.txt");
        int x;
        do{
            x=f1.read();
            System.out.println((char)x);
            
        } while (x!=-1);
        f1.close();
    }
}
