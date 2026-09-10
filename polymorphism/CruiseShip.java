package polymorphism;

public class CruiseShip extends Ship{
    private int max_passenger_count;

    public CruiseShip(String ship_name, String year_built, int max_passengers){
        super(ship_name, year_built);
        this.max_passenger_count = max_passengers;
    }

    public int get_max_passengers(){
        return max_passenger_count;
    }

    public void set_max_passengers(int new_max){
        this.max_passenger_count = new_max;
    }

    public void print(){
        System.out.println("Name: " + super.get_ship_name() + " | Max Capacity: " + max_passenger_count);
    }
}
