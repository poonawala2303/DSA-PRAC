//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1383140994/

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If pivot is not found , i.e array is not rotated. In that case , do normal Binary Search
        if(pivot == -1){
            return binarySearch(nums , target , 0 , nums.length-1);
        }

        // if pivot is found , you have 2 ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
       }

        if(target >= nums[0])
        {
            return binarySearch(nums,target,0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);

    }

    static int binarySearch(int[] arr , int target , int start , int end){

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

        return -1;
    }

    // wont work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <=end){
            int mid = start + (end-start) /2;
            // 4 cases over here

            // case 1

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            // case 2

            if(mid >start && arr[mid] < arr[mid-1]){
                return (mid-1);
            }

            // case 3

            if(arr[mid] <= arr[start]){
                end = mid-1;
            }

            // case 4

            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
