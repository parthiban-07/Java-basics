import java.util.Scanner;
class c10{
    public static void main (String args[]) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("enter first number");
        int a = Scan.nextInt();
        System.out.print("enter last number");
        int b = Scan.nextInt();
        for ( int i=a;i<=b;i=i+1)
        if(i%2!=0)
        {
        System.out.println(i);
        }
    }
}
