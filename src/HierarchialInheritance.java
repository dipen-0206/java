class IT{
    public void messages(){
        System.out.println("this is it course");
    }
}
class BCA1 extends IT{ }
class BIT extends IT{}
class BScCSIT extends IT{}

public class HierarchialInheritance {
    static void main(String[] args){
        BCA1 b1=new BCA1();
        BIT b2=new BIT();
        BScCSIT b3=new BScCSIT();
        b1.messages();

        b2.messages();
        b3.messages();
    }
}
