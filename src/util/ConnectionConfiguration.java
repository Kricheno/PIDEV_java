package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {

    static String url="jdbc:mysql://localhost:3306/pidev?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String login="root";
    static String password="";

     Connection conn;

    public  Connection getConnection() {
        return conn;
    }

    static ConnectionConfiguration conconf;

    public static ConnectionConfiguration getInstance(){
        if(conconf==null){
            conconf= new ConnectionConfiguration();
        }
        return conconf;
    }
    private ConnectionConfiguration() {

        try {
            conn = DriverManager.getConnection(url, login, password);
            System.out.println("Connection established");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
