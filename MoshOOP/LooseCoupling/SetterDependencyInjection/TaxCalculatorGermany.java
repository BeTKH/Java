package MoshOOP.LooseCoupling.SetterDependencyInjection;

public class TaxCalculatorGermany implements INTaxCalculator{

    private int taxableIncome;

    // constructor.
    public TaxCalculatorGermany(int taxableIncome_){
        this.taxableIncome =taxableIncome_;
    }

    @Override
    public double calculateTax() {
        return taxableIncome *0.45;
    }
}
