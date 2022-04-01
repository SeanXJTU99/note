package try_;

public class TryExercise {
    public static int method(){
        int i =1;
        try {
            i++;
            int res = 10/0;
            return 1;
        } catch (ArithmeticException e) {
//            return ++i;
            return i++;
        }finally {
//             return ++i;
            ++i;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
