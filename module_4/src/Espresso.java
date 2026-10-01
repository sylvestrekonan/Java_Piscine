public class Espresso extends Coffee {

    int numberOfShot;

    //Constructor
    public Espresso(String name, String roast, double price, int numberOfShot) {
        super(name,roast, price);
        this.numberOfShot = numberOfShot;
    }

    public void printEspressoDetails() {
        double facture = numberOfShot * price;
        System.out.println("Vous avez demander " + numberOfShot + " portion! Chaque portion d'Espresso coût " + price + "$. Votre facture total est de: " + facture + "$.");
    }


}
