/**
 * THE IF-ELSE-IF STATEMENT
 * read marks of student and classifying them as distinction ,first,second,third class and unsuccessful
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class P3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the final mark of Student : ");
        float marks = sc.nextFloat();

        if(marks>=90)
            System.out.println("Distinction");
        else if(marks>=80)
            System.out.println("First");
        else if(marks>=60)
            System.out.println("Second");
        else if(marks>=40)
            System.out.println("Third");
        else
            System.out.println("Fail");
    }
}
