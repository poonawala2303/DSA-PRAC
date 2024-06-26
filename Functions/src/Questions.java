import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
//        System.out.println(isArmstrong(n));

        for (int i = 100; i < 999 ; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }

    }

    // Print all 3 digit armstrong numbers

    static boolean isArmstrong(int n){
        int orignal = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            n = n/10;
            sum = sum+ rem*rem*rem;
        }

        return sum == orignal;
    }

    // Check if number is prime or not

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
