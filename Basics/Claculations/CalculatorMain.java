package Basics.Claculations;

public class CalculatorMain {
    public static void main(String [] args){

        // calculate average of 3 numbers
        var calc = new AvreageOfThreeCalculator();

        calc.setValues();
        calc.averageOfThree();

        // area of circle calculator
        var arc = new AreaCircleCalculator();
        arc.setRadius();
        arc.areaOfCircle();
    }
}