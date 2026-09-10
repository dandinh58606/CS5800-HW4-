package polymorphism;

public class Ship {
    private String ship_name;
    private String year_built;

    public Ship(String name, String year){
        this.ship_name = name;
        this.year_built = year;
    }

    public String get_ship_name(){
        return ship_name;
    }

    public void set_ship_name(String new_name){
        this.ship_name = new_name;
    }

    public String get_year_built(){
        return year_built;
    }

    public void set_year_built(String new_year){
        this.year_built = new_year;
    }

    public void print(){
        System.out.println("Name: " + ship_name + " | Year Built: " + year_built);
    }
}
