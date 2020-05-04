import javax.swing.*;

public class VehicleInformation {
    public static void main(String[] args) {
        Vehicle[] vehicles =  new Vehicle[3];
        vehicles[0] = new Car("Seat", 40, 6, false);
        vehicles[1] = new Car("Audi", 50, 8, false);
        vehicles[2] = new Truck("Scania", 600, 20, false, 8000);

        System.out.println(vehicles[0].getInfo());
        System.out.println(vehicles[1].getInfo());
        System.out.println(vehicles[2].getInfo());

    }
}




