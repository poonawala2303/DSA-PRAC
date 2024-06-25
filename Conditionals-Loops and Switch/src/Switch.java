import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("King of Fruits");
            case "Orange" -> System.out.println("King of Fruits");
            case "Grapes" -> System.out.println("King of Fruits");
            default -> System.out.println("Aha Tamatar bade mazedaar");
        }
    }
}
