package homework.Vehicle.Air;

public class Civil extends Air {
    protected int capacity;
    protected boolean business;

    public Civil(double power, double maxSpeed, double weight, String brand, double wingspan, double runwayLength, int capacity, boolean business) {
        super(power, maxSpeed, weight, brand, wingspan, runwayLength);
        this.capacity = capacity;
        this.business = business;
    }

    @Override
    protected double getPowerInHp() {
        return super.getPowerInHp();
    }

    public String description() {
        return "Civil{" +
                "capacity=" + capacity +
                ", business=" + business +
                ", wingspan=" + wingspan +
                ", runwayLength=" + runwayLength +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", power in hp=" + this.getPowerInHp() +
                '}';
    }

    public String loadPassengers(double numberOfPassengers) {
        if (numberOfPassengers <= capacity) {
            return "Пассажиры загружен.";
        } else {
            return "Вам нужен самолёт побольше.";
        }
    }
}
