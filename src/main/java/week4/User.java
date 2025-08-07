package week4;

// w4q9 - inner classes
public class User {
    private final String name = "Yuvi";

    // Private inner class - accessible only within User
    private class Settings {
        void display() {
            System.out.println("Private Settings accessed");
            System.out.println("User: " + name);
        }
    }

    // Public inner class - accessible from outside
    public class Profile {
        public void display() {
            System.out.println("Public Profile accessed");
            System.out.println("User: " + name);
        }
    }

    public void showSettings() {
        Settings settings = new Settings();
        settings.display();
    }

    public static void main(String[] args) {
        User user = new User();

        // accessing private inner class internally
        user.showSettings();

        // accessing public inner class externally
        User.Profile p = user.new Profile();
        p.display();

        // User.Settings s = u.new Settings(); // Not allowed if written outside User class
    }
}
