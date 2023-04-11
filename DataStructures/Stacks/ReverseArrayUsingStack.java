package DataStructures.Stacks;
import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {

        // create an arry
        int[] listNum = { 100, 200, 300, 400 };

        System.out.println("Before REV: "+Arrays.toString(listNum));

        int[] revArr = reverseArray(listNum);

        System.out.println("After  Rev: "+Arrays.toString(revArr));

    }

    // method that reverse an arry

    public static int[] reverseArray(int[] list_){

        // create stack object
        Stack<Integer> stk = new Stack<Integer>();

        // insert into the stack
        for (int i = 0; i < list_.length ; i++){
            stk.push(list_[i]);
        }

        // from the stack back to the arry
        for (int j = 0; j < list_.length ; j++){

            // take the top element from the stack and store in the array
            list_[j] = stk.pop();
        }

        return list_;

    }

}
