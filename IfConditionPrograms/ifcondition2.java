//Check the number is even or odd

import java.util.Scanner;

public class ifcondition2 {
    public static void main(String[] args) {

        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
