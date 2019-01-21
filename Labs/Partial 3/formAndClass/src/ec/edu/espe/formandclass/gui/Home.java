/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.formandclass.gui;

import edu.ec.espe.util.FileManager;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author JDIsmael
 */
public class Home extends javax.swing.JFrame {
    private String user = "";
    public Home(String user) {
        initComponents();
        this.user = user;
        lblUser.setText("User: " + user);
        setLocation(400, 150);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblPAy = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        btnQuery = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();
        txtHourWork = new javax.swing.JTextField();
        lblMenssage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jLabel1.setOpaque(true);

        lblUser.setBackground(new java.awt.Color(0, 153, 153));
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Usuario Loggeado");
        lblUser.setOpaque(true);

        btnOut.setBackground(new java.awt.Color(0, 153, 153));
        btnOut.setForeground(new java.awt.Color(255, 255, 255));
        btnOut.setText("cerrar sesion");
        btnOut.setBorderPainted(false);
        btnOut.setOpaque(true);
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        jLabel3.setText("Registre usuario");

        lblName.setText("Nombres: ");

        lblSurname.setText("Apellidos:");

        lblPAy.setText("Sueldo por hora:");

        lblHour.setText("Hora trabajadas por mes:");

        btnQuery.setText("Consultar Empleados");
        btnQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryActionPerformed(evt);
            }
        });

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblMenssage.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblMenssage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSurname)
                            .addComponent(lblName)
                            .addComponent(lblPAy)
                            .addComponent(lblHour))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtSurname)
                                    .addComponent(txtPay)
                                    .addComponent(txtHourWork, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuery)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenssage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPAy)
                    .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHour)
                    .addComponent(txtHourWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnQuery))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMenssage, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOutActionPerformed

    private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryActionPerformed
        Query query = new Query(user);
    }//GEN-LAST:event_btnQueryActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        lblMenssage.setText("");
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String key =txtName.getText(); 
        if(!txtHourWork.getText().trim().equals("") && !txtName.getText().trim().equals("")
                && !txtPay.getText().trim().equals("") && !txtSurname.getText().trim().equals("")){
            FileManager.writeFile(new File("trabajadores.csv")
                ,key +";"+txtSurname.getText()+";"+txtPay.getText()+";"
                        +txtHourWork.getText()+"\n");
            float salary = calculateSalary(Float.parseFloat(txtPay.getText()), Integer.parseInt(txtHourWork.getText()));
            float iess = calculateIess(salary);
            FileManager.writeFile(new File("Sueldos.csv"), key + ";" + salary + ";" + iess + "\n");
            lblMenssage.setText("Empleado "+txtName.getText()+" agregado exitosamente");
            cleanField();
        }else{
            JOptionPane.showMessageDialog(this, "Llene todos los campos"
                        , "Error al agregar Empleado", JOptionPane.ERROR_MESSAGE);
            lblMenssage.setText("");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed
    
    private float calculateSalary(float money, int hourWork){
        return money * hourWork;
    }
    private float calculateIess(float salary){
        return salary * 0.0945f;
    }
    private void cleanField(){
        txtHourWork.setText("");
        txtName.setText("");
        txtPay.setText("");
        txtSurname.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblMenssage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPAy;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtHourWork;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
