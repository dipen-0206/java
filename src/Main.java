import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age<18)
            System.out.println("umer pugena vai tero");
        else
            System.out.println("vote dey aaba ");
    }

}