public class PrimeNumber {
    public static void main(String[] args) {


        for (int i=2;i<100;i++){
            if (i==2){
                System.out.print(i+" ");

            }else{
                int prime=0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime=1;
                        break;
                    }
                }
                if(prime==0){
                    System.out.print(i + " ");
                }
            }

        }
    }
}

