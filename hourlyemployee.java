public class hourlyemployee extends employee{
    private double wage;
    private int hours_worked;

    public hourlyemployee(String firstname, String lastname, String ssn, double wage, int hours_worked){
        super(firstname, lastname, ssn);
        this.wage = wage;
        this.hours_worked = hours_worked;
    }

    public double get_wage(){
        return wage;
    }

    public int get_hours(){
        return hours_worked;
    }

    public void set_wage(double wage){
        this.wage = wage;
    }

    public void set_hours(int new_hours_worked){
        this.hours_worked = new_hours_worked;
    }

    public String toString(){
        return get_firstname() + " " + get_lastname() +
        " | SSN: " + get_ssn() + 
        " | Hourly Wage: $" + String.format("%.2f", wage) + 
        " | Hours Worked: " + hours_worked;
    }
}