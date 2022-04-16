import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
     static int[] sorting(int[] list){
        int[] copyList = Arrays.copyOf(list, list.length);
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    list[i + 1] = copyList[i];
                    list[i] = copyList[i + 1];
                    sorting(list);
                }
            }

        return list;
     }

    public static void main(String[] args) {

       Scanner inp=new Scanner(System.in);
        System.out.println("Enter dimension of array.");
        int dimension=inp.nextInt();
        int[] arr=new int[dimension];

        System.out.println("Dimension of array :"+dimension);
        System.out.println("Enter elements of array:");
        for (int i=0;i<dimension;i++){
            int num=inp.nextInt();
            arr[i]=num;
        }
        for (int j=0;j<dimension;j++){
        System.out.println((j+1)+". Element:\t"+arr[j]);
        }
        sorting(arr);
        System.out.println("Küçükten büyüğe sıralanmış hali:"+Arrays.toString(arr));

    }
}
