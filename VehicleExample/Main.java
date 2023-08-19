package VehicleExample;

public class Main {

    private static void Actions(Vehicle vehicle){
        vehicle.start();
        vehicle.accelerate();
        vehicle.brake();
    }


    public static void main(String args[]){
        Vehicle car=new Car();
        Vehicle motorcycle=new Motorcycle();

        System.out.println("...CAR...");
        Actions(car);
        System.out.println();
        System.out.println("...MOTORCYCLE...");
        Actions(motorcycle);
//        car.start();
//        car.accelerate();
//        car.brake();
//
//        motorcycle.start();
//        motorcycle.accelerate();
//        motorcycle.brake();
    }
}


