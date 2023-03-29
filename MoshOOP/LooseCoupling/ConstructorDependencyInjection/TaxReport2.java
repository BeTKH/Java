package MoshOOP.LooseCoupling.ConstructorDependencyInjection;

public class TaxReport2 {

    // taxReport2 class must depend on Interface
    // rather than TaxCalculator2018 class

    // (removed) private TaxCalculator2018 calculator2;
    private InterfaceTaxCalculator calculator2;



    // constructr
    public TaxReport2(InterfaceTaxCalculator calculator2_){  // constructor injection step

        this.calculator2 = calculator2_;
        // (removed) calculator2 = new TaxCalculator2018(5000);  // creates tight-coupling - removed!!!
    }


    // method

    public void show2(){
        System.out.println("your Tax is: "+calculator2.calculateTax20xx());
    }

}
