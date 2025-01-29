import java.util.Scanner; /* java's built in scanner class */

public class scanner{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

      String name;
      int age;
      float shoeSize;
      System.out.println("Please enter your name: ");
      name = scanner.nextLine(); /* accepts all user input until enter is pressed*/ 
      System.out.println("Please enter your age: ");
      age = scanner.nextInt(); /*Accepts all input until space is pressed */
      System.out.println("Please enter your shoe size");
      shoeSize = scanner.nextFloat(); 
      System.out.println("Your name is " + name);
      System.out.println("Your age is " + age);
      System.out.println("Your shoeSize is " + shoeSize);
      scanner.close();
    }
}   