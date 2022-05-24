/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basaconection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conectar;
    PreparedStatement ps;
    
    public Connection establecerConexion(){      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/MarcosLeSupoAlPOV", "root", "8904");

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base correctamente"+e.toString());
        }
        
        return conectar;
    }
    

    
    
    
    
    
    
}
