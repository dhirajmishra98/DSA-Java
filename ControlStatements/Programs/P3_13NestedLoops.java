/**
 * NESTED LOOPS
 * print Floyd's Triangle pattern
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_13NestedLoops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of Rows : ");
        int num = sc.nextInt();

        int k=1;
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                System.out.print(k+ " "); k++;
            }
            System.out.println();
        }
    }
}
