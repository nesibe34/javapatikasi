import java.util.*;

public class MobilePhone extends Product{
    private String battery;
    private String color;
    private String memory;
    private String camera;

    public MobilePhone(int id, String name, String price, String discountRate, String stock, String brand,
                       String screen, String RAM, String battery, String color, String memory,String camera) {
        super(id, name, price, discountRate, stock, brand, screen, RAM);
        this.battery = battery;
        this.color = color;
        this.memory = memory;
        this.camera=camera;
    }
    static  TreeSet<MobilePhone> mobilePhones=new TreeSet<>(new Comparator<MobilePhone>() {
        @Override
        public int compare(MobilePhone o1, MobilePhone o2) {
            return o1.getId()- o2.getId();
        }
    });
public static void start(){
    mobilePhones.add(new MobilePhone(1,"SAMSUNG GALAXY A51 ","3199.0","20","128","Samsung","6.5",
            "6","4000.0","Siyah","8","32"));
    mobilePhones.add( new MobilePhone(2,"iPhone 11 64 GB ","7379.0","10","64","Apple","6.1",
            "6","3046.0","Mavi","16","5"));
    mobilePhones.add( new MobilePhone(3,"iPhone 13 64 GB ","7379.0","10","64","Apple","6.1",
            "6","3046.0","Mavi","16","5"));
}


    public static void listProduct(){

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                  | Price        | Brand      | Storage    | Screen Size  | Camera     | Battery    | RAM        | COLOR      |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

        for (MobilePhone m:mobilePhones){
            System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s | %-10s | %-10s | %-10s |\n" ,
                    m.getId(), m.getName(), m.getPrice(), m.getBrand(),
                    m.getStock(), m.getScreen(), m.getCamera(), m.getBattery(), m.getRAM(), m.getColor());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
    public static void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.print("Product name:");
        String productNameInput = input.nextLine();
        System.out.print("Unit Price: ");
        String unitPriceInput = input.nextLine();
        System.out.print("Discount Rate: ");
        String discountRateInput = input.nextLine();
        System.out.print("Stock: ");
        String stockInput = input.nextLine();
        System.out.print("Brand: ");
        String brandInput = input.nextLine();
        System.out.print("Screen Size: ");
        String screenSizeInput = input.nextLine();
        System.out.print("RAM: ");
        String RAMInput = input.nextLine();
        System.out.print("Battery: ");
        String batteryInput = input.nextLine();
        System.out.print("Color: ");
        String colorInput = input.nextLine();
        System.out.print("Memory: ");
        String memoryInput = input.nextLine();
        System.out.print("Camera: ");
        String camInput = input.nextLine();
        mobilePhones.add(new MobilePhone(mobilePhones.last().getId()+1, productNameInput,unitPriceInput,discountRateInput,
                stockInput,brandInput,screenSizeInput,RAMInput,batteryInput,colorInput,memoryInput,camInput));
        listProduct();
    }
    public static void deleteProduct() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter ID number to delete:");
        int deleteId = inp.nextInt();
        Iterator<MobilePhone> itr = mobilePhones.iterator();
        while (itr.hasNext()) {
            if (itr.next().getId() == deleteId) {
                itr.remove();
            }
        }
        listProduct();
    }
    public static void filterProduct(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an ID interval to filter products or '0' if you don't like to enter an ID: ");
        int idStart = input.nextInt();
        int idFinish=input.nextInt();
        boolean idExits = idStart != 0 && idFinish!=0;

        System.out.print("Enter the brand to filter products or 'none' if you don't like to enter a brand: ");
        String brandProduct = input.next();
        boolean brandExits = !brandProduct.equals("none");
        ArrayList<MobilePhone> filteredProducts=new ArrayList<>();
        if(idExits && brandExits){
            for (MobilePhone n:mobilePhones){
                if (idStart<=n.getId() && n.getId()<=idFinish && n.getBrand().equals(brandProduct)){
                    filteredProducts.add(n);
                }
            }
        }
        else if (idExits){
            for (MobilePhone n:mobilePhones){
                if (idStart<=n.getId() && n.getId()<=idFinish){
                    filteredProducts.add(n);
                }
            }
        }else if(brandExits){
            for (MobilePhone n:mobilePhones){
                if (n.getBrand().equals(brandProduct)){
                    System.out.println(n.getBrand());
                    filteredProducts.add(n);
                }
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                  | Price         | Brand     | Storage    | Screen Size  | RAM        |");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (MobilePhone n:filteredProducts){
            System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s |\n",
                    n.getId(), n.getName(), n.getPrice(), n.getBrand(),
                    n.getStock(), n.getScreen(), n.getRAM());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}
