class Pops{
    public void display(){
        System.out.println("1crore");
    }
}
class Son extends Pops{}
class Nati extends Son {}



public class MultiLevelExample {
    static void main(String[] args){
        Nati n1=new Nati();
        n1.display();
    }
}
