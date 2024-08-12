import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,-54}
        };

        int target = 99;

        int[] ans = search2d(arr,target); // format of return value {row},{col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max2d(arr));
    }

    static int[] search2d(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
//                    System.out.println("Element found at index ["+row+"]"+"["+col+"]");
//                    return target;
                    return new int[]{row,col}; // new keyword is used bcoz here the array isnt initialized before
                }
            }
        }
//        return -1;
        return new int[]{-1,-1};
    }

    static int max2d(int[][] arr){
        int max= arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
//        return -1;
        return max;
    }
}
