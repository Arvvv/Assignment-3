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
public class A3Q4 {

    public void countingSort(int[] array) {
        // creating a tracker
        int[] tracker = new int[101];
        // for loop which will run the array
        for (int i = 0; i < array.length; i++) {
            tracker[array[i]]++;
        }
        for (int i = 0; i < tracker.length; i++) {
            for (int v = 0; v < tracker[i]; v++) {
                // printing values obtained from tracker
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // testing A3Q4
        A3Q4 test = new A3Q4();

        // creating a random array
        int[] numbers = new int[100];
        // random number 
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }
        // sorting 
        test.countingSort(numbers);
    }

}
