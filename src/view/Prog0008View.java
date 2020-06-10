package view;

import control.Prog0008Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import template.FormTemplate;
import vo.Prog0008Vo;

public class Prog0008View extends FormTemplate implements ActionListener,FocusListener
{
  Prog0008Vo prog0008Vo;
  Prog0008Control prog0008Control;
  
  public Prog0008View() 
  {
    initComponents();
    super.lblTitulo.setText("CADASTRO DE COMARCA");
    super.lblCodi.setText("Codigo");
    super.lblDesc.setText("Comarca");
    super.setTitle("..::PROG0008::..");
    super.setSize(835, 463);
    super.setLocationRelativeTo(null);
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    edCodi.addFocusListener((FocusListener) this);
    prog0008Vo = new Prog0008Vo();
    prog0008Control = new Prog0008Control();
  }

  @Override
  public void btnBuscarActionPerformed(ActionEvent e) 
  {
    ListaView lista = new ListaView(this);
    lista.setVisible(true);
    this.dispose();
  }

  @Override
  public void btnGravarActionPerformed(ActionEvent e) 
  {
    if(edCodi.getText().equals(""))
    {
      try 
      {
        prog0008Control.gravarForo(edDesc.getText(),
                                   jtaObse.getText());
        
        JOptionPane.showMessageDialog(null,"Registro Salvo com sucesso","Gravar Foro",JOptionPane.INFORMATION_MESSAGE);
        edCodi.setText("");
        edDesc.setText("");
        jtaObse.setText("");
        edDesc.requestFocus();
      } 
      catch (ClassNotFoundException ex) 
      {
        Logger.getLogger(Prog0008View.class.getName()).log(Level.SEVERE, null, ex);
      } 
      catch (SQLException ex) 
      {
        Logger.getLogger(Prog0008View.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    else
    {
      try 
      {
        prog0008Control.editarForo(edCodi.getText(),
                                   edDesc.getText(),
                                   jtaObse.getText());
      } catch (ClassNotFoundException ex) {
        Logger.getLogger(Prog0008View.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
        Logger.getLogger(Prog0008View.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  @Override
  public void btnExcluirActionPerformed(ActionEvent e) 
  {
    if(!edCodi.getText().equals(""))
    {
      try 
      {
        prog0008Control.excluirRegistro(edCodi.getText());

        JOptionPane.showMessageDialog(null,"Registro excluido com sucesso","Excluir Foro",JOptionPane.INFORMATION_MESSAGE);
      } 
      catch (SQLException ex) 
      {
        Logger.getLogger(Prog0008View.class.getName()).log(Level.SEVERE, null, ex);
      } 
      catch (ClassNotFoundException ex) 
      {
        Logger.getLogger(Prog0008View.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    else
    {
      JOptionPane.showMessageDialog(null,"Não foi selecionado registro para exclusão. Você deve selecionar um registro","Excluir Foro",JOptionPane.INFORMATION_MESSAGE);
      edCodi.requestFocus();
    }
  }

  @Override
  public void btnSairActionPerformed(ActionEvent e) 
  {
    this.dispose();
  }

  @Override
  public void focusGained(FocusEvent fe) 
  {
    
  }

  @Override
  public void focusLost(FocusEvent fe) 
  {
    if(!edCodi.getText().equals(""))
    {
      try 
      {
        prog0008Vo = prog0008Control.buscarRegistro(edCodi.getText()); 
        edDesc.setText(prog0008Vo.getDescricao());
        jtaObse.setText(prog0008Vo.getObservacao());
      }
      catch (SQLException ex) 
      {
        Logger.getLogger(Prog0008View.class.getName()).log(Level.SEVERE, null, ex);
      } 
      catch (ClassNotFoundException ex) 
      {
        Logger.getLogger(Prog0008View.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    else
    {
      edDesc.setText("");
      jtaObse.setText("");
      edDesc.requestFocus();
    }
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jtaObse = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    jtaObse.setBackground(new java.awt.Color(255, 255, 255));
    jtaObse.setColumns(20);
    jtaObse.setForeground(new java.awt.Color(0, 0, 0));
    jtaObse.setRows(5);
    jScrollPane1.setViewportView(jtaObse);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        .addContainerGap())
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jtaObse;
  // End of variables declaration//GEN-END:variables

  public JTextArea getJtaObse() {
    return jtaObse;
  }

  public void setJtaObse(JTextArea jtaObse) {
    this.jtaObse = jtaObse;
  }

  public JTextField getEdCodi() {
    return edCodi;
  }

  public void setEdCodi(JTextField edCodi) {
    this.edCodi = edCodi;
  }

  public JTextField getEdDesc() {
    return edDesc;
  }

  public void setEdDesc(JTextField edDesc) {
    this.edDesc = edDesc;
  }

  private static final long serialVersionUID = 1L;
}
