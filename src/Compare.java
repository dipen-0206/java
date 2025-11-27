import java.util.Scanner;

public class Compare {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b)
            System.out.println("both are equal");
        else {
            if(a<b)
                System.out.println("first num is small");
            else
                System.out.println("second num is small");
        }

    }
}
