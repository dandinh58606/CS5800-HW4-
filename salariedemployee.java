public class salariedemployee extends employee{
    private double weekly_salary;

    public salariedemployee(String firstname, String lastname, String ssn, double weekly_salary){
        super(firstname, lastname, ssn);
        this.weekly_salary = weekly_salary;
    }

    public double get_weekly(){
        return weekly_salary;
    }

    public void set_weekly(double weekly_salary){
        this.weekly_salary = weekly_salary;
    }

    public String toString(){
        return get_firstname() + " " + get_lastname() + 
           " | SSN: " + get_ssn() + 
           " | Weekly Salary: $" + String.format("%.2f", weekly_salary);
    }
}