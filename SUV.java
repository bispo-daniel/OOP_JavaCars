package OOP_JavaCars;

public class SUV extends Car {
    int id = 0;
    String bodyStyle = "SUV";
    int doorNumber = 4;
    int seatsNumber = 5;

    //Constructor
    public SUV(int id, String brand, String model, int year, String engine) {
        super(brand, model, year, engine);
        this.id = id + 1;
    }

    //Class with method to print this class attributes
    Print myPrinter = new Print(id, brand, model, year, bodyStyle, engine, doorNumber, seatsNumber);
}
