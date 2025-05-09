package factory;

public class LampFactory {
    public static Lamp createLamp(LampType type) {
        return switch (type) {
            case LED -> new LedLamp();
            case HALOGEN -> new HalogenLamp();
            case FLUORESCENT -> new FluorescentLamp();
            default -> throw new IllegalArgumentException("Unsupported lamp type: " + type);
        };
    }
}
