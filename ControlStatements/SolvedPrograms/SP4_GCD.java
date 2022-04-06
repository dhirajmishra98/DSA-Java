/**
 * WaP to find the Greatest Common Divisor of Two given numbers
 */
package ControlStatements.SolvedPrograms;

import java.util.Scanner;

public class SP4_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to find GCD ");
        int a=sc.nextInt(); int b = sc.nextInt();

        int ans = 1;
//          first approach
//        for(int i=2;i<=Math.min(a,b);i++){
//            if(a%i==0 && b%i==0)
//                ans = i;
//        }
//        System.out.println("GCD is "+ans);

//        second approach
        while (a!=b){
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        System.out.println("GCD is "+a);

    }
}
