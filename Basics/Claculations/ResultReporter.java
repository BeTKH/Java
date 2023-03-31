package Basics.Claculations;

public class ResultReporter {


    private ICalculator icalc;

    // interface constructor
    public ResultReporter(ICalculator icalc_) {
        this.icalc = icalc_;
    }


    // display
    public void ToString(){
        System.out.println("the area is: "+icalc.calculate());
    }






}
