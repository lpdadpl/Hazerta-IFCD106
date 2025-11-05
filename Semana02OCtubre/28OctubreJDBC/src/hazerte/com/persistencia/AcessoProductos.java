package hazerte.com.persistencia;

import hazerte.com.modelo.Producto;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AcessoProductos extends Connection{

    public List<Producto> obtenerProductos() throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        Statement sentencia;
        ResultSet rejilla;
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "SELECT product_id, product_name FROM products";
        //2. Abrir conexion
        openConnection();
        //3. Abrir sentencia
        sentencia =  myConnection.createStatement();
        //4. Ejecutar sentencia
        rejilla = sentencia.executeQuery(sql);
        //5. Procesar resultados
        while (rejilla.next()){
            Producto p = new Producto();
            p.setId(rejilla.getInt("product_id"));
            p.setNombre(rejilla.getString("product_name"));
            listaProductos.add(p);
        }

        cerrarConexion();
        return listaProductos;


    }
}
