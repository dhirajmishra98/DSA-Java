/**
 * WaP to convert given temperature in Fahrenheit to Celsius
 * c = (5/9)*(f-32);
 */
package JavaEssentials;

import java.util.Scanner;

public class SP_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f,c;
        System.out.print("Enter temperature in Fahrenheit : ");
        f = sc.nextDouble();
        c = 5.0/9.0 * (f-32);
        System.out.println("Temperature in Celsius : "+c);
    }
}
