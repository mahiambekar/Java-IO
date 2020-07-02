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
		File f1 = new File("Text.txt");

        if (f1.exists()) {
            System.out.println("File Exists");
        } else {
            f1.createNewFile();
            System.out.println("File Created");
        }
	}
}
