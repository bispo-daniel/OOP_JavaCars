public class Sedan extends Car {
    int id;
    String bodyStyle = "Sedan";
    int doorNumber = 4;
    int seatsNumber = 5;

    //Constructor
    public Sedan(int idIn, String brand, String model, int year, String engine){
        super(brand, model, year, engine);
        this.id = idIn;
    }

    //Class with method to print this class attributes
    public String print(){
        return 
            "\nId: " + id + " Brand: " + brand + " Model: " + model + " Year: " + year +  " Body Style: " + bodyStyle + " Engine: " + engine + " Door Number: " + doorNumber + " Seats Number: " + seatsNumber;
    }
}
