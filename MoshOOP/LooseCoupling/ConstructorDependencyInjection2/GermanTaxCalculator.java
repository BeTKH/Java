package MoshOOP.LooseCoupling.ConstructorDependencyInjection2;

public class GermanTaxCalculator implements ITaxCalculator {

    private int TaxableIncome;

    // constructor x
    public GermanTaxCalculator(int TaxableIncome_){
        this.TaxableIncome = TaxableIncome_ ;
    }

    @Override
    public double CalculateTax(){
        return TaxableIncome * 0.45;
    }
}
