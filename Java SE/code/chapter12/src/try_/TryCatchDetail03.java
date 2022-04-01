package try_;

public class TryCatchDetail03 {
    public static void main(String[] args) {
        try {
            int res = 10 / 0;
            System.out.println(res);
        } finally {
            System.out.println("finally");
        }
        System.out.println("res");
    }
}
