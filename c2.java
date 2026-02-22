import java.util.Scanner;
class c2{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int Income = Scan.nextInt();
        if(Income>=70000)
        {
            System.out.print("eligible for loan");
        }
        else
        {
            System.out.print("not eligible for loan");
        }
    }
    
    }
