package interface_.dbinterface;

public class OracleDB implements DBinterface {
    @Override
    public void connect() {
        System.out.println("oracle connected");
    }

    @Override
    public void close() {
        System.out.println("oracle closed");
    }
}
