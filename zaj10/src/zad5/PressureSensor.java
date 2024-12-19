package zad5;

public class PressureSensor implements Sensor {
    private double pressure;
    private String status;

    public PressureSensor(double pressure) {
        this.pressure = pressure;
        this.status = "OK";
    }

    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        this.pressure = 0.0;
        this.status = "RESET";
        System.out.println("PressureSensor reset.");
    }
}
