//TIPO ENTIDADE
package view;


//import vo.ProgVo;
import controle.Prog0005Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import template.FormTemplate;
import vo.Prog0005Vo;

public class Prog0005View extends FormTemplate implements ActionListener,FocusListener
{
  private String valor;
  
  List<Prog0005Vo>prog0005List = new ArrayList<>();
  public Prog0005View() 
  {
    initComponents();
    super.lblTitulo.setText("CADASTRO TIPO DE ENTIDADE");
    super.lblCodi.setText("Codigo");
    super.lblDesc.setText("Descrição");
    super.setTitle("..::PROG0005::..");    
    super.setSize(835, 463);
    super.setLocationRelativeTo(null);
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    edCodi.addFocusListener((FocusListener) this);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jtaObs = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jtaObs.setBackground(new java.awt.Color(255, 255, 255));
    jtaObs.setColumns(20);
    jtaObs.setRows(5);
    jScrollPane1.setViewportView(jtaObs);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        .addContainerGap())
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jtaObs;
  // End of variables declaration//GEN-END:variables

  @Override
  public void btnBuscarActionPerformed(ActionEvent e) 
  {
    ListaView TipoEnti = new ListaView(this);
    TipoEnti.setVisible(true);
    this.dispose();
  }

  @Override
  public void btnGravarActionPerformed(ActionEvent e) 
  {
    if(edCodi.getText().equals(""))
    {
      
      try 
      {
        Prog0005Control prog0005 = new Prog0005Control();
        prog0005.graverTipoEntidade(edDesc.getText(),
                                    jtaObs.getText());
        JOptionPane.showMessageDialog(null,"Registro Salvo com sucesso:" ,"Cadastro Tipo Entidade",JOptionPane.INFORMATION_MESSAGE);
        edCodi.setText("");
        edDesc.setText("");
        jtaObs.setText("");
      } 
      catch (SQLException | ClassNotFoundException ex) 
      {
        Logger.getLogger(Prog0005View.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    else
    {
      try 
      {
        Prog0005Control prog0005 = new Prog0005Control();
        prog0005.editarTipoEntidade(edCodi.getText(),
                                    edDesc.getText(),
                                    jtaObs.getText());
      } 
      catch (ClassNotFoundException ex) 
      {
        Logger.getLogger(Prog0005View.class.getName()).log(Level.SEVERE, null, ex);
      } 
      catch (SQLException ex) 
      {
        Logger.getLogger(Prog0005View.class.getName()).log(Level.SEVERE, null, ex);
      }
      JOptionPane.showMessageDialog(null,"Registro Editado com sucesso:" ,"Cadastro Tipo Entidade",JOptionPane.INFORMATION_MESSAGE);
      edCodi.setText("");
      edDesc.setText("");
      jtaObs.setText("");
    }
  }

  @Override
  public void btnExcluirActionPerformed(ActionEvent e) 
  {
    if(!edCodi.getText().equals(""))
    {
      try 
      {
        Prog0005Control prog0005 = new Prog0005Control();
        prog0005.excluirTipoEntidade(edCodi.getText());
        
        JOptionPane.showMessageDialog(null,"Registro excluido com sucesso","Excluir Tipo Entidade",JOptionPane.INFORMATION_MESSAGE);
      } 
      catch (SQLException ex) 
      {
        Logger.getLogger(Prog0005View.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
        Logger.getLogger(Prog0005View.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    else
    {
      JOptionPane.showMessageDialog(null,"Não foi selecionado registro para exclusão. Você deve selecionar um registro","Excluir Tipo Entidade",JOptionPane.INFORMATION_MESSAGE);
      edCodi.requestFocus();
    }
  }

  @Override
  public void btnSairActionPerformed(ActionEvent e) 
  {
    this.dispose();
  }

  @Override
  public void focusGained(FocusEvent e) {
  }

  @Override
  public void focusLost(FocusEvent e) 
  {
    if(!edCodi.getText().equals(""))
    {
      try 
      {
        Prog0005Vo pro0005Vo = new Prog0005Vo();
        Prog0005Control prog0005 = new Prog0005Control();
        pro0005Vo = prog0005.buscarTipoEntidade(edCodi.getText());
        
        edCodi.setText(pro0005Vo.getCodigo());
        edDesc.setText(pro0005Vo.getDescricao());
        jtaObs.setText(pro0005Vo.getObservacao());
        
      } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(Prog0005View.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
    }
    else
    {
      edCodi.setText("");
      edDesc.setText("");
      jtaObs.setText("");
    }
  }

  public JTextArea getJtaObs() {
    return jtaObs;
  }

  public void setJtaObs(JTextArea jtaObs) {
    this.jtaObs = jtaObs;
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
  
  
}
