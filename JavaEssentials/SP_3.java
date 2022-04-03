/**
 * WaP to read the values of a, b, c and display the value of x according to give equation
 */
package JavaEssentials;

import java.util.Scanner;

public class SP_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three numbers : ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        System.out.println("According to equation : "+ (a/(b-c)));
    }
}
