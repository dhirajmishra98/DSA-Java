/**
 * THE IF-ELSE STATEMENT
 * Program to check whether the given integer is even or odd using if else statement
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int num = sc.nextInt();

        if(num%2 ==0)
            System.out.println("num : "+num+" is even ");
        else
            System.out.println("num : "+num+" is odd");
    }
}
