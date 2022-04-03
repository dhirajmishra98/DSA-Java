/**
 * WaP that multiplies the value of num1 by 2, adds the value of num2 to it, and then stores the result
 * in newNum. Then the program outputs the value of newNum
 */
package JavaEssentials;

import java.util.Scanner;

public class PE_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int newNum = (num1*2)+num2;
        System.out.println("newNum is "+newNum);
    }
}
