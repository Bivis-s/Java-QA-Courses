package homework.Vehicle;

public abstract class Vehicle {
    protected double power;
    protected double maxSpeed;
    protected double weight;
    protected String brand;

    public Vehicle(double power, double maxSpeed, double weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    protected double getPowerInHp() {
        return power / 0.74;
    }
}
