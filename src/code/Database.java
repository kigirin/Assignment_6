package code;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
    private static String url;
    private static String user;
    private static String password;

    public Database(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
    public static boolean getInstance(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return true;
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean stmt(String str){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement st=connection.prepareStatement(str);
            st.executeUpdate();
            return true;
        }
        catch (SQLException e){
            return  false;
        }

    }
}
