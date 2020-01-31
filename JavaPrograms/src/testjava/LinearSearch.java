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
public class LinearSearch {

    public static void main(String[] args) {

        int num, val, search, i;

        System.out.println("Enter # of elements...");

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter values...");

        for (i = 0; i < num; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter search value...");

        search = sc.nextInt();

        for (i = 0; i < arr.length; i++) {

            if (arr[i] == search) {

                System.out.println("Found value = " + arr[i] + "& index is = " + i);

                break;

            }

        }

        if (num == i) {
            System.out.println("Not found");
        }
        sc.close();

    }

}
