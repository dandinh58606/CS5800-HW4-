package interfaces;

public class VendorInvoice implements Payable{
    private String vendor_name;
    private String invoice_number;
    private double amount_due;

    public VendorInvoice(String ven_name, String invoice_num, double due_amount){
        this.vendor_name = ven_name;
        this.invoice_number = invoice_num;
        set_amount_due(due_amount);
    }

    public String get_vendor_name(){
        return vendor_name;
    }

    public void set_vendor_name(String new_vendor_name){
        this.vendor_name = new_vendor_name;
    }

    public String get_invoice_number(){
        return invoice_number;
    }

    public void set_invoice_number(String new_invoice_number){
        this.invoice_number = new_invoice_number;
    }

    public double get_amount_due(){
        return amount_due;
    }

    public void set_amount_due(double new_amount_due){
        if(new_amount_due < 0){
            throw new IllegalArgumentException("Amount due cannot be negative: " + new_amount_due);
        }
        this.amount_due = new_amount_due;
    }

    public double calculatePayment(){
        return amount_due;
    }

    public String getPayeeName(){
        return vendor_name;
    }

    public void print(){
        System.out.println(getPayeeName() + " | Invoice: " + invoice_number + " | Payment: " + calculatePayment());
    }
}
