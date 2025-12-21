public class ConstructorTypes {
    private ConstructorTypes(){
        System.out.println("this is private constructor");
    }
    public ConstructorTypes(int x, int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
           ConstructorTypes c1=new ConstructorTypes();
           ConstructorTypes c2=new ConstructorTypes(2,3);

    }
}

