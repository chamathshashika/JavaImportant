/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_programs;

/**
 *
 * @author chamathw
 */
public class ConvertChatToStringAndStringToChar {

    public static void main(String[] args) {

        /**
         * Program to convert char to String
         *
         * Method 1: Using toString() method
         */
        char c = 'a';

        String s = Character.toString(c);

        System.out.println("String is " + s);

        /**
         * Method 2: Usng valueOf() method
         */
        String v = String.valueOf(c);

        System.out.println("String is " + v);

        /**
         * ************************************************************
         */
        /**
         * Converting String to Char
         */
        String str = "HelloWorld";

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            System.out.println("Charactor is " + ch[i]);

        }

        /**
         * Using charAt() method
         */
        for (int i = 0; i < str.length(); i++) {
            char chs = str.charAt(i);
            System.out.println("Character at " + i + " Position: " + chs);
        }

    }

}
