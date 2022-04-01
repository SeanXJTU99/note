package hw;

public class Homework02 {
    public static void main(String[] args){
        if(args[4].equals("john")){//ArrayIndexOutOfBoundsException
            System.out.println("AA");
        }else{
            System.out.println("BB");
        }
        Object o =args[2];//String->Obj,向上转型
        Integer i = (Integer)o;//String->Integer向下转型，错误 ClassCastException
    }
}
