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

    double truckAdictionalCombustionAirConditioning() {
        if (isAirConditioning()) {
            return getAverageFuelOn100km() + 1.6;
        } else {
            return getAverageFuelOn100km();
        }
    }
    double truckAdictionalCombustionLoadWeight(){
        if (truckAdictionalCombustionLoadWeight() == getLoadWeight() + 100);
        return getAverageFuelOn100km() + 0.5;
    }


    }



