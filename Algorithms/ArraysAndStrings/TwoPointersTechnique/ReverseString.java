package Algorithms.ArraysAndStrings.TwoPointersTechnique;


/**
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * */
public class ReverseString {


    public static void main(String[] args) {

        String originalString = "Hello world";
        char[] originalCharArr = originalString.toCharArray();

        System.out.println("Original String: " + originalString);
        reverseString(originalCharArr);




    }


    public static void reverseString(char[] s){



        // create two pointers: one at the beginning and one at the end of the array
        int left = 0;
        int right = s.length - 1;

        // loop through the array, swapping the characters at the two pointers
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

        // convert array to string

        System.out.println("Reversed String: " + String.valueOf(s));

    }


}
