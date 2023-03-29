package MoshOOP.LooseCoupling.MethodInjection;

public class MainMethodInjection {

    public static void main(String[] args) {

        TaxCalculatorETH txCalculatorETH = new TaxCalculatorETH(50_000);
        TaxReporter txReport = new TaxReporter();

        // method injection .
        txReport.showTaxReport(txCalculatorETH);

    }
}
