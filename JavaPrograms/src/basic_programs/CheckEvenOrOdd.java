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
public class CheckEvenOrOdd {

    public static void main(String[] args) {

        System.out.println("Enter your number...");

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        
        sc.close();

    }

}
