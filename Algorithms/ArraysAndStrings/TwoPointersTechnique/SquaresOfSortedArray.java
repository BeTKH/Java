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

        int[] sqArr = squareArray(arr);

        System.out.println(Arrays.toString(sqArr));

        System.out.println(Arrays.toString(sortArr(sqArr)));

    }


    public static int[] squareArray(int[] numArr){

        int[] squaredArr = new int[numArr.length-1];

        for (int i = 0; i < numArr.length-1 ; i++){
            squaredArr[i] = numArr[i] * numArr[i];

        }

        return squaredArr;
    }


    public static int[] sortArr(int[] arrSQ){

        int n = arrSQ.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, index = n - 1;

        while (left <= right) {
            //int leftSquare = arrSQ[left] * arrSQ[left];
            //int rightSquare = arrSQ[right] * arrSQ[right];

            if (arrSQ[left] > arrSQ[right]) {
                result[index] = arrSQ[left];
                left++;
            } else {
                result[index] = arrSQ[right];
                right--;
            }
            index--;
        }

        return result;


    }


}
