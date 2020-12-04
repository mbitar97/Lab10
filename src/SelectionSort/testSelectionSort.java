package SelectionSort;

/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {

    SelectionSort temp = new SelectionSort();

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        //sorting the array
        arr = temp.basicSelectionSort(arr);
        //adding assertions:
        assertTrue("index 0 is wrong, it should be " + Sortedarr[0] + " but it is " + arr[0] , arr[0] == Sortedarr[0]);
        assertTrue("index 1 is wrong, it should be " + Sortedarr[1] + " but it is " + arr[1] , arr[1] == Sortedarr[1]);
        assertTrue("index 2 is wrong, it should be " + Sortedarr[2] + " but it is " + arr[2] , arr[2] == Sortedarr[2]);
        assertTrue("index 3 is wrong, it should be " + Sortedarr[3] + " but it is " + arr[3] , arr[3] == Sortedarr[3]);
        assertTrue("index 4 is wrong, it should be " + Sortedarr[4] + " but it is " + arr[4] , arr[4] == Sortedarr[4]);
    }

    public void testNegative(){

        /** Test data contains negative values only **/
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        /** add tests to check for this unit test **/
        //sorting the array
        arr = temp.basicSelectionSort(arr);
        //adding assertions:
        assertTrue("index 0 is wrong, it should be " + Sortedarr[0] + " but it is " + arr[0] , arr[0] == Sortedarr[0]);
        assertTrue("index 1 is wrong, it should be " + Sortedarr[1] + " but it is " + arr[1] , arr[1] == Sortedarr[1]);
        assertTrue("index 2 is wrong, it should be " + Sortedarr[2] + " but it is " + arr[2] , arr[2] == Sortedarr[2]);
        assertTrue("index 3 is wrong, it should be " + Sortedarr[3] + " but it is " + arr[3] , arr[3] == Sortedarr[3]);
        assertTrue("index 4 is wrong, it should be " + Sortedarr[4] + " but it is " + arr[4] , arr[4] == Sortedarr[4]);
    }

    public void testMixed(){

        /** Test data contains with both positive, negative and zeros **/
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;

        /** add tests to check for this unit test **/
        //sorting the array
        arr = temp.basicSelectionSort(arr);
        //adding assertions:
        assertTrue("index 0 is wrong, it should be " + Sortedarr[0] + " but it is " + arr[0] , arr[0] == Sortedarr[0]);
        assertTrue("index 1 is wrong, it should be " + Sortedarr[1] + " but it is " + arr[1] , arr[1] == Sortedarr[1]);
        assertTrue("index 2 is wrong, it should be " + Sortedarr[2] + " but it is " + arr[2] , arr[2] == Sortedarr[2]);
        assertTrue("index 3 is wrong, it should be " + Sortedarr[3] + " but it is " + arr[3] , arr[3] == Sortedarr[3]);
        assertTrue("index 4 is wrong, it should be " + Sortedarr[4] + " but it is " + arr[4] , arr[4] == Sortedarr[4]);
    }

    public void testDuplicates(){

        /** Test data contains duplicates **/
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 7;
        arr[2] = 7;
        arr[3] = -2;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 7;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;

        /** add tests to check for this unit test **/
        //sorting the array
        arr = temp.basicSelectionSort(arr);
        //adding assertions:
        assertTrue("index 0 is wrong, it should be " + Sortedarr[0] + " but it is " + arr[0] , arr[0] == Sortedarr[0]);
        assertTrue("index 1 is wrong, it should be " + Sortedarr[1] + " but it is " + arr[1] , arr[1] == Sortedarr[1]);
        assertTrue("index 2 is wrong, it should be " + Sortedarr[2] + " but it is " + arr[2] , arr[2] == Sortedarr[2]);
        assertTrue("index 3 is wrong, it should be " + Sortedarr[3] + " but it is " + arr[3] , arr[3] == Sortedarr[3]);
        assertTrue("index 4 is wrong, it should be " + Sortedarr[4] + " but it is " + arr[4] , arr[4] == Sortedarr[4]);
    }


}
