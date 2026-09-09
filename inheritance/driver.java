package inheritance;

public class driver {
    public static void main(String[] args) {
        // Creation of all of the employee objects
        salariedemployee employee1 = new salariedemployee("Joe", "Jones", "111-11-1111", 2500);
        hourlyemployee employee2 = new hourlyemployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        hourlyemployee employee3 = new hourlyemployee("Mary", "Quinn", "333-33-3333", 19, 47);
        commisionemployee employee4 = new commisionemployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        salariedemployee employee5 = new salariedemployee("Renwa", "Chanel", "555-55-5555", 1700);
        baseemployee employee6 = new baseemployee("Mike", "Davenport", "666-66-6666", 95000);
        commisionemployee employee7 = new commisionemployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);
        
        // Print statements of Employee info to create output
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee5.toString());
        System.out.println(employee6.toString());
        System.out.println(employee7.toString());
    }
}