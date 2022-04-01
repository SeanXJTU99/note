package enum_;

public class EnumerationExercise {
    public static void main(String[] args) {
        //获取枚举类对象
        Week[] values = Week.values();
        for(Week week:values){
            System.out.println(week);
        }
    }
}
enum Week{
    MONDAY("1"),TUESDAY("2");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
