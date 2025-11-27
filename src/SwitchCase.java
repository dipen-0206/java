import java.util.Scanner;
public class SwitchCase {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("**** Menu ****");
        System.out.println("1.Sum\n2. Product\n3. Reminder\n4. Quotient\n5. Difference");
        System.out.println("enter your choice");
        int c=sc.nextInt();
        switch(c){
            case 1:
                System.out.println("sum"+(a+b));
                break;
            case 2:
                System.out.println("product"+(a*b));
                break;
            case 3:
                System.out.println("Reminder"+(a%b));
                break;
            case 4:
                System.out.println("quotient"+(a/b));
                break;
            case 5:
                System.out.println("Difference"+(a-b));
                break;
            default:
                System.out.println("error");
                break;
        }
    }

}
