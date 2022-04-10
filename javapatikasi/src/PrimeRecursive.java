import java.util.Scanner;

public class PrimeRecursive {
    static boolean isPrime(int p, int divisor){
        while (p!=divisor){
            if (p%divisor==0){
                return false;
            }
           return isPrime(p,divisor+1);
        }
        return true;
    }
    public static void main(String[] args) {
        int number;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number:");
        number=inp.nextInt();
        if (isPrime(number,2)){
            System.out.println(number+" is PRIME.");
        }else {
            System.out.println(number+" is not PRIME.");
        }
    }
}
