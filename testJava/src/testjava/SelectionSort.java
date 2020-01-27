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
public class SelectionSort {

    private static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[index]) {

                    index = j;

                }

            }

            int smallNummber = arr[index];

            arr[index] = arr[i];

            arr[i] = smallNummber;

        }

    }

    public static void main(String[] args) {

        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};

        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println();

        sort(arr1);

        for (int i : arr1) {

            System.out.print(i + " ");

        }

    }

}
