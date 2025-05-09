package singleton;

public class SingletonTypes {

    // 1. Eager Initialization Singleton
    /**
     * Simple and thread-safe but the instance is created even if it might not be used
     */
    public static class EagerInitializedSingleton {
        private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

        private EagerInitializedSingleton() {
        }

        public static EagerInitializedSingleton getInstance() {
            return instance;
        }
    }

    // 2. Lazy Initialization Singleton
    /**
     * The instance is created only when needed but it is not thread-safe
     */
    public static class LazyInitializedSingleton {
        private static LazyInitializedSingleton instance;

        private LazyInitializedSingleton() {
        }

        public static LazyInitializedSingleton getInstance() {
            if (instance == null) {
                instance = new LazyInitializedSingleton();
            }
            return instance;
        }
    }

    // 3. Thread Safe Singleton
    /**
     * Thread-safe but slower due to synchronized overhead
     */
    public static class ThreadSafeSingleton {
        private static ThreadSafeSingleton instance;

        private ThreadSafeSingleton() {
        }

        public static synchronized ThreadSafeSingleton getInstance() {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    }

    // 4. Bill Pugh Singleton
    /**
     * Thread-safe, lazy and no synchronization overhead
     */
    public static class BillPughSingleton {
        private BillPughSingleton() {
        }

        private static class SingletonHelper {
            private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        }

        public static BillPughSingleton getInstance() {
            return SingletonHelper.INSTANCE;
        }
    }

}

/*
## Which approach is the most effective and why?

Based on my understanding if we go through each approach we can have some pros and cons,
in case of Eager Initialization Singleton it is Simple and thread-safe but the instance is created even if it might not be used,
in case of Lazy Initialization Singleton the instance is created only when needed but it is not thread-safe,
in case of the Thread-safe Singleton it is thread-safe but slower due to synchronized overhead,
the last approach the Bill pugh Singleton it is thread-safe, lazy and no synchronization overhead
so the **Bill pugh Singleton considered the most effective approach among the four**
because of the Lazy Initialization so the instance is created only when getInstance()
is called so it is efficient in terms of memory usage, and it is thread-safe without synchronization overhead,
the JVM handles class loading and ensures the static inner class (`Helper`) is loaded only once and in a thread-safe manner.
No need for explicit `synchronized`. and it provides High Performance so no locking is required on method calls,
unlike synchronized methods which slow down access.
finally the code is clean and easy to understand without complex double-checked locking or early object creation.

*/

/*
## The difference between using the synchronized keyword on a method versus using a synchronized block in Java.

In case of Synchronized method the Lock Scope is on the whole method but in the Synchronized Block the lock scope is in specific block
usually the instance creation, In case of performance the Synchronized method is slower because it is always synchronized
but the Synchronized Block is faster because the lock is only when needed.

*/


