import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private String price;
    private String discountRate;
    private String stock;
    private String brand;
    private String screen;
    private String RAM;
    public Product(int id, String name, String price, String discountRate, String stock, String brand, String screen,String RAM) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.brand = brand;
        this.screen=screen;
        this.RAM=RAM;
    }

    public static void processMenu(int num) {
        Notebook.start();
        MobilePhone.start();
        boolean quıt = true;
        while (quıt) {
            Scanner inp = new Scanner(System.in);
            System.out.println("-----------------");
            System.out.println("1 - List Items");
            System.out.println("2 - Add Items");
            System.out.println("3 - Delete Items");
            System.out.println("4 - Filter Items");
            System.out.println("0 - Back");
            System.out.print("Your choice: ");

            int choice = inp.nextInt();
            System.out.println();
            switch (choice) {
                case 0:
                    quıt = false;
                    break;
                case 1:
                    listProduct(num);
                    break;
                case 2:
                    addProduct(num);
                    break;
                case 3:
                    deleteProduct(num);
                    break;
                case 4:
                    filterProduct(num);
                    break;
                default:
                    System.out.println();
                    System.out.println("There is no such an option. Please enter your choice again.");
                    processMenu(num);
            }
        }
    }

    public static void listProduct(int num){
        if (num==1){
            System.out.println("Notebooks");
            Notebook.listProduct();
        }else if (num==2){
            System.out.println("Mobile Phones");
            MobilePhone.listProduct();
        }
    }
    public static void addProduct(int num){
        if (num==1){
            Notebook.addProduct();
        }else if (num==2){
            MobilePhone.addProduct();
        }
    }
    public static void deleteProduct(int num){
        if (num==1){
            Notebook.deleteProduct();
        }else if (num==2){
            MobilePhone.deleteProduct();
        }

    }
    public static void filterProduct(int num){
        if (num==1){
            Notebook.filterProduct();

        }else if (num==2){
            MobilePhone.filterProduct();

        }

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

}
