public class Print {
    int id;
    String brand;
    String model; 
    int year; 
    String bodyStyle;
    String engine;
    int doorNumber;
    int seatsNumber;

    public Print(int id, String brand, String model, int year, String bodyStyle, String engine, int doorNumber, int seatsNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
        this.engine = engine;
        this.doorNumber = doorNumber;
        this.seatsNumber = seatsNumber;
    }

    public String print(){
        return 
            "\nId: " + id +
            "\nBrand: " + brand +
            "\nModel: " + model +
            "\nYear: " + year + 
            "\nBody Style: " + bodyStyle +
            "\nEngine: " + engine +
            "\nDoor Number: " + doorNumber +
            "\nSeats Number: " + seatsNumber + "\n";
    }
}
