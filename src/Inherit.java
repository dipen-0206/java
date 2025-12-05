class Parent{
    public void display(){
        System.out.println("1 crore ");
    }
}
class Child extends Parent{


}

public class Inherit {
    static void main(String[] args) {
        Child c1=new Child();
        c1.display();
    }
}
