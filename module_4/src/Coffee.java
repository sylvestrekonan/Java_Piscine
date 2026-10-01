public class Coffee {

    public String name;
    public String roast;
    public int caffeineLevelInMg;
    public double price;

    // Constructor
    public Coffee (String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;

        setCaffeineLevelInMg();
    }

    //Method for set the caffeine level
    public void setCaffeineLevelInMg() {
        if (roast.equals("light")) {
            caffeineLevelInMg = 50;

        } else if (roast.equals("medium")) {
            caffeineLevelInMg = 100;

        } else if (roast.equals("dark")) {
            caffeineLevelInMg = 150;

        } else {
            caffeineLevelInMg = 0;
        }
    }

    //Methods to simulate a coffee preparations
    public void grindBeans() {
        System.out.println("\nGrinding Beans for " + name + "...");
    }

    public void brewCoffee() {
        System.out.println("\nbrewing your favorite " + name + "...");
    }

    //Display the information about coffee
    public void printInfo() {
        System.out.println("\nYour ordered a " + name + " with a " + roast + " roast");
        System.out.println("The caffeine level in your coffee is: " + caffeineLevelInMg);
    }
}
