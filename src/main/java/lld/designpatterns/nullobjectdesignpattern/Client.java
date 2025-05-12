package lld.designpatterns.nullobjectdesignpattern;

public class Client {
    public static void main(String[] args){
        VehicleFactory factory = new VehicleFactory();
        Vehicle car = factory.getVehicle("Car");
        System.out.println("Seating capacity: "+car.getSeatingCapacity());
        System.out.println("Tank capacity: "+car.getTankCapacity());

        Vehicle bike = factory.getVehicle("Bike");
        System.out.println("Seating capacity: "+bike.getSeatingCapacity());
        System.out.println("Tank capacity: "+bike.getTankCapacity());
    }
}
