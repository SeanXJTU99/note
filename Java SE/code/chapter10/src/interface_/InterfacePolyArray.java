package interface_;

public class InterfacePolyArray {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new iPhone();
        usbs[1] = new Camera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if(usbs[i] instanceof iPhone){
                ((iPhone) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class iPhone implements Usb{
    public void call(){
        System.out.println("calling");
    }

    @Override
    public void work() {
        System.out.println("phone work");
    }
}
class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("camera work");
    }
}