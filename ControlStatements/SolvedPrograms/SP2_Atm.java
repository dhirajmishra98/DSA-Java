/**
 * WaP to read the amount to be withdrawn from an ATM. If the limit is less than 40001 the customer can
 * collect cash; otherwise the system should give an appropriate message
 */
package ControlStatements.SolvedPrograms;

import java.util.Scanner;

public class SP2_Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw ");
        int limit = sc.nextInt();

        if(limit%500 ==0 && limit<40001)
            System.out.println("Collect your cash !");
        else if(limit%500 !=0 && limit<40001)
            System.out.println("Plz enter value multiple of 500 !");
        else
            System.out.println("No sufficient balance !");
    }
}

