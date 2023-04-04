package OOP_JavaCars;

public class Roadster extends Car {
    int id = 0;
    String bodyStyle = "Roadster";
    int doorNumber = 2;
    int seatsNumber = 2;

    //Constructor
    public Roadster(int id, String brand, String model, int year, String engine){
        super(brand, model, year, engine);
        this.id = id + 1;
    }

    //Class with method to print this class attributes
    Print myPrinter = new Print(id, brand, model, year, bodyStyle, engine, doorNumber, seatsNumber);
}
