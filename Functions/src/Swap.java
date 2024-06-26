public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        System.out.println(a + " "+b);

        // swap numbers code
//        int temp = a;
//        a=b;
//        b=temp;
        swap(a,b);
        System.out.println(a + " "+b);
        String name = "Kunal";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam){
        naam = "Rahul";
        System.out.println(naam);
    }
    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }
}
