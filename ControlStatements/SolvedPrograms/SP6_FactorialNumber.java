/**
 * WaP to calculate factorial for a given number
 */
package ControlStatements.SolvedPrograms;

import java.util.Scanner;

public class SP6_FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find Factorial ");
        int num = sc.nextInt();
        double fac = 1;
        for(int i=num;i>=1;i--)
            fac = fac*i;

        System.out.println("Factorial of "+num+ " is "+fac);
    }
}
