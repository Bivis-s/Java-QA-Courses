package homework.Vehicle.Land;

import homework.Vehicle.Vehicle;

public abstract class Land extends Vehicle {
    protected int wheels;
    protected double totalFuelConsumption;

    public Land(double power, double maxSpeed, double weight, String brand, int wheels, double TotalFuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.wheels = wheels;
        this.totalFuelConsumption = TotalFuelConsumption;
    }

    @Override
    protected double getPowerInHp() {
        return super.getPowerInHp();
    }
}
