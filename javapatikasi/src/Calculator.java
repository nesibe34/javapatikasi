import java.util.Scanner;

public class Calculator {
        static void sum() {
            Scanner scan = new Scanner(System.in);
            int num1, num2, result = 0;
            num1 = scan.nextInt();
            num2 = scan.nextInt();

            result = num1 + num2;

            System.out.println("Result : " + result);
        }

        static void differ() {
            Scanner scan = new Scanner(System.in);
            int num1,num2, result = 0;
            num1= scan.nextInt();
            num2= scan.nextInt();
            result=num1-num2;
            System.out.println("Result : " + result);
        }

        static void product() {
            Scanner scan = new Scanner(System.in);
            int num1,num2, result = 0;
            num1= scan.nextInt();
            num2= scan.nextInt();
                result = num1*num2;

            System.out.println("Result : " + result);
        }

        static void division() {
            Scanner scan = new Scanner(System.in);
            double num1,num2, result = 0.0;
            num1= scan.nextDouble();
            num2= scan.nextDouble();

                if ( num2 == 0) {
                    System.out.println("Divisor cannot be 0.");
                }else{
                    result =num1/num2;
                }

            System.out.println("Result : " + result);
        }

        static void exp() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter base:");
            int base = scan.nextInt();
            System.out.print("Enter exponent:");
            int exponent = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }

            System.out.println("Result : " + result);
        }

        static void factorial() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number :");
            int n = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println("Result : " + result);
        }
    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = scan.nextInt();
        System.out.print("Enter second number:");
        int num2 = scan.nextInt();
        int result ;
        result=num1%num2;
        System.out.println("Result : " + result);
    }
    static void reactangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter short side length:");
        int num1 = scan.nextInt();
        System.out.print("Enter long side length:");
        int num2 = scan.nextInt();
        int perimeter,area;
        area=num1*num2;
        perimeter=2*(num1+num2);
        System.out.println("Area : " + area+"\nPerimeter:"+perimeter);
    }




    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Calculate Exponential Number\n"
                + "6- Calculate Factorial\n"
                + "7- Calculate Modulo\n"
                + "8- Calculate Area and Perimeter of a Rectangle\n"
                + "0- Quit";
            System.out.println(menu);
        do{
            System.out.print("Select an operation:");
            select = inp.nextInt();
            switch(select) {
                case 1:
                    sum();
                    break;
                case 2:
                    differ();
                    break;
                case 3:
                    product();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exp();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    reactangle();
                    break;
            }
        }while(select!=0);
    }

}

