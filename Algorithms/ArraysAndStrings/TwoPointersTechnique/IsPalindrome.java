package Algorithms.ArraysAndStrings.TwoPointersTechnique;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println("enter a string to check for palindromeness: ");

        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine().trim().toLowerCase();

        boolean result = checkIfPalindrome(stringInput);
        System.out.println("The string is boolean: "+result);

    }

    public static boolean checkIfPalindrome(String s){

        int pointerLeft = 0;
        int pointerRight = s.length() -1;

        while (pointerLeft < pointerRight){

            if(s.charAt(pointerLeft) != s.charAt(pointerRight)){
                return false;
            }

            pointerLeft ++;
            pointerRight --;

        }
        return true;
    }

}



