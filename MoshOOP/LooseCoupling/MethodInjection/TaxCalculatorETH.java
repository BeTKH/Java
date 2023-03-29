package MoshOOP.LooseCoupling.MethodInjection;

public class TaxCalculatorETH implements INTFCalculator{

    private int taxableIncomeInBirr;

    //constructor .
    public TaxCalculatorETH(int taxableIncomeInBirr_){
        this.taxableIncomeInBirr = taxableIncomeInBirr_;
    }


    @Override
    public double calculateTax() {
        return taxableIncomeInBirr*0.01;
    }
}
