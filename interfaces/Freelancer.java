package interfaces;

public class Freelancer implements Payable{
    private String firstname;
    private String lastname;
    private double hourly_rate;
    private double hours_worked;

    public Freelancer(String first, String last, double hour_rate, double working_hours){
        this.firstname = first;
        this.lastname = last;
        set_hourly_rate(hour_rate);
        set_working_hours(working_hours);
    }

    public String get_first_name(){
        return firstname;
    }

    public void set_first_name(String new_first_name){
        this.firstname = new_first_name;
    }

    public String get_last_name(){
        return lastname;
    }

    public void set_last_name(String new_last_name){
        this.lastname = new_last_name;
    }

    public double get_hourly_rate(){
        return hourly_rate;
    }

    public void set_hourly_rate(double new_hourly_rate){
        if(new_hourly_rate < 0){
            throw new IllegalArgumentException("Hourly Rate cannot be negative: " + new_hourly_rate);
        }
        this.hourly_rate = new_hourly_rate;
    }

    public double get_working_hours(){
        return hours_worked;
    }

    public void set_working_hours(double new_working_hours){
        if(new_working_hours < 0){
            throw new IllegalArgumentException("Amount of hours worked cannot be negative: " + new_working_hours);
        }
        this.hours_worked = new_working_hours;
    }

    public double calculatePayment(){
        if(this.hours_worked <= 40){
            return this.hours_worked * this.hourly_rate;
        }
        else{
            double normal_pay = 40 * this.hourly_rate;
            double overtime_pay = ((this.hours_worked - 40)* 1.5) * this.hourly_rate;
            return normal_pay + overtime_pay;
        }
    }

    public void print(){
        double calc_wage = this.calculatePayment();
        System.out.println(getPayeeName() + " | Wage: " + calc_wage);
    }

    public String getPayeeName(){
        return firstname + " " + lastname;
    }
}
