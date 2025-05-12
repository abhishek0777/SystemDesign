package lld.designpatterns.nullobjectdesignpattern;

public class VehicleFactory {
    Vehicle getVehicle(String type){
        if(type.equals("Car")){
            return new Car();
        }
//        here we would've return actual null value, then we've to handle null pointer exception
        return new NullObject();
//        return null;
    }

}
