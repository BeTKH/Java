package Basics.Methods;

public class GetExponent {

    // main method
    public static void main(String[] args) {


        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(280, 7));
        System.out.println(getExponent(-250, 5));
        System.out.println(getExponent(18, 1));
        System.out.println(getExponent(128, 4));

    }


    public static int getExponent(int n , int p){

        if (p <= 1)
            return -1;
        int count = 0;
        n = n > 0 ? n : -n;
        for (int num = n; num > 0; num /= p) {
            if (num % p == 0)
                count++;
            else break;
        }
        return count;
    }
}