package OOP.Encapsulation;

public class Employe {
    private int baseSalary;
    private int hourlyRate;


    public void setBaseSalary(int baseSalary_){

        if (baseSalary_ < 0)
            throw new IllegalArgumentException("base salary can't be < 0!");
        this.baseSalary = baseSalary_;
    }

    public int getBaseSalary() {
        return baseSalary;
    }


    public void setHourlyRate(int hourlyRate) {

        if (hourlyRate < 0)
            throw new IllegalArgumentException("hourly rate can't be < 0!");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }



    // method overloading.

    public int calculateWage(int extraHours){
        return baseSalary + extraHours * hourlyRate;
    }

    public int calculateWage(){
        return baseSalary ;
    }
}
