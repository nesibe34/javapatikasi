import java.util.Arrays;
import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Matrisin satır ve sütun sayısını giriniz:");
        int row= inp.nextInt();
        int column= inp.nextInt();
        int[][] matris=new int[row][column];
        System.out.println("Matrisin elemanlarını giriniz:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matris[i][j]= inp.nextInt();

            }
        }
        System.out.println("Matris: ");
        for (int k= 0; k < row; k++) {
            for (int m = 0; m<column; m++) {
                System.out.print(matris[k][m] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpozu: ");
        for (int k= 0; k <column; k++) {
            for (int m = 0; m<row; m++) {
                System.out.print(matris[m][k] + " ");
            }
            System.out.println();
        }
    }
}
