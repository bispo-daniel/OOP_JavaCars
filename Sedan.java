package OOP_JavaCars;

public class Sedan extends Car {
    int id = 0;
    String bodyStyle = "Sedan";
    int doorNumber = 4;
    int seatsNumber = 5;

    //Constructor
    public Sedan(int idIn, String brand, String model, int year, String engine){
        super(brand, model, year, engine);
        this.id = idIn;
    }

    //Class with method to print this class attributes
    Print myPrinter = new Print(id, brand, model, year, bodyStyle, engine, doorNumber, seatsNumber);
}
