public class Tiger extends Animal implements Walk{

    private int numberOfStrip;
    private int speed;
    private int soundLevelOfRoar;


    public Tiger() {
        super("Tiger");
        this.numberOfStrip = 0;
        this.speed = 0;
        this.soundLevelOfRoar = 0;

    }

    public int getNumberOfStrip() {
        return numberOfStrip;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setNumberOfStrip(int numberOfStrip) {
        this.numberOfStrip = numberOfStrip;
    }

    public void setSpeed(int speed)  { this.speed = speed; }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at speed " + speed + " mph" );

    }
}
