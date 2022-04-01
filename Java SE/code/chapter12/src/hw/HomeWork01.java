package hw;

public class HomeWork01 {
    public static void main(String[] args) {
        //先验证输入参数正确
        try {
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("args number error");
            }
            //转整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要整数");
        }catch(ArithmeticException e){
            System.out.println("divide by 0");
        }
    }
    public static double cal(int n1, int n2){
        return n1 / n2;
    }
}
