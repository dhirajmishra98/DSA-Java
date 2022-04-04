/**
 * LOGICAL OPERATORS
 * reads experience and salary and calculate the new salary
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter experience of employee ");
        byte exp = sc.nextByte();
        System.out.println("Enter basic pay of employee ");
        double sal = sc.nextDouble();

        if(exp>=15 && sal>=8000)
            System.out.println("New salary is : "+(sal+1500));
        else{
            if(exp<15 && sal>=6000)
                System.out.println("New salary is : "+(sal+1000));
            else
                System.out.println("New salary is : "+sal);
        }
    }
}
