package bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bI = new BigInteger("8000000000");
        System.out.println(bI);
        //计算需要特定的方法
        BigInteger add = bI.add(BigInteger.valueOf(2));
        System.out.println(add);
//        long l = 8000000000;
//        System.out.println(l);
    }
}
