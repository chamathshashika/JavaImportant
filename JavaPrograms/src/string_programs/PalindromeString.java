/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_programs;

import java.util.Scanner;

/**
 *
 * @author chamathw
 */
public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String change = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            change = change + str.charAt(i);

        }

        if (str.equals(change)) {

            System.out.println("String is a palindrome.");

        } else {

            System.out.println("String is not a palindrome.");

        }

    }

}
//Program 1: Palindrome check Using Stack
//        System.out.print("Enter any string:");
//        Scanner in=new Scanner(System.in);
//        String inputString = in.nextLine();
//        Stack stack = new Stack();
//
//        for (int i = 0; i < inputString.length(); i++) {
//            stack.push(inputString.charAt(i));
//        }
//
//        String reverseString = "";
//
//        while (!stack.isEmpty()) {
//            reverseString = reverseString+stack.pop();
//        }
//
//        if (inputString.equals(reverseString))
//            System.out.println("The input String is a palindrome.");
//        else
//            System.out.println("The input String is not a palindrome.");

//Program 2: Palindrome check Using Queue
//        System.out.print("Enter any string:");
//        Scanner in=new Scanner(System.in);
//        String inputString = in.nextLine();
//        Queue queue = new LinkedList();
//
//        for (int i = inputString.length()-1; i >=0; i--) {
//            queue.add(inputString.charAt(i));
//        }
//
//        String reverseString = "";
//
//        while (!queue.isEmpty()) {
//            reverseString = reverseString+queue.remove();
//        }
//        if (inputString.equals(reverseString))
//            System.out.println("The input String is a palindrome.");
//        else
//            System.out.println("The input String is not a palindrome.");


//Program 3: Using while loop
//        int i = str.length() - 1;
//        while (i >= 0) {
//
//            change = change + str.charAt(i);
//
//            i--;
//
//        }


