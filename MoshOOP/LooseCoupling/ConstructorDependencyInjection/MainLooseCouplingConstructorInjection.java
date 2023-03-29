package MoshOOP.LooseCoupling.ConstructorDependencyInjection;

public class MainLooseCouplingConstructorInjection {

    public static void main(String[] args) {
        // tax  for year 2018
        TaxCalculator2018 calc2018 = new TaxCalculator2018(100_000);

        TaxReport2 txRep2018 = new TaxReport2(calc2018); // inject calculator obj
        txRep2018.show2();

        // TaxCalculator2018 class and TaxReport2 class are isolated!!!


        // tax for year 2019
        TaxCalculator2019 calc2019 = new TaxCalculator2019(200_000);
        TaxReport2 txRep2019 = new TaxReport2(calc2019);   // inject calculator object
        txRep2019.show2();

        // TaxCalculator2019 class and TaxReport2 class are isolated!!!


        /*
         * MANUAL DEPENDENCY INJECTION aka Poor Man's Dependency Injection
         *
         * - is not scalable
         * - for large applications we must use !!Dependency Injection frameworks!!
         * - examples of  Dependency Injection frameworks
         *       - spring
         *
         */
    }
}
