package interface_;

public interface AInterface {
    public int n1 = 10;
    public void h1();
    //default 修饰 默认方法
    default public void ok(){
        System.out.println("ok");
    }
    public static void cry(){
        System.out.println("cry");
    }
}
