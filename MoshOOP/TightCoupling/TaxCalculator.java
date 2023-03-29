package MoshOOP.TightCoupling;

public class TaxCalculator {

    private double taxableIncome;


    // constructor.
    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // methods

    public double calculateTax(){

        // 30% tax
        return taxableIncome * 0.3;
    }
}
