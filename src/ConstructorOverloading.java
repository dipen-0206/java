public class ConstructorOverloading {
    public ConstructorOverloading(int x,int y){
        System.out.println("sum="+(x+y));

    }
    public ConstructorOverloading(double x,double y){
        System.out.println("sum="+(x+y));
    }
    public ConstructorOverloading(int x,int y,int z){
        System.out.println("sum="+(x+y+z));

    }
    public ConstructorOverloading(int x,int y,int z,int i){
        System.out.println("sum="+(x+y+z+i));

    }

    public static void main(String[] args) {
        new ConstructorOverloading(10,20);
        new ConstructorOverloading(10,20);
        new ConstructorOverloading(10,20,30);
        new ConstructorOverloading(10,20,30,40);


    }


}
