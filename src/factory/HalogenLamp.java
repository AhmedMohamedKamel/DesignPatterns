package factory;

public class HalogenLamp implements Lamp{
    @Override
    public void turnOn() {
        System.out.println("Halogen Lamp is now ON – warm and cozy light!");
    }
}
