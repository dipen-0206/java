abstract class Abstraction{
    public void show(){
        System.out.println("this is abstraction by abstract");

    }
    public abstract void display();
}
class Example extends Abstraction{
    @Override
    public void display() {
        System.out.println("use of abstraction");
    }
}
class Abstraction1 {
    static void main(String[] args) {
        Example e1 = new Example();
        e1.show();
        e1.display();

    }
}