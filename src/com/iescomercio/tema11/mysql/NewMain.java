package com.iescomercio.tema11.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.iescomercio.tema10.objectstream.ConexionBD;

public class NewMain {

    public static void main(String[] args) {
        Connection con;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/negocios2011?zeroDateTimeBehavior=convertToNull", "root", "");
            con = ConexionBD.getConexion();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT count(pc.idpedido),emp.nomempleado, year(pc.fechapedido) FROM  pedidoscabe pc natural join empleados emp group by emp.NOMEMPLEADO, year(pc.fechapedido) order by year(fechapedido)");

            while (rs.next()) {
                int nped = rs.getInt(1);
                String nemp = rs.getString("emp.nomempleado");
                int año = rs.getInt(3);
                System.out.println("Nº Pedidos: " + nped + " Nombre: " + nemp + " Año: " + año);
            }
            rs.close();
            stm.close();
            con.close();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
