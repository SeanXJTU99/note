package interface_.dbinterface;

public class DBwork {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
    }
    public static void t(DBinterface db){
        db.connect();
        db.close();
    }
}
