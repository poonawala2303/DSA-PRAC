public class OrderAgnostic {
    public static void main(String[] args) {
//        int[] arr = {-2,-18,-36,-69,2,4,6,9,11,12,14,20,36,48};
        int[] arr = {48,36,20,14,12,11,9,6,4,2,1,-69,-36,-18,-2};
        int target = 20;

        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int arr[] , int target){
        int start = 0;
        int end = arr.length -1;

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
