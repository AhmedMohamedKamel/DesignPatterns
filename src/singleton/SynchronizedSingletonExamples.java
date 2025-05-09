package singleton;

public class SynchronizedSingletonExamples {

    /**
     * Synchronized Method Like the Thread Safe Singleton
     * The getInstance() method is synchronized, so only one thread can execute it at a time,
     * and it ensures thread safety during instance creation.
     */
    public static class ThreadSafeSingleton {
        private static ThreadSafeSingleton instance;

        private ThreadSafeSingleton() {}

        public static synchronized ThreadSafeSingleton getInstance() {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    }

    /**
     * Synchronized Block
     * First check (without lock): Improves performance when instance is already initialized.
     * Second check (with lock): Ensures thread safety when instance is not yet created.
     */
    public static class SingletonSynchronizedBlock {
        private static volatile SingletonSynchronizedBlock instance;

        private SingletonSynchronizedBlock() {}

        public static SingletonSynchronizedBlock getInstance() {
            if (instance == null) { // First check
                synchronized (SingletonSynchronizedBlock.class) {
                    if (instance == null) { // Second check
                        instance = new SingletonSynchronizedBlock();
                    }
                }
            }
            return instance;
        }
    }
}
