import java.util.Scanner;

public class TempProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temperature in degree celsius (C): ");
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Fahreheit is: "+tempF);
    }
}
