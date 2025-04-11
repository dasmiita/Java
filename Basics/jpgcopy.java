package newProject;

import java.io.FileOutputStream;
import java.io.FileInputStream;



public class jpgcopy
{
	public static void main(String[] args) {
		String path  = "<src photo>";
		String dest = "<destination photo>";
				
		try {
			FileInputStream fr = new FileInputStream(path);
			FileOutputStream fw = new FileOutputStream (dest);
			System.out.println("File opened"); 
			int ch; 
			while((ch=fr.read()) !=-1) {
				fw.write(ch);
			}
			System.out.println("copied");
		
		fr.close();
		fw.close();
		System.out.println("File Closerd");}
		catch (Exception e)
		{
			System.out.println("Error ; " + e.getMessage());
		}
		
	}
}