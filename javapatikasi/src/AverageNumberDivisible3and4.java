import java.util.Scanner;

public class AverageNumberDivisible3and4 {
    public static void main(String[] args) {
        int sum=0,count=0;
        Scanner inp=new Scanner(System.in);
        int board= inp.nextInt();

        for (int i=0;i<board;i++){
            if (i%3==0 && i%4==0 && i!=0){
                sum+=i;
                count++;
            }
        }
        double average=sum/count;
        System.out.println("Average of the number which is divisible by 3 and 4 is "+average);

    }
}
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
// 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.