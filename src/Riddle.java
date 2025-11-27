import java.util.*;
public class Riddle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
        System.out.println("\nEnter your answer");
        String Ans = sc.nextLine();
        if (Ans.equalsIgnoreCase("echo"))
            System.out.println("congratulations");
        else
            System.out.println("Wrong, Try again");

    }
}
