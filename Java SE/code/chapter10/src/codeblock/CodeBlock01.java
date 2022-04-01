package codeblock;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CodeBlock01 {
    public static void main(String[] args) {
//        Movie movie = new Movie("1", 10, "2");
//        AA aa = new AA();
        BB bb = new BB();
        System.out.println(Cat.n1);
        System.out.println(DD.n1);
        DD dd = new DD();
        System.out.println(dd.n1);

    }
}
class AA{
    static{
        System.out.println("AA 静态代码块");
    }
}
class BB extends AA{
    static {
        System.out.println("BB 静态代码块");
    }
}
class Cat{
    public static int n1 = 99;
    static {
        System.out.println("Cat 静态代码块");
    }
}
class DD{
    public static int n1 = 10;
    static{
        System.out.println("DD 静态代码块");
    }
    {
        System.out.println("DD 普通代码块");
    }
}