package polymorphism;

public class driver {
    public static void main(String[] args) {
        Ship[] shiplist = new Ship[3];

        shiplist[0] = new Ship("Queen Mary", "1920");
        shiplist[1] = new CruiseShip("Quantum of the Seas", "2020", 100000);
        shiplist[2] = new CargoShip("The Royal Scurvy", "1531", 25);

        for(Ship ship : shiplist){
            ship.print();
        }
    }
}
