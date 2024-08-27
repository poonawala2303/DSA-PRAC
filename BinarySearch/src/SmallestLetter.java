public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};
        char target = 'e';
        char ans = (char) binarySearch(letters,target);
        System.out.println(ans);

    }

    // return the index

    static int binarySearch(char[] letters , char target){
        int start = 0;
        int end = letters.length -1;

//        if(target > letters[letters.length-1]) return -1;

        while(start<=end){
//            int mid = (start + end) / 2; // might pe possible that (start+end) exceeds the range and then gives error
              // Better way below:
            int mid = start + (end-start) / 2;

            if (target < letters[mid]){
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }

        return letters[start % letters.length];
    }
}