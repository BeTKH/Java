package MoshOOP.LooseCoupling.MethodInjection;

public class TaxReporter {


    // method injection.
    public void showTaxReport(INTFCalculator calculator){
        System.out.println("tax due via method injection :"+calculator.calculateTax());
    }

}
