public class FindArmstrong {
    public static void main(String[] args) {
        int i,tempNumber,digitvalue;

        for (i=100;i<=100000;i++){
            int digitcounter=0;
            tempNumber=i;
            while(tempNumber!=0){
                tempNumber=tempNumber/10;
                digitcounter++;
            }
            tempNumber=i;
            int result=0;
            while(tempNumber!=0){
                digitvalue=tempNumber%10;
                tempNumber=tempNumber/10;
                int exp=1;
                for (int j=1;j<=digitcounter;j++){
                    exp*=digitvalue;
                }
                result+=exp;
            }
            //System.out.println(result);
            if (result==i){
                System.out.println(i+" sayısı bir Armstrong sayısıdır.");

            }

        }

    }
}
