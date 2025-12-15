class Encapsulation {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    static class Ex{
        static void main(String[]args){
            Encapsulation e1=new Encapsulation();
            e1.setName("Raju");
            e1.setAddress("Kritipur");
            System.out.println(e1.getName()+" "+e1.getAddress());
        }
    }
}
