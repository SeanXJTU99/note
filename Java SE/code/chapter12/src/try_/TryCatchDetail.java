package try_;

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("program going");
        }
    }
}