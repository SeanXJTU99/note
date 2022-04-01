package interface_.dbinterface;

public class MysqlDB implements DBinterface {
    @Override
    public void connect() {
        System.out.println("connect mysql");
    }

    @Override
    public void close() {
        System.out.println("close mysql");
    }
}
