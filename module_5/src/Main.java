import  java.util.Scanner;

public class Main {
    void main(String[] args) {

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();

        Scanner keyboard = new Scanner(System.in);

        boolean continueOutLoop = true;
        boolean continueInnerLoop = true;

        int menuChoice = 1;

        do {

            switch (animalChoiceMenu(keyboard)) {

                case 1:
                    do {

                        System.out.println("The animal which chosen is: " + tigerObject.getNameOfAnimal());

                        menuChoice = animalDetailManipulation(keyboard, tigerObject);

                        switch (menuChoice) {

                            case 1:
                                System.out.print("Enter the speed: ");
                                tigerObject.setSpeed(keyboard.nextInt());

                                System.out.print("Enter the number of strip: ");
                                tigerObject.setNumberOfStrip(keyboard.nextInt());

                                System.out.print("Enter the sound level of roar: ");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());

                                System.out.print("Enter the height: ");
                                tigerObject.setHeight(keyboard.nextInt());

                                System.out.print("Enter the weight: ");
                                tigerObject.setWeight(keyboard.nextInt());

                                System.out.print("Enter of age: ");
                                tigerObject.setAge(keyboard.nextInt());

                                break;

                            case 2:

                                System.out.println("Age:  " + tigerObject.getAge() );
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Number of strip: " + tigerObject.getNumberOfStrip());
                                System.out.println("Sound of level roar: " + tigerObject.getSoundLevelOfRoar());

                                break;

                            case 3:

                                tigerObject.walking();
                                break;

                            case 4:

                                tigerObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("choice not valid ");

                        }

                        System.out.println("Continue with this animal ? (Enter true for yes or false for no)");
                        continueInnerLoop = keyboard.nextBoolean();

                    } while (continueInnerLoop);

                    break;

                case 2:

                    do {

                        System.out.println("The animal which chosen is: " + dolphinObject.getNameOfAnimal());

                        menuChoice = animalDetailManipulation(keyboard, dolphinObject);

                        switch (menuChoice) {

                            case 1:

                                System.out.print("Enter the color: ");
                                dolphinObject.setColor(keyboard.next());

                                System.out.print("Enter the swimming speed: ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());

                                System.out.print("Enter the height: ");
                                tigerObject.setHeight(keyboard.nextInt());

                                System.out.print("Enter the weight: ");
                                tigerObject.setWeight(keyboard.nextInt());

                                System.out.print("Enter of age: ");
                                tigerObject.setAge(keyboard.nextInt());

                                break;

                            case 2:

                                System.out.println("Color: " + dolphinObject.getColor());
                                System.out.println("Swimming speed: " + dolphinObject.getSwimmingSpeed());
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Weight: " + dolphinObject.getWeight());

                                break;

                            case 3:

                                dolphinObject.swimming();
                                break;

                            case 4:

                                System.out.print("Indicate the number of kilograms of fish that the dolphin must consume: ");
                                dolphinObject.eatingFood(keyboard.nextInt());
                                dolphinObject.eatingCompleted();

                                break;

                            default:
                                System.out.println("choice not valid");
                        }

                        System.out.println("Continue with this animal ? (Enter true for yes or false for no)");
                        continueInnerLoop = keyboard.nextBoolean();

                    } while (continueInnerLoop);

                default:
                    System.out.println("Sorry no such animal available ");

            }

            System.out.println("Continue with Zoo menu ? (Enter true for yes or false for no)");
            continueOutLoop = keyboard.nextBoolean();

        } while (continueOutLoop);

    }

    private static int animalChoiceMenu(Scanner keyboard) {

        int choiceGiveByUser;

        System.out.println("********* Zoo Animal choice menu ********");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.print("Enter choice of animal (1, 2, 3): ");
        choiceGiveByUser = keyboard.nextInt();
        return choiceGiveByUser;

    }

    private static int animalDetailManipulation(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("********* Animal details menu for " + animal.getNameOfAnimal() + " *********");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice of animal detail: ");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;




    }
}

