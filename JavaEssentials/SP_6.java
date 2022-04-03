/**
 * WaP to calculate area and circumference of a circle with radius r
 */
package JavaEssentials;

import java.util.Scanner;

public class SP_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle : ");
        double r = sc.nextDouble();

        System.out.println("Circumference of Circle "+(2*3.14*r));
        System.out.println("Area of Circle "+(3.14*r*r));
    }
}
