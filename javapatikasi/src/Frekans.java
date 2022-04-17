import java.util.Arrays;

public class Frekans {
    static boolean isSame(int[] list,int value){
        for (int k:list){
        if (k==value){
            return true;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={10, 20, 20, 10, 10, 20, 5, 20};
        int[] check=new int[arr.length];
        Arrays.sort(arr);
        int count=0;
        int index=0;
        System.out.println("Dizi:"+Arrays.toString(arr));
        System.out.println("Tekrar eden sayılar:");

        for (int i=0;i<arr.length;i++){
            count=0;
            for (int j=0;j< arr.length;j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if(!isSame(check,arr[i])){
                check[index++]=arr[i];
                    System.out.println(arr[i] + " sayısı " + count + " kez tekrar edildi. ");

            }
        }
    }
}
