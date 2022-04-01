package staticjava;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println("num of total= " + Person.getTotalPerson());
        Person p1 = new Person();
        System.out.println("num of total= " + Person.getTotalPerson());
        Person.setTotalPerson(3);
        new Person();
    }
}
class Person{
    private int id;
    private static int total = 0;
    public static int getTotalPerson(){
//        id++;
        return total;
    }
    public Person(){
        total ++;
        id = total;
    }
    public static void  setTotalPerson(int total){
//        this.total = total;
        Person.total = total;
    }
}