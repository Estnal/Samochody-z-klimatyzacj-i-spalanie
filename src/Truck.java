public class Truck extends Car {
    private double loadWeight;

    public Truck(String carName, double tankCapacity, double averageFuelOn100km, boolean airConditioning, double loadWeight) {
        super(carName, tankCapacity, averageFuelOn100km, airConditioning);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
    public double getRange() {
        double range = this.getAverageFuelOn100km();

        if (this.isAirConditioning()) {
            range = range + 1.6;
        }

        return range + (this.getLoadWeight() / 100 *  0.5);
    }

    @Override
    String getInfo() {
        return super.getInfo() + " " + loadWeight + " " + getRange();
    }
}






