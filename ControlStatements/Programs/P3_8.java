/**
 * SWITCH CASE
 * illustrating switch case showing grades of students as done earlier
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter final grade of student ");
        char mark = sc.next().charAt(0);
        switch (mark){
            case 'D' -> System.out.println("Distinction");
            case 'F' -> System.out.println("First");
            case 'S' -> System.out.println("Second");
            case 'T' -> System.out.println("Third ");
            default -> System.out.println("Fail");
        }
    }
}
