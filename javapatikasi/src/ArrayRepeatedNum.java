import java.util.Arrays;

public class ArrayRepeatedNum {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={2,1,4,6,1,3,5,4,7,2,8,3,9,8};
        int[] duplicate=new int[list.length];
        int startındex=0;
        for (int i=0;i< list.length;i++){
            for (int j=0;j< list.length;j++){
                if (i!=j && list[i]==list[j] && list[i]%2==0){
                    if (!isFind(duplicate,list[i])){
                        duplicate[startındex++]=list[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}


