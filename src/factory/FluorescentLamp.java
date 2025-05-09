package factory;

public class FluorescentLamp implements Lamp {
    @Override
    public void turnOn() {
        System.out.println("Fluorescent Lamp is now ON – bright and efficient!");
    }
}
