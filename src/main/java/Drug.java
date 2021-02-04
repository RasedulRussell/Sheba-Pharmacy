
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
public class Drug extends javax.swing.JFrame {
    
    private Connection connection = null;
    ManagerFrame mf = null;
   
    public Drug() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DrugName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Add = new javax.swing.JToggleButton();
        Done = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Drug Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(152, 174, 131, 17);

        DrugName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DrugName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugNameActionPerformed(evt);
            }
        });
        getContentPane().add(DrugName);
        DrugName.setBounds(392, 171, 168, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Price");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(152, 301, 131, 17);

        Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Price);
        Price.setBounds(392, 298, 168, 23);

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(461, 380, 99, 25);

        Done.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        getContentPane().add(Done);
        Done.setBounds(152, 380, 99, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(152, 246, 131, 17);

        Quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Quantity);
        Quantity.setBounds(392, 243, 168, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Drug Deals");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(231, 86, 148, 29);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\drug1.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 830, 510);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 830, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DrugNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrugNameActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
            String drugName = DrugName.getText();
            int price = Integer.parseInt(Price.getText());
            int quantity = Integer.parseInt(Quantity.getText());
            float perPrice = price/quantity;
        try {
            Statement st = connection.createStatement();
            String checkQuery = "select * from drug where name = '" + drugName + "'";
            ResultSet rs = st.executeQuery(checkQuery);
            if(rs.next()){
                int val = rs.getInt("quantity");
                val = val + quantity;
                System.out.print(val);
                String update = "update drug set quantity = " + val + ", price = " + perPrice + " where name = '" + drugName + "'";
                st.executeQuery(update);
            }else{
                String query = "insert into drug values('" + drugName + "'," + quantity + "," + perPrice + ")";
                st.executeQuery(query);
            }
            JOptionPane.showMessageDialog(null,"Drug Added");
            DrugName.setText("");
            Price.setText("");
            Quantity.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        this.setVisible(false);
        mf.setVisible(true);
    }//GEN-LAST:event_DoneActionPerformed

    public void setConnection(Connection con, ManagerFrame m, Drug dg){
        connection = con;
        mf = m;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Add;
    private javax.swing.JToggleButton Done;
    private javax.swing.JTextField DrugName;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
