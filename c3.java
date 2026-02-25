import java.util.Scanner;
class c3{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int num = Scan.nextInt();
        if(num%3==0 && num%5==0)
        { System.out.print("yes");
        }
        else{
            System.out.print("no");
            
        }
    }
}