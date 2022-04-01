package interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型变量可以指向，实现接口的类的对象
        IG ig = new Teacher();
        //若IG继承了IH，Teacher实现了IG，相当于Teacher也实现了IH
        IH ih = new Teacher();
    }
}

interface IH{}
interface IG extends IH{}
class Teacher implements IG{}