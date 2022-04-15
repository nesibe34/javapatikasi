import java.util.Scanner;
import java.util.Arrays;
public class ClosestNumber {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int nearMax;
        int nearMin;
        Arrays.sort(list);
        nearMax=list[0];
        nearMin=list[list.length-1];
        Scanner inp=new Scanner(System.in);
        int number= inp.nextInt();
        System.out.println("Girilen sayı:"+number);
        if (number<list[0] || number>list[list.length-1]){
            System.out.println("Girilen sayı aralığın dışındadır. " +
                    "Lütfen " +list[0]+" ve "+list[list.length-1]+" aralığında bir değer giriniz:");

        }else{
            for (int i : list) {
                if (i < number) {
                    nearMax = i;
                }
            }
            for (int j = list.length - 1; j >= 0; j--) {
                if (list[j] > number) {
                    nearMin = list[j];

                }
            }
            System.out.println("Girilen sayıdan küçük en yakın sayı:\t"+nearMax);
            System.out.println("Girilen sayıdan büyük en yakın sayı:\t"+nearMin);
        }
    }
}
