/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		FileReader fin = new FileReader("test.txt");

        int x;
        do {
            x = fin.read();
            if (x != -1) {
                System.out.println((char) x);
            }

        } while (x != -1);

        fin.close();


	}
}
