/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminBD.Tables;

import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zakariya
 */
public class AjouterChamp extends javax.swing.JFrame {

    /**
     * Creates new form AjouterChamp
     */
    public AjouterChamp() {
        setBestLookAndFeelAvailable();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public static void setBestLookAndFeelAvailable() {
        String system_lf = UIManager.getSystemLookAndFeelClassName().toLowerCase();

        if (system_lf.contains("metal")) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e) {
            }
        } else {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnnuler = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        PanelAttributs = new javax.swing.JPanel();
        cbNullAutorise = new javax.swing.JCheckBox();
        cbNullAutorise1 = new javax.swing.JCheckBox();
        PanelDescription = new javax.swing.JPanel();
        lbDefault = new javax.swing.JLabel();
        tfNomChamp = new javax.swing.JTextField();
        lbTypeChamp = new javax.swing.JLabel();
        rbDefaultNull = new javax.swing.JRadioButton();
        rbDefaultOther = new javax.swing.JRadioButton();
        cbLongueur1 = new javax.swing.JSpinner();
        tfDefaultOther = new javax.swing.JTextField();
        lbLongueur = new javax.swing.JLabel();
        lbNomChamp = new javax.swing.JLabel();
        cbTypeChamp = new javax.swing.JComboBox();
        cbLongueur2 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        PanelAttributs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attributs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        cbNullAutorise.setText("NULL autorisé");
        cbNullAutorise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNullAutoriseActionPerformed(evt);
            }
        });

        cbNullAutorise1.setText("Unique");
        cbNullAutorise1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNullAutorise1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAttributsLayout = new javax.swing.GroupLayout(PanelAttributs);
        PanelAttributs.setLayout(PanelAttributsLayout);
        PanelAttributsLayout.setHorizontalGroup(
            PanelAttributsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAttributsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAttributsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbNullAutorise)
                    .addComponent(cbNullAutorise1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAttributsLayout.setVerticalGroup(
            PanelAttributsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAttributsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbNullAutorise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbNullAutorise1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        lbDefault.setText("Valeur par défaut :");

        lbTypeChamp.setText("Type du champ :");

        rbDefaultNull.setText("< NULL >");
        rbDefaultNull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDefaultNullActionPerformed(evt);
            }
        });

        rbDefaultOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDefaultOtherActionPerformed(evt);
            }
        });

        lbLongueur.setText("Longueur :");

        lbNomChamp.setText("Nom du champ :");

        cbTypeChamp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bit", "TinyInt", "SmallInt", "MediumInt", "Int", "BigInt", "Real", "Double", "Float", "Decimal", "Numeric", "Date", "Time", "TimeStamp", "DateTime", "Year", "Char", "VarChar", "Binary", "VarBinary", "TinyBlob", "Blob", "MediumBlob", "LongBlob", "TinyText", "Text", "MediumText", "LongText", "Enum", "Set", "Geometry", "Point", "LineString", "Polygon", "MultiPoint", "MultiLineString", "MultiPolygon", "GeometryCollection" }));

        javax.swing.GroupLayout PanelDescriptionLayout = new javax.swing.GroupLayout(PanelDescription);
        PanelDescription.setLayout(PanelDescriptionLayout);
        PanelDescriptionLayout.setHorizontalGroup(
            PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDescriptionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomChamp)
                    .addComponent(lbTypeChamp)
                    .addComponent(lbLongueur)
                    .addComponent(lbDefault))
                .addGap(25, 25, 25)
                .addGroup(PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelDescriptionLayout.createSequentialGroup()
                            .addComponent(rbDefaultOther)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfDefaultOther))
                        .addComponent(rbDefaultNull)
                        .addComponent(tfNomChamp)
                        .addComponent(cbTypeChamp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDescriptionLayout.createSequentialGroup()
                        .addComponent(cbLongueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbLongueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PanelDescriptionLayout.setVerticalGroup(
            PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomChamp)
                    .addComponent(tfNomChamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTypeChamp)
                    .addComponent(cbTypeChamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLongueur)
                    .addComponent(cbLongueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLongueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDefault)
                    .addComponent(rbDefaultNull))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbDefaultOther)
                    .addComponent(tfDefaultOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnnuler))
                    .addComponent(PanelAttributs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelAttributs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnuler)
                    .addComponent(btnOK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String champs = tfNomChamp.getText();
        String type = (String) cbTypeChamp.getSelectedItem();
        String txt = tfDefaultOther.getText();
        DefaultTableModel model = (DefaultTableModel) CreerTable.jTable4.getModel();
        if (rbDefaultNull.isSelected() || rbDefaultOther.isSelected() || cbNullAutorise.isSelected() || cbNullAutorise.isSelected()) {
            
            if (rbDefaultNull.isSelected() && cbNullAutorise.isSelected()) {
                model.addRow(new Object[]{champs, type, "NULL autorisé", "Null"});
            } else if (rbDefaultNull.isSelected() && cbNullAutorise1.isSelected()) {
                model.addRow(new Object[]{champs, type, "Unique", "Null"});
            } else if (rbDefaultOther.isSelected() && cbNullAutorise.isSelected()) {
                model.addRow(new Object[]{champs, type, "NULL autorisé", txt});
            } else if (rbDefaultOther.isSelected() && cbNullAutorise1.isSelected()) {
                model.addRow(new Object[]{champs, type, "Unique", txt});
            }else if (rbDefaultNull.isSelected()) {
                model.addRow(new Object[]{champs, type, "", "Null"});
            } else if (rbDefaultOther.isSelected()) {
                model.addRow(new Object[]{champs, type, "", txt});
            } else if (cbNullAutorise.isSelected()) {
                model.addRow(new Object[]{champs, type, "NULL autorisé", ""});
            } else if (cbNullAutorise1.isSelected()) {
                model.addRow(new Object[]{champs, type, "Unique", ""});
            }
        } else {
            model.addRow(new Object[]{champs, type, "", ""});
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void rbDefaultNullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDefaultNullActionPerformed
        rbDefaultOther.setSelected(false);
        tfDefaultOther.setEnabled(false);
    }//GEN-LAST:event_rbDefaultNullActionPerformed

    private void rbDefaultOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDefaultOtherActionPerformed
        rbDefaultOther.setSelected(true);
        tfDefaultOther.setEnabled(true);
        rbDefaultNull.setSelected(false);
    }//GEN-LAST:event_rbDefaultOtherActionPerformed

    private void cbNullAutoriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNullAutoriseActionPerformed
        cbNullAutorise1.setSelected(false);
    }//GEN-LAST:event_cbNullAutoriseActionPerformed

    private void cbNullAutorise1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNullAutorise1ActionPerformed
        cbNullAutorise.setSelected(false);
    }//GEN-LAST:event_cbNullAutorise1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjouterChamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterChamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterChamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterChamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterChamp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAttributs;
    private javax.swing.JPanel PanelDescription;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnOK;
    private javax.swing.JSpinner cbLongueur1;
    private javax.swing.JSpinner cbLongueur2;
    private javax.swing.JCheckBox cbNullAutorise;
    private javax.swing.JCheckBox cbNullAutorise1;
    private javax.swing.JComboBox cbTypeChamp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDefault;
    private javax.swing.JLabel lbLongueur;
    private javax.swing.JLabel lbNomChamp;
    private javax.swing.JLabel lbTypeChamp;
    private javax.swing.JRadioButton rbDefaultNull;
    private javax.swing.JRadioButton rbDefaultOther;
    private javax.swing.JTextField tfDefaultOther;
    private javax.swing.JTextField tfNomChamp;
    // End of variables declaration//GEN-END:variables
}
