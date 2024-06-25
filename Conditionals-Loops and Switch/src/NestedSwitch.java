import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int empID = in.nextInt();


        switch (empID){
            case 1:
                System.out.println("Mustafa");
                break;
            case 2:
                System.out.println("Arpan");
                break;
            case 3:
                String Department = in.next();
                System.out.println("Employee Number 3");
                switch (Department){
                    case "IT":
                        System.out.println("IT Dept");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    case "HR":
                        System.out.println("HR");
                        break;
                    default:
                        System.out.println("Enter valid Dept");
                }
                break;

            default:
                System.out.println("Enter valid EMP ID");
        }

        /*
        switch (empID) {
            case 1 -> System.out.println("Mustafa");
            case 2 -> System.out.println("Arpan");
            case 3 -> {
                String Department = in.next();
                System.out.println("Employee Number 3");
                switch (Department) {
                    case "IT" -> System.out.println("IT Dept");
                    case "Management" -> System.out.println("Management");
                    case "HR" -> System.out.println("HR");
                    default -> System.out.println("Enter valid Dept");
                }
            }
            default -> System.out.println("Enter valid EMP ID");
        }

        */

    }
}
