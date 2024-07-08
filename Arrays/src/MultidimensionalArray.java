import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Multidimensional arrays are like matrix
        /*
         1 2 3
         4 5 6
         7 8 9
         */

        int[][] arr = new int[3][2];

        int [][] arr2D = {
                {1,2,3,},
                {4},
                {5,6,7,8,}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
         //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println("");
//        }

        // pro output

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // legend output

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
