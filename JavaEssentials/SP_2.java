/**
 * Write a program that inputs the number of hours that an employee works and the employee's
 * hourly wage. Then display the employee gross pay.
 */
package JavaEssentials;

import java.util.Scanner;

public class SP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours worked and wages respectively : ");
        int hour,wage;
        hour = sc.nextInt();
        wage = sc.nextInt();

        System.out.println("The #hours employee worked : "+hour);
        System.out.println("The #wages employee get per hour : "+wage);
        System.out.println("The Gross Pay employee should get : "+(hour*wage));
    }
}
