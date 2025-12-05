public class Program {
    public void show(){
        System.out.println("Hello k xa");
    }
    public void sum(int a, int b){
        System.out.println("Sum="+(a+b));
    }

}
class BCA {
    static void main(String[] args) {
        Program p1 = new Program();
        p1.show();
        Program p2=new Program();
        p2.show();
        Program p3=new Program();
        p3.sum(10,20);
    }
}
