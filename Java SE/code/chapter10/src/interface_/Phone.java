package interface_;

//实现Usb接口的方法
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("phone starts working");
    }

    @Override
    public void end() {
        System.out.println("phone ended working");
    }
}
