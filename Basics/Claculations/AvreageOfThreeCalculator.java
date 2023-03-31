package Basics.Claculations;

import java.util.Scanner;

public class AvreageOfThreeCalculator {

    // variables
    private double value1, value2, value3;

    // setter
    public void setValues() {

        Scanner input = new Scanner(System.in);

        System.out.print("The first vaule1: ");
        double value1_ = input.nextDouble();
        this.value1 = value1_;

        System.out.print("The first vaule2: ");
        double value2_ = input.nextDouble();
        this.value2 = value2_;

        System.out.print("The first value3: ");
        double value3_ = input.nextDouble();
        this.value3 = value3_;
    }


    public void  averageOfThree(){

        double average =  (value1+value2+value3)/3;
        System.out.println("The average is: "+average);
    }



}
