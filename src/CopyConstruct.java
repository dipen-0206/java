public class CopyConstruct {
    private String name, address;
    public CopyConstruct(String name, String address){
        this.name=name;
        this.address=address;
        System.out.println(name+" "+address);
    }
    public CopyConstruct(CopyConstruct c1){
        name= c1.name;
        address=c1.address;
        System.out.println(name+" "+address);
    }

    static void main(String[] args) {
        CopyConstruct c1=new CopyConstruct("ram","kalanki");
        CopyConstruct c2=new CopyConstruct(c1);
    }
}
