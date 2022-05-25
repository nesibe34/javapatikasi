import java.util.*;

public class Notebook extends Product{
    private String hardDisk;

    public Notebook(int id, String name, String price, String discountRate, String stock, String brand, String screen, String RAM, String hardDisk) {
        super(id, name, price, discountRate, stock, brand, screen, RAM);
        this.hardDisk = hardDisk;
    }
    static TreeSet<Notebook> notebooks = new TreeSet<>(new Comparator<Notebook>() {
        @Override
        public int compare(Notebook o1, Notebook o2) {
            return o1.getId() - o2.getId();
        }
    });
    public static void start(){
    notebooks.add(new Notebook(1, "HUAWEI Matebook 14", "7000.0", "10", "512",
            "Huawei", "14.0", "16", "1 GB"));
    notebooks.add(new Notebook(2, "LENOVO V14 IGL", "3699.0", "10", "1024",
            "Lenovo", "14.0", "8", "1 GB"));
    notebooks.add(new Notebook(3, "LENOVO V18 ", "4659.0", "10", "1024",
                "Lenovo", "14.0", "8", "1 GB"));
    }

    public static void listProduct(){

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                  | Price         | Brand     | Storage    | Screen Size  | RAM        |");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (Notebook n:notebooks){
            System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s |\n",
                    n.getId(), n.getName(), n.getPrice(), n.getBrand(),
                    n.getStock(), n.getScreen(), n.getRAM());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
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
        String brandInput = input.next();
        System.out.print("Screen Size: ");
        String screenSizeInput = input.next();
        System.out.print("RAM: ");
        String RAMInput = input.next();
        System.out.print("Hard Disk: ");
        String HDInput = input.next();
            notebooks.add(new Notebook(notebooks.last().getId()+1, productNameInput,unitPriceInput,discountRateInput,
                    stockInput,brandInput,screenSizeInput,RAMInput,HDInput));
           listProduct();
    }
    public static void deleteProduct(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter ID number to delete:");
        int deleteId=inp.nextInt();
        Iterator<Notebook> itr = notebooks.iterator();
        while (itr.hasNext()) {
            if(itr.next().getId()==deleteId){
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
        ArrayList<Notebook> filteredProducts=new ArrayList<>();
        if(idExits && brandExits){
            for (Notebook n:notebooks){
                if (idStart<=n.getId() && n.getId()<=idFinish && n.getBrand().equals(brandProduct)){
                    filteredProducts.add(n);
                }
            }
        }
        else if (idExits){
                for (Notebook n:notebooks){
                 if (idStart<=n.getId() && n.getId()<=idFinish){
                     filteredProducts.add(n);
                 }
                }
        }else if(brandExits){
            for (Notebook n:notebooks){
                if (n.getBrand().equals(brandProduct)){
                    System.out.println(n.getBrand());
                    filteredProducts.add(n);
                }
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                  | Price         | Brand     | Storage    | Screen Size  | RAM        |");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (Notebook n:filteredProducts){
            System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s |\n",
                    n.getId(), n.getName(), n.getPrice(), n.getBrand(),
                    n.getStock(), n.getScreen(), n.getRAM());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }
}
