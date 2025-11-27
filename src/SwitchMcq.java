import java.util.*;
public class SwitchMcq {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("I build up castles, I tear down mountains.\n" +
                "I make some men blind, I help others to see.\n" +
                "What am I?");
        System.out.println("**** Choices ****\n");
        System.out.println("1. Water\t2. Sand\t3. Time\t4. Wind");
        System.out.println("Enter your choice ");
        int a= sc.nextInt();
        switch(a){
            case 1:
                System.out.println("Wrong Try Again");
                break;
            case 2:
                System.out.println("congrats, your correct");
                break;
            case 3:
                System.out.println("Wrong Try Again");
                break;
            case 4:
                System.out.println("Wrong Try Again");
                break;
            default:
                System.out.println("choose from given options");
                break;
        }
    }
}
