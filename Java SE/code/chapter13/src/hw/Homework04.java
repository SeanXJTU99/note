package hw;

/*
输入字符串，判断有多少大写字母，小写字母，数字
 */
public class Homework04 {
    public static void main(String[] args) {
        String input = "1234LiuKai";
        countStr(input);
    }
    /*
    遍历字符串，若在0-9则为数字。。。
     */
    public static void countStr(String str){
        if(str == null){
            System.out.println("null");
            return;
        }
        int strLen = str.length();
        int numCount = 0, lowerCount = 0, upperCount = 0, otherCount = 0;
        for (int i = 0; i < strLen; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i)<='9'){
                numCount ++;
            }else if(str.charAt(i) >='a' && str.charAt(i) <='z'){
                lowerCount ++;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upperCount ++;
            }else{
                otherCount ++;
            }
        }
        System.out.println("number" + numCount);
        System.out.println("lowercase" + lowerCount);
        System.out.println("uppercase" + upperCount);
    }
}
