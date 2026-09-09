public class baseemployee extends employee{
    private double base_salary;

    public baseemployee(String firstname, String lastname, String ssn, double base_salary){
        super(firstname, lastname, ssn);
        this.base_salary = base_salary;
    }

    public double get_base_sal(){
        return base_salary;
    }

    public void set_base_sal(double new_base_sal){
        this.base_salary = new_base_sal;
    }

    public String toString() {
    return get_firstname() + " " + get_lastname() + 
        " | SSN: " + get_ssn() + 
        " | Base Salary: $" + String.format("%.2f", base_salary);
}
}