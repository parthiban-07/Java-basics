 import java.util.Scanner;
 class c8{
    public static void main(String args[]){
        Scanner Scan =new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = Scan.nextInt();
        System.out.println("Enter second number");
        int num2 = Scan.nextInt();
        int Greaternumber = (num1>num2)?num1:num2;
        System.out.print("Greater number is:"  +Greaternumber);
    }
}

