import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalized = myGreet(naam);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String Greeting = "Hello " + name;
        return Greeting;
    }


    static void greeting(){
        System.out.println("Hello World");
    }
}
