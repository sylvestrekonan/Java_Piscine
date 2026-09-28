import java.util.Scanner;

public class UserInput {

    public String obtainBmiSystem() {

        //Display the welcome message to the user
        System.out.println("Welcome to the BMI calculator app!");
        System.out.print("Please select the preferred BMI calculation system (Imperial/Metric) ");


        Scanner keyboard = new Scanner(System.in);
        String bmiSystem = keyboard.next();


        if (!(bmiSystem.equalsIgnoreCase("Imperial") || bmiSystem.equalsIgnoreCase("Metric"))) {
            return "";
        }

        return bmiSystem;

    }

    public double obtainHeight(String bmiSystem) {

        double height = 0;
        boolean isValidInput = true;

        while (isValidInput) {

            Scanner input = new Scanner(System.in);

            switch(bmiSystem.toUpperCase()) {

                case "IMPERIAL":
                    System.out.print("Enter the height in inches:");
                    break;

                case "METRIC":
                    System.out.print("Enter the height in meters:");
                    break;

                default:
                    System.out.println("Please enter a valid BMI system as input");
                    break;
            }

            if (input.hasNextDouble()) {

                height = input.nextDouble();
                isValidInput = false;

            } else {

                System.out.println("Please enter a valid height");
                height = 0;
            }
        }

        return height;
    }

    public double obtainWeight(String bmiSystem) {

        double weight = 0;
        boolean isValidInput = true;

        while (isValidInput) {

            Scanner input = new Scanner(System.in);

            switch (bmiSystem.toUpperCase()) {

                case "IMPERIAL":
                    System.out.print("Enter the weight in pounds:");
                    break;

                case "METRIC":
                    System.out.print("Enter the weight in kilos:");
                    break;

                default:
                    System.out.println("Please enter a valid BMI system as input");
                    break;
            }

            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                isValidInput = false;

            } else {
                System.out.println("Please enter a valid weight");
                weight = 0;
            }
        }

        return weight;
    }
}
