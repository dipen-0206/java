import java.util.*;
public class  MarksChecker {
    static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        if(marks<40)
            System.out.println("fail");
        else if (marks<60)
            System.out.println("3rd division");
        else if (marks<70)
            System.out.println("2nd division");
        else if (marks<80)
            System.out.println("1st division");
        else if (marks<=100)
            System.out.println("distinction");
        else
            System.out.println("error");

        }

    }

