package customexception;

public class CustomException {
    public static void main(String[] args) throws AgeException {
        int age = 180;
        if(!(age>=18 && age<=120)){
            throw new AgeException("age should between 18 and 120");
        }
        System.out.println("age correct");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}