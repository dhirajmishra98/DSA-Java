/**
 * Take input and show to user
 */
package JavaEssentials;

import java.util.Scanner;

public class PE_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        num2 = sc.nextInt();

        System.out.println("Num1 is  "+num1);
        System.out.println("Num2 is "+num2);
    }
}
