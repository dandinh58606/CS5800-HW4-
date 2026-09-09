import employee;

public class salariedemployee extends employee{
    private String weekly_salary;

    public salariedemployee(String firstname, String lastname, String ssn, String weekly_salary){
        super(firstname, lastname, ssn);
        this.weekly_salary = weekly_salary;
    }

    public String get_weekly(){
        return weekly_salary;
    }

    public void set_weekly(String weekly_salary){
        this.weekly_salary = weekly_salary;
    }
}