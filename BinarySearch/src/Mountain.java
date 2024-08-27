public class Mountain {
    public static void main(String[] args) {

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
}
