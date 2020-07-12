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
        BufferedReader bin = new BufferedReader(fin);
        FileWriter fout = new FileWriter("text.txt");
        BufferedWriter bout = new BufferedWriter(fout);
        String s1 = "";
        while ((s1 = bin.readLine()) != null) {
            System.out.println(s1);
            fout.write(s1);
        }        
        
        fin.close();
        fout.close();
        System.out.println("File Copied!!!");
		

	}
}
