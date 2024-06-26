import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,30); // We pass the value in the order of their declaration. i.e if a is passes first in sum3() fxn, then here also 'a' will be first
        System.out.println(ans);
    }

    // Pass the value of numbers when your are calling method in main()

    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }

    //return value

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    //doesn't return anything
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is "+sum);
    }
}
