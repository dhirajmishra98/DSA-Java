/**
 * COMPARING STRING OBJECTS
 * equals() and compareTo() methods illustration
 */
package ControlStatements.Programs;

import java.util.Scanner;

public class S3_6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1,str2,str3;
        System.out.println("Enter three strings : ");
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        str3 = sc.nextLine();

        System.out.println("Illustrating equals() method ");
        System.out.println("Is str1 equal to str2 ? : "+str1.equals(str2));
        System.out.println("Is str2 equal to str3 ? : "+str2.equals(str3));
        System.out.println();

        System.out.println("Illustrating compareTo() method ");
        System.out.println(">0 if str1 > str2 &&  <0 if str1 < str2 && 0 if str1==str2");
        System.out.println("0 if str1 == str2 : "+str1.compareTo(str2));
    }
}
