package MoshOOP.TightCoupling;


public class TaxReport {

    private TaxCalculator calculator;

    // constructor
    public TaxReport(){



        /*.
         * Decoupling via Dependency Injection:
         *
         * - classes should not instantiate their dependents i.e.
         * - TaxRep class should not depend on TaxCalculator2018 class
         * - TaxRep class Should not CREATE calculate object
         * - The responsibility of creating calculator object will be given to another class (MainTaxDE)
         * - The other class (usually MainTaxDE) is responsible  for INJECTING DEPENDENCY
         * - TaxRep class Only USE calculator object
         * - we should not create instance of TaxCalculator2018 in TaxRep
         *
         *
         * Various ways of INJECTING DEPENDENCIES
         *   - constructor Injection - pass dependencies via constructor of a class
         *   - setter Injection - pass dependency via setter
         *   - Method Injection - pass dependency using a regular method
         * */

        calculator = new TaxCalculator(5000);  // created tight-coupling | deprecated!!!
    }


    // Method showing tax report
    public void showTaxReport(){
        var tax = calculator.calculateTax();
        System.out.println("calculated tax is: "+tax);
    }
}
