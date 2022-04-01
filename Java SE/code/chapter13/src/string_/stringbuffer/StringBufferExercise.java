package string_.stringbuffer;

public class StringBufferExercise {
    public static void main(String[] args) {
        //价格每三位用逗号隔开
        //使用StringBuffer insert 方法
        String price = "123456.99";
        StringBuffer sb = new StringBuffer(price);
        //先找到小数点索引
        //在该位置前3位插入，
//        int i = sb.lastIndexOf(".");

        for(int i = sb.lastIndexOf(".")-3;i>0;i-=3){
            sb = sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
