public class SearchInMountain {
    public static void main(String[] args) {

    }

    int search(int[]arr , int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target,0,peak);

        if(firstTry != -1){
            return firstTry;
        }
        // else try to search in 2nd half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start) / 2;

            if(arr[mid] > arr[mid+1]){
                // descending part of array
                // this may be the answer but look at the left
                end = mid;
            }
            else{
                // ascending part of array
                start = mid + 1;
            }

            // at the end start = end bcoz of 2 conditions
        }
        return start; // or return end as both are equal
    }

    static int orderAgnosticBS(int arr[] , int target , int start , int end){

        // find whether array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
//            int mid = (start + end) / 2; // might pe possible that (start+end) exceeds the range and then gives error
            // Better way below:
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
