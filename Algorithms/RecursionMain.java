package Algorithms;

public class RecursionMain {

    public static void main(String[] args) {


        // iteration
        for (int i = 0; i < 10; i++){

            System.out.println("Iterating :"+i);
        }
        System.out.println();

        // recursion
        recurser(0);



    }

    // recusrion - a function that calls it self!
    private static int recurser(int i) {

        /**
         * baseCase - a condition that tells when to stop the recursion
         * without this the recurion will be infinite loop
         * */
        if (i > 9){
            return i;
        }

        System.out.println("Recusing :"+i);
        recurser(i+1);

        System.out.println("end of the call where i ="+i);
        return i;
    }
}
