/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_programs;

import java.util.Scanner;

/**
 *
 * @author chamathw
 */
public class AddTwoNumber {

    public static void main(String[] args) {

        /**
         * First Example: Sum of two numbers
         */
        int num1 = 100, num2 = 50, sum;

        sum = num1 + num2;

        System.out.println("Total = " + sum);

        /**
         * Second Example: Sum of two numbers using Scanner
         */
        int i, j, k;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First #");

        i = sc.nextInt();

        System.out.println("Enter Second #");

        j = sc.nextInt();

        k = i + j;

        System.out.println("Total = " + k);
        
        sc.close();

    }

}
