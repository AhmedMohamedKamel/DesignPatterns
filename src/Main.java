import factory.Lamp;
import factory.LampFactory;
import factory.LampType;
import observer.*;
import singleton.*;
import template.method.*;

public class Main {
    public static void main(String[] args) {
        // Eager Initialized Singleton
        System.out.println("Eager Initialized Singleton:");
        SingletonTypes.EagerInitializedSingleton eagerSingleton1 = SingletonTypes.EagerInitializedSingleton.getInstance();
        SingletonTypes.EagerInitializedSingleton eagerSingleton2 = SingletonTypes.EagerInitializedSingleton.getInstance();
        System.out.println("Are both instances same? " + (eagerSingleton1 == eagerSingleton2));

        // Lazy Initialized Singleton
        System.out.println("\nLazy Initialized Singleton:");
        SingletonTypes.LazyInitializedSingleton lazySingleton1 = SingletonTypes.LazyInitializedSingleton.getInstance();
        SingletonTypes.LazyInitializedSingleton lazySingleton2 = SingletonTypes.LazyInitializedSingleton.getInstance();
        System.out.println("Are both instances same? " + (lazySingleton1 == lazySingleton2));

        // Thread Safe Singleton
        System.out.println("\nThread Safe Singleton:");
        SingletonTypes.ThreadSafeSingleton threadSafeSingleton1 = SingletonTypes.ThreadSafeSingleton.getInstance();
        SingletonTypes.ThreadSafeSingleton threadSafeSingleton2 = SingletonTypes.ThreadSafeSingleton.getInstance();
        System.out.println("Are both instances same? " + (threadSafeSingleton1 == threadSafeSingleton2));

        // Bill Pugh Singleton
        System.out.println("\nBill Pugh Singleton:");
        SingletonTypes.BillPughSingleton billPughSingleton1 = SingletonTypes.BillPughSingleton.getInstance();
        SingletonTypes.BillPughSingleton billPughSingleton2 = SingletonTypes.BillPughSingleton.getInstance();
        System.out.println("Are both instances same? " + (billPughSingleton1 == billPughSingleton2));

        // Thread Safe Singleton using Synchronized Method
        System.out.println("\nThread Safe Singleton using Synchronized Method:");
        SynchronizedSingletonExamples.ThreadSafeSingleton threadSafeSynchronizedSingleton1 = SynchronizedSingletonExamples.ThreadSafeSingleton.getInstance();
        SynchronizedSingletonExamples.ThreadSafeSingleton threadSafeSynchronizedSingleton2 = SynchronizedSingletonExamples.ThreadSafeSingleton.getInstance();
        System.out.println("Are both instances same? " + (threadSafeSynchronizedSingleton1 == threadSafeSynchronizedSingleton2));

        // Singleton using Synchronized Block
        System.out.println("\nSingleton using Synchronized Block:");
        SynchronizedSingletonExamples.SingletonSynchronizedBlock synchronizedBlockSingleton1 = SynchronizedSingletonExamples.SingletonSynchronizedBlock.getInstance();
        SynchronizedSingletonExamples.SingletonSynchronizedBlock synchronizedBlockSingleton2 = SynchronizedSingletonExamples.SingletonSynchronizedBlock.getInstance();
        System.out.println("Are both instances same? " + (synchronizedBlockSingleton1 == synchronizedBlockSingleton2));

        // Prepare Tea
        System.out.println("\nPreparing Tea:");
        EnhancementExample.HotDrink tea = new EnhancementExample.Tea();
        tea.prepare();

        // Prepare Coffee
        System.out.println("\nPreparing Coffee:");
        EnhancementExample.HotDrink coffee = new EnhancementExample.Coffee();
        coffee.prepare();

        // Admin registration
        System.out.println("\nRegistering Admin:");
        TemplateMethodExample.UserRegistration admin = new TemplateMethodExample.AdminRegistration();
        admin.registerUser();

        // Guest registration
        System.out.println("\nRegistering Guest:");
        TemplateMethodExample.UserRegistration guest = new TemplateMethodExample.GuestRegistration();
        guest.registerUser();

        // Factory Example
        System.out.println("\nFactory Example");
        Lamp led = LampFactory.createLamp(LampType.LED);
        led.turnOn();

        Lamp halogen = LampFactory.createLamp(LampType.HALOGEN);
        halogen.turnOn();

        Lamp fluorescent = LampFactory.createLamp(LampType.FLUORESCENT);
        fluorescent.turnOn();

        // Observer Example
        System.out.println("\nObserver Example");
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber ahmed = new Subscriber("Ahmed");
        Subscriber fatma = new Subscriber("Fatma");
        Subscriber ali = new Subscriber("Ali");

        channel.subscribe(ahmed);
        channel.subscribe(fatma);

        channel.uploadVideo("Observer Pattern in Java");

        channel.subscribe(ali);
        channel.uploadVideo("Factory Pattern Tutorial in Java");

        channel.unsubscribe(fatma);
        channel.uploadVideo("Singleton Pattern Explained in Java");

    }
}