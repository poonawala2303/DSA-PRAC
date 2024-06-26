import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,8,9);
//        multiple(2,5,"Kunal");
//          demo(2,4,8,9,9,9,78);
            demo("Mustafa","Kunal","Arpan");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b , String ...v){
        System.out.println(a+ " "+b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
