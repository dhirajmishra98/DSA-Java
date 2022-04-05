/**
 * FOR LOOP
 * checks whether the given number is palindrome or not
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_12ForDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check palindrome : ");
        int num = sc.nextInt();

        int revnum = 0,rem=0;
        for(int i=num;i>0; i/=10){
            rem = i%10;
            revnum = revnum*10+rem;
        }
        if(revnum == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
