/**
 * WaP to calculate the roots of a quadratic equation
 */
package ControlStatements.SolvedPrograms;

import java.util.*;

public class SP3_QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a,b,c of quadratic equation ");
        double a = sc.nextDouble(); double b= sc.nextDouble(); double c= sc.nextDouble();

        double determinant = Math.pow(b,2) - (4*a*c);
        double alpha,beta;
        if(determinant>0){
            alpha = (-b+Math.sqrt(determinant))/(2*a);
            beta = (-b-Math.sqrt(determinant))/(2*a);
            System.out.println("Roots are REAL and DISTINCT ");
            System.out.println("Root1 : "+alpha+ " Root2 : "+beta);
        }
        else if(determinant == 0){
            alpha = -b/(2*a);
            System.out.println("Roots are REAL and EQUAL ");
            System.out.println("Root1 : "+alpha+" Root2 : "+alpha);
        }
        else{
            alpha = -b/(2*a);
            beta = Math.sqrt(-determinant)/(2*a);
            System.out.println("Roots are IMAGINARY and UNEQUAL ");
            System.out.println("Root1 : "+alpha+"+"+beta+"i"+ " Root2 : "+alpha+"-"+beta+"i");
        }
    }
}
