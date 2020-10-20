package homework.Vehicle.Land;

public class Car extends Land {
    protected String bodyType;
    protected int capacity;

    public Car(double power, double maxSpeed, double weight, String brand, int wheels, double totalFuelConsumption, String bodyType, int capacity) {
        super(power, maxSpeed, weight, brand, wheels, totalFuelConsumption);
        this.bodyType = bodyType;
        this.capacity = capacity;
    }

    @Override
    protected double getPowerInHp() {
        return super.getPowerInHp();
    }

    public String description() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", capacity=" + capacity +
                ", wheels=" + wheels +
                ", fuelConsumption=" + totalFuelConsumption +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", power in hp=" + this.getPowerInHp() +
                '}';
    }

    private double calculateFuelConsumption(double time) {
        double distance = maxSpeed * time;
        return (distance * totalFuelConsumption) / 100;
    }

    public String drive(double time) {
        double distance = maxSpeed * time;
        double fuelConsumption = calculateFuelConsumption(time);

        return "За время " + time + "ч, автомобиль " + brand + ", двигаясь с максимальной скоростью " +
                maxSpeed + "км/ч проедет " + distance + "км и израсходует " + fuelConsumption + "л топлива.";
    }
}
