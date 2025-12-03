import java.util.*;
public class Method {
    public void show() {
        System.out.println("Hello");
    }
    public static int sum(int a, int b){
        int c = a+b;
        return c;
    }
    public static void SI(int p,int t,int r){
        int si=p*t*r;
        System.out.println("SI="+si);
    }
    public static int prod(){
        int a=10, b=20;
        return a+b;
    }
    public static void main(String[]args){
        Object show;

       System.out.println(sum(20,10));
       SI(1000,20,10);
        System.out.println(prod());
    }


}
