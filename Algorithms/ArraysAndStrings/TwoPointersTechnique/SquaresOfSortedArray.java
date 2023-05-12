package Algorithms.ArraysAndStrings.TwoPointersTechnique;


import java.util.Arrays;

/***
 *
 * Given an integer array nums sorted in increasing order,
 * return an array of the squares of each number sorted in increasing order.
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 */


public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10,12};
        System.out.println(Arrays.toString(squareNSort(arr)));

    }

    /**
     * public static int[] squareArray(int[] numArr){
     *
     *         int[] squaredArr = new int[numArr.length-1];
     *
     *         for (int i = 0; i < numArr.length-1 ; i++){
     *             squaredArr[i] = numArr[i] * numArr[i];
     *
     *         }
     *
     *         return squaredArr;
     *     }
     * */


    public static int[] squareNSort(int[] arrSQ){


        int[] result = new int[arrSQ.length];

        int leftPointer = 0;
        int rightPoiter = arrSQ.length - 1;
        int index = arrSQ.length - 1;

        while (leftPointer <= rightPoiter) {

            int leftSquare = arrSQ[leftPointer] * arrSQ[leftPointer];
            int rightSquare = arrSQ[rightPoiter] * arrSQ[rightPoiter];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                leftPointer++;
            } else {
                result[index] = rightSquare;
                rightPoiter--;
            }
            index--;
        }

        return result;


    }


}
