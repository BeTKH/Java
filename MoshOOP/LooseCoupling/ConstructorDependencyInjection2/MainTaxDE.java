package MoshOOP.LooseCoupling.ConstructorDependencyInjection2;

public class MainTaxDE {

    public static void main(String[] args) {

        GermanTaxCalculator taxCalcDE = new GermanTaxCalculator(50_000);
        TaxReport taxRepDE = new TaxReport(taxCalcDE);
        taxRepDE.showTaxReport();
        // sh

        SaudiTaxCalculator taxCalcSauD = new SaudiTaxCalculator(50_000);
        TaxReport taxRepSauD = new TaxReport(taxCalcSauD);
        taxRepSauD.showTaxReport();

    }
}
