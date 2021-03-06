package hw;

public class Homework01 {
    public static void main(String[] args) {
        String str = "abcde";
        String str2 = null;
        try {
            str2 = reverse(str,0,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(str2);
    }
    public static String reverse(String str, int start, int end){
        //输入参数验证
        if(!(str != null && start >=0 && end<=str.length() && end >start)){
            throw new RuntimeException("args error");
        }
        //双指针相向交换
        //先将字符串提取为字符数组
        char[] chars = str.toCharArray();
        //交换媒介
        char temp = ' ';
        for(int i = start, j = end; i<j;i++,j--){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
