public class UmerException {
    public void vote(int age){
        if(age>18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("youre little bird");
        }

    }

    static void main(String[] args) {
        UmerException e1=new UmerException();
        try{
            e1.vote(16);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            throw  e;
        }
    }
}
