/**
 * THE IF STATEMENT
 * works on billing for a customer who purchase dress material from a retail shop. for every purchase of
 * more than Rs. 5000 the retailer permits a 10% discount
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of total purchase : ");
        int purchase = sc.nextInt();

        if(purchase >= 5000){
            System.out.println("Total purchase = "+purchase);
            System.out.println("Discount = "+(purchase*0.1));
            System.out.println("Total amount to be paid = "+(purchase - (purchase*0.1)));
        }
    }
}
