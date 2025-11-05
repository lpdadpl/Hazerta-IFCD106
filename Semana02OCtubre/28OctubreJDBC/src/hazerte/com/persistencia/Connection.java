package hazerte.com.persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    java.sql.Connection myConnection;

    public void openConnection() throws ClassNotFoundException, SQLException {
        try{
            Class.forName("org.postgresql.Driver");
            myConnection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/northwind",
                    "postgres",
                    "a"

            );
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void cerrarConexion() throws SQLException {
        if (myConnection != null && !myConnection.isClosed()) {
            myConnection.close();
            System.out.println("Conexión cerrada con éxito.");
        }
    }
}
