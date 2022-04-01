package try_;

public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person("jack");
            person = null;
            System.out.println(person.getName());
            int n = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
        }


    }
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}