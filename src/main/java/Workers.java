
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RasedulRussell
 */
public class Workers extends javax.swing.JFrame {

    /**
     * Creates new form Workers
     */
    Connection connection = null;
    ManagerFrame mFrame = null;
    public Workers(Connection connection, ManagerFrame mFrame) {
        this.connection = connection;
        this.mFrame = mFrame;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Act = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Done = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(81, 143, 109, 42);
        getContentPane().add(UserName);
        UserName.setBounds(411, 146, 177, 42);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(81, 244, 109, 42);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Act");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(81, 346, 109, 42);
        getContentPane().add(Act);
        Act.setBounds(411, 349, 177, 42);
        getContentPane().add(Password);
        Password.setBounds(411, 247, 177, 42);

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(498, 440, 90, 42);

        Done.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        getContentPane().add(Done);
        Done.setBounds(81, 440, 90, 42);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Drug Deals");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(171, 42, 250, 58);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        this.setVisible(false);
        mFrame.setVisible(true);
    }//GEN-LAST:event_DoneActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        try {
            Statement st = connection.createStatement();
            String userName = UserName.getText();
            String password = Password.getText();
            int act = Integer.parseInt(Act.getText());
            String query = "select * from useraccount where username= '" + userName + "' and password='"+
                            password + "' and act=" + act;
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Workers exist chose different Workers");
                UserName.setText("");
                Password.setText("");
                Act.setText("");
            }else{
                String qr = "insert into useraccount values('" + userName + "', '" + password + "'," + act + ")";
                st.executeQuery(qr);
                JOptionPane.showMessageDialog(null,"Workers Added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Workers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Act;
    private javax.swing.JButton Add;
    private javax.swing.JButton Done;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
