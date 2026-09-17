public static void main(String[] args) {
    
    String firstName = "chuck"; 
    String lastName = "Mallon";
    String movieTitle = "the last dance ";

    String username = firstName + lastName;
    String movieName = movieTitle.toLowerCase();

    int numberOfTicket = 9;
    double pricePerTickets = 20.50;

    double TotalPrice = numberOfTicket * pricePerTickets;


    System.out.println("Congratulation you have successfully booked tickets");
    System.out.println("Username: " + username.toLowerCase());
    System.out.println("Movie: " + movieName);
    System.out.println("NumberOfTicket: " + numberOfTicket);
    System.out.println("Price per ticket: $" + pricePerTickets);
    System.out.println("Total price of tickets is: $" + TotalPrice);
    System.out.println("Thank you for choosing us for booking your movie tickets");
    System.out.println();

    System.out.println("Enjoy your movie");


}