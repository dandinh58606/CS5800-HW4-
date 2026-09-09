public class commisionemployee extends employee{
    private double rate;
    private double gross_sales;

    public commisionemployee(String firstname, String lastname, String ssn, double rate, double gross_sales){
        super(firstname, lastname, ssn);
        this.rate = rate;
        this.gross_sales = gross_sales;
    }

    public double get_rate(){
        return rate;
    }

    public double get_gross_sales(){
        return gross_sales;
    }

    public void set_rate(double new_rate){
        this.rate = new_rate;
    }

    public void set_gross_sales(double new_gross){
        this.gross_sales = new_gross;
    }

    public String toString() {
    return get_firstname() + " " + get_lastname() + 
           " | SSN: " + get_ssn() + 
           " | Commission Rate: " + (rate * 100) + "%" + 
           " | Gross Sales: $" + String.format("%.2f", gross_sales);
}
}