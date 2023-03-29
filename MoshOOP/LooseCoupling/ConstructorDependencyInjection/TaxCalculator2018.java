package MoshOOP.LooseCoupling.ConstructorDependencyInjection;


// interface implementation
public class TaxCalculator2018 implements InterfaceTaxCalculator {

    private int taxableIncome2018;


    // constr
    public TaxCalculator2018(int taxableIncome_) {

        this.taxableIncome2018 = taxableIncome_;
    }

    @Override  // tells the JAVAC this method is an implementation of method declared in the interface
    public double calculateTax20xx(){

        // 25% Tax
        return taxableIncome2018 * 0.25;
    }
}
