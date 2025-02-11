package library;
import java.util.Scanner;
public class YTstudentImport{
public static void main (String[] args)
    {
    YTstudent s1 = new YTstudent();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name = ");
    s1.name=sc.nextLine();
    System.out.println("Enter your roll = ");
    s1.roll=sc.nextInt();
    System.out.println("Enter your marks = ");
    s1.marks=sc.nextDouble(); 
    sc.close();
    s1.display();
  
}}