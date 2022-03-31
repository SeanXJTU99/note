package hw;

/*
 输入用户名 密码 邮箱，若正确则提示注册成功 否则生成异常对象
 用户名长度2-4
 密码长度6，全是数字
 邮箱中包含@和. 且@在.之前
 */
public class Homework02 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "1067346500@qq.com";
        try {
            userRegister(name,pwd,email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void userRegister(String name, String pwd, String email){

        if(name == null || pwd == null || email== null){
            throw new RuntimeException("cannot be null");
        }
        //用户名校验
        if(!(name.length()<=4 && name.length()>=2)){
            throw new RuntimeException("username length error");
        }
        //密码校验
        if(!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("password should be 6 bit int");
        }
        //邮箱校验
        int i1 = email.indexOf('@');
        int i2 = email.indexOf('.');
        if(!(i1 > 0 && i2 > i1 +1 )){
            throw new RuntimeException("email format error");
        }
        System.out.println("registered successfully");
    }
    //检验一个字符串是否全是数字
    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
