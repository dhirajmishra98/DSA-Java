package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The sum of digits of "+num+" is : "+sumOfDigits(num));
    }
    static int sumOfDigits(int n){
        if(n<0)
            return -1;
        if(n == 0)
            return 0;
        else
            return (n%10)+sumOfDigits(n/10);
    }
}
