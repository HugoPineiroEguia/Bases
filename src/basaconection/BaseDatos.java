
package basaconection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BaseDatos extends javax.swing.JFrame {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion bd = new Conexion();
    boolean mod = false; 
    String nomMod = null;

    public BaseDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lBaseDatos = new javax.swing.JLabel();
        bConectar = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        tNom = new javax.swing.JTextField();
        tDNI = new javax.swing.JTextField();
        tApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bAnadair = new javax.swing.JToggleButton();
        bMod = new javax.swing.JToggleButton();
        bEliminar = new javax.swing.JToggleButton();
        bConsulta = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        lBaseDatos.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lBaseDatos.setForeground(new java.awt.Color(0, 51, 51));
        lBaseDatos.setText("BASE DE DATOS ALUMNOS");

        bConectar.setBackground(new java.awt.Color(153, 204, 255));
        bConectar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bConectar.setForeground(new java.awt.Color(60, 63, 65));
        bConectar.setText("CONECTAR");
        bConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConectarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 51));

        tNom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomActionPerformed(evt);
            }
        });

        tDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE DEL ALUMNO");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("APELLIDOS DEL ALUMNO");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI DEL ALUMNO");

        bAnadair.setBackground(new java.awt.Color(51, 51, 255));
        bAnadair.setForeground(new java.awt.Color(255, 255, 255));
        bAnadair.setText("Añadir");
        bAnadair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnadairActionPerformed(evt);
            }
        });

        bMod.setBackground(new java.awt.Color(51, 51, 255));
        bMod.setForeground(new java.awt.Color(255, 255, 255));
        bMod.setText("Modificar");
        bMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModActionPerformed(evt);
            }
        });

        bEliminar.setBackground(new java.awt.Color(51, 51, 255));
        bEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bConsulta.setBackground(new java.awt.Color(51, 51, 255));
        bConsulta.setForeground(new java.awt.Color(255, 255, 255));
        bConsulta.setText("Consulta");
        bConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lBaseDatos))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                        .addComponent(tApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tNom, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bAnadair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAnadair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMod, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConectarActionPerformed
           
        try {
            bd.establecerConexion();
            JOptionPane.showMessageDialog(null, "CONEXION CON EXITO");
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_bConectarActionPerformed

    private void tNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomActionPerformed
        
    }//GEN-LAST:event_tNomActionPerformed

    private void bAnadairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadairActionPerformed
        
        Connection conectar = null;
         
       
        try {
            
            conectar =  bd.establecerConexion();
            
            ps = (PreparedStatement) conectar.prepareStatement("INSERT INTO sqlconection (Nombre, Apellidos, DNI) VALUES (?,?,?)");
            ps.setString(1, tNom.getText());
            ps.setString(2, tApellidos.getText());
            ps.setString(3, tDNI.getText());
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "FILA INSERTADA CON EXITO");
            tNom.setText("");
            tApellidos.setText("");
            tDNI.setText("");
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }  
        
        
        
    }//GEN-LAST:event_bAnadairActionPerformed

    private void bModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModActionPerformed
        
        Connection conectar = null;    
        
        if (mod==true){
        try {
            
            conectar =  bd.establecerConexion();
            
            ps = (PreparedStatement) conectar.prepareStatement("UPDATE sqlconection set Apellidos=?, DNI=? WHERE Nombre=?");
            ps.setString(1, tApellidos.getText());
            ps.setString(2, tDNI.getText());
            ps.setString(3, nomMod);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "FILA MODIFICADA CON EXITO");
            tNom.setText("");
            tApellidos.setText("");
            tDNI.setText("");
            
            mod = false;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        } 
        else if (mod==false){
            nomMod = JOptionPane.showInputDialog("ESCRIBE EL NOMBRE DEL USUARIO QUE DESEAS MODIFICAR");
            mod = true;
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_bModActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        
        Connection conectar = null;
        String nombre = JOptionPane.showInputDialog("ESCRIBE EL NOMBRE DEL USUARIO QUE DESEAS ELEMINAR DE LA BASE DE DATOS");
       
        try {
            
            conectar =  bd.establecerConexion();
            
            ps = (PreparedStatement) conectar.prepareStatement("DELETE FROM sqlconection WHERE Nombre = ?");
            ps.setString(1, nombre);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "FILA ELIMINADA");
            tNom.setText("");
            tApellidos.setText("");
            tDNI.setText("");
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }  
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaActionPerformed
                
        Connection conectar = null;
         
       
        try {
            
            conectar =  bd.establecerConexion();
            String nombre = JOptionPane.showInputDialog("ESCRIBE EL NOMBRE DEL USUARIO QUE DESEAS CONSULTAR LOS DATOS");
            
            ps = (PreparedStatement) conectar.prepareStatement("SELECT * FROM sqlconection WHERE Nombre = ?");
            ps.setString(1, nombre);
            
            rs =ps.executeQuery();
            JOptionPane.showMessageDialog(null, "CONSULTA REALIZADA CON EXITO");
            if(rs.next()){
                tNom.setText(rs.getString("Nombre"));
                tApellidos.setText(rs.getString("Apellidos"));
                tDNI.setText(rs.getString("DNI"));
            }
            
            
            
        
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }  
    }//GEN-LAST:event_bConsultaActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bAnadair;
    private javax.swing.JToggleButton bConectar;
    private javax.swing.JToggleButton bConsulta;
    private javax.swing.JToggleButton bEliminar;
    private javax.swing.JToggleButton bMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lBaseDatos;
    private javax.swing.JTextField tApellidos;
    private javax.swing.JTextField tDNI;
    private javax.swing.JTextField tNom;
    // End of variables declaration//GEN-END:variables

}