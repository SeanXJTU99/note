package hw;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1, 19,"jcak"));
        dao.save("002",new User(2,20,"user"));
        dao.save("003",new User(3,25,"luv"));
        List<User> userList = dao.list();
        System.out.println(userList);

        dao.update("003", new User(3,58, "milan"));
        List<User> list1 = dao.list();
        System.out.println(list1);
    }
}
