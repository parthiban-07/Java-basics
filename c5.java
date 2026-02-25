import java.util.Scanner;
class c4{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int subject1Mark = Scan.nextInt();
        int subject2Mark = Scan.nextInt();
        int subject3Mark = Scan.nextInt();
        int subject4Mark = Scan.nextInt();
        int subject5Mark = Scan.nextInt();
        int totalMarks = subject1Mark + subject2Mark + subject3Mark + subject4Mark + subject5Mark;
        Double Average = totalMarks/5.0;
        if(Average<35){
            System.out.print("Additional class is required");
        }
        else{
            System.out.print("You are good to go");
        }
    }
    }