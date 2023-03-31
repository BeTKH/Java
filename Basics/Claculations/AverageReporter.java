package Basics.Claculations;

public class AverageReporter {

    private ICalculator icalcAvg;

    // interface constructor
    public AverageReporter(ICalculator icalc_) {
        this.icalcAvg = icalc_;
    }


    // display result
    public void ToString(){
        System.out.println("the average of the numbers is: "+ icalcAvg.calculate());
    }
}
