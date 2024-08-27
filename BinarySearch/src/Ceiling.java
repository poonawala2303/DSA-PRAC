public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = binarySearch(arr,target);
        if (ans>=0){
        System.out.println("Element found at index number: "+ans);
        }
        else{
            System.out.println(ans);
        }
    }

    // return the index

    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;

        if(target > arr[arr.length-1]) return -1;

        while(start<=end){
//            int mid = (start + end) / 2; // might pe possible that (start+end) exceeds the range and then gives error
              // Better way below:
            int mid = start + (end-start) / 2;

            if (target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid +1;
            }
            else{
                return mid;
            }
        }

        return start;
    }
}