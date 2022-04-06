/**
 * WaP to read a number and a digit and determine whether the first number contains the digit.
 * If so, count how many times the digit is in number.
 */
package ControlStatements.SolvedPrograms;

import java.util.Scanner;

public class SP8_DigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Enter a digit ");
        int digit = sc.nextInt();

        int count=0,rem;
        int original = num;
        while (num>0){
            int d = num%10;
            if(d == digit)
                count++;
            num/=10;
        }
        System.out.println("Digit "+digit+" occurs "+count+" times "+" in "+original);
    }
}
