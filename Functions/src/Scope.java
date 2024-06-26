public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        {
//            int a = 30; // already initialised outside the block in the same method , hence cannot initialose agai
            a = 80; // reassgin original ref variable to other value
            int c = 99;
            System.out.println(a);
            // values initialised inside the block remain inside the block
        }
        System.out.println(a);
//        System.out.println(num); Will give an error since variable is inside the function

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
