public class Shadow {
    static int x = 90; // will be shadowed ahead in main method
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // the class variable at line 2 is shadowed by this.
        System.out.println(x); // 40
    }

    static void fun()
    {
        System.out.println(x);
    }
}
