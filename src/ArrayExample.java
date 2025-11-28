import java.util.*;
public class ArrayExample {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int []c=new int[]{1,2,3,4,5,6,7,8,9,10};
//        for (int x:c){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//
//        int []d=new int[5];
//        System.out.println("enter 5 number");
//        for (int i=0;i<5;i++) {
//            d[i] = sc.nextInt();
//        }
//        for (int x:d){
//            System.out.print(x+" ");
//        }


//        int [][]arr = new int[3][4];
//        System.out.println("Enter 3*4 array:");
//        for (int i=0;i<3;i++){
//            for (int j=0;j<4;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        for (int i=0;i<3;i++){
//            for (int j=0;j<4;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int [][] arr=new int [][]{
//                {1},
//                {1,2},
//                {1,2,3},
//                {1,2,3,4}
//        };
//        for (int i=0;i<arr.length; i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        int []a= new int[2];
        int []b = new int[2];
        System.out.println("enter first array");
        for (int i=0;i<2;i++){
            a[i] =sc.nextInt();
        }

        System.out.println("enter second array");
        for (int i=0;i<2;i++){
            b[i]= sc.nextInt();
        }

        System.out.println("sum is =");
        int []s= new int[2];
        for (int i=0;i<2;i++){

            s[i]=a[i]+b[i];
        }

        for (int x:s){
            System.out.println(x+" ");
        }


    }
}
