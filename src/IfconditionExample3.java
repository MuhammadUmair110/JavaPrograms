//In this Program we get 2 Numbers input from the User and check the:
// Numbers are Equal, Lesser and Greater

import java.util.Scanner;

public class IfconditionExample3 {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        if (num1==num2){
            System.out.println("Both Given Numbers are Equal");
        } else if (num1 > num2) {
            System.out.println("First given Number is Greater then Second Number");
        }
        else {
            System.out.println("First given Number is Lesser then Second Number");
            }
    }
}
