package Basics.Claculations;

public class CalculatorMain {
    public static void main(String [] args){

        // calculate average of 3 numbers
        var calcAvg = new AverageOfThreeCalculator();
        var avgReport = new AverageReporter(calcAvg); // constructor injection
        avgReport.ToString();



        // area of circle calculator
        var calcArc = new AreaCircleCalculator();
        var areaReporter = new AreaReporter(calcArc); // constructor injection

        // show area
        areaReporter.ToString();

    }
}