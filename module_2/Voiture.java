package module_2;
import java.util.Scanner;

public class Voiture {
    public static void main(String[] args) {
        
        
        boolean isEngineOn = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;

        Scanner keyBoard = new Scanner(System.in);

        while (choice != 5) {

            System.out.println("-------- Car Dashboard ---------");
            System.out.println("Speed: " + speed);
            System.out.println("Car is running: " + isEngineOn);
            System.out.println("Gear: " + gear);
            System.out.println("------- End Dashboard --------");
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Turn off/on engine");
            System.out.println("2. change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. exit");


            System.out.print("Enter your choice: ");
            choice = keyBoard.nextInt();

            System.out.println("Menu item selected: " + choice);
            System.out.println();



            switch (choice) {

                case 1:
                    isEngineOn = !isEngineOn;
                    System.out.println("engine is turn on");
                    break;
                case 2:
                    System.out.println("Enter gear (P, D, R): ");
                    gear = keyBoard.next();
                    break;
                case 3:
                    if (isEngineOn && !gear.equals("P")) {
                        System.out.println("the engine accelerate.");
                        speed += 10;
                    } else {
                        System.out.println("Can't accelerate while the engine is off or in park (P).");
                    }
                    break;
                case 4:
                    if (isEngineOn && speed > 0) {
                        System.out.println("Engine brake.");
                        speed -= 5;
                    } else {
                        System.out.println("can't apply the brake while  the engine is off or car not moving ");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! please try again");          
            }
            
        }
        keyBoard.close();
        
        System.out.println();
        System.out.println("Turning off the engine and exiting the car. GoodBye!! ");

            
            
    }

       
    
}


