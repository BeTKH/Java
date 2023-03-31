package Basics.Claculations;

import java.util.Scanner;

public class AreaCircleCalculator implements ICalculator {

    // Area of Circle
    final double PI = 3.14159;
    private double radiusOfCircle;


    // constructor
    public AreaCircleCalculator() {

        Scanner input = new Scanner(System.in);
        System.out.print("\nenter radius of the circle: ");

        double radiusOfCircle_ = input.nextDouble();
        this.radiusOfCircle = radiusOfCircle_;
    }


    // calculate area of the circle
    @Override
    public double calculate(){

        return radiusOfCircle * radiusOfCircle * PI;
    }
}
