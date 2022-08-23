import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHi "+name+"! I'm Javabot. Where are you from?");
        String home = scan.nextLine();

        System.out.println("\nI hear it's beautiful at "+home+"! I'm from a place called Cosmin's House");
        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("\nSo you're " + age + ", cool! I'm 1 month old.");
        System.out.println("This means I'm a lot younger than you.");
        System.out.println("Enough about me. What's your favourite language? (you can say Python, I'll allow it)");
        scan.nextLine();
        String language = scan.nextLine();

        System.out.println("\n" + language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        scan.close();
    }
}
