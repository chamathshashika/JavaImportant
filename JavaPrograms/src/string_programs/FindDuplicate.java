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
public class FindDuplicate {

    public static void main(String[] args) {

        String str = "duplicate characters";
        int count;

        char[] c = str.toCharArray();

        for (int i = 0; i < c.length; i++) {

            count = 1;

            for (int j = i + 1; j < c.length; j++) {

                if (c[i] == c[j] && c[i] != ' ') {

                    count++;
                    c[j] = '0';

                }

            }

            if (count > 1 && c[i] != '0') {

                System.out.println("Duplicate character is =" + c[i] + " Count is = " + count);

            }

        }

    }

}
