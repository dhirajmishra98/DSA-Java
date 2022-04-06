/**
 * WaP to read two integer values and display the largest
 */
package ControlStatements.SolvedPrograms;

import java.util.Scanner;

public class SP1_LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to compare ");
        int a= sc.nextInt(); int b = sc.nextInt();
        if(a>b)
            System.out.println(a+" is greater than "+b);
        else if(a<b)
            System.out.println(b+" is greater than "+a);
        else
            System.out.println(a+" is equal to "+b);
    }
}
