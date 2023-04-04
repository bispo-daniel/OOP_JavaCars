public class Sedan extends Car {
    String bodyStyle = "Sedan";
    int doorNumber = 4;
    int seatsNumber = 5;

    //Constructor
    public Sedan(String brand, String model, int year, String engine){
        super(brand, model, year, engine);
    }

    //Class with method to print this class attributes
    Print myPrinter = new Print(brand, model, year, bodyStyle, engine, doorNumber, seatsNumber);
}
