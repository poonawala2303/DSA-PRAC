public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        System.out.println("Minimum element is "+ans);
        return ans;
    }
}
