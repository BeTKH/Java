package OOP.Encapsulation;

public class EmployeeMain {

    public static void main(String[] args) {

        
        Employe Johnny = new Employe();
        Johnny.setHourlyRate(23);
        Johnny.setBaseSalary(4000);

        
        //.
        System.out.println("\ncalculated wage for emplyoee object John is: "+Johnny.calculateWage(40));

        System.out.println("\ncalculated wage for emplyoee object John is: "+Johnny.calculateWage());

    }
}


