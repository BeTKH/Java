package Algorithms;

public class RecursionMain {

    public static void main(String[] args) {


        // iteration
        for (int i = 0; i < 10; i++){

            System.out.println("Iterating :"+i);
        }
        System.out.println("");

        // recursion
        recurser(1);



    }

    private static int recurser(int i) {

        if (i > 10){
            return i;
        }

        System.out.println("Recusing :"+i);
        recurser(i+1);
        return i;
    }
}
