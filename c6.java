
import java.util.Scanner;

class c6{
    public static void main(String args []){
        Scanner Scan = new Scanner(System.in);
        String colourOfTheTrafficLight = Scan.nextLine();
        if(colourOfTheTrafficLight.equals("Red")){
            System.out.print("stop");
        }
        else if(colourOfTheTrafficLight.equals("yellow")){
            System.out.print("get reaady");
        }
        else if(colourOfTheTrafficLight.equals("green")){
            System.out.print("goo");
        }
    }
}