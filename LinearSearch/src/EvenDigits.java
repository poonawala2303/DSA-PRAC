// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count =0;

        for(int num: nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

    // fxn to check whether even digits are there or not
    static boolean even(int num) {
        int numberDigits = digits2(num);
        return numberDigits % 2 == 0;
    }

    static int digits(int num){
        int count = 0;

        while (num>0){
            count++;
            num = num/10;
        }

        return count;
    }

    //optimised solution

    static int digits2(int num){
        if (num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) +1;
    }
}
