package MoshOOP.LooseCoupling.SetterDependencyInjection;

public class TaxReport {


    private INTaxCalculator calculator;

    // constructor - setup constructor injection
    public TaxReport(INTaxCalculator calculator_){
        this.calculator = calculator_;
    }

    // method.
    public void showTaxReport(){

        var tax = calculator.calculateTax();
        System.out.println("Tax Report via setter injection: "+tax);
    }


    // public void showTaxReport(INTaxCalculator calculator){
    //    System.out.println("tax due via method injection :"+calculator.calculateTax());
    // }


    // setter - setup setter injection
    public void setCalculator(INTaxCalculator calculator_) {
        this.calculator = calculator_;
    }


}
