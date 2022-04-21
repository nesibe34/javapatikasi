import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Oynamak istediğiniz Mayın Tarlası boyutlarını(satır ve sütun) giriniz:");
        int rowNumber= inp.nextInt();
        int columnNumber= inp.nextInt();
        MineSweeper mine=new MineSweeper(rowNumber,columnNumber);
        mine.run();



    }
}
