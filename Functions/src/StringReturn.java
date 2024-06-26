public class StringReturn {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String Greeting = "Hi , how are you";
        return Greeting;
    }
}
