/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.HomeworkBaseDeDatos.GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Mejia
 */
public class Product {
     Connection con;
private String id;
private String name;
private float cost;
private int stock;

public Product(){
    
}

public void addProduct(String idStr,String nameStr, String costStr, String stockStr){
     try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
     
      try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventarioproyecto?useTimezone=true&serverTimezone=UTC","root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO productos VALUES('"+idStr+"','"+nameStr+
                    "','"+costStr+"','"+stockStr+"')");
        } catch (SQLException ex) {
            Logger.getLogger(FrmProduct.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de Datos");
        }
}
}
