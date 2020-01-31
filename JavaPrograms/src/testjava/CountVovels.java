/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

/**
 *
 * @author chamathw
 */
public class CountVovels {

    static String str = "BeginnersBook45";

    static int vcount, nocount = 0;

    public static void main(String[] args) {

        char[] c = str.toLowerCase().toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {

                vcount++;

            } else if (c[i] >= 'a' && c[i] <= 'z') {

                nocount++;

            }

        }

//        str = str.toLowerCase();
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char c = str.charAt(i);
//
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//
//                vcount++;
//
//            } else if (c >= 'a' && c <= 'z') {
//
//                nocount++;
//
//            }
//
//        }
//        
        System.out.println("v count = " + vcount + " | no count = " + nocount);

    }

}
