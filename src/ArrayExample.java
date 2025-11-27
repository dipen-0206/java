import java.util.*;
public class ArrayExample {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []c=new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int x:c){
            System.out.print(x+" ");
        }
        System.out.println();

        int []d=new int[5];
        System.out.println("enter 5 number");
        for (int i=0;i<5;i++) {
            d[i] = sc.nextInt();
        }
        for (int x:d){
            System.out.print(x+" ");
        }




    }
}
