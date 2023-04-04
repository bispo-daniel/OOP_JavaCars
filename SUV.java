public class SUV extends Car {
    
    String bodyStyle = "SUV";
    int doorNumber = 4;
    int seatsNumber = 5;

    //Constructor
    public SUV(String brand, String model, int year, String engine) {
        super(brand, model, year, engine);
    }

    //Class with method to print this class attributes
    Print myPrinter = new Print(brand, model, year, bodyStyle, engine, doorNumber, seatsNumber);
}
