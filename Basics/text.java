package newProject;

import java.io.FileReader;


public class text{
	public static void main(String[] args) {
		String path  = "<enter path here>";
		
				
		try {
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter (dest);
			System.out.println("File opened"); 
			int ch; //reads character by character and returns ASCII file will return -1 at the end of the file 
			while((ch=fr.read()) !=-1) {
				fw.write(ch);
			}
		
		fr.close();
		System.out.println("File Closerd");}
		catch (Exception e)
		{
			System.out.println("Error ; " + e.getMessage());
		}
		
	}
}