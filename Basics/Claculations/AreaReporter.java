package Basics.Claculations;

public class AreaReporter {


    private ICalculator icalcAreaC;

    // interface constructor
    public AreaReporter(ICalculator icalc_) { // constructor injection
        this.icalcAreaC = icalc_;
    }

    // display result

    public void ToString(){
        System.out.println("the area of the circle is: "+ icalcAreaC.calculate());
    }

}
