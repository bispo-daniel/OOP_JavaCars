public class Print {
    String brand;
    String model; 
    int year; 
    String bodyStyle;
    String engine;
    int doorNumber;
    int seatsNumber;

    public Print(String brand, String model, int year, String bodyStyle, String engine, int doorNumber, int seatsNumber) {
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
            "\nBrand: " + brand +
            "\nModel: " + model +
            "\nYear: " + year + 
            "\nBody Style: " + bodyStyle +
            "\nEngine: " + engine +
            "\nDoor Number: " + doorNumber +
            "\nSeats Number: " + seatsNumber + "\n";
    }
}
