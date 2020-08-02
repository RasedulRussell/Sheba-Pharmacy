
import javax.swing.JOptionPane;

/**
 *
 * @author RasedulRussell
 * 
 */
public class Memo extends javax.swing.JFrame {

    /**
     * Creates new form Memo
     */
    private String drugName;
    private int quantity;
    public Memo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        Done = new javax.swing.JButton();
        Quantity = new javax.swing.JTextField();
        DrugName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add);
        Add.setBounds(600, 390, 109, 44);

        Done.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Done.setText("Done");
        jPanel1.add(Done);
        Done.setBounds(440, 390, 109, 44);

        Quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        jPanel1.add(Quantity);
        Quantity.setBounds(533, 290, 177, 42);

        DrugName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DrugName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugNameActionPerformed(evt);
            }
        });
        jPanel1.add(DrugName);
        DrugName.setBounds(533, 176, 177, 42);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(261, 287, 90, 42);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Drug Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(261, 176, 90, 42);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Drugs Deals ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(333, 77, 239, 41);

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(260, 390, 109, 44);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\bigstock.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -10, 1050, 590);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 5, 1060, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
            
    }//GEN-LAST:event_QuantityActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        drugName = DrugName.getText();
        boolean flag = false;
        if(drugName == null){
            flag = true;
        }
        if(Quantity.getText() == null){
            flag = true;
        }else{
            quantity = Integer.parseInt(Quantity.getText());
        }
        if(flag){
            JOptionPane.showMessageDialog(null, "invalid drugName");
        }
        DrugName.setText(null);
        Quantity.setText(null);
    }//GEN-LAST:event_AddActionPerformed

    private void DrugNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugNameActionPerformed
        
    }//GEN-LAST:event_DrugNameActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Done;
    private javax.swing.JTextField DrugName;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Quantity;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
