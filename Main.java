package OOP_JavaCars;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Sedan> sedans = new ArrayList<>();
    static ArrayList<SUV> suvs = new ArrayList<>();
    static ArrayList<Coupe> coupes = new ArrayList<>();
    static ArrayList<Roadster> roadsters = new ArrayList<>();

    static void createMenu(){
        String createCar = "Create Car:\n   1- Create Sedan\n   2- Create SUV\n   3- Create Coupe\n   4- Create Roadster";
        String opStr = JOptionPane.showInputDialog(null, createCar);
        int op = Integer.parseInt(opStr);

        switch(op){
            case 1:
                createSedan();
                break;
            case 2:
                createSUV();
                break;
            case 3:
                createCoupe();
                break;
            case 4:
                createRoadster();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Type a valid option...");
                createMenu();
        }
    }

    static int sedanIt = 0;
    static void createSedan() {
        String brand = JOptionPane.showInputDialog(null, "Type the car's brand");
        String model = JOptionPane.showInputDialog(null, "Type the car's model");
        String yearStr = JOptionPane.showInputDialog(null, "Type the car's year");
            int year = Integer.parseInt(yearStr);
        String engine = JOptionPane.showInputDialog(null, "Type the car's engine");

        Sedan ss = new Sedan(sedanIt, brand, model, year, engine);
        sedans.add(ss);
        sedanIt++;
        menu();
    }

    static int suvIt = 0;
    static void createSUV() {
        String brand = JOptionPane.showInputDialog(null, "Type the car's brand");
        String model = JOptionPane.showInputDialog(null, "Type the car's model");
        String yearStr = JOptionPane.showInputDialog(null, "Type the car's year");
            int year = Integer.parseInt(yearStr);
        String engine = JOptionPane.showInputDialog(null, "Type the car's engine");

        SUV ss = new SUV(suvIt, brand, model, year, engine);
        suvs.add(ss);
        suvIt++;
        menu();
    }

    static int coupeIt = 0;
    static void createCoupe() {
        String brand = JOptionPane.showInputDialog(null, "Type the car's brand");
        String model = JOptionPane.showInputDialog(null, "Type the car's model");
        String yearStr = JOptionPane.showInputDialog(null, "Type the car's year");
            int year = Integer.parseInt(yearStr);
        String engine = JOptionPane.showInputDialog(null, "Type the car's engine");

        Coupe ss = new Coupe(coupeIt, brand, model, year, engine);
        coupes.add(ss);
        coupeIt++;
        menu();
    }

    static int roadsterIt = 0;
    static void createRoadster() {
        String brand = JOptionPane.showInputDialog(null, "Type the car's brand");
        String model = JOptionPane.showInputDialog(null, "Type the car's model");
        String yearStr = JOptionPane.showInputDialog(null, "Type the car's year");
            int year = Integer.parseInt(yearStr);
        String engine = JOptionPane.showInputDialog(null, "Type the car's engine");

        Roadster ss = new Roadster(roadsterIt, brand, model, year, engine);
        roadsters.add(ss);
        roadsterIt++;
        menu();
    }

    static void listMenu(){
        String listCar = "List Car:\n   1- List Sedans\n   2- List SUVs\n   3- List Coupes\n   4- List Roadsters\n   5- List all cars";
        String opStr = JOptionPane.showInputDialog(null, listCar);
        int op = Integer.parseInt(opStr);

        switch(op){
            case 1: 
                listSedans();
                break;
            case 2:
                listSUVs();
                break;
            case 3:
                listCoupes();
                break;
            case 4:
                listRoadsters();
                break;
            case 5:
                listAllCars();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Type a valid option...");
                listMenu();
        }
    }

    static String completeSedansList;
    static void listSedans(){
        completeSedansList = "";

        for(Sedan ss : sedans){
            completeSedansList += ss.myPrinter.print();
        }

        JOptionPane.showMessageDialog(null, completeSedansList);
        menu();
    }

    static String completeSUVsList;
    static void listSUVs(){
        completeSUVsList = "";

        for(SUV ss : suvs){
            completeSUVsList += ss.myPrinter.print();
        }

        JOptionPane.showMessageDialog(null, completeSUVsList);
        menu();
    }

    static String completeCoupesList;
    static void listCoupes(){
        completeCoupesList = "";

        for(Coupe ss : coupes){
            completeCoupesList += ss.myPrinter.print();
        }

        JOptionPane.showMessageDialog(null, completeCoupesList);
        menu();
    }

    static String completeRoadstersList;
    static void listRoadsters(){
        completeRoadstersList = "";

        for(Roadster ss : roadsters){
            completeRoadstersList += ss.myPrinter.print();
        }

        JOptionPane.showMessageDialog(null, completeRoadstersList);
        menu();
    }

    static String completeCarsList;
    static void listAllCars(){
        completeCarsList = "";

        for(Sedan ss : sedans){
            completeCarsList += ss.myPrinter.print();
        }
        for(SUV ss : suvs){
            completeCarsList += ss.myPrinter.print();
        }
        for(Coupe ss : coupes){
            completeCarsList += ss.myPrinter.print();
        }
        for(Roadster ss : roadsters){
            completeCarsList += ss.myPrinter.print();
        }

        JOptionPane.showMessageDialog(null, completeCarsList);
        menu();
    }

    static void updateMenu() {
        String opString = JOptionPane.showInputDialog(null, "Update Car:\n   1- Update Sedan\n   2- Update SUV\n   3- Update Coupe\n   4- Update Roadster");
        int op = Integer.parseInt(opString);

        switch(op){
            case 1:
                updateSedan();
                break;
            case 2:
                updateSUV();
                break;
            case 3:
                updateCoupe();
                break;
            case 4:
                updateRoadster();
                break;
        }
    }

    private static void updateSedan() {
    }
    private static void updateSUV() {
    }
    private static void updateCoupe() {
    }
    private static void updateRoadster() {
    }

    static void deleteMenu() {
        String opString = JOptionPane.showInputDialog(null, "Delete Car:\n   1- Delete Sedan\n   2- Delete SUV\n   3- Delete Coupe\n   4- Delete Roadster\n   5- Delete all cars");
        int op = Integer.parseInt(opString);

        switch(op){
            case 1:
                deleteSedan();
                break;
            case 2:
                deleteSUV();
                break;
            case 3:
                deleteCoupe();
                break;
            case 4:
                deleteRoadster();
                break;
            case 5:
                deleteAllCars();
                break;
        }
    }
    
    private static void deleteSedan() {
        String idStr = JOptionPane.showInputDialog(null, "Type the car's id");
        int id = Integer.parseInt(idStr);

        for(Sedan ss : sedans){
            if(ss.id == id){
                sedans.remove(ss);
                break;
            }
        }

        menu();
    }

    private static void deleteSUV() {
    }

    private static void deleteCoupe() {
    }

    private static void deleteRoadster() {
    }

    private static void deleteAllCars() {
    }

    static void menu(){
        String options = "1) Create car\n 2) List car\n 3) Update car\n 4) Delete car\n 0) Exit";
        String opStr = JOptionPane.showInputDialog(null, options);
        int op = Integer.parseInt(opStr);

        switch(op){
            case 0:
                System.exit(0);
                break;
            case 1:
                createMenu();
                break;
            case 2:
                listMenu();
                break;
            case 3:
                updateMenu();
                break;
            case 4:
                deleteMenu();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Type a valid option...");
                menu();
        }
    }


    public static void main(String[] arr) {
        try{
            menu();
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "You probably typed a letter where a number is expected.\nTry again...");
            main(arr);
        }
    }
}
