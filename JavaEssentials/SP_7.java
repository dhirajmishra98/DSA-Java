/**
 * WaP to calculate simple interest for the given principal, rate of interest and number of years
 */
package JavaEssentials;

import java.util.Scanner;

public class SP_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t; double p,r;
        System.out.print("Enter principal , time, rate respectively : ");
        p = sc.nextDouble();
        t = sc.nextInt();
        r = sc.nextDouble();

        double si = (p*t*r)/100;
        System.out.println("Simple Interest : "+ si);
    }
}
