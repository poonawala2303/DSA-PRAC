import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q: Find largest num

        // Way 1

//        int max = a;
//
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println("Max number is: "+ max);

        // Way 2

//        int max = 0 ;
//        if(a>b){
//            max = b;
//        }
//        else{
//            max =a;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println("Max num: "+max);

        // Way 3

//        System.out.println(Math.max(34,25));
//          int max = Math.max(c,Math.max(a,b));
//          System.out.println(max);
    }
}
