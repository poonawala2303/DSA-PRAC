import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;

        // Internally , it would be stored like [5,6,7,8,9]
//        System.out.println(arr[3]);
//        System.out.println(arr[5]); // index out of bounds error

        // input using for loops

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // simplified form of for loop below, known as for each loop
//        for (int num : arr) {
//            System.out.println(num);
//        }

        // best way to print array below

//        System.out.println(Arrays.toString(arr));

        // array of objects

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "BYE";

        System.out.println(Arrays.toString(str));

    }
}