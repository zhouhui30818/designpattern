package flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 11:59
 */
public class ConnectionPool {

    private static String url = "jdbc:mysql://139.129.135.123:3306/try2better";
    private static String username = "root";
    private static String password = "zhou30818";
    private static String driverClassName = "com.mysql.jdbc.Driver";
    private static int poolSize = 3;
    private static List<Connection> connectionList = new ArrayList<Connection>();

    static {
        try {
            for (int i = 0; i < poolSize; i++) {
                Connection connection = createConnection();
                connectionList.add(connection);
            }
        }catch (Exception e){
            if(connectionList != null && !connectionList.isEmpty()){
                for(Connection connection : connectionList){
                    if(connection == null){
                        continue;
                    }
                    try {
                        connection.close();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    public static Connection fetchConnection(){
        synchronized (connectionList){
            if(connectionList.size() > 0){
                Connection connection = connectionList.get(0);
                if(connection != null){
                    connectionList.remove(connection);
                    return connection;
                }else {
                    return null;
                }
            }else{
                return null;
            }
        }
    }

    public static void release(Connection connection){
        synchronized (connectionList){
            connectionList.add(connection);
        }
    }

    public static void closeAll(){
        synchronized (connectionList){
            for(Connection connection : connectionList){
                if(connection == null){
                    continue;
                }
                try {
                    connection.close();
                }catch (Exception e){

                }
            }
        }
    }

    private static Connection createConnection(){
        try {
            Class.forName(driverClassName);
            return DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
