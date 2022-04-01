package innerclass;

public class AnonymousInnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone();
        cp.alarm(new Bell(){
            @Override
            public void ring() {
                System.out.println("get up");
            }
        });
        cp.alarm(new Bell(){
            @Override
            public void ring() {
                System.out.println("take class");
            }
        });
    }
}
class Cellphone{
    public void alarm(Bell bell){
        bell.ring();
    }
}

interface Bell{
    void ring();
}