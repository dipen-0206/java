import java.util.Scanner;

public class Prime {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
                count++;
        }
        if (count==2)
            System.out.println("prime number");
        else if (count>2)
            System.out.println("composite number");
        else
            System.out.println("Neither prime nor composite");
    }
}
