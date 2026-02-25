
import java.util.Scanner;

class c4{
    public static void main(String args []){
        Scanner Scan = new Scanner(System.in);
        int Score = Scan.nextInt();
        if(Score<=49){
            System.out.print("you need to improve");
        }
        else if(Score>49 && Score<=70){
            System.out.print("good job");
        }
        else if(Score>70){
            System.out.print("Excellent performance");
        }
            
        }
    }
