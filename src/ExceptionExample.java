public class ExceptionExample {
    static void main(String[] args) {
     int []x={1,2,3,5,7,9};
     try {
         System.out.println(x[10]);

     }
     catch (Exception e){
         System.out.println("Exception Occured:"+e.getMessage());
     }
    }
}
