public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-17,3,14,28};
        int target = 3;
        System.out.println(linearSearch(arr,target,1,4));
    }

    static int linearSearch(int[] arr , int target, int start , int end) {
        if (arr.length == 0){
            return -1;
        }

        // else run a for loop

        for (int index = start; index < end; index++) {
            // chk element at every index if it == target

            int element = arr[index];
            if(element == target){
                System.out.println("Element found at "+ index + "th position within the range "+start+" to "+end);
                return index;
            }
        }

        return -1;
    }

}
