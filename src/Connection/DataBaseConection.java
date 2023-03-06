package Connection;

import com.MySqlDbConnection;

import java.sql.Connection;
public class DataBaseConection {
    public class DbConnection {
        static Connection connection = null;
        public static Connection getConnections(){
            connection = MySqlDbConnection.getConnection("studentdb", "root", "1234");
            return connection;

        }

    }

}
