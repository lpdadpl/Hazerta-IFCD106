package hazerte.com.presentacion;

import hazerte.com.modelo.Producto;
import hazerte.com.persistencia.AcessoProductos;
import hazerte.com.persistencia.Connection;

import java.sql.SQLException;
import java.util.List;

public class Inicio
{
    protected Connection myConnection;


    public static void main(String[] args) {
        System.out.println("aplicacion iniciada");
        Connection c1 = new Connection();
        AcessoProductos ap = new AcessoProductos();

        try {
            List<Producto> productos = ap.obtenerProductos();
            for(Producto p : productos){
                System.out.println(p.toString());
            }
        } catch (ClassNotFoundException e){
            System.out.println(e.toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
