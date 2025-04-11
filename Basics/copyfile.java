package newProject;

import java.io.FileReader;
import java.io.FileWriter;


public class copyfile{
	public static void main(String[] args) {
		String path  = "<source address";
		String dest = "<destination address>";
				
		try {
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter (dest);
			System.out.println("File opened"); 
			int ch; //reads character by character and returns ASCII file will return -1 at the end of the file 
			while((ch=fr.read()) !=-1) {
				fw.write(ch);
			}
		
		fr.close();
		fw.close();
		System.out.println("File Closerd");}
		catch (Exception e)
		{
			System.out.println("Error ; " + e.getMessage());
		}
		
	}
}