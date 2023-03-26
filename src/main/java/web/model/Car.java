package web.model;

public class Car {

    private String model;

    private String engine;

    private String tire;

    public Car () {

    }

    public Car(String model, String engine, String tire) {
        this.model = model;
        this.engine = engine;
        this.tire = tire;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }
}
