package Basics.Claculations;

import java.util.Scanner;

public class AverageOfThreeCalculator implements ICalculator {

    // variables
    private double value1, value2, value3;
    Scanner input = new Scanner(System.in);

    public AverageOfThreeCalculator() {
        System.out.print("The first vaule1: ");
        double value1_ = input.nextDouble();

        System.out.print("The first vaule2: ");
        double value2_ = input.nextDouble();

        System.out.print("The first value3: ");
        double value3_ = input.nextDouble();

        this.value1 = value1_;
        this.value2 = value2_;
        this.value3 = value3_;
    }



    @Override
    public double calculate(){


        //average of 3 numbers
        return (value1+value2+value3)/3;
    }



}
