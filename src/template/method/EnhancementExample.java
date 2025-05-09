package template.method;

public class EnhancementExample {

    /**
     * Abstract class defining the template method for preparing a hot drink.
     */
    public static abstract class HotDrink {
        public void prepare() {
            boilWater();
            typeOfDrink();
            pourIntoCup();
        }

        protected void boilWater() {
            System.out.println("Boiling water");
        }

        protected void pourIntoCup() {
            System.out.println("Pouring into cup");
        }

        protected abstract void typeOfDrink();
    }


    /**
     * Concrete implementation for Tea.
     */
    public static class Tea extends HotDrink {
        @Override
        protected void typeOfDrink() {
            System.out.println("Adding tea bag");
        }
    }

    /**
     * Concrete implementation for Coffee.
     */
    public static class Coffee extends HotDrink {
        @Override
        protected void typeOfDrink() {
            System.out.println("Adding coffee");
        }
    }
}
