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
}