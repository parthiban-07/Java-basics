import java.util.Scanner;
class c7{
    public static void main(String args [])
    {
        Scanner Scan =new Scanner(System.in);
        System.out.print("Enter your salary :");
        int Salary = Scan.nextInt();
        System.out.print("Enter your Age :");
        int Age =Scan.nextInt();
        if(Salary>=20000 || Age<=25){
            System.out.println("You are eligible for loan");
            System.out.println("Enter your loan Amount :");
           int loanAmount = Scan.nextInt(); 
        if(loanAmount<=50000){
            System.out.print("Loan is available");
                             }
        else {
            System.out.print("Maximum loan Amount is 50000");
             }
        
                                     }
    }
        }