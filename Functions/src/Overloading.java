public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun(87,54);

        int ans = sum(90,90,90);
        System.out.println(ans);
    }

    static int sum (int a , int b){
        return a+b;
    }

    static int sum (int a , int b , int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);
    }
    static void fun(int num1 , int num2){
        System.out.println("Second One");
        System.out.println(num1 + " "+num2);
    }
}
