package mysqlejemplo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionSQL {

    Connection conexion = null;

    public Connection ConexionBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/acueducto", "root", "");

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return conexion;
    }

}
