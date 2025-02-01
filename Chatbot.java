//import Scanner
import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
         
        //set up scanner. 
        Scanner hey = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String name = hey.nextLine();
                           
        //add new a line before asking next question. 
        System.out.println("Hi " + name +"  I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        String home = hey.nextLine();


        //add new a line before asking next question.
        System.out.println("I hear it's beautiful at " +home+ "  I'm from a place called Oracle");
        System.out.println("How old are you?");
        //Pick up age and store it.
        int age = hey.nextInt();


        //add new a line before asking next question.
        System.out.println("So you're " + age +"I'm 400 years old.");
        System.out.println("This means I'm " + 400/age + " times older than you.");
        hey.nextLine();
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        String lang = hey.next();
        hey.nextLine();

        //add new a line here.
        System.out.println(lang + " that's great! Nice chatting with you "+ name + " I have to log off now. See ya!");
        
        //close scanner. 
        hey.close();
        
    }
}
