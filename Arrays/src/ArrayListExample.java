import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        Scanner in = new Scanner(System.in);

//        list.add(65);
//        list.add(78);
//        list.add(45);
//        list.add(89);
//        list.add(12);
//        list.add(189);
//        list.add(178);
//        list.add(152);
//        list.add(152);
//        list.add(152);

        // input

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //getting item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass index . list[index] wont work here, will give and error
        }
        System.out.println();
        System.out.println(list);
    }
}
