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
public class A3Q3 {

    public int countOnes(int[] array) {
        // creating a counter and making it equal to 0
        int counter = 0;
        // this for loop will proceed throughout the array 
        for (int i = 0; i < array.length; i++) {
            // locating the value one then adjusting the value of the counter 
            if (array[i] == 1) {
                // increasing the counter value by one per how many times one was used  
                counter = counter + 1;
            }
        }
        // return the new value of the counter 
        return counter;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // testing 
        A3Q3 test = new A3Q3();
        // creating an array
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 0;
        numbers[2] = 1;
        numbers[3] = 0;
        numbers[4] = 1;
        numbers[5] = 0;
        numbers[6] = 1;
        numbers[7] = 0;
        numbers[8] = 0;
        numbers[9] = 1;
        // testing the method 
        int Q3 = test.countOnes(numbers);
        //printing the answer to Q3
        System.out.println(Q3);

    }

}
