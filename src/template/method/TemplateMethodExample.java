package template.method;

public class TemplateMethodExample {
    public static abstract class UserRegistration {
        /**
         * Template method for registering a user.
         * Declared final to prevent overriding.
         */
        public final void registerUser() {
            validateData();
            saveToDatabase();
            sendWelcomeEmail();
        }

        protected abstract void validateData();

        protected void saveToDatabase() {
            System.out.println("Saving user to the database...");
        }

        protected void sendWelcomeEmail() {
            System.out.println("Sending welcome email...");
        }
    }

    /**
     * Registers an admin user with full validation.
     */
    public static class AdminRegistration extends UserRegistration {

        @Override
        protected void validateData() {
            System.out.println("Validating admin credentials...");
        }
    }

    /**
     * Registers a guest user with minimal validation and no welcome email.
     */
    public static class GuestRegistration extends UserRegistration {

        @Override
        protected void validateData() {
            System.out.println("Minimal validation for guest user...");
        }

        @Override
        protected void sendWelcomeEmail() {
            System.out.println("No email sent for guest.");
        }
    }

}
