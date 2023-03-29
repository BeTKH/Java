package MoshOOP.LooseCoupling.ConstructorDependencyInjection2;

public class TaxReport {

    private ITaxCalculator taxCalculator;


    // constructor .
    public TaxReport(ITaxCalculator taxCalculator_){

        this.taxCalculator = taxCalculator_;
    }

    // method to generate taxReport
    public void showTaxReport(){

        System.out.println("Your tax due is: "+taxCalculator.CalculateTax());
    }
}
