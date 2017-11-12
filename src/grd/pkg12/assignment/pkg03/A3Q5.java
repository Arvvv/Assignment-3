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
public class A3Q5 {

    public void Swap(String[] array, int positionOne, int positionTwo) {
        String temporary = array[positionOne];
        array[positionOne] = array[positionTwo];
        array[positionTwo] = temporary;
    }

    // the InsertionSortAlphabetical method will sort the words alphabetically
    public void InsertionSortAlphabetical(String[] array) {
        // proceeding through the array 
        for (int i = 0; i < array.length - 1; i++) {
            // saving this position 
            int position = i;

            while (position >= 0 && array[position].compareTo(array[position + 1]) > 0) {
                // swap down if it is not in the right order
                Swap(array, position, position + 1);
                position--;
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // testing A3Q5
        A3Q5 test = new A3Q5();
        // creating an array of words 
        String words[] = new String[4];
        words[0] = "stop";
        words[1] = "like";
        words[2] = "nope";
        words[3] = "yeah";

        // using the method to sort the array of words alphabetically
        test.InsertionSortAlphabetical(words);

        for (int i = 0; i < words.length; i++) {
            // printing the array of words
            System.out.println(words[i]);
        }
    }

}
