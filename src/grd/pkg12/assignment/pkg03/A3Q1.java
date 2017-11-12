/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grd.pkg12.assignment.pkg03;

/**
 *
 * @author Owner
 */
public class A3Q1 {

    // The swap method which will be used to swap two different individual values 
    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    // The selectionSort method 
    public void selectionSort(int[] array) {
        // keeping track of the position
        for (int position = 0; position < array.length; position++) {
            // first position is the lowest 
            int lowest = position;
            // continue looking for the lowest number throughout the array
            for (int i = position + 1; i < array.length; i++) {
                // Checking to see if a lower value was discovered
                if (array[i] < array[position]) {
                    // lowest value 
                    lowest = i;
                }
                // if the lowest value was attained swap into array
                if (array[lowest] < array[position]) {
                    // swap
                    swap(array, lowest, position);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q1 test = new A3Q1();
        // creating a random array of integers
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // random number
            numbers[i] = (int) (Math.random() * 99);
        }
        // BEFORE
        System.out.println("BEFORE:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // insert sorting method
        test.selectionSort(numbers);
        // AFTER
        System.out.println("AFTER:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
