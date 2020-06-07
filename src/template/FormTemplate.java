package template;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class FormTemplate extends javax.swing.JFrame 
{
  public FormTemplate() 
  {
    initComponents();
    btnBuscar.addActionListener((ActionListener)this);
    btnGravar.addActionListener((ActionListener)this);
    btnExcluir.addActionListener((ActionListener)this);
    btnSair.addActionListener((ActionListener)this);     
  }

  public abstract void btnBuscarActionPerformed(ActionEvent e);
  public abstract void btnGravarActionPerformed(ActionEvent e);
  public abstract void btnExcluirActionPerformed(ActionEvent e);
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
      case"Sair":
        btnSairActionPerformed(e);
        break;
      case "Buscar":
        btnBuscarActionPerformed(e);
        break;  
    }
  }
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lblCodi = new javax.swing.JLabel();
    edCodi = new javax.swing.JTextField();
    edDesc = new javax.swing.JTextField();
    lblDesc = new javax.swing.JLabel();
    lblTitulo = new javax.swing.JLabel();
    jSeparator3 = new javax.swing.JSeparator();
    btnBuscar = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    btnGravar = new javax.swing.JButton();
    btnExcluir = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Formulario Template 1");

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jPanel1.setName("norte"); // NOI18N

    lblCodi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    lblCodi.setText("    ");

    edCodi.setBackground(new java.awt.Color(255, 255, 255));

    edDesc.setBackground(new java.awt.Color(255, 255, 255));

    lblDesc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    lblDesc.setText("    ");

    lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
    lblTitulo.setText("    ");

    btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscar.setText("Buscar");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jSeparator3)
          .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblCodi)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(edCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(edDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblDesc)
                .addGap(0, 0, Short.MAX_VALUE)))))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblDesc, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblCodi, javax.swing.GroupLayout.Alignment.TRAILING))
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jPanel2.setName("sul"); // NOI18N

    btnGravar.setBackground(new java.awt.Color(0, 0, 0));
    btnGravar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnGravar.setForeground(new java.awt.Color(255, 255, 255));
    btnGravar.setText("Gravar");

    btnExcluir.setBackground(new java.awt.Color(0, 0, 0));
    btnExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
    btnExcluir.setText("Excluir");

    btnSair.setBackground(new java.awt.Color(0, 0, 0));
    btnSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
        .addComponent(btnSair)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(26, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnExcluir)
          .addComponent(btnGravar)
          .addComponent(btnSair))
        .addGap(14, 14, 14))
    );

    getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

    pack();
  }// </editor-fold>//GEN-END:initComponents
   
  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected javax.swing.JButton btnBuscar;
  protected javax.swing.JButton btnExcluir;
  protected javax.swing.JButton btnGravar;
  protected javax.swing.JButton btnSair;
  protected javax.swing.JTextField edCodi;
  protected javax.swing.JTextField edDesc;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JSeparator jSeparator3;
  protected javax.swing.JLabel lblCodi;
  protected javax.swing.JLabel lblDesc;
  protected javax.swing.JLabel lblTitulo;
  // End of variables declaration//GEN-END:variables

  private static final long serialVersionUID = 1L;
}
