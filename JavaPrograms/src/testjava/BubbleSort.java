/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Arrays;

/**
 *
 * @author chamathw
 */
public class BubbleSort {

    private static void sortArray(int arr[]) {

        int len = arr.length;

        int temp = 0;

        for (int i = 0; i < len; i++) {

            for (int j = 1; j < (len - i); j++) {

                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];

                    arr[j - 1] = arr[j];

                    arr[j] = temp;

                }

            }

        }

    }

//    private static void sortArray(int[] arr) {
//
//        int len = arr.length;
//
//        int temp = 0;
//
//        for (int i = 0; i < len; i++) {
//
//            for (int j = 1; j < (len - i); j++) {
//
//                if (arr[j - 1] > arr[j]) {
//
//                    temp = arr[j - 1];
//
//                    arr[j - 1] = arr[j];
//
//                    arr[j] = temp;
//
//                }
//
//            }
//
//        }
//
//    }
//    private static void sortArray(int[] arr) {
//
//        int i = arr.length;
//        
//        System.out.println(i);
//        
//        int temp = 0;
//
//        for (int j = 0; j < i; j++) {
//
//            for (int k = 1; k < (i - j); k++) {
//
//                if (arr[k - 1] > arr[k]) {
//
//                    temp = arr[k - 1];
//
//                    arr[k - 1] = arr[k];
//
//                    arr[k] = temp;
//
//                }
//
//            }
//
//        }
//
//    }
    public static void main(String[] args) {

        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++");

        sortArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
