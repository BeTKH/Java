package Basics.Claculations;

import java.util.Scanner;

public class AreaCircleCalculator {

    // Area of Circle
    final double PI = 3.14159;
    private double radiusOfCircle;



    public void setRadius(){


        System.out.print("\nenter radius of the circle: ");

        Scanner input = new Scanner(System.in);
        double radiusOfCircle_ = input.nextDouble();
        this.radiusOfCircle = radiusOfCircle_;


    }

    //areaOfCircle AvreageOfThreeCalculator
    public void areaOfCircle(){
        System.out.println("Area of the circle is: "+radiusOfCircle * radiusOfCircle * PI);;
    }
}
