package Basics.Claculations;

public class CalculatorMain {
    public static void main(String [] args){

        // calculate average of 3 numbers
        var calcAvg = new AverageOfThreeCalculator();
        var avgReport = new AverageReporter(calcAvg); // constructor injection

        System.out.println(avgReport.toString());      // display result using toString()



        // area of circle calculator
        var calcArc = new AreaCircleCalculator();
        var areaReport = new AreaReporter(calcArc); // constructor injection

        // show area
        areaReport.ToString();

    }
}