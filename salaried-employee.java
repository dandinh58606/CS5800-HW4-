import Employee;

public class SalariedEmployee extends Employee{
    private String weekly_salary;

    public SalariedEmployee(String firstname, String lastname, String ssn, String weekly_salary){
        super(firstname, lastname, ssn);
        this.weekly_salary = weekly_salary;
    }

    public string get_weekly(){
        return weekly_salary;
    }

    public void set_weekly(String weekly_salary){
        this.weekly_salary = weekly_salary;
    }
}