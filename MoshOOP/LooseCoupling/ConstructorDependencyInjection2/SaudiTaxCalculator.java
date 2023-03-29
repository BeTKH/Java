package MoshOOP.LooseCoupling.ConstructorDependencyInjection2;

public class SaudiTaxCalculator implements ITaxCalculator {

    private int taxableIncome;

    public SaudiTaxCalculator(int taxableIncome_){
        this.taxableIncome = taxableIncome_;
    }

    //marker
    @Override
    public double CalculateTax(){
        return taxableIncome * 0;
    }
}
