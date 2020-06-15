package template;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class FormContrato extends javax.swing.JFrame 
{

  public FormContrato() 
  {
    initComponents();
    btnBuscar.addActionListener((ActionListener)this);
    btnGravar.addActionListener((ActionListener)this);
    btnExcluir.addActionListener((ActionListener)this);
    btnImprimir.addActionListener((ActionListener)this);
    btnSair.addActionListener((ActionListener)this); 
  }
  
  public abstract void btnBuscarActionPerformed(ActionEvent e);
  public abstract void btnGravarActionPerformed(ActionEvent e);
  public abstract void btnExcluirActionPerformed(ActionEvent e);
  public abstract void btnImpromirActionPerformed(ActionEvent e);
  public abstract void btnSairActionPerformed(ActionEvent e);

  
  public void actionPerformed(ActionEvent e)
  {
    switch(e.getActionCommand())
    {
      case"Gravar":
        btnGravarActionPerformed(e);
        break;
      case"Excluir":
        btnExcluirActionPerformed(e);
        break;
      case"Imprimir":
        btnImpromirActionPerformed(e);
        break;
      case"Sair":
        btnSairActionPerformed(e);
        break;
      case "Buscar":
        btnBuscarActionPerformed(e);
        break;  
    }
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lblData = new javax.swing.JLabel();
    edCodi = new javax.swing.JTextField();
    btnBuscar = new javax.swing.JButton();
    edStatus = new javax.swing.JTextField();
    edData = new javax.swing.JFormattedTextField();
    lblCodi = new javax.swing.JLabel();
    lblStatus = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    lblTitulo = new javax.swing.JLabel();
    edValor = new javax.swing.JTextField();
    lblValor = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    btnGravar = new javax.swing.JButton();
    btnExcluir = new javax.swing.JButton();
    btnImprimir = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    lblData.setBackground(new java.awt.Color(255, 255, 255));
    lblData.setForeground(new java.awt.Color(0, 0, 0));

    edCodi.setBackground(new java.awt.Color(255, 255, 255));
    edCodi.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscar.setText("Buscar");

    edStatus.setBackground(new java.awt.Color(255, 255, 255));
    edStatus.setForeground(new java.awt.Color(0, 0, 0));

    edData.setBackground(new java.awt.Color(255, 255, 255));
    edData.setForeground(new java.awt.Color(0, 0, 0));

    lblCodi.setBackground(new java.awt.Color(255, 255, 255));
    lblCodi.setForeground(new java.awt.Color(0, 0, 0));

    lblStatus.setBackground(new java.awt.Color(255, 255, 255));
    lblStatus.setForeground(new java.awt.Color(0, 0, 0));

    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

    edValor.setBackground(new java.awt.Color(255, 255, 255));
    edValor.setForeground(new java.awt.Color(0, 0, 0));

    lblValor.setBackground(new java.awt.Color(255, 255, 255));
    lblValor.setForeground(new java.awt.Color(0, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSeparator1)
          .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblCodi)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(edCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(edData, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblValor)
                .addGap(0, 0, Short.MAX_VALUE))
              .addComponent(edValor, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(edStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(5, 5, 5)
        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblCodi)
            .addComponent(lblData)
            .addComponent(lblStatus))
          .addComponent(lblValor))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jPanel2.setForeground(new java.awt.Color(255, 255, 255));

    btnGravar.setBackground(new java.awt.Color(0, 0, 0));
    btnGravar.setForeground(new java.awt.Color(255, 255, 255));
    btnGravar.setText("Gravar");

    btnExcluir.setBackground(new java.awt.Color(0, 0, 0));
    btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
    btnExcluir.setText("Excluir");

    btnImprimir.setBackground(new java.awt.Color(0, 0, 0));
    btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
    btnImprimir.setText("Imprimir");
    btnImprimir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnImprimirActionPerformed(evt);
      }
    });

    btnSair.setBackground(new java.awt.Color(0, 0, 0));
    btnSair.setForeground(new java.awt.Color(255, 255, 255));
    btnSair.setText("Sair");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnGravar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnExcluir)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnImprimir)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
        .addComponent(btnSair)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(10, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnImprimirActionPerformed

   
  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected javax.swing.JButton btnBuscar;
  protected javax.swing.JButton btnExcluir;
  protected javax.swing.JButton btnGravar;
  protected javax.swing.JButton btnImprimir;
  protected javax.swing.JButton btnSair;
  protected javax.swing.JTextField edCodi;
  protected javax.swing.JFormattedTextField edData;
  protected javax.swing.JTextField edStatus;
  protected javax.swing.JTextField edValor;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JSeparator jSeparator1;
  protected javax.swing.JLabel lblCodi;
  protected javax.swing.JLabel lblData;
  protected javax.swing.JLabel lblStatus;
  protected javax.swing.JLabel lblTitulo;
  protected javax.swing.JLabel lblValor;
  // End of variables declaration//GEN-END:variables

}
