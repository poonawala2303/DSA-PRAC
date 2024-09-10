import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
     }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j <= (arr.length - i - 1); j++) {
                if (arr[j] < arr[j-1]){
                    // int temp = a
                    // a = b;
                    // b = temp;

                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
                }
                // if no swaps occur, stop the program
                if(!swapped){
                    break;
                }
            }
        }
    }
}