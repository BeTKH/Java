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

        int[] arr = {-4,-1,0,3,10};



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


    public static int[] squareNSort(int[] nums){


        int[] squaredArray = new int[nums.length];

        int i =0;

        for(int num:nums){
            squaredArray[i++] = num *num;
        }

        Arrays.sort(squaredArray);
        return squaredArray;



    }


}
