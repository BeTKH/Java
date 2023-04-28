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
        String reversed = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversed);

    }


    public static String reverseString(String originalStr){

        // convert string to char array
        char[] charArray = originalStr.toCharArray();

        // create two pointers: one at the beginning and one at the end of the array
        int left = 0;
        int right = charArray.length - 1;

        // loop through the array, swapping the characters at the two pointers
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // convert the character array back to a string and return it
        return new String(charArray);

    }


}
