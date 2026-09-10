package polymorphism;

public class CargoShip extends Ship{
    private int cargo_capacity;

    public CargoShip(String name, String year, int capacity){
        super(name, year);
        this.cargo_capacity = capacity;
    }

    public int get_cargo_capacity(){
        return cargo_capacity;
    }
    
    public void set_cargo_capacity(int new_capacity){
        this.cargo_capacity = new_capacity;
    }

    public void print(){
        System.out.println("Name: " + super.get_ship_name() + " | Capacity (in tonnes): " + cargo_capacity);
    }
}
