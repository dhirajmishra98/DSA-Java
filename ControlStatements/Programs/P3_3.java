/**
 * NESTED IF STATEMENTS
 * illustrates the use of nested if statement by reading the experience and salary and calculates
 * new salary --> refer book for full question
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter experience of employee : ");
        byte exp = sc.nextByte();
        System.out.println("Enter basic salary of employee : ");
        double salary = sc.nextDouble();

        if(exp>=15){
            if(salary>=8000)
                System.out.println("New salary of employee : "+(salary+1500));
        }
        else{
            if(salary>=6000)
                System.out.println("New salary of employee : "+(salary+1000));
        }
    }
}
