import java.util.Scanner;
class q4 {
    public static void main(String[] args) 
    {
      Scanner Scan = new Scanner(System.in);
      String name = Scan.nextLine();
      double Score =Scan.nextDouble();
      Scan.nextLine();
     String department = Scan.nextLine();
        
          System.out.println("My name is  "+name);
          System.out.println("My Score is  "+Score/10 +"10");
          System.out.println("My department is  "+department);

    }}