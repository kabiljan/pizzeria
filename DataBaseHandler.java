import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler extends Config {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName +  "?" + "useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
        Class.forName( "com.mysql.jdbc.Driver" );
        dbConnection = DriverManager.getConnection( connectionString, dbUser,
                dbPass );
        return dbConnection;
    }

    public void signUpUser(String Имя, String Фамилия, String Адрес, String Телефон) {
        String insert = "INSERT INTO" + Const.polzovateli_table + "(" + Const.polzovateli_Имя + ","
                + Const.polzovateli_Фамилия + "," + Const.polzovateli_Адрес + ","
                + Const.polzovateli_Телефон + ")" + "VALUES(?,?,?,?)";


        try {
            PreparedStatement prSt = getDbConnection().prepareStatement( insert );
            prSt.setString( 1, Имя );
            prSt.setString( 2, Фамилия );
            prSt.setString( 3, Адрес );
            prSt.setString( 4, Телефон );

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
