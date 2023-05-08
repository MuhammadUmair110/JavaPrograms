//Basic Calculater Program

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {

        System.out.println("Enter two Numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("For adding the Number Press 1");
        System.out.println("For subtraction Press 2");
        System.out.println("For Multiplication Press 3");
        System.out.println("For Division Press 4");
        System.out.println("For Modulo Press 5");

        int button = sc.nextInt();

        switch (button) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5 : System.out.println(a%b);
            break;
            default :
                System.out.println("You Press the wrong Number");
        }

    }
}
