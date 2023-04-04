public class SUV extends Car {
    int id;
    String bodyStyle = "SUV";
    int doorNumber = 4;
    int seatsNumber = 5;

    //Constructor
    public SUV(int id, String brand, String model, int year, String engine) {
        super(brand, model, year, engine);
        this.id = id;
    }

    //Class with method to print this class attributes
    public String print(){
        return 
            "\nId: " + id + " Brand: " + brand + " Model: " + model + " Year: " + year +  " Body Style: " + bodyStyle + " Engine: " + engine + " Door Number: " + doorNumber + " Seats Number: " + seatsNumber;
    }
}