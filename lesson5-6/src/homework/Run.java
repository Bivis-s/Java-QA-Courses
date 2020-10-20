package homework;

import homework.Vehicle.*;
import homework.Vehicle.Air.*;
import homework.Vehicle.Land.*;

public class Run {
    public static void main(String[] args) {
        Car car = new Car(80, 220, 1950, "KIA", 4, 7, "Sedan", 5);
        System.out.println(car.description());
        System.out.println(car.drive(2.5));

        System.out.println();

        Truck truck = new Truck(180, 160, 3420, "LADA", 4, 15, 2000);
        System.out.println(truck.description());
        System.out.println(truck.loadCargo(2000));

        System.out.println();

        Civil civil = new Civil(13000, 1200, 36000, "Boeing", 35.7, 1750, 120, false);
        System.out.println(civil.description());
        System.out.println(civil.loadPassengers(115));

        System.out.println();

        Military military = new Military(18000, 3250, 2220, "Sukhoi", 14.7, 600, true, 1);
        System.out.println(military.description());
        System.out.println(military.shot());
        System.out.println(military.shot());
        System.out.println(military.ejection());
    }
}
