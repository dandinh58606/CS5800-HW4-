package interfaces;

public class driver {
    public static void main(String[] args) {
        Payable[] payable_list = {
            new Freelancer("John", "Smith", 20, 34),
            new Freelancer("Jane", "Doe", 25, 48),
            new VendorInvoice("Microsoft", "0001", 70000),
            new VendorInvoice("Cal Poly Pomona", "0002", 50000)
        };

        double total_for_period = 0.0;
        for(Payable p : payable_list){
            p.print();
            double payment = p.calculatePayment();
            total_for_period += payment;
        }

        System.out.printf("%n Total Payment for Period: $%.2f%n", total_for_period);
    }
}
