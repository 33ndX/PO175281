package zad5;

public class TemperatureSensor implements Sensor {
    private double temperature;
    private String status;

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
        this.status = "OK";
    }

    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        this.temperature = 0.0;
        this.status = "RESET";
        System.out.println("TemperatureSensor reset.");
    }
}
