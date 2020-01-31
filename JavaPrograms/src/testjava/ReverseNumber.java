/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Scanner;

/**
 *
 * @author chamathw
 */
public class ReverseNumber {

    public static void main(String[] args) {

        int num = 0;
        int reversenum = 0;

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        while (num != 0) {

            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;

        }

        System.out.println("Reverse #: " + reversenum);

    }

}
