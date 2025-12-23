public class CustomException {
    public void vote(int age){
        if (age>=18){
            System.out.println("you can vote");
        }
        else{
            throw new ArithmeticException("Umer pugena");
        }
    }

    static void main(String[] args) {
        CustomException c1=new CustomException();
        c1.vote(17);
    }
}
