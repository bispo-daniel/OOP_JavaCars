public class Main {
    public static void main(String[] arr) {
        Sedan e63 = new Sedan("Mercedes-Benz", "E63", 2023, "v8");
        Roadster AventadorRoadster = new Roadster("Lamborghini", "Aventador S Roadster", 2017, "v12");
        Coupe nine11 = new Coupe("Porsche", "911 GT3 Touring", 2022, "flat-6");
        SUV g63 = new SUV("Mercedes-Benz", "G63", 2022, "v8");

        System.out.println(e63.myPrinter.print());
        System.out.println(AventadorRoadster.myPrinter.print());
        System.out.println(nine11.myPrinter.print());
        System.out.println(g63.myPrinter.print());
    }
}
