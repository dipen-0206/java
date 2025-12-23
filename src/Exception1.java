import java.util.Scanner;

public class Exception1 {
    static void main(String[] args) {
        int salary ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        salary=sc.nextInt();
        if (salary<50000){
            throw new ArithmeticException("you are not welcome");
        }
        else{
            System.out.println("welcome my friends");
        }
    }

}
