public class BMICalculator {

    private double heightInInches;
    private double weightInPounds;

    private double heightInMeters;
    private double weightInKilos;


    public  BMICalculator() {
        this.heightInMeters = 0;
        this.heightInInches = 0;
        this.weightInPounds = 0;
        this.weightInKilos = 0;
    }

    public static double calculateBmiImperial(double heightInInches, double weightInPounds) {
        return  (703 * weightInPounds)/(heightInInches * heightInInches);
    }

    public static double calculateBmiMetric(double heightInMeters, double weightInKilos) {
        return weightInKilos/(heightInMeters * heightInMeters);
    }

    public static String getBmiCategory( double bmi) {

        if( bmi < 18.25 ) {
            return "underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }

    }


}