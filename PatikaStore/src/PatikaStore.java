import java.util.Scanner;
import java.util.TreeSet;

public class PatikaStore {
    Scanner inp=new Scanner(System.in);
       public void enter(){
        System.out.println("Welcome to Patika Store");
        boolean quit=true;
        while (quit) {
            System.out.println("Product Management Panel");
            System.out.println("1-Notebooks");
            System.out.println("2-Mobile Phones");
            System.out.println("3-List Brands");
            System.out.println("0-Sign Out");
            System.out.print("Your select: ");
            int select = inp.nextInt();
            switch (select){
                    case 1:
                        Product.processMenu(1);
                        break;
                    case 2:
                        Product.processMenu(2);
                        break;
                    case 3:
                        Brand.listBrands();
                        break;
                    case 0:
                        quit=false;
                        break;
                    default:
                        System.out.println("Incorrect select. Please try again: ");
                        select= inp.nextInt();
                        break;
                }
        }
    }
}
