package interface_;

public class InterfaceExercise {
    public static void main(String[] args){
        new C().pX();
    }
}
interface A{int x= 0;}
class B{int x = 1;}
class C extends B implements A{
    public void pX(){
        //sout(x);     //ERROR，x混淆
        //明确指定x
        System.out.println(A.x);
        System.out.println(super.x);
    }

}