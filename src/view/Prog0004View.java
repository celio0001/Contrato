package view;

import javax.swing.JOptionPane;

public class Prog0004View extends javax.swing.JFrame 
{
  public Prog0004View() 
  {
    initComponents();
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    super.setLocationRelativeTo(null); 
  }
    
@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jrbFisica = new javax.swing.JRadioButton();
    jrbJuridica = new javax.swing.JRadioButton();
    jButton1 = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JSeparator();
    jSeparator2 = new javax.swing.JSeparator();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("..::PROG0004::..");

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    jLabel1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("DEFINA TIPO ENTIDADE");

    jrbFisica.setBackground(new java.awt.Color(255, 255, 255));
    buttonGroup1.add(jrbFisica);
    jrbFisica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jrbFisica.setForeground(new java.awt.Color(0, 0, 0));
    jrbFisica.setText("Pessoa Fisica");

    jrbJuridica.setBackground(new java.awt.Color(255, 255, 255));
    buttonGroup1.add(jrbJuridica);
    jrbJuridica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jrbJuridica.setForeground(new java.awt.Color(0, 0, 0));
    jrbJuridica.setText("Pessoa Juridica");

    jButton1.setBackground(new java.awt.Color(0, 0, 0));
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Confirma");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSeparator1)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(85, 85, 85)
            .addComponent(jLabel1))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(137, 137, 137)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(jrbFisica)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
        .addComponent(jrbJuridica)
        .addGap(41, 41, 41))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(14, 14, 14)
        .addComponent(jLabel1)
        .addGap(44, 44, 44)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jrbFisica)
          .addComponent(jrbJuridica))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    if(jrbFisica.isSelected())
    {
      Prog0006View prog0006 = new Prog0006View();
      prog0006.setVisible(true);
      this.dispose();
    }
    else if(jrbJuridica.isSelected())
    {
      Prog0007View prog0007 = new Prog0007View();
      prog0007.setVisible(true);
      this.dispose();
    }
    else
    {
      JOptionPane.showMessageDialog(null, "PARA PROSSEGUIR VOCÊ DEVE SELECIONAR UMA OPÇÃO ","AVISO",JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JRadioButton jrbFisica;
  private javax.swing.JRadioButton jrbJuridica;
  // End of variables declaration//GEN-END:variables
}
