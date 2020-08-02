
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author RasedulRussell
 * 
 */

public class LogInForm extends javax.swing.JFrame {
    
    Connection connection = null;
    private String userName, password;
    
    public LogInForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        LogIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 103, 44));

        UserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 157, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 103, 43));

        PasswordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 157, 43));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 118, 47));

        LogIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LogIn.setText("log In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        getContentPane().add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 105, 47));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Welcome To Drug Deals");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 444, 35));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\pharmacy4.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        userName = UserName.getText();
    }//GEN-LAST:event_UserNameActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        password = PasswordField.getText();
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UserName.setText("");
        PasswordField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        userName = UserName.getText();
        password = PasswordField.getText();
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        try {
            Statement st = connection.createStatement();
            String query = "select * from useraccount where username= '" + userName + "' and password='"+
                            password + "' and act=1";
            ResultSet rs = st.executeQuery(query);
            System.out.println(query);
            if(rs.next()){
                this.setVisible(false);
                ManagerFrame mframe = new ManagerFrame(connection);
                mframe.setVisible(true);
            }else{
                query = "select * from useraccount where username= '" + userName + "' and password='"+
                            password + "' and act=2";
                rs = st.executeQuery(query);
                if(rs.next()){
                    Memo memo = new Memo();
                    this.setVisible(false);
                    memo.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"invalid user");
                    UserName.setText("");
                    PasswordField.setText("");
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LogInActionPerformed

    public void SetVisible(LogInForm obj){
        this.setVisible(true);
    }
    
    public void setConnection(Connection conn){
        connection = conn;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
