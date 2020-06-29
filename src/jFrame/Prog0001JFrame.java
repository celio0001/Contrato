package jFrame;

import javax.swing.JPanel;
import view.Prog0004View;
import view.Prog0005View;
import view.Prog0008View;
import view.Prog0009View;
//import view.Prog0008View;
public class Prog0001JFrame extends javax.swing.JFrame 
{

  public Prog0001JFrame() 
  {
    initComponents();
    setTitle("..::PRINCIPAL::..");
    super.setExtendedState(MAXIMIZED_BOTH);
    super.setLocationRelativeTo(null);
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    ImportaImagem imgTela = new ImportaImagem();
    this.PanelPrincipal.add(imgTela);
    
  }
    
@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    PanelPrincipal = new javax.swing.JPanel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu4 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();
    jMenu5 = new javax.swing.JMenu();
    jMenuItem3 = new javax.swing.JMenuItem();
    jMenuItem4 = new javax.swing.JMenuItem();
    jMenu6 = new javax.swing.JMenu();
    jmComarca = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();
    jMenu7 = new javax.swing.JMenu();
    jMenuItem6 = new javax.swing.JMenuItem();
    jMenuItem7 = new javax.swing.JMenuItem();
    jMenuItem8 = new javax.swing.JMenuItem();
    jMenu8 = new javax.swing.JMenu();
    jMenuItem9 = new javax.swing.JMenuItem();
    jMenuItem10 = new javax.swing.JMenuItem();
    jMenuItem11 = new javax.swing.JMenuItem();
    jMenu9 = new javax.swing.JMenu();
    jMenuItem12 = new javax.swing.JMenuItem();
    jMenuItem13 = new javax.swing.JMenuItem();
    jMenuItem14 = new javax.swing.JMenuItem();
    jm = new javax.swing.JMenu();
    jmSair = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
    PanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
    PanelPrincipal.setLayout(new java.awt.BorderLayout());
    getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

    jMenu1.setText("CADASTRO");

    jMenu4.setText("Usuário");

    jMenuItem1.setText("Novo");
    jMenu4.add(jMenuItem1);

    jMenuItem2.setText("Alterar Senha");
    jMenu4.add(jMenuItem2);

    jMenu1.add(jMenu4);

    jMenu5.setText("Entidade");

    jMenuItem3.setText("Novo");
    jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem3ActionPerformed(evt);
      }
    });
    jMenu5.add(jMenuItem3);

    jMenuItem4.setText("Tipo Entidade");
    jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem4ActionPerformed(evt);
      }
    });
    jMenu5.add(jMenuItem4);

    jMenu1.add(jMenu5);

    jMenu6.setText("Comarca");

    jmComarca.setText("Novo");
    jmComarca.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jmComarcaActionPerformed(evt);
      }
    });
    jMenu6.add(jmComarca);

    jMenu1.add(jMenu6);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("TIPO CONTRATO");

    jMenu7.setText("Imovel");

    jMenuItem6.setText("Compra/Venda");
    jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem6ActionPerformed(evt);
      }
    });
    jMenu7.add(jMenuItem6);

    jMenuItem7.setText("Locação");
    jMenu7.add(jMenuItem7);

    jMenuItem8.setText("Comodato");
    jMenu7.add(jMenuItem8);

    jMenu2.add(jMenu7);

    jMenu8.setText("Veiculo");

    jMenuItem9.setText("Compra/Venda");
    jMenu8.add(jMenuItem9);

    jMenuItem10.setText("Locação");
    jMenu8.add(jMenuItem10);

    jMenuItem11.setText("Comodato");
    jMenu8.add(jMenuItem11);

    jMenu2.add(jMenu8);

    jMenu9.setText("Serviço");

    jMenuItem12.setText("Efetivo");
    jMenu9.add(jMenuItem12);

    jMenuItem13.setText("Temporario");
    jMenu9.add(jMenuItem13);

    jMenuItem14.setText("Estágio");
    jMenu9.add(jMenuItem14);

    jMenu2.add(jMenu9);

    jMenuBar1.add(jMenu2);

    jm.setText("SAIR");

    jmSair.setText("Sair");
    jmSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jmSairActionPerformed(evt);
      }
    });
    jm.add(jmSair);

    jMenuBar1.add(jm);

    setJMenuBar(jMenuBar1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    Prog0004View prog0004 = new Prog0004View();
    prog0004.setVisible(true);
  }//GEN-LAST:event_jMenuItem3ActionPerformed

  private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
    System.exit(0);
  }//GEN-LAST:event_jmSairActionPerformed

  private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Prog0005View prog0005 = new Prog0005View();
    prog0005.setVisible(true);
  }//GEN-LAST:event_jMenuItem4ActionPerformed

  private void jmComarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmComarcaActionPerformed
    Prog0008View prog0008 = new Prog0008View();
    prog0008.setVisible(true);
  }//GEN-LAST:event_jmComarcaActionPerformed

  private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    Prog0009View prog0009 = new Prog0009View();
    prog0009.setVisible(true);
  }//GEN-LAST:event_jMenuItem6ActionPerformed

  public static void main(String args[]) 
  {
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
          java.util.logging.Logger.getLogger(Prog0001JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
          java.util.logging.Logger.getLogger(Prog0001JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          java.util.logging.Logger.getLogger(Prog0001JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          java.util.logging.Logger.getLogger(Prog0001JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      
    java.awt.EventQueue.invokeLater(new Runnable() 
    {
        public void run() {
            new Prog0001JFrame().setVisible(true);
        }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel PanelPrincipal;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenu jMenu5;
  private javax.swing.JMenu jMenu6;
  private javax.swing.JMenu jMenu7;
  private javax.swing.JMenu jMenu8;
  private javax.swing.JMenu jMenu9;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem10;
  private javax.swing.JMenuItem jMenuItem11;
  private javax.swing.JMenuItem jMenuItem12;
  private javax.swing.JMenuItem jMenuItem13;
  private javax.swing.JMenuItem jMenuItem14;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JMenuItem jMenuItem3;
  private javax.swing.JMenuItem jMenuItem4;
  private javax.swing.JMenuItem jMenuItem6;
  private javax.swing.JMenuItem jMenuItem7;
  private javax.swing.JMenuItem jMenuItem8;
  private javax.swing.JMenuItem jMenuItem9;
  private javax.swing.JMenu jm;
  private javax.swing.JMenuItem jmComarca;
  private javax.swing.JMenuItem jmSair;
  // End of variables declaration//GEN-END:variables

  private static final long serialVersionUID = 1L;
}


