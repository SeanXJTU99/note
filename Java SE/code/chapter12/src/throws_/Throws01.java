package throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }
    public void f1() throws FileNotFoundException{//调用者处理
        //FileNotFoundException 编译异常
        //也可以try-catch
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
