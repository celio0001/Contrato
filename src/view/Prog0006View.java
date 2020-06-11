package view;

import control.Prog0006Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import template.FormTemplate;
import vo.Prog0006Vo;

public class Prog0006View extends FormTemplate implements ActionListener,FocusListener
{
  
  Prog0006Vo prog0006Vo = new Prog0006Vo();
  private String palavra;
  public Prog0006View() 
  {
    initComponents();
    super.lblTitulo.setText("CADASTRO DE ENTIDADE PESSOA FISICA");
    super.lblCodi.setText("Codigo");
    super.lblDesc.setText("Nome");
    super.setTitle("..::PROG0006::..");
    super.setSize(620, 670);
    super.setLocationRelativeTo(null);
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    edCodi.addFocusListener((FocusListener) this);
  }
  
  @Override
  public void btnBuscarActionPerformed(ActionEvent e) 
  {
    setPalavra("listaPessoaFisica");
    buscarLista(palavra);
  }

  @Override
  public void btnGravarActionPerformed(ActionEvent e)
  {
    if(edCodi.getText().equals(""))
    {
      //INSERINDO
      Prog0006Control fisica = new Prog0006Control();
      try 
      {
        fisica.gravarPessoaFisica(edDesc.getText(),
                                  edCep.getText(),
                                  edEnde.getText(),
                                  edNume.getText(),
                                  edCodiCida.getText(),
                                  edNomeCida.getText(),
                                  edSiglaEsta.getText(),
                                  edBairro.getText(),
                                  edComp.getText(),
                                  edRg.getText(),
                                  edCpf.getText(),
                                  edFoneFixo.getText(),
                                  edCelu.getText(),
                                  edEmail.getText(),
                                  edTienCodi.getText(),
                                  edTienNome.getText(),
                                  edObse.getText());
        limarCampos();
        
        JOptionPane.showMessageDialog(null,"Cadastro Salvo com sucesso","Gravar Pessoa Fisica",JOptionPane.INFORMATION_MESSAGE);
      } 
      catch (ClassNotFoundException | SQLException ex) 
      {
        System.out.println("Error:"+ex);
      }
    }
    else
    {
      System.out.println(edNasc.getText());
      System.out.println(edTienNome.getText());
      //EDITANDO
      Prog0006Control pessoaE = new Prog0006Control();
      try 
      {
        pessoaE.editarPessoa(edCodi.getText(),
                             edDesc.getText(),
                             edCep.getText(),
                             edEnde.getText(),
                             edNume.getText(),
                             edCodiCida.getText(),
                             edNomeCida.getText(),
                             edSiglaEsta.getText(),
                             edBairro.getText(),
                             edComp.getText(),
                             edRg.getText(),
                             edCpf.getText(),
                             edFoneFixo.getText(),
                             edCelu.getText(),
                             edEmail.getText(),
                             edTienCodi.getText(),
                             edTienNome.getText(),
                             edObse.getText());
        limarCampos();
        edDesc.requestFocus();
        
        JOptionPane.showMessageDialog(null,"Edição realizada com sucesso","Gravar Pessoa Fisica",JOptionPane.INFORMATION_MESSAGE);
      } 
      catch (ClassNotFoundException | SQLException ex) 
      {
        System.out.println("Error:"+ex);
      }      
    }
  }

  @Override
  public void btnExcluirActionPerformed(ActionEvent e) 
  { 
    try 
    {
      Prog0006Control pessoaE = new Prog0006Control();
      pessoaE.excluirPessoa(edCodi.getText());
      limarCampos();

      JOptionPane.showMessageDialog(null,"Cadastro Excluido com sucesso","Excluir Pessoa Fisica",JOptionPane.INFORMATION_MESSAGE);
    } 
    catch (ClassNotFoundException | SQLException | NumberFormatException ex) 
    {
      System.out.println("Error:"+ex);
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
  public void focusLost(FocusEvent e) {
    if(!edCodi.getText().equals(""))
    {    
      try 
      {
        Prog0006Control buscaEntidade = new Prog0006Control();
        prog0006Vo = buscaEntidade.buscaNovaEntidade(edCodi.getText());
        edCodi.setText(prog0006Vo.getCodigo());
        edDesc.setText(prog0006Vo.getDescricao());
        edNasc.setText(prog0006Vo.getNascionalidade());
        edProfi.setText(prog0006Vo.getProfissao());
        edCep.setText(prog0006Vo.getCep());
        edEnde.setText(prog0006Vo.getEndereco());
        edNume.setText(prog0006Vo.getNumero());
        edCpf.setText(prog0006Vo.getCpf());
        edCodiCida.setText(prog0006Vo.getCodiCida());
        edFoneFixo.setText(prog0006Vo.getFoneFixo());
        edCelu.setText(prog0006Vo.getCelular());
        edNomeCida.setText(prog0006Vo.getNomeCida());
        edEmail.setText(prog0006Vo.getEmail());
        edSiglaEsta.setText(prog0006Vo.getEstado());
        edBairro.setText(prog0006Vo.getBairro());
        edRg.setText(prog0006Vo.getRg());
        edComp.setText(prog0006Vo.getComplemento());
        edTienCodi.setText(prog0006Vo.getCodiTien());
        edTienNome.setText(prog0006Vo.getTien());
        edObse.setText(prog0006Vo.getObservacao());      
      } 
      catch (SQLException | ClassNotFoundException ex) 
      {
        System.out.println("Error:"+ex);
      }
    } 
    else 
    {
      limarCampos();
      edDesc.requestFocus();   
    }  
  }
    
@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    edEnde = new javax.swing.JTextField();
    edNume = new javax.swing.JTextField();
    edCodiCida = new javax.swing.JTextField();
    edNomeCida = new javax.swing.JTextField();
    btnBuscarCida = new javax.swing.JButton();
    edSiglaEsta = new javax.swing.JTextField();
    edBairro = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    edComp = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    edRg = new javax.swing.JTextField();
    edCpf = new javax.swing.JTextField();
    edFoneFixo = new javax.swing.JTextField();
    edCelu = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    edEmail = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    edObse = new javax.swing.JTextPane();
    edCep = new javax.swing.JFormattedTextField();
    jLabel15 = new javax.swing.JLabel();
    edNasc = new javax.swing.JTextField();
    jLabel16 = new javax.swing.JLabel();
    edProfi = new javax.swing.JTextField();
    jLabel17 = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    edTienCodi = new javax.swing.JTextField();
    edTienNome = new javax.swing.JTextField();
    btnBuscarTien = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    jLabel1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("Cep");

    jLabel2.setBackground(new java.awt.Color(255, 255, 255));
    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("Endereço");

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3.setText("Nro");

    jLabel4.setBackground(new java.awt.Color(255, 255, 255));
    jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4.setText("Cidade");

    jLabel5.setBackground(new java.awt.Color(255, 255, 255));
    jLabel5.setForeground(new java.awt.Color(0, 0, 0));
    jLabel5.setText("Nome Cidade");

    jLabel6.setBackground(new java.awt.Color(255, 255, 255));
    jLabel6.setForeground(new java.awt.Color(0, 0, 0));
    jLabel6.setText("UF");

    jLabel7.setBackground(new java.awt.Color(255, 255, 255));
    jLabel7.setForeground(new java.awt.Color(0, 0, 0));
    jLabel7.setText("Bairro");

    edEnde.setBackground(new java.awt.Color(255, 255, 255));
    edEnde.setForeground(new java.awt.Color(0, 0, 0));

    edNume.setBackground(new java.awt.Color(255, 255, 255));
    edNume.setForeground(new java.awt.Color(0, 0, 0));

    edCodiCida.setBackground(new java.awt.Color(255, 255, 255));
    edCodiCida.setForeground(new java.awt.Color(0, 0, 0));

    edNomeCida.setEditable(false);
    edNomeCida.setBackground(new java.awt.Color(255, 255, 255));
    edNomeCida.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscarCida.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscarCida.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscarCida.setText("Buscar");
    btnBuscarCida.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarCidaActionPerformed(evt);
      }
    });

    edSiglaEsta.setBackground(new java.awt.Color(255, 255, 255));
    edSiglaEsta.setForeground(new java.awt.Color(0, 0, 0));

    edBairro.setBackground(new java.awt.Color(255, 255, 255));
    edBairro.setForeground(new java.awt.Color(0, 0, 0));

    jLabel8.setBackground(new java.awt.Color(255, 255, 255));
    jLabel8.setForeground(new java.awt.Color(0, 0, 0));
    jLabel8.setText("Complemento");

    edComp.setBackground(new java.awt.Color(255, 255, 255));
    edComp.setForeground(new java.awt.Color(0, 0, 0));

    jLabel9.setBackground(new java.awt.Color(255, 255, 255));
    jLabel9.setForeground(new java.awt.Color(0, 0, 0));
    jLabel9.setText("Observação");

    jLabel10.setBackground(new java.awt.Color(255, 255, 255));
    jLabel10.setForeground(new java.awt.Color(0, 0, 0));
    jLabel10.setText("RG");

    jLabel11.setBackground(new java.awt.Color(255, 255, 255));
    jLabel11.setForeground(new java.awt.Color(0, 0, 0));
    jLabel11.setText("CPF");

    jLabel12.setBackground(new java.awt.Color(255, 255, 255));
    jLabel12.setForeground(new java.awt.Color(0, 0, 0));
    jLabel12.setText("Fone");

    jLabel13.setBackground(new java.awt.Color(255, 255, 255));
    jLabel13.setForeground(new java.awt.Color(0, 0, 0));
    jLabel13.setText("Celular");

    edRg.setBackground(new java.awt.Color(255, 255, 255));
    edRg.setForeground(new java.awt.Color(0, 0, 0));

    edCpf.setBackground(new java.awt.Color(255, 255, 255));
    edCpf.setForeground(new java.awt.Color(0, 0, 0));

    edFoneFixo.setBackground(new java.awt.Color(255, 255, 255));
    edFoneFixo.setForeground(new java.awt.Color(0, 0, 0));

    edCelu.setBackground(new java.awt.Color(255, 255, 255));
    edCelu.setForeground(new java.awt.Color(0, 0, 0));

    jLabel14.setBackground(new java.awt.Color(255, 255, 255));
    jLabel14.setForeground(new java.awt.Color(0, 0, 0));
    jLabel14.setText("Email");

    edEmail.setBackground(new java.awt.Color(255, 255, 255));
    edEmail.setForeground(new java.awt.Color(0, 0, 0));

    edObse.setBackground(new java.awt.Color(255, 255, 255));
    edObse.setForeground(new java.awt.Color(0, 0, 0));
    jScrollPane2.setViewportView(edObse);

    edCep.setBackground(new java.awt.Color(255, 255, 255));
    edCep.setForeground(new java.awt.Color(0, 0, 0));
    try {
      edCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    edCep.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        edCepFocusLost(evt);
      }
    });

    jLabel15.setForeground(new java.awt.Color(0, 0, 0));
    jLabel15.setText("Nascionalidade");

    edNasc.setBackground(new java.awt.Color(255, 255, 255));
    edNasc.setForeground(new java.awt.Color(0, 0, 0));

    jLabel16.setForeground(new java.awt.Color(0, 0, 0));
    jLabel16.setText("Profissão");

    edProfi.setBackground(new java.awt.Color(255, 255, 255));
    edProfi.setForeground(new java.awt.Color(0, 0, 0));
    edProfi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        edProfiActionPerformed(evt);
      }
    });

    jLabel17.setBackground(java.awt.Color.white);
    jLabel17.setForeground(new java.awt.Color(0, 0, 0));
    jLabel17.setText("Tipo de Entidade");

    jLabel18.setBackground(java.awt.Color.white);
    jLabel18.setForeground(new java.awt.Color(0, 0, 0));
    jLabel18.setText("Codigo");

    edTienCodi.setBackground(new java.awt.Color(255, 255, 255));
    edTienCodi.setForeground(new java.awt.Color(0, 0, 0));

    edTienNome.setBackground(new java.awt.Color(255, 255, 255));
    edTienNome.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscarTien.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscarTien.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscarTien.setText("Buscar");
    btnBuscarTien.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarTienActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel9)
            .addGap(433, 433, 433))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(edBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edComp)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel10)
                  .addComponent(edRg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edFoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edCelu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(edEmail)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel4)
                  .addComponent(edCep, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                  .addComponent(edCodiCida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btnBuscarCida)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(edNomeCida, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(jLabel5)))
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(edEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(edNume)
                  .addComponent(edSiglaEsta)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel14)
                  .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel16)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(edProfi)))
              .addComponent(jScrollPane2)
              .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel18)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(edTienCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscarTien)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edTienNome)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel17)
                    .addGap(0, 0, Short.MAX_VALUE)))))
            .addContainerGap())))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel15)
          .addComponent(jLabel16))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edProfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2)
          .addComponent(jLabel3))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCep, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(2, 2, 2)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(jLabel5)
          .addComponent(jLabel6))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCodiCida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeCida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edSiglaEsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnBuscarCida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel7)
          .addComponent(jLabel8))
        .addGap(2, 2, 2)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel10)
          .addComponent(jLabel11)
          .addComponent(jLabel12)
          .addComponent(jLabel13))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edFoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addComponent(jLabel14)
        .addGap(0, 0, 0)
        .addComponent(edEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel18)
            .addGap(0, 0, 0)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(edTienCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnBuscarTien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(edTienNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(5, 5, 5)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(jLabel9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel17))
        .addContainerGap())
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void edCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCepFocusLost
    Prog0006Control cepB = new Prog0006Control();
      try {
        prog0006Vo = cepB.buscaCep(edCep.getText());
        edEnde.setText(prog0006Vo.getEndereco());
        edBairro.setText(prog0006Vo.getBairro());
        edCodiCida.setText(prog0006Vo.getCodiCida());
        edNomeCida.setText(prog0006Vo.getNomeCida());
        edSiglaEsta.setText(prog0006Vo.getEstado());
      } 
      catch (ClassNotFoundException | SQLException ex) 
      {
        System.out.println("Error:"+ex);
      }
  }//GEN-LAST:event_edCepFocusLost

  private void btnBuscarCidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCidaActionPerformed
   
    setPalavra("listaCidade");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscarCidaActionPerformed

  private void btnBuscaTipoEntidadeFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaTipoEntidadeFisicaActionPerformed
    setPalavra("tipoEnti");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaTipoEntidadeFisicaActionPerformed

  private void edProfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edProfiActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_edProfiActionPerformed

  private void btnBuscarTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTienActionPerformed
    setPalavra("tipoEnti");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscarTienActionPerformed

  public void buscarLista(String palavra)
  {
    switch(palavra)
    {
      case"listaPessoaFisica":
      {
        ListaView lista = new ListaView(this);
        lista.setVisible(true);
        this.dispose();
        break;
      }
      case"listaCidade":
      {
        ListaView listaCidade = new ListaView(this);
        listaCidade.setVisible(true);
        this.dispose();
        break;
      }
      case"tipoEnti":
      {
        ListaView listaTipoEnti = new ListaView(this);
        listaTipoEnti.setVisible(true);
        this.dispose();
        break;
      }
    }
  }
  public void limarCampos()
  {
    edCodi.setText("");
    edDesc.setText("");
    edCep.setText("");
    edEnde.setText("");
    edNume.setText("");
    edCodiCida.setText("");
    edNomeCida.setText("");
    edSiglaEsta.setText("");
    edBairro.setText("");
    edComp.setText("");
    edRg.setText("");
    edCpf.setText("");
    edFoneFixo.setText("");
    edCelu.setText("");
    edEmail.setText("");
    edTienCodi.setText("");
    edTienNome.setText("");
    edObse.setText("");
  }
//=================================================================  
  public JTextField getEdBairro() {
    return edBairro;
  }

  public void setEdBairro(JTextField edBairro) {
    this.edBairro = edBairro;
  }

  public JFormattedTextField getEdCep() {
    return edCep;
  }

  public void setEdCep(JFormattedTextField edCep) {
    this.edCep = edCep;
  }

  public JTextField getEdCodiCida() {
    return edCodiCida;
  }

  public void setEdCodiCida(JTextField edCodiCida) {
    this.edCodiCida = edCodiCida;
  }

  public JTextField getEdComp() {
    return edComp;
  }

  public void setEdComp(JTextField edComp) {
    this.edComp = edComp;
  }

  public JTextField getEdCpf() {
    return edCpf;
  }

  public void setEdCpf(JTextField edCpf) {
    this.edCpf = edCpf;
  }

  public JTextField getEdEmail() {
    return edEmail;
  }

  public void setEdEmail(JTextField edEmail) {
    this.edEmail = edEmail;
  }

  public JTextField getEdEnde() {
    return edEnde;
  }

  public void setEdEnde(JTextField edEnde) {
    this.edEnde = edEnde;
  }

  public JTextField getEdFoneFixo() {
    return edFoneFixo;
  }

  public void setEdFoneFixo(JTextField edFoneFixo) {
    this.edFoneFixo = edFoneFixo;
  }

  public JTextField getEdNasc() {
    return edNasc;
  }

  public void setEdNasc(JTextField edNasc) {
    this.edNasc = edNasc;
  }

  public JTextField getEdNomeCida() {
    return edNomeCida;
  }

  public void setEdNomeCida(JTextField edNomeCida) {
    this.edNomeCida = edNomeCida;
  }

  public JTextField getEdNume() {
    return edNume;
  }

  public void setEdNume(JTextField edNume) {
    this.edNume = edNume;
  }

  public JTextPane getEdObse() {
    return edObse;
  }

  public void setEdObse(JTextPane edObse) {
    this.edObse = edObse;
  }

  public JTextField getEdProfi() {
    return edProfi;
  }

  public void setEdProfi(JTextField edProfi) {
    this.edProfi = edProfi;
  }

  public JTextField getEdRg() {
    return edRg;
  }

  public void setEdRg(JTextField edRg) {
    this.edRg = edRg;
  }

  public JTextField getEdSiglaEsta() {
    return edSiglaEsta;
  }

  public void setEdSiglaEsta(JTextField edSiglaEsta) {
    this.edSiglaEsta = edSiglaEsta;
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

  public JTextField getEdCelu() {
    return edCelu;
  }

  public void setEdCelu(JTextField edCelu) {
    this.edCelu = edCelu;
  }

  public String getPalavra() {
    return palavra;
  }
  
  public void setPalavra(String palavra) {
    this.palavra = palavra;
  }

  public JTextField getEdTienCodi() {
    return edTienCodi;
  }

  public void setEdTienCodi(JTextField edTienCodi) {
    this.edTienCodi = edTienCodi;
  }

  public JTextField getEdTienNome() {
    return edTienNome;
  }

  public void setEdTienNome(JTextField edTienNome) {
    this.edTienNome = edTienNome;
  }
  
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBuscarCida;
  private javax.swing.JButton btnBuscarTien;
  private javax.swing.JTextField edBairro;
  private javax.swing.JTextField edCelu;
  private javax.swing.JFormattedTextField edCep;
  private javax.swing.JTextField edCodiCida;
  private javax.swing.JTextField edComp;
  private javax.swing.JTextField edCpf;
  private javax.swing.JTextField edEmail;
  private javax.swing.JTextField edEnde;
  private javax.swing.JTextField edFoneFixo;
  private javax.swing.JTextField edNasc;
  private javax.swing.JTextField edNomeCida;
  private javax.swing.JTextField edNume;
  private javax.swing.JTextPane edObse;
  private javax.swing.JTextField edProfi;
  private javax.swing.JTextField edRg;
  private javax.swing.JTextField edSiglaEsta;
  private javax.swing.JTextField edTienCodi;
  private javax.swing.JTextField edTienNome;
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
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JSeparator jSeparator1;
  // End of variables declaration//GEN-END:variables

  
  private static final long serialVersionUID = 1L;
}