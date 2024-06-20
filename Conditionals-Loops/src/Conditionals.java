import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sal.nextInt();
        if(salary>10000){
            salary+= 2000;
        }
        else{
            salary+= 1000;
        }
        System.out.println(salary);
    }
}