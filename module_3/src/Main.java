public class Main {
    static void main (String[] args) {

        double height, weight;
        double bmi = 0;

        String bmiSystem, bmiCategory;

        UserInput userInput = new UserInput();
        BMICalculator bmiCalculator = new BMICalculator();

        bmiSystem = userInput.obtainBmiSystem();

        switch (bmiSystem.toUpperCase()) {

            case "IMPERIAL":
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainWeight(bmiSystem);
                bmi = bmiCalculator.calculateBmiImperial(height, weight);
                break;

            case "METRIC":
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);
                bmi = bmiCalculator.calculateBmiMetric(height, weight);
                break;

            default:
                System.out.println("Please enter a valid BMI system as input.");
                break;

        }

        System.out.println("Your bmi is: " + bmi);

        bmiCategory = bmiCalculator.getBmiCategory(bmi);

        System.out.println("Your BMI category is: " + bmiCategory);


    }
}