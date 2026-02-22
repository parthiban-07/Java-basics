import java.util.Scanner;
class c1
{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int marks = Scan.nextInt();
        if(marks>= 35)
        {
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}
    