import java.util.Scanner;

public class CoffeeMachine {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {

            System.out.println("\nWelcome to the coffee machine");
            System.out.println("Select an option to continue: ");
            System.out.println("1. Espresso");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = keyboard.nextInt();

            switch (choice) {

                case 1:
                    String espressoName = "Espresso";
                    double espressoPrice = 3.45;

                    System.out.print("what roast would you like ? (light, medium, dark): ");
                    String espressoRoast = keyboard.next();

                    System.out.print("how many servings would you like? : ");
                    int numberOfShots = keyboard.nextInt();

                    Espresso myEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);

                    myEspresso.grindBeans();
                    myEspresso.brewCoffee();
                    myEspresso.printInfo();

                    myEspresso.printEspressoDetails();

                    break;

                case 2:
                    System.out.println("Thank you for using coffee machine");
                    return;

                default:
                    System.out.println("Please enter a choice valid ");
            }
        }
    }
}
