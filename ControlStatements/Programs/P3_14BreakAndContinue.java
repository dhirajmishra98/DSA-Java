/**
 * BREAK AND CONTINUE STATEMENTS
 * 1. Adds the entered integers continuously and terminates when 0 is entered
 * 2. Adds the positive numbers and neglects 0 and negative values.
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_14BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter numbers : ");
            int num = sc.nextInt();
            if(num == 0)
                break;
            else
                sum = sum+num;
        }
        System.out.println("Sum is "+sum);
        cont();
    }
    public static void cont(){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<10;i++){
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            if(num == 0)
                continue;
            if(num<0)
                continue;
            if (num>0)
                sum = sum+num;
        }
        System.out.println("Sum is "+sum);
    }
}
