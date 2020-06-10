//CADASTRO ENTIDADE
package view;

import model.ListaEnderecoEntidadeTableModel;
import control.Prog0007Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import template.FormTemplate;
import vo.Prog0007Vo;

public class Prog0007View extends FormTemplate implements ActionListener,FocusListener
{
  private int flag;
  private String palavra;
  List<Prog0007Vo> prog0007List = new ArrayList<>();
  List<Prog0007Vo> prog0007List1 = new ArrayList<>();
  Prog0007Vo prog0007Vo = new Prog0007Vo();
  
  public Prog0007View() 
  {
    initComponents();
    super.lblTitulo.setText("CADASTRO DE ENTIDADE");
    super.lblCodi.setText("Codigo");
    super.lblDesc.setText("Rasão Social");
    super.setTitle("..::PROG0007::..");
    super.setSize(820, 700);
    super.setLocationRelativeTo(null);
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    edCodi.addFocusListener((FocusListener) this);
    flag = 0;
  }

  @Override
  public void btnBuscarActionPerformed(ActionEvent e) 
  {
    setPalavra("entidade");
    buscarRegirtro(palavra);
 //   mostrarRegistro();
  }

  @Override
  public void btnGravarActionPerformed(ActionEvent e) 
  {
    if (edCodi.getText().equals("")) 
    {      
      try 
      {   
        Prog0007Control prog0007 = new Prog0007Control();
        prog0007.gravarEntidade(edDesc.getText(),
                                edFant.getText(),
                                edCodiTien.getText(),
                                jftCnpj.getText(),
                                jftRg.getText(),
                                jftCpf.getText(),
                                jftFone.getText(),
                                jftCelu.getText(),
                                edContato.getText(),
                                edIeEnde.getText(),
                                edEmail.getText(),
                                jtaObse.getText());  
        gravarPropriedade();
        gravarBanco();
        JOptionPane.showMessageDialog(null,"Registro Salvo com sucesso:" ,"Cadastro Entidade",JOptionPane.INFORMATION_MESSAGE);
        //limparCampos();  
      } 
      catch (SQLException | ClassNotFoundException ex) 
      {
        Logger.getLogger(Prog0007View.class.getName()).log(Level.SEVERE, null, ex);
      }
    } 
    else 
    {      
      try 
      {
        Prog0007Control prog0007VoEE = new Prog0007Control();
        prog0007VoEE.editarEntidade(edCodi.getText(),
                                    edDesc.getText(),
                                    edFant.getText(),
                                    edCodiTien.getText(),
                                    jftCnpj.getText(),
                                    jftRg.getText(),
                                    jftCpf.getText(),
                                    jftFone.getText(),
                                    jftCelu.getText(),
                                    edContato.getText(),
                                    jtaObse.getText());  
        editarPropriedade();
        editarBanco(); 
        limparCampos(); 
      } 
      catch (ClassNotFoundException | SQLException ex) 
      {
        Logger.getLogger(Prog0007View.class.getName()).log(Level.SEVERE, null, ex);
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
        Prog0007Control prog0007Ex = new Prog0007Control();
        prog0007Ex.excluirDadosPrincipais(edCodi.getText()); 
        excluirPropriedade();
        excluirBanco();

        JOptionPane.showMessageDialog(null,"Cadastro Excluido com sucesso","Excluir Registro Entidade",JOptionPane.INFORMATION_MESSAGE);      
      } 
      catch (SQLException | ClassNotFoundException ex) 
      {
        Logger.getLogger(Prog0007View.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    else
    {
      JOptionPane.showMessageDialog(null,"Não foi selecionado registro para exclusão. Você deve selecionar um registro","Excluir Entidade",JOptionPane.INFORMATION_MESSAGE);
      edCodi.requestFocus();
    }
  }
  
  private void excluirPropriedade() throws SQLException, ClassNotFoundException 
  {
    Prog0007Control prog0007 = new Prog0007Control();
    prog0007.excluirPropriedade(edCodi.getText());
  }
  
  private void excluirBanco() throws SQLException, ClassNotFoundException 
  {
    Prog0007Control prog0007 = new Prog0007Control();
    prog0007.excluirBanco(edCodi.getText());
  }

  @Override
  public void btnSairActionPerformed(ActionEvent e) 
  {
    this.dispose();
  }
  
  @Override
  public void focusGained(FocusEvent e) 
  {
    
  }

  //EVENTO OCORRE QUANDO O CAMPO CODIGO PERDE O FOCO
  @Override
  public void focusLost(FocusEvent e) 
  { 
    // VERIFICA SE AO PERDER O FOCO O CAMPO CODIGO ESTA PREENCHIDO
    // SE ESTIVER BUSCA OS REGISTROS DO RELATIVOS AO CODIGO QUE ESTÃO NO CAMPO CODIGO
    if(!edCodi.getText().equals(""))
    {      
      try
      {
        Prog0007Control prog0007ControlB = new Prog0007Control();
        prog0007Vo = prog0007ControlB.buscaNovaEntidade(edCodi.getText());
        
        edDesc.setText(prog0007Vo.getRazao());
        edFant.setText(prog0007Vo.getNomeFantasia());      
        jftCpf.setText(prog0007Vo.getCpf());
        jftCnpj.setText(prog0007Vo.getCnpj());       
        jftFone.setText(prog0007Vo.getTelefone());
        edContato.setText(prog0007Vo.getContato());
        edEmail.setText(prog0007Vo.getEmail());
        jtaObse.setText(prog0007Vo.getObservacao());
        jftCelu.setText(prog0007Vo.getCelular());
        edCodiTien.setText(prog0007Vo.getCodiTipoEnti());
        edTien.setText(prog0007Vo.getTipoEnti());
        jftRg.setText(prog0007Vo.getRg());                
        mostrarRegistro();
      }
      catch (ClassNotFoundException | SQLException ex) 
      {
        Logger.getLogger(Prog0007View.class.getName()).log(Level.SEVERE, null, ex);
      } 
      catch(FileNotFoundException ex)
      {
        JOptionPane.showMessageDialog(null,"Registro não encontrado ou inexistente:" ,"Busca Entidade",JOptionPane.INFORMATION_MESSAGE);
      }
    } 
    else 
    {
      if(flag == 0)
      {
        limparCampos();
        edDesc.requestFocus();
      }      
    }  
  }
  
  //METODO PARA GRAVAR ABA PROPRIEDADE
  public void gravarPropriedade() throws SQLException, ClassNotFoundException
  {
    Prog0007Control prog0007GE = new Prog0007Control();
    prog0007GE.gravarPropriedade(edDescEnde.getText(),
                                 edContEnde.getText(),
                                 jftFoneEnde.getText(),
                                 jftCepEnde.getText(),
                                 edEndeEnde.getText(),
                                 jftNumeEnde.getText(),
                                 edCodiCidaEnde.getText(),
                                 edBairEnde.getText(),
                                 edCompEnde.getText(),
                                 edIeEnde.getText(),
                                 edCodiBancEnde.getText());
  }
  
  //METODO PARA GRAVAR ABA BANCO
  public void gravarBanco() throws ClassNotFoundException, SQLException
  {
    Prog0007Control prog0007GB = new Prog0007Control();
    prog0007GB.gravarBanco(edBancCodi.getText(),
                           edBancNome.getText(),
                           edBancAgencia.getText(),
                           edBancConta.getText());
    flag = 0;
  }
  
  //METODO PARA EDITAR ABA PROPRIEDADE
  public void editarPropriedade() throws SQLException, ClassNotFoundException
  {
    Prog0007Control prog0007GE = new Prog0007Control();
    prog0007GE.editarPropriedade(edCodi.getText(),
                                 edDescEnde.getText(),
                                 edContEnde.getText(),
                                 jftFoneEnde.getText(),
                                 jftCepEnde.getText(),
                                 edEndeEnde.getText(),
                                 jftNumeEnde.getText(),
                                 edCodiCidaEnde.getText(),
                                 edBairEnde.getText(),
                                 edCompEnde.getText(),
                                 edIeEnde.getText(),
                                 edCodiBancEnde.getText());
  }
  
  //METODO PARA EDITAR ABA BANCO
  public void editarBanco() throws ClassNotFoundException, SQLException
  {
    Prog0007Control prog0007GB = new Prog0007Control();
    prog0007GB.editarBanco(edCodi.getText(),
                           edCodiBancEnde.getText(),
                           edNomeBancEnde.getText(),
                           edAgencBancEnde.getText(),
                           edContBancEnde.getText());
    flag = 0;
  }
  
  //METODO PARA MOSTRAR TELA LISTA ENDEREÇOS
  public void mostrarRegistro()
  {
    prog0007List1 = new Prog0007Control().findbuscaEnde(edCodi.getText());
    if(prog0007List1 != null)
      jtblGrid1.setModel(new ListaEnderecoEntidadeTableModel(prog0007List1));  
  }
  
  //METODO PARA BUSCARR UMA LISTA ESPECIFICA CONFORME A PALAVRA QUE É PASSADA POR PARAMETRO
  public void buscarRegirtro(String texto)
  {
    switch (texto)  
    {
      case "entidade":
        ListaView lista = new ListaView(this);
        lista.setVisible(true);
        this.dispose();
 
        break;
      case "tipoEnti":
            ListaView listaTipoEnti = new ListaView(this);
            listaTipoEnti.setVisible(true);
            this.dispose();
        break;
      case "cidaEnde":
            ListaView listaCidade = new ListaView(this);
            listaCidade.setVisible(true);
            this.dispose();
        break;
      case "bancoEnde":
            ListaView listaBancoEnde = new ListaView(this);
            listaBancoEnde.setVisible(true);
            this.dispose();
        break;
      case "banco":
            ListaView listaBanco = new ListaView(this);
            listaBanco.setVisible(true);
            this.dispose();
        break;
      default:
        JOptionPane.showMessageDialog(null,"Registro Invalido ou inesistente:" ,"Buscar Entidade",JOptionPane.INFORMATION_MESSAGE);
        break;
    }
  }
 
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    abas = new javax.swing.JTabbedPane();
    jPanel8 = new javax.swing.JPanel();
    jLabel13 = new javax.swing.JLabel();
    edFant = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    edCodiTien = new javax.swing.JTextField();
    edTien = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    btnBuscaTipoEntidade = new javax.swing.JButton();
    jCheckBox1 = new javax.swing.JCheckBox();
    jftCnpj = new javax.swing.JFormattedTextField();
    jftRg = new javax.swing.JFormattedTextField();
    jftCpf = new javax.swing.JFormattedTextField();
    jftFone = new javax.swing.JFormattedTextField();
    jftCelu = new javax.swing.JFormattedTextField();
    edContato = new javax.swing.JTextField();
    edEmail = new javax.swing.JTextField();
    jLabel19 = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    jLabel24 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    jSeparator2 = new javax.swing.JSeparator();
    jScrollPane4 = new javax.swing.JScrollPane();
    jtaObse = new javax.swing.JTextArea();
    btnAvancar1 = new javax.swing.JButton();
    jPanel9 = new javax.swing.JPanel();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    edDescEnde = new javax.swing.JTextField();
    edContEnde = new javax.swing.JTextField();
    edEndeEnde = new javax.swing.JTextField();
    edCodiCidaEnde = new javax.swing.JTextField();
    edNomeCidaEnde = new javax.swing.JTextField();
    edUfEnde = new javax.swing.JTextField();
    edBairEnde = new javax.swing.JTextField();
    edCompEnde = new javax.swing.JTextField();
    edIeEnde = new javax.swing.JTextField();
    jftCepEnde = new javax.swing.JFormattedTextField();
    jftNumeEnde = new javax.swing.JFormattedTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jftFoneEnde = new javax.swing.JFormattedTextField();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel2 = new javax.swing.JLabel();
    edNomeBancEnde = new javax.swing.JTextField();
    edCodiBancEnde = new javax.swing.JTextField();
    edAgencBancEnde = new javax.swing.JTextField();
    edContBancEnde = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();
    jLabel27 = new javax.swing.JLabel();
    jLabel28 = new javax.swing.JLabel();
    jSeparator3 = new javax.swing.JSeparator();
    jScrollPane3 = new javax.swing.JScrollPane();
    jtblGrid1 = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    btnBuscaCidaEnde = new javax.swing.JButton();
    btnBuscaBancEnde = new javax.swing.JButton();
    btnAvancar2 = new javax.swing.JButton();
    jPanel10 = new javax.swing.JPanel();
    edBancCodi = new javax.swing.JTextField();
    edBancNome = new javax.swing.JTextField();
    edBancConta = new javax.swing.JTextField();
    edBancAgencia = new javax.swing.JTextField();
    btnBuscaBanco = new javax.swing.JButton();
    jLabel18 = new javax.swing.JLabel();
    jLabel29 = new javax.swing.JLabel();
    jLabel30 = new javax.swing.JLabel();
    jLabel31 = new javax.swing.JLabel();
    jSeparator4 = new javax.swing.JSeparator();
    jButton5 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jSeparator5 = new javax.swing.JSeparator();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable2 = new javax.swing.JTable();
    jPanel11 = new javax.swing.JPanel();
    jScrollPane5 = new javax.swing.JScrollPane();
    jtaAssinatura = new javax.swing.JTextArea();

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

    abas.setBackground(java.awt.Color.white);
    abas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    abas.setForeground(new java.awt.Color(0, 0, 0));

    jPanel8.setBackground(java.awt.Color.white);

    jLabel13.setBackground(java.awt.Color.white);
    jLabel13.setForeground(new java.awt.Color(0, 0, 0));
    jLabel13.setText("Nome Fantasia");

    edFant.setBackground(java.awt.Color.white);
    edFant.setForeground(new java.awt.Color(0, 0, 0));

    jLabel14.setBackground(java.awt.Color.white);
    jLabel14.setForeground(new java.awt.Color(0, 0, 0));
    jLabel14.setText("Codigo");

    edCodiTien.setBackground(new java.awt.Color(255, 255, 255));
    edCodiTien.setForeground(new java.awt.Color(0, 0, 0));

    edTien.setBackground(new java.awt.Color(255, 255, 255));
    edTien.setForeground(new java.awt.Color(0, 0, 0));

    jLabel15.setBackground(java.awt.Color.white);
    jLabel15.setForeground(new java.awt.Color(0, 0, 0));
    jLabel15.setText("Tipo de Entidade");

    btnBuscaTipoEntidade.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaTipoEntidade.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaTipoEntidade.setText("Buscar");
    btnBuscaTipoEntidade.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaTipoEntidadeActionPerformed(evt);
      }
    });

    jCheckBox1.setText("Comissao Diferenciada");

    jftCnpj.setBackground(new java.awt.Color(255, 255, 255));
    jftCnpj.setForeground(new java.awt.Color(0, 0, 0));

    jftRg.setBackground(new java.awt.Color(255, 255, 255));
    jftRg.setForeground(new java.awt.Color(0, 0, 0));

    jftCpf.setBackground(new java.awt.Color(255, 255, 255));
    jftCpf.setForeground(new java.awt.Color(0, 0, 0));

    jftFone.setBackground(new java.awt.Color(255, 255, 255));
    jftFone.setForeground(new java.awt.Color(0, 0, 0));

    jftCelu.setBackground(new java.awt.Color(255, 255, 255));
    jftCelu.setForeground(new java.awt.Color(0, 0, 0));

    edContato.setBackground(new java.awt.Color(255, 255, 255));
    edContato.setForeground(new java.awt.Color(0, 0, 0));

    edEmail.setBackground(new java.awt.Color(255, 255, 255));
    edEmail.setForeground(new java.awt.Color(0, 0, 0));

    jLabel19.setBackground(java.awt.Color.white);
    jLabel19.setForeground(new java.awt.Color(0, 0, 0));
    jLabel19.setText("Cnpj");

    jLabel20.setBackground(java.awt.Color.white);
    jLabel20.setForeground(new java.awt.Color(0, 0, 0));
    jLabel20.setText("Rg");

    jLabel21.setBackground(java.awt.Color.white);
    jLabel21.setForeground(new java.awt.Color(0, 0, 0));
    jLabel21.setText("Cpf");

    jLabel22.setBackground(java.awt.Color.white);
    jLabel22.setForeground(new java.awt.Color(0, 0, 0));
    jLabel22.setText("Telefone");

    jLabel23.setBackground(java.awt.Color.white);
    jLabel23.setForeground(new java.awt.Color(0, 0, 0));
    jLabel23.setText("Celular");

    jLabel24.setBackground(java.awt.Color.white);
    jLabel24.setForeground(new java.awt.Color(0, 0, 0));
    jLabel24.setText("Contato");

    jLabel25.setBackground(java.awt.Color.white);
    jLabel25.setForeground(new java.awt.Color(0, 0, 0));
    jLabel25.setText("Imail");

    jtaObse.setBackground(java.awt.Color.white);
    jtaObse.setColumns(20);
    jtaObse.setRows(5);
    jScrollPane4.setViewportView(jtaObse);

    btnAvancar1.setBackground(new java.awt.Color(0, 0, 0));
    btnAvancar1.setForeground(new java.awt.Color(255, 255, 255));
    btnAvancar1.setText("Avançar");
    btnAvancar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAvancar1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
      jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jSeparator2)
          .addComponent(edEmail)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                .addComponent(jftCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE)))
            .addGap(0, 4, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel20)
              .addComponent(jftRg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel21)
              .addComponent(jftCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel22)
              .addComponent(jftFone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel23)
              .addComponent(jftCelu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel24)
              .addComponent(edContato, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(jLabel25)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel14)
              .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(edCodiTien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaTipoEntidade)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel15)
              .addComponent(edTien)))
          .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(edFant, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnAvancar1)))
        .addContainerGap())
    );
    jPanel8Layout.setVerticalGroup(
      jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel13)
        .addGap(0, 0, 0)
        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel8Layout.createSequentialGroup()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(edFant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox1))
            .addGap(1, 1, 1)
            .addComponent(jLabel14)
            .addGap(0, 0, 0)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(edCodiTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnBuscaTipoEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(jLabel15)
            .addGap(0, 0, 0)
            .addComponent(edTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(2, 2, 2)
        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel19)
          .addComponent(jLabel20)
          .addComponent(jLabel21)
          .addComponent(jLabel22)
          .addComponent(jLabel23)
          .addComponent(jLabel24))
        .addGap(0, 0, 0)
        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jftCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jftRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jftCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jftFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jftCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addComponent(jLabel25)
        .addGap(0, 0, 0)
        .addComponent(edEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnAvancar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    abas.addTab("Dados Principais", jPanel8);

    jPanel9.setBackground(java.awt.Color.white);

    jLabel16.setForeground(new java.awt.Color(0, 0, 0));
    jLabel16.setText("Contato");

    jLabel17.setForeground(new java.awt.Color(0, 0, 0));
    jLabel17.setText("Descrição");

    edDescEnde.setBackground(java.awt.Color.white);
    edDescEnde.setForeground(new java.awt.Color(0, 0, 0));

    edContEnde.setBackground(java.awt.Color.white);
    edContEnde.setForeground(new java.awt.Color(0, 0, 0));

    edEndeEnde.setBackground(java.awt.Color.white);
    edEndeEnde.setForeground(new java.awt.Color(0, 0, 0));

    edCodiCidaEnde.setBackground(java.awt.Color.white);
    edCodiCidaEnde.setForeground(new java.awt.Color(0, 0, 0));

    edNomeCidaEnde.setBackground(java.awt.Color.white);
    edNomeCidaEnde.setForeground(new java.awt.Color(0, 0, 0));

    edUfEnde.setBackground(java.awt.Color.white);
    edUfEnde.setForeground(new java.awt.Color(0, 0, 0));

    edBairEnde.setBackground(java.awt.Color.white);
    edBairEnde.setForeground(new java.awt.Color(0, 0, 0));

    edCompEnde.setBackground(java.awt.Color.white);
    edCompEnde.setForeground(new java.awt.Color(0, 0, 0));

    edIeEnde.setBackground(java.awt.Color.white);
    edIeEnde.setForeground(new java.awt.Color(0, 0, 0));

    jftCepEnde.setBackground(java.awt.Color.white);
    jftCepEnde.setForeground(new java.awt.Color(0, 0, 0));
    jftCepEnde.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        jftCepEndeFocusLost(evt);
      }
    });

    jftNumeEnde.setBackground(java.awt.Color.white);
    jftNumeEnde.setForeground(new java.awt.Color(0, 0, 0));

    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("Cep");

    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3.setText("Numero");

    jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4.setText("UF");

    jLabel5.setForeground(new java.awt.Color(0, 0, 0));
    jLabel5.setText("Nome da Cidade");

    jLabel6.setForeground(new java.awt.Color(0, 0, 0));
    jLabel6.setText("Cidade");

    jLabel7.setForeground(new java.awt.Color(0, 0, 0));
    jLabel7.setText("Bairro");

    jLabel8.setForeground(new java.awt.Color(0, 0, 0));
    jLabel8.setText("Complemento");

    jLabel9.setForeground(new java.awt.Color(0, 0, 0));
    jLabel9.setText("IE");

    jftFoneEnde.setBackground(java.awt.Color.white);
    jftFoneEnde.setForeground(new java.awt.Color(0, 0, 0));

    jLabel10.setForeground(new java.awt.Color(0, 0, 0));
    jLabel10.setText("Telefone");

    jLabel11.setForeground(new java.awt.Color(0, 0, 0));
    jLabel11.setText("Endereço");

    jLabel2.setBackground(new java.awt.Color(255, 255, 255));
    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("Dados Bamcarios");

    edNomeBancEnde.setBackground(java.awt.Color.white);
    edNomeBancEnde.setForeground(new java.awt.Color(0, 0, 0));

    edCodiBancEnde.setBackground(java.awt.Color.white);
    edCodiBancEnde.setForeground(new java.awt.Color(0, 0, 0));
    edCodiBancEnde.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        edCodiBancEndeActionPerformed(evt);
      }
    });

    edAgencBancEnde.setBackground(java.awt.Color.white);
    edAgencBancEnde.setForeground(new java.awt.Color(0, 0, 0));

    edContBancEnde.setBackground(java.awt.Color.white);
    edContBancEnde.setForeground(new java.awt.Color(0, 0, 0));

    jLabel12.setForeground(new java.awt.Color(0, 0, 0));
    jLabel12.setText("Codigo");

    jLabel26.setForeground(new java.awt.Color(0, 0, 0));
    jLabel26.setText("Nome do Banco");

    jLabel27.setForeground(new java.awt.Color(0, 0, 0));
    jLabel27.setText("Conta");

    jLabel28.setForeground(new java.awt.Color(0, 0, 0));
    jLabel28.setText("Agencia");

    jtblGrid1.setBackground(java.awt.Color.white);
    jtblGrid1.setForeground(new java.awt.Color(0, 0, 0));
    jtblGrid1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    jtblGrid1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jtblGrid1MouseClicked(evt);
      }
    });
    jScrollPane3.setViewportView(jtblGrid1);

    jButton1.setBackground(java.awt.Color.white);
    jButton1.setForeground(new java.awt.Color(0, 0, 0));
    jButton1.setText("Inserir");

    jButton2.setBackground(java.awt.Color.white);
    jButton2.setForeground(new java.awt.Color(0, 0, 0));
    jButton2.setText("Excluir");

    btnBuscaCidaEnde.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaCidaEnde.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaCidaEnde.setText("Buscar");
    btnBuscaCidaEnde.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCidaEndeActionPerformed(evt);
      }
    });

    btnBuscaBancEnde.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaBancEnde.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaBancEnde.setText("Buscar");
    btnBuscaBancEnde.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaBancEndeActionPerformed(evt);
      }
    });

    btnAvancar2.setBackground(new java.awt.Color(0, 0, 0));
    btnAvancar2.setForeground(new java.awt.Color(255, 255, 255));
    btnAvancar2.setText("Avançar");
    btnAvancar2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAvancar2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
      jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel9Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane3)
          .addComponent(jSeparator1)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(edBairEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
              .addComponent(edCompEnde))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(142, 142, 142))
              .addComponent(edIeEnde)))
          .addGroup(jPanel9Layout.createSequentialGroup()
            .addComponent(edAgencBancEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 651, Short.MAX_VALUE))
              .addComponent(edContBancEnde)))
          .addGroup(jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
              .addComponent(edDescEnde))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel16)
              .addComponent(edContEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel10)
              .addComponent(jftFoneEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel9Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButton2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jftCepEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edEndeEnde))
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel1)
                      .addComponent(jLabel6))
                    .addGap(78, 78, 78))
                  .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(edCodiCidaEnde)
                    .addGap(6, 6, 6)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel11)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addComponent(btnBuscaCidaEnde)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                      .addComponent(edNomeCidaEnde))))))
            .addGap(6, 6, 6)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jftNumeEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel4)
              .addComponent(edUfEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(73, 95, Short.MAX_VALUE))
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edCodiBancEnde, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                  .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btnBuscaBancEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edNomeBancEnde)
                  .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(502, 502, 502))))
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))))
          .addGroup(jPanel9Layout.createSequentialGroup()
            .addComponent(btnAvancar2)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel9Layout.setVerticalGroup(
      jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel9Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel17)
          .addComponent(jLabel16)
          .addComponent(jLabel10))
        .addGap(0, 0, 0)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edDescEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edContEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jftFoneEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel1)
            .addComponent(jLabel11))
          .addComponent(jLabel3))
        .addGap(0, 0, 0)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jftCepEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(edEndeEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jftNumeEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(1, 1, 1)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel4)
                  .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(edCodiCidaEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(edUfEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(btnBuscaCidaEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel9Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(0, 0, 0)
            .addComponent(edNomeCidaEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(2, 2, 2)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jLabel8)
          .addComponent(jLabel9))
        .addGap(0, 0, 0)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edBairEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCompEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edIeEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel2)
        .addGap(0, 0, 0)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel26)
          .addComponent(jLabel12))
        .addGap(0, 0, 0)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCodiBancEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeBancEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnBuscaBancEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel28)
          .addComponent(jLabel27))
        .addGap(0, 0, 0)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edAgencBancEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edContBancEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnAvancar2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jButton1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
        .addContainerGap())
    );

    abas.addTab("Propriedades", jPanel9);

    jPanel10.setBackground(java.awt.Color.white);

    edBancCodi.setBackground(java.awt.Color.white);
    edBancCodi.setForeground(new java.awt.Color(0, 0, 0));

    edBancNome.setBackground(java.awt.Color.white);
    edBancNome.setForeground(new java.awt.Color(0, 0, 0));

    edBancConta.setBackground(java.awt.Color.white);
    edBancConta.setForeground(new java.awt.Color(0, 0, 0));

    edBancAgencia.setBackground(java.awt.Color.white);
    edBancAgencia.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscaBanco.setBackground(java.awt.Color.white);
    btnBuscaBanco.setForeground(new java.awt.Color(0, 0, 0));
    btnBuscaBanco.setText("Buscar");
    btnBuscaBanco.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaBancoActionPerformed(evt);
      }
    });

    jLabel18.setBackground(java.awt.Color.white);
    jLabel18.setForeground(new java.awt.Color(0, 0, 0));
    jLabel18.setText("Codigo");

    jLabel29.setBackground(java.awt.Color.white);
    jLabel29.setForeground(new java.awt.Color(0, 0, 0));
    jLabel29.setText("Nome do Banco");

    jLabel30.setBackground(java.awt.Color.white);
    jLabel30.setForeground(new java.awt.Color(0, 0, 0));
    jLabel30.setText("Agencia");

    jLabel31.setBackground(java.awt.Color.white);
    jLabel31.setForeground(new java.awt.Color(0, 0, 0));
    jLabel31.setText("Conta");

    jButton5.setBackground(java.awt.Color.white);
    jButton5.setForeground(new java.awt.Color(0, 0, 0));
    jButton5.setText("Inserir");

    jButton6.setBackground(java.awt.Color.white);
    jButton6.setForeground(new java.awt.Color(0, 0, 0));
    jButton6.setText("Excluir");

    jTable2.setBackground(java.awt.Color.white);
    jTable2.setForeground(new java.awt.Color(0, 0, 0));
    jTable2.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    jScrollPane2.setViewportView(jTable2);

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
      jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
          .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(edBancCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaBanco))
              .addComponent(jLabel18))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel29)
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(edBancNome))))
          .addGroup(jPanel10Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButton6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton5))
          .addComponent(jSeparator5)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(edBancAgencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel31)
                .addGap(0, 580, Short.MAX_VALUE))
              .addGroup(jPanel10Layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edBancConta)))))
        .addContainerGap())
    );
    jPanel10Layout.setVerticalGroup(
      jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel10Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel18)
          .addComponent(jLabel29))
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edBancCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnBuscaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edBancNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel30)
          .addComponent(jLabel31))
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edBancAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edBancConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton5)
          .addComponent(jButton6))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    abas.addTab("Dados BAncarios", jPanel10);

    jtaAssinatura.setBackground(java.awt.Color.white);
    jtaAssinatura.setColumns(20);
    jtaAssinatura.setRows(5);
    jScrollPane5.setViewportView(jtaAssinatura);

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
      jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel11Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel11Layout.setVerticalGroup(
      jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel11Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        .addContainerGap())
    );

    abas.addTab("Assinatura", jPanel11);

    getContentPane().add(abas, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  //METODO QUE AO CLICAR NO REGISTRO DA TABELA PREENCHE OS CAMPOS DAS ABAS PROPRIEDADES E BANCOS
  private void jtblGrid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblGrid1MouseClicked
    int linha = jtblGrid1.getSelectedRow();
    ListaEnderecoEntidadeTableModel item = new ListaEnderecoEntidadeTableModel(prog0007List1);
    
    getEdCodi().setText((String) item.getValueAt(linha, 0));
    getEdDescEnde().setText((String) item.getValueAt(linha, 1));  
    getJftCepEnde().setText((String) item.getValueAt(linha, 4));
    getEdEndeEnde().setText((String) item.getValueAt(linha, 5));
    getJftNumeEnde().setText((String) item.getValueAt(linha, 6));
    getEdCodiCidaEnde().setText((String) item.getValueAt(linha, 7));
    getEdNomeCidaEnde().setText((String) item.getValueAt(linha, 8));
    getEdUfEnde().setText((String) item.getValueAt(linha, 9));
    getEdBairEnde().setText((String) item.getValueAt(linha, 10));
    getEdContEnde().setText((String) item.getValueAt(linha, 2));
    getJftFoneEnde().setText((String) item.getValueAt(linha, 3));
    getEdCompEnde().setText((String) item.getValueAt(linha, 11));
    getEdIeEnde().setText((String) item.getValueAt(linha, 16));  
    getEdBancEnde().setText((String) item.getValueAt(linha, 12));
    getEdNomeBancEnde().setText((String) item.getValueAt(linha, 13));
    getEdContBancEnde().setText((String) item.getValueAt(linha, 14));   
    getEdAgencBancEnde().setText((String) item.getValueAt(linha, 15));    
    getEdBancCodi().setText((String)item.getValueAt(linha, 12));
    getEdBancNome().setText((String) item.getValueAt(linha, 13));
    getEdBancConta().setText((String) item.getValueAt(linha, 14)); 
    getEdBancAgencia().setText((String) item.getValueAt(linha, 15));  
  }//GEN-LAST:event_jtblGrid1MouseClicked

  public void limparCampos()
  {
    edDesc.setText("");
    edFant.setText("");
    jftCpf.setText("");
    jftCnpj.setText("");      
    jftFone.setText("");
    edContato.setText("");
    edEmail.setText("");      
    jtaObse.setText("");
    jftCelu.setText("");     
    edCodiTien.setText("");
    edTien.setText("");        
    jftRg.setText("");   
    edDescEnde.setText("");
    edContEnde.setText("");
    jftFoneEnde.setText("");
    jftCepEnde.setText("");
    edEndeEnde.setText("");
    jftNumeEnde.setText("");
    edCodiCidaEnde.setText("");
    edNomeCidaEnde.setText("");
    edUfEnde.setText("");
    edBairEnde.setText("");
    edCompEnde.setText("");
    edCodiBancEnde.setText("");
    edNomeBancEnde.setText("");
    edAgencBancEnde.setText("");
    edContBancEnde.setText("");
    edIeEnde.setText("");
    flag = 1;
  }
  
  private void edCodiBancEndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edCodiBancEndeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_edCodiBancEndeActionPerformed

  private void btnBuscaTipoEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaTipoEntidadeActionPerformed
    setPalavra("tipoEnti");
    buscarRegirtro(palavra);
  }//GEN-LAST:event_btnBuscaTipoEntidadeActionPerformed

  private void btnBuscaCidaEndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCidaEndeActionPerformed
    setPalavra("cidaEnde");
    buscarRegirtro(palavra);
  }//GEN-LAST:event_btnBuscaCidaEndeActionPerformed

  private void btnBuscaBancEndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaBancEndeActionPerformed
    setPalavra("bancoEnde");
    buscarRegirtro(palavra);
  }//GEN-LAST:event_btnBuscaBancEndeActionPerformed

  private void btnBuscaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaBancoActionPerformed
   setPalavra("banco");
    buscarRegirtro(palavra);
  }//GEN-LAST:event_btnBuscaBancoActionPerformed

  //METODO PARA BUSCA AUTOMATICA DE ENDEREÇO PELO CEP
  private void jftCepEndeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftCepEndeFocusLost
    try 
    {
      Prog0007Control cepB = new Prog0007Control();
      prog0007Vo = cepB.buscaCep(jftCepEnde.getText());
      edEndeEnde.setText(prog0007Vo.getEndereco());
      edBairEnde.setText(prog0007Vo.getBairro());
      edCodiCidaEnde.setText(prog0007Vo.getCodiCida());
      edNomeCidaEnde.setText(prog0007Vo.getNomeCidade());
      edContEnde.setText(prog0007Vo.getUf());
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007View.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_jftCepEndeFocusLost

  private void btnAvancar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancar2ActionPerformed
    this.abas.setSelectedIndex(2);
  }//GEN-LAST:event_btnAvancar2ActionPerformed

  private void btnAvancar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancar1ActionPerformed
    this.abas.setSelectedIndex(1);
  }//GEN-LAST:event_btnAvancar1ActionPerformed

  
//=====================================================================================================================
  // OS METODOS ABAIXO SAO SOMENTE GETERS E SETERS
  public JTextField getEdAgencBancEnde() 
  {
    return edAgencBancEnde;
  }
  
  public void setEdAgencBancEnde(JTextField edAgencBancEnde) 
  {
    this.edAgencBancEnde = edAgencBancEnde;
  }

  public JTextField getEdBairEnde() 
  {
    return edBairEnde;
  }

  public void setEdBairEnde(JTextField edBairEnde) 
  {
    this.edBairEnde = edBairEnde;
  }

  public JTextField getEdBancEnde() 
  {
    return edCodiBancEnde;
  }

  public void setEdBancEnde(JTextField edBancEnde) 
  {
    this.edCodiBancEnde = edBancEnde;
  }

  public JTextField getEdCodiCidaEnde() 
  {
    return edCodiCidaEnde;
  }

  public void setEdCodiCidaEnde(JTextField edCodiCidaEnde) 
  {
    this.edCodiCidaEnde = edCodiCidaEnde;
  }

  public JTextField getEdCodiTien() 
  {
    return edCodiTien;
  }

  public void setEdCodiTien(JTextField edCodiTien) 
  {
    this.edCodiTien = edCodiTien;
  }

  public JTextField getEdCompEnde() 
  {
    return edCompEnde;
  }

  public void setEdCompEnde(JTextField edCompEnde) 
  {
    this.edCompEnde = edCompEnde;
  }

  public JTextField getEdContBancEnde() 
  {
    return edContBancEnde;
  }

  public void setEdContBancEnde(JTextField edContBancEnde) 
  {
    this.edContBancEnde = edContBancEnde;
  }

  public JTextField getEdContato()
  {
    return edContato;
  }

  public void setEdContato(JTextField edContato)
  {
    this.edContato = edContato;
  }

  public JTextField getEdDescEnde() 
  {
    return edDescEnde;
  }

  public void setEdDescEnde(JTextField edDescEnde) 
  {
    this.edDescEnde = edDescEnde;
  }

  public JTextField getEdEmail()
  {
    return edEmail;
  }

  public void setEdEmail(JTextField edEmail) 
  {
    this.edEmail = edEmail;
  }

  public JTextField getEdEndeEnde() 
  {
    return edEndeEnde;
  }

  public void setEdEndeEnde(JTextField edEndeEnde) 
  {
    this.edEndeEnde = edEndeEnde;
  }

  public JTextField getEdFant() 
  {
    return edFant;
  }

  public void setEdFant(JTextField edFant) 
  {
    this.edFant = edFant;
  }

  public JTextField getEdIeEnde()
  {
    return edIeEnde;
  }

  public void setEdIeEnde(JTextField edIeEnde) 
  {
    this.edIeEnde = edIeEnde;
  }

  public JTextField getEdNomeBancEnde()
  {
    return edNomeBancEnde;
  }

  public void setEdNomeBancEnde(JTextField edNomeBancEnde)
  {
    this.edNomeBancEnde = edNomeBancEnde;
  }

  public JTextField getEdNomeCidaEnde()
  {
    return edNomeCidaEnde;
  }

  public void setEdNomeCidaEnde(JTextField edNomeCidaEnde) 
  {
    this.edNomeCidaEnde = edNomeCidaEnde;
  }

  public JTextField getEdTien() 
  {
    return edTien;
  }

  public void setEdTien(JTextField edTien) 
  {
    this.edTien = edTien;
  }

  public JTextField getEdUfEnde() 
  {
    return edUfEnde;
  }

  public void setEdUfEnde(JTextField edUfEnde) 
  {
    this.edUfEnde = edUfEnde;
  }

  public JTextField getEdContEnde()
  {
    return edContEnde;
  }

  public void setEdContEnde(JTextField edContEnde)
  {
    this.edContEnde = edContEnde;
  }

  public JFormattedTextField getJftCelu()
  {
    return jftCelu;
  }

  public void setJftCelu(JFormattedTextField jftCelu)
  {
    this.jftCelu = jftCelu;
  }

  public JFormattedTextField getJftCepEnde()
  {
    return jftCepEnde;
  }

  public void setJftCepEnde(JFormattedTextField jftCepEnde) 
  {
    this.jftCepEnde = jftCepEnde;
  }

  public JFormattedTextField getJftCnpj()
  {
    return jftCnpj;
  }

  public void setJftCnpj(JFormattedTextField jftCnpj)
  {
    this.jftCnpj = jftCnpj;
  }

  public JFormattedTextField getJftCpf()
  {
    return jftCpf;
  }

  public void setJftCpf(JFormattedTextField jftCpf) 
  {
    this.jftCpf = jftCpf;
  }

  public JFormattedTextField getJftFone()
  {
    return jftFone;
  }

  public void setJftFone(JFormattedTextField jftFone)
  {
    this.jftFone = jftFone;
  }

  public JFormattedTextField getJftFoneEnde()
  {
    return jftFoneEnde;
  }

  public void setJftFoneEnde(JFormattedTextField jftFoneEnde) 
  {
    this.jftFoneEnde = jftFoneEnde;
  }

  public JFormattedTextField getJftNumeEnde()
  {
    return jftNumeEnde;
  }

  public void setJftNumeEnde(JFormattedTextField jftNumeEnde)
  {
    this.jftNumeEnde = jftNumeEnde;
  }

  public JTextArea getJtaObse()
  {
    return jtaObse;
  }

  public void setJtaObse(JTextArea jtaObse)
  {
    this.jtaObse = jtaObse;
  }

  public JTextField getEdCodi()
  {
    return edCodi;
  }

  public void setEdCodi(JTextField edCodi) 
  {
    this.edCodi = edCodi;
  }

  public JTextField getEdDesc()
  {
    return edDesc;
  }

  public void setEdDesc(JTextField edDesc)
  {
    this.edDesc = edDesc;
  }

  public JTextField getEdBancAgencia()
  {
    return edBancAgencia;
  }

  public void setEdBancAgencia(JTextField edBancAgencia)
  {
    this.edBancAgencia = edBancAgencia;
  }

  public JTextField getEdBancCodi() 
  {
    return edBancCodi;
  }

  public void setEdBancCodi(JTextField edBancCodi)
  {
    this.edBancCodi = edBancCodi;
  }

  public JTextField getEdBancConta()
  {
    return edBancConta;
  }

  public void setEdBancConta(JTextField edBancConta)
  {
    this.edBancConta = edBancConta;
  }

  public JTextField getEdBancNome()
  {
    return edBancNome;
  }

  public void setEdBancNome(JTextField edBancNome)
  {
    this.edBancNome = edBancNome;
  }

  public String getPalavra() 
  {
    return palavra;
  }

  public void setPalavra(String palavra)
  {
    this.palavra = palavra;
  }

  public JFormattedTextField getJftRg() {
    return jftRg;
  }

  public void setJftRg(JFormattedTextField jftRg) {
    this.jftRg = jftRg;
  }

  public JTextField getEdCodiBancEnde() {
    return edCodiBancEnde;
  }

  public void setEdCodiBancEnde(JTextField edCodiBancEnde) {
    this.edCodiBancEnde = edCodiBancEnde;
  } 
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTabbedPane abas;
  private javax.swing.JButton btnAvancar1;
  private javax.swing.JButton btnAvancar2;
  private javax.swing.JButton btnBuscaBancEnde;
  private javax.swing.JButton btnBuscaBanco;
  private javax.swing.JButton btnBuscaCidaEnde;
  private javax.swing.JButton btnBuscaTipoEntidade;
  private javax.swing.JTextField edAgencBancEnde;
  private javax.swing.JTextField edBairEnde;
  private javax.swing.JTextField edBancAgencia;
  private javax.swing.JTextField edBancCodi;
  private javax.swing.JTextField edBancConta;
  private javax.swing.JTextField edBancNome;
  private javax.swing.JTextField edCodiBancEnde;
  private javax.swing.JTextField edCodiCidaEnde;
  private javax.swing.JTextField edCodiTien;
  private javax.swing.JTextField edCompEnde;
  private javax.swing.JTextField edContBancEnde;
  private javax.swing.JTextField edContEnde;
  private javax.swing.JTextField edContato;
  private javax.swing.JTextField edDescEnde;
  private javax.swing.JTextField edEmail;
  private javax.swing.JTextField edEndeEnde;
  private javax.swing.JTextField edFant;
  private javax.swing.JTextField edIeEnde;
  private javax.swing.JTextField edNomeBancEnde;
  private javax.swing.JTextField edNomeCidaEnde;
  private javax.swing.JTextField edTien;
  private javax.swing.JTextField edUfEnde;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel28;
  private javax.swing.JLabel jLabel29;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel30;
  private javax.swing.JLabel jLabel31;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel10;
  private javax.swing.JPanel jPanel11;
  private javax.swing.JPanel jPanel8;
  private javax.swing.JPanel jPanel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JTable jTable1;
  private javax.swing.JTable jTable2;
  private javax.swing.JFormattedTextField jftCelu;
  private javax.swing.JFormattedTextField jftCepEnde;
  private javax.swing.JFormattedTextField jftCnpj;
  private javax.swing.JFormattedTextField jftCpf;
  private javax.swing.JFormattedTextField jftFone;
  private javax.swing.JFormattedTextField jftFoneEnde;
  private javax.swing.JFormattedTextField jftNumeEnde;
  private javax.swing.JFormattedTextField jftRg;
  private javax.swing.JTextArea jtaAssinatura;
  private javax.swing.JTextArea jtaObse;
  private javax.swing.JTable jtblGrid1;
  // End of variables declaration//GEN-END:variables

  private static final long serialVersionUID = 1L; 
}
