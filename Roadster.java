public class Roadster extends Car {
    String bodyStyle = "Roadster";
    int doorNumber = 2;
    int seatsNumber = 2;

    //Constructor
    public Roadster(String brand, String model, int year, String engine){
        super(brand, model, year, engine);
    }

    //Class with method to print this class attributes
    Print myPrinter = new Print(brand, model, year, bodyStyle, engine, doorNumber, seatsNumber);
}
