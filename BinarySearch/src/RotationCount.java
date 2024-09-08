public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Array has been rotated " + countRotations(arr)+ " times");
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return (pivot+1);
    }

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
