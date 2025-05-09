package factory;

public class LedLamp implements Lamp{
    @Override
    public void turnOn() {
        System.out.println("LED Lamp is now ON – energy efficient and bright!");
    }
}
