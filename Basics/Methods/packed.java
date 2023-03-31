package Basics.Methods;

public class packed {

    public static void main(String[] args) {

        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));
        System.out.println(isPacked(new int[]{1, 2, 1}));
        System.out.println(isPacked(new int[]{2, 1, 1}));
        System.out.println(isPacked(new int[]{-3, -3, -3}));
        System.out.println(isPacked(new int[]{0, 2, 2}));
        System.out.println(isPacked(new int[]{2, 1, 2}));

    }

    public static int isPacked( int[] a){

        int j = 0;
        for (int i = 0; i < a.length; i = j) {


            // if there is any negative value --- is NOT Basics.Methods.packed --> return 0
            if (a[i] <= 0)
                return 0;

            int count = 0;
            for (j = i; j < i + a[i]; j++) {
                if (a[i] != a[j]) {
                    return 0;
                }
            }

            for (int anA : a) {
                if (anA == a[i])
                    count++;
            }
            if (count > a[i])
                return 0;
        }

        return 1;
    }
}