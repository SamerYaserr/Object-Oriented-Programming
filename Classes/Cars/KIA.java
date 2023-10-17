public class KIA extends Cars{

    public KIA() {}

    public KIA(int maxSpeed, float height, float weight, int numbersOfWheels) {
        super(maxSpeed, height, weight, numbersOfWheels);
    }

    @Override
    void autoPilot() {
        System.out.println("KIA autoPilot");
    }

    @Override
    void streamingServices() {
        System.out.println("KIA streamingServices");
    }

    @Override
    void parkingSensors() {
        System.out.println("KIA parkingSensors");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
