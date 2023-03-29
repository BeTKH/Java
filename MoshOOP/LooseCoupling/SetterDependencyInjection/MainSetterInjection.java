package MoshOOP.LooseCoupling.SetterDependencyInjection;

public class MainSetterInjection {

    public static void main(String[] args) {

        var calculatorETH = new TaxCalculatorEth(50_000);

        //(constructor injection)
        var txReport = new TaxReport(calculatorETH);
        txReport.showTaxReport();

        // setter Injection.
        txReport.setCalculator(new TaxCalculatorGermany(50_000));
        txReport.showTaxReport();
    }
}
