/**
 * WHILE LOOP
 * counts and displays value in multiple of 5
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_9_10WhileDemo {
    public static void main(String[] args) {
        int n=0;
        while (n<=50){
            n+=5;
            System.out.println(n);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to reverse : ");
        int num=sc.nextInt();
        while (num!=0){
            System.out.print(num%10);
            num /= 10;
        }
    }
}
