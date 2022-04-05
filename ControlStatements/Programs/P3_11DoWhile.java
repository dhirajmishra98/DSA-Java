/**
 * DO-WHILE LOOP
 * finds the factor of a given number
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_11DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to find factor : ");
        int num = sc.nextInt();
        int d = 2;
        do{
            if(num%d == 0)
                System.out.print(d+" ");
            ++d;
        }while (d<=num/2);
    }
}
