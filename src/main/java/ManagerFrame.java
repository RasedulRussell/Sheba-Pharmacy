
import java.sql.Connection;

/**
 *
 * @author RasedulRussell
 */
public class ManagerFrame extends javax.swing.JFrame {

    private Connection connection = null;
    Drug drug = new Drug();
    public ManagerFrame(Connection connection) {
        initComponents();
        this.connection = connection;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddDrug = new javax.swing.JButton();
        UpdateDrug = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        AddWorkers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Drug Deals");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 40, 250, 50);

        AddDrug.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddDrug.setText("Add");
        AddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrugActionPerformed(evt);
            }
        });
        jPanel1.add(AddDrug);
        AddDrug.setBounds(50, 300, 107, 47);

        UpdateDrug.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpdateDrug.setText("Update");
        jPanel1.add(UpdateDrug);
        UpdateDrug.setBounds(290, 300, 107, 47);

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(780, 300, 107, 47);

        AddWorkers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddWorkers.setText("Add Workers");
        AddWorkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddWorkersActionPerformed(evt);
            }
        });
        jPanel1.add(AddWorkers);
        AddWorkers.setBounds(510, 300, 130, 47);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\manager.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 990, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void AddWorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddWorkersActionPerformed
        Workers workers = new Workers(connection, this);
        this.setVisible(false);
        workers.setVisible(true);
    }//GEN-LAST:event_AddWorkersActionPerformed

    private void AddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrugActionPerformed
        this.setVisible(false);
        drug.setConnection(connection, this, drug);
        drug.setVisible(true);
    }//GEN-LAST:event_AddDrugActionPerformed

    public void setOwn( Connection con){
        System.out.println("setOwn");
        connection = con;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDrug;
    private javax.swing.JButton AddWorkers;
    private javax.swing.JButton Exit;
    private javax.swing.JButton UpdateDrug;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
