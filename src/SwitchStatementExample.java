import java.util.Scanner;

public class SwitchStatementExample {
    public static void main(String[] args) {
        System.out.println("Enter the Button Number");

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1 : System.out.println("Hello");
            break;
            case 2  : System.out.println("Hi");
            break;
            case 3  : System.out.println("How are You");
            break;
        }
    }
}
