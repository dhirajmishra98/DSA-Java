/**
 * Write a program that asks the user to enter two numbers, obtains the two numbers from the user and prints
 * the sum, product, difference, and quotient of two numbers.
 */
package JavaEssentials;
import java.util.*;

public class SP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first num : ");
        a = sc.nextInt();
        System.out.print("Enter second num : ");
        b = sc.nextInt();

        System.out.println("Required Outputs for : "+a+" "+b);
        System.out.println("Addition : "+(a+b));
        System.out.println("Difference : "+(a-b));
        System.out.println("product : "+(a*b));
        System.out.println("Quotient : "+(a/b));
    }
}
