public class Coupe extends Car {
    int id;
    String bodyStyle = "Coupe";
    int doorNumber = 2;
    int seatsNumber = 2;

    //Constructor
    public Coupe(int id, String brand, String model, int year, String engine){
        super(brand, model, year, engine);
        this.id = id;
    }

    //Class with method to print this class attributes
    public String print(){
        return 
            "\nId: " + id + " Brand: " + brand + " Model: " + model + " Year: " + year +  " Body Style: " + bodyStyle + " Engine: " + engine + " Door Number: " + doorNumber + " Seats Number: " + seatsNumber;
    }
}
