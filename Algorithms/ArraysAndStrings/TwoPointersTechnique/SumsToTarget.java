package Algorithms.ArraysAndStrings.TwoPointersTechnique;

import java.util.Arrays;

/**
 * Given:
 *
 * a sorted array of unique integers &
 * a target integer,
 *
 * return:
 * true - if there exists a pair of numbers that sum to target,
 * false - otherwise.
 * */
public class SumsToTarget {

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 6, 8, 9, 14, 15};
        int target = 13;

        boolean result = checkIfSumsToTarget(array, target);
        System.out.println("The arry adds to the target: "+result);

    }

    protected static boolean checkIfSumsToTarget(int[] list_, int target_){

        int leftPointer = 0;
        int rightPointer = list_.length -1;

        while(leftPointer < rightPointer){

            if(list_[leftPointer] + list_[rightPointer] == target_){

                return true;
            }

            leftPointer ++;
            rightPointer --;
        }

        return false;
    }
}
