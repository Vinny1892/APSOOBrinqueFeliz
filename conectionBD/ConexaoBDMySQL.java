package conectionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author kaio
 */
public class ConexaoBDMySQL {


    private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/brinque_feliz";
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "passwordRoot";

    public static Connection getConnection() {
        System.out.println("Conectando ao Banco de Dados");
        System.out.println("passou Aqui");
        try {
            Class.forName(DRIVER_CLASS);
            return DriverManager.getConnection(URL_MYSQL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }
}
