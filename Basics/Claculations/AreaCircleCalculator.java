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


    //areaOfCircle AverageOfThreeCalculator
    @Override
    public double calculate(){
        //System.out.println("Area of the circle is: "+radiusOfCircle * radiusOfCircle * PI);

        return radiusOfCircle * radiusOfCircle * PI;
    }
}
