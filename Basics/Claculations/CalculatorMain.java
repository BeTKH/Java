package Basics.Claculations;

public class CalculatorMain {
    public static void main(String [] args){

        // calculate average of 3 numbers
        var calcAvg = new AverageOfThreeCalculator();
        var avgReport = new ResultReporter(calcAvg); // constructor injection
        avgReport.ToString();



        // area of circle calculator
        var arc = new AreaCircleCalculator();
        var areaReporter = new ResultReporter(arc); // constructor injection

        // show area
        areaReporter.ToString();

    }
}