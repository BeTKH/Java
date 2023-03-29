package MoshOOP.LooseCoupling.SetterDependencyInjection;

public class TaxCalculatorEth implements INTaxCalculator {

    private int txableEthIncome;

    // constructor
    public TaxCalculatorEth(int txableEthIncome_){
        this.txableEthIncome = txableEthIncome_;
    }

    // calculator.
    @Override
    public double calculateTax(){
        return txableEthIncome * 0.12;
    }

}
