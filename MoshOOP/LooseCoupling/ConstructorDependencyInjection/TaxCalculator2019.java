package MoshOOP.LooseCoupling.ConstructorDependencyInjection;

public class TaxCalculator2019 implements InterfaceTaxCalculator {

    private double taxableIncome2019;

    // settr
    public TaxCalculator2019(double taxableIncome2019_) {
        this.taxableIncome2019 = taxableIncome2019_;
    }

    @Override  // tells the JAVAC this method is an implementation of method declared in the interface
    public double calculateTax20xx(){

        // 25% Tax
        return taxableIncome2019 * 0.20;
    }
}
