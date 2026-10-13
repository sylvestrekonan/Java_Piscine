public class Dolphin extends Animal implements Swim{

    private String color;
    private int swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
        this.color = "Black";
        this.swimmingSpeed = 0;
    }

    public String getColor() {
        return color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // surcharge de la method eatingFood
    public void eatingFood( int quantity) {
        System.out.println("Dolphin: I eat " + quantity + " kg of fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed + " miles nautique par hour " );
    }
}
