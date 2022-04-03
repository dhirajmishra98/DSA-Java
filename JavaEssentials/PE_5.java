/**
 * WaP that prompts the user to input a five digit positive integer. The program then outputs the digit
 * of number, one digit per line without using a loop structure. for example , if input is 12345
 * then output is
 *1
 * 2
 * 3
 * 4
 * 5
 */
package JavaEssentials;

import java.util.Scanner;

public class PE_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 digit number : ");
        int num = sc.nextInt();
        System.out.println(num%10); num/=10;
        System.out.println(num%10); num/=10;
        System.out.println(num%10); num/=10;
        System.out.println(num%10); num/=10;
        System.out.println(num%10); num/=10;
    }
}
