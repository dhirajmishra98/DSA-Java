/**
 * WaP that prompts the user to input length and width of a rectangle and then prints the rectangles
 * perimeter and area.
 */
package JavaEssentials;

import java.util.Scanner;

public class PE_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length and breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Perimeter of Rectangle : "+(2*(l+b)));
        System.out.println("Area of Rectangle : "+(l*b));
    }
}
