public class Main {
    public static void main(String[] args) {
        int[] nums = {23,45,1,80,89,78};
        int target = 89;
        int ans = linearSearch(nums,target);
//        System.out.println(ans);

    }

    // search in array: return the index if item is found
    // otherwise return -1

    static int linearSearch(int[] arr , int target) {
        if (arr.length == 0){
            return -1;
        }
        
        // else run a for loop

        for (int index = 0; index < arr.length; index++) {
            // chk element at every index if it == target

            int element = arr[index];
            if(element == target){
                System.out.println("Element found at "+ index + "th position");
                return  index;
            }
        }

        return -1;
    }
}