package string_.stringbuffer;

public class StrToStrBuffer {
    public static void main(String[] args) {
        String str = "helo";
        //返回Buffer对象，对str没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //append
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);


        //Buffer ->string
        StringBuffer stringBuffer2 = new StringBuffer("123abc");
        //toString
        String s = stringBuffer2.toString();
        //构造器
        String s1 = new String(stringBuffer2);
    }
}
