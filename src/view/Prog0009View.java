package view;

import control.Prog0006Control;
import control.Prog0009Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import template.FormContrato;
import vo.Prog0006Vo;
import vo.Prog0009Vo;

public class Prog0009View extends FormContrato implements ActionListener,FocusListener 
{

  private Prog0009Control prog0009Control;
  private Prog0009Vo prog0009Vo;
  private String palavra;
  
  public Prog0009View() 
  {
    initComponents();
    setTitle("..::PROG0009::..");
    super.lblTitulo.setText("CADASTRO DE CONTRATO");
    super.lblCodi.setText("Codigo");
    super.lblData.setText("Data");
    super.lblValor.setText("Valor");
    super.lblStatus.setText("Status");
    super.setTitle("..::PROG0009::..");
    super.setSize(650, 710);
    super.setLocationRelativeTo(null);
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    edCodi.addFocusListener((FocusListener) this);
    prog0009Control = new Prog0009Control();
    prog0009Vo = new Prog0009Vo();
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
        prog0009Vo = prog0009Control.buscarContrato(edCodi.getText());
      } 
      catch (SQLException ex) 
      {
        Logger.getLogger(Prog0009View.class.getName()).log(Level.SEVERE, null, ex);
      } 
      catch (ClassNotFoundException ex) 
      {
        Logger.getLogger(Prog0009View.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    else
    {
      edStatus.setText("Lançado");
      edData.requestFocus();
    }
  }

  @Override
  public void btnBuscarActionPerformed(ActionEvent e) 
  {
    
  }

  @Override
  public void btnGravarActionPerformed(ActionEvent e) 
  {
    
    if(edCodi.getText().equals(""))
    {
      try 
      {
        prog0009Control.gravarContrato(edData.getText(),
                                       edValor.getText(),
                                       edStatus.getText(),
                                       edCodiComp.getText(),
                                       edCepComp.getText(),
                                       edEndeComp.getText(),
                                       edNumeComp.getText(),
                                       edBairroComp.getText(),
                                       edCodiCidaComp.getText(),
                                       edCodiVend.getText(),
                                       edCepVend.getText(),
                                       edEndeVend.getText(),
                                       edNumeVend.getText(),
                                       edBairroVend.getText(),
                                       edCodiCidaVend.getText(),
                                       edCodiCidaImovel.getText(),
                                       edNomeTest1.getText(),
                                       edNomeTest2.getText(),
                                       edCodiForo.getText(),
                                       edCodiBanc.getText(),
                                       edCodiTienComp.getText(),
                                       edCodiTienVend.getText());
        
        JOptionPane.showMessageDialog(null,"Registro Salvo com sucesso:" ,"Cadastro Contrato",JOptionPane.INFORMATION_MESSAGE);
      } 
      catch (ClassNotFoundException | SQLException /*| NumberFormatException*/ ex) 
      {
        System.out.println("Error: "+ex);
      }
    }
  }

  @Override
  public void btnExcluirActionPerformed(ActionEvent e) 
  {
    
  }

  @Override
  public void btnImpromirActionPerformed(ActionEvent e) 
  {
    
  }

  @Override
  public void btnSairActionPerformed(ActionEvent e) 
  {
    this.dispose();
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    jLabel18 = new javax.swing.JLabel();
    edCepComp = new javax.swing.JTextField();
    jLabel19 = new javax.swing.JLabel();
    edEndeComp = new javax.swing.JTextField();
    jLabel20 = new javax.swing.JLabel();
    edNumeComp = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    edCodiCidaComp = new javax.swing.JTextField();
    btnBuscaComp = new javax.swing.JButton();
    btnBuscaCidaComp = new javax.swing.JButton();
    edNomeComp = new javax.swing.JTextField();
    edNomeCidaComp = new javax.swing.JTextField();
    jLabel22 = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    edUfComp = new javax.swing.JTextField();
    jLabel24 = new javax.swing.JLabel();
    edBairroComp = new javax.swing.JTextField();
    jSeparator2 = new javax.swing.JSeparator();
    jLabel3 = new javax.swing.JLabel();
    btnBuscaVendedor = new javax.swing.JButton();
    edNomeVend = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();
    edCepVend = new javax.swing.JTextField();
    jLabel27 = new javax.swing.JLabel();
    edEndeVend = new javax.swing.JTextField();
    jLabel28 = new javax.swing.JLabel();
    edNumeVend = new javax.swing.JTextField();
    jLabel29 = new javax.swing.JLabel();
    edCodiCidaVend = new javax.swing.JTextField();
    btnBuscaCidaVend = new javax.swing.JButton();
    edNomeCidaVend = new javax.swing.JTextField();
    jLabel30 = new javax.swing.JLabel();
    jLabel31 = new javax.swing.JLabel();
    edUfVend = new javax.swing.JTextField();
    jLabel32 = new javax.swing.JLabel();
    edBairroVend = new javax.swing.JTextField();
    edCodiComp = new javax.swing.JTextField();
    edCodiVend = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    edCodiTienVend = new javax.swing.JTextField();
    btnBuscarTienVend = new javax.swing.JButton();
    edTienVend = new javax.swing.JTextField();
    edCodiTien = new javax.swing.JLabel();
    edCodiTienComp = new javax.swing.JTextField();
    edTienComp = new javax.swing.JTextField();
    btnBuscarTienComp = new javax.swing.JButton();
    lblTienComp = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    edNomeCidaImovel = new javax.swing.JTextField();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    edUfImovel = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    edBairroImovel = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();
    edCepImovel = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    edEndeImovel = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    edNumeImovel = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    edCodiCidaImovel = new javax.swing.JTextField();
    btnBuscaCidaImovel = new javax.swing.JButton();
    jSeparator3 = new javax.swing.JSeparator();
    jLabel34 = new javax.swing.JLabel();
    edNomeTest1 = new javax.swing.JTextField();
    jLabel35 = new javax.swing.JLabel();
    edNomeTest2 = new javax.swing.JTextField();
    btnBuscaTest3 = new javax.swing.JButton();
    btnBuscaTest4 = new javax.swing.JButton();
    edCodiTest1 = new javax.swing.JTextField();
    edCodiTest2 = new javax.swing.JTextField();
    jLabel36 = new javax.swing.JLabel();
    jLabel37 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    btnBuscaBanco = new javax.swing.JButton();
    edNomeBanc = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    btnBuscaForo = new javax.swing.JButton();
    edNomeForo = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    edCodiBanc = new javax.swing.JTextField();
    edCodiForo = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
    jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    jLabel18.setBackground(new java.awt.Color(255, 255, 255));
    jLabel18.setForeground(new java.awt.Color(0, 0, 0));
    jLabel18.setText("Cep");

    edCepComp.setBackground(new java.awt.Color(255, 255, 255));
    edCepComp.setForeground(new java.awt.Color(0, 0, 0));
    edCepComp.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        edCepCompFocusLost(evt);
      }
    });

    jLabel19.setBackground(new java.awt.Color(255, 255, 255));
    jLabel19.setForeground(new java.awt.Color(0, 0, 0));
    jLabel19.setText("Endereço");

    edEndeComp.setBackground(new java.awt.Color(255, 255, 255));
    edEndeComp.setForeground(new java.awt.Color(0, 0, 0));

    jLabel20.setBackground(new java.awt.Color(255, 255, 255));
    jLabel20.setForeground(new java.awt.Color(0, 0, 0));
    jLabel20.setText("Numero");

    edNumeComp.setBackground(new java.awt.Color(255, 255, 255));
    edNumeComp.setForeground(new java.awt.Color(0, 0, 0));

    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("Codigo");

    jLabel21.setBackground(new java.awt.Color(255, 255, 255));
    jLabel21.setForeground(new java.awt.Color(0, 0, 0));
    jLabel21.setText("Codigo");

    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("Comprador");

    edCodiCidaComp.setBackground(new java.awt.Color(255, 255, 255));
    edCodiCidaComp.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscaComp.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaComp.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaComp.setText("Buscar");
    btnBuscaComp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCompActionPerformed(evt);
      }
    });

    btnBuscaCidaComp.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaCidaComp.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaCidaComp.setText("Buscar");
    btnBuscaCidaComp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCidaCompActionPerformed(evt);
      }
    });

    edNomeComp.setBackground(new java.awt.Color(255, 255, 255));
    edNomeComp.setForeground(new java.awt.Color(0, 0, 0));

    edNomeCidaComp.setBackground(new java.awt.Color(255, 255, 255));
    edNomeCidaComp.setForeground(new java.awt.Color(0, 0, 0));

    jLabel22.setBackground(new java.awt.Color(255, 255, 255));
    jLabel22.setForeground(new java.awt.Color(0, 0, 0));
    jLabel22.setText("Cidade");

    jLabel23.setBackground(new java.awt.Color(255, 255, 255));
    jLabel23.setForeground(new java.awt.Color(0, 0, 0));
    jLabel23.setText("UF");

    edUfComp.setBackground(new java.awt.Color(255, 255, 255));
    edUfComp.setForeground(new java.awt.Color(0, 0, 0));

    jLabel24.setBackground(new java.awt.Color(255, 255, 255));
    jLabel24.setForeground(new java.awt.Color(0, 0, 0));
    jLabel24.setText("Bairro");

    edBairroComp.setBackground(new java.awt.Color(255, 255, 255));
    edBairroComp.setForeground(new java.awt.Color(0, 0, 0));

    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3.setText("Codigo");

    btnBuscaVendedor.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaVendedor.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaVendedor.setText("Buscar");
    btnBuscaVendedor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaVendedorActionPerformed(evt);
      }
    });

    edNomeVend.setBackground(new java.awt.Color(255, 255, 255));
    edNomeVend.setForeground(new java.awt.Color(0, 0, 0));

    jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4.setText("Vendedor");

    jLabel26.setBackground(new java.awt.Color(255, 255, 255));
    jLabel26.setForeground(new java.awt.Color(0, 0, 0));
    jLabel26.setText("Cep");

    edCepVend.setBackground(new java.awt.Color(255, 255, 255));
    edCepVend.setForeground(new java.awt.Color(0, 0, 0));
    edCepVend.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        edCepVendFocusLost(evt);
      }
    });

    jLabel27.setBackground(new java.awt.Color(255, 255, 255));
    jLabel27.setForeground(new java.awt.Color(0, 0, 0));
    jLabel27.setText("Endereço");

    edEndeVend.setBackground(new java.awt.Color(255, 255, 255));
    edEndeVend.setForeground(new java.awt.Color(0, 0, 0));

    jLabel28.setBackground(new java.awt.Color(255, 255, 255));
    jLabel28.setForeground(new java.awt.Color(0, 0, 0));
    jLabel28.setText("Numero");

    edNumeVend.setBackground(new java.awt.Color(255, 255, 255));
    edNumeVend.setForeground(new java.awt.Color(0, 0, 0));

    jLabel29.setBackground(new java.awt.Color(255, 255, 255));
    jLabel29.setForeground(new java.awt.Color(0, 0, 0));
    jLabel29.setText("Codigo");

    edCodiCidaVend.setBackground(new java.awt.Color(255, 255, 255));
    edCodiCidaVend.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscaCidaVend.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaCidaVend.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaCidaVend.setText("Buscar");
    btnBuscaCidaVend.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCidaVendActionPerformed(evt);
      }
    });

    edNomeCidaVend.setBackground(new java.awt.Color(255, 255, 255));
    edNomeCidaVend.setForeground(new java.awt.Color(0, 0, 0));

    jLabel30.setBackground(new java.awt.Color(255, 255, 255));
    jLabel30.setForeground(new java.awt.Color(0, 0, 0));
    jLabel30.setText("Cidade");

    jLabel31.setBackground(new java.awt.Color(255, 255, 255));
    jLabel31.setForeground(new java.awt.Color(0, 0, 0));
    jLabel31.setText("UF");

    edUfVend.setBackground(new java.awt.Color(255, 255, 255));
    edUfVend.setForeground(new java.awt.Color(0, 0, 0));

    jLabel32.setBackground(new java.awt.Color(255, 255, 255));
    jLabel32.setForeground(new java.awt.Color(0, 0, 0));
    jLabel32.setText("Bairro");

    edBairroVend.setBackground(new java.awt.Color(255, 255, 255));
    edBairroVend.setForeground(new java.awt.Color(0, 0, 0));

    edCodiComp.setBackground(new java.awt.Color(255, 255, 255));
    edCodiComp.setForeground(new java.awt.Color(0, 0, 0));

    edCodiVend.setBackground(new java.awt.Color(255, 255, 255));
    edCodiVend.setForeground(new java.awt.Color(0, 0, 0));

    jLabel9.setBackground(new java.awt.Color(255, 255, 255));
    jLabel9.setForeground(new java.awt.Color(0, 0, 0));
    jLabel9.setText("Codigo");

    edCodiTienVend.setBackground(new java.awt.Color(255, 255, 255));
    edCodiTienVend.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscarTienVend.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscarTienVend.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscarTienVend.setText("Buscar");

    edTienVend.setBackground(new java.awt.Color(255, 255, 255));
    edTienVend.setForeground(new java.awt.Color(0, 0, 0));

    edCodiTien.setBackground(new java.awt.Color(255, 255, 255));
    edCodiTien.setForeground(new java.awt.Color(0, 0, 0));
    edCodiTien.setText("Codigo");

    edCodiTienComp.setBackground(new java.awt.Color(255, 255, 255));
    edCodiTienComp.setForeground(new java.awt.Color(0, 0, 0));

    edTienComp.setBackground(new java.awt.Color(255, 255, 255));
    edTienComp.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscarTienComp.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscarTienComp.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscarTienComp.setText("Buscar");

    lblTienComp.setBackground(new java.awt.Color(255, 255, 255));
    lblTienComp.setForeground(new java.awt.Color(0, 0, 0));
    lblTienComp.setText("Tipo Entidade");

    jLabel11.setBackground(new java.awt.Color(255, 255, 255));
    jLabel11.setForeground(new java.awt.Color(0, 0, 0));
    jLabel11.setText("Tipo entidade");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(5, 5, 5)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel24)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(edCodiComp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaComp)))
            .addGap(3, 3, 3)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(edNomeComp)))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel21)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(edCodiCidaComp)
                  .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edCepComp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jLabel19)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btnBuscaCidaComp)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(edNomeCidaComp)
                      .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))))
                  .addComponent(edEndeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(9, 9, 9)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(edNumeComp)
              .addComponent(edUfComp)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel20)
                  .addComponent(jLabel23))
                .addGap(0, 30, Short.MAX_VALUE))))
          .addComponent(edBairroComp, javax.swing.GroupLayout.Alignment.LEADING))
        .addGap(5, 5, 5))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(edCodiVend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscaVendedor))
                  .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(edNomeVend)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel29)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(edCodiCidaVend)
                      .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(edCepVend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel27)
                      .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscaCidaVend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(edNomeCidaVend)
                          .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addGap(0, 0, Short.MAX_VALUE))))
                      .addComponent(edEndeVend, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel28)
                      .addComponent(jLabel31))
                    .addGap(0, 34, Short.MAX_VALUE))
                  .addComponent(edNumeVend)
                  .addComponent(edUfVend)))
              .addComponent(edBairroVend)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(edCodiTienVend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscarTienVend))
                  .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(edTienVend))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
        .addContainerGap())
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(edCodiTienComp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnBuscarTienComp))
          .addComponent(edCodiTien))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(edTienComp)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(lblTienComp)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuscaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCodiComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel18)
          .addComponent(jLabel19)
          .addComponent(jLabel20))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCepComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edEndeComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNumeComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel21)
          .addComponent(jLabel22)
          .addComponent(jLabel23))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnBuscaCidaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(edNomeCidaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(edUfComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(edCodiCidaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addComponent(jLabel24)
        .addGap(0, 0, 0)
        .addComponent(edBairroComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCodiTien)
          .addComponent(lblTienComp))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCodiTienComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edTienComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnBuscarTienComp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(5, 5, 5)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel4))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuscaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCodiVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel26)
          .addComponent(jLabel27)
          .addComponent(jLabel28))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCepVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edEndeVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNumeVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel29)
          .addComponent(jLabel30)
          .addComponent(jLabel31))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnBuscaCidaVend, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(edNomeCidaVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(edUfVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(edCodiCidaVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addComponent(jLabel32)
        .addGap(0, 0, 0)
        .addComponent(edBairroVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9)
          .addComponent(jLabel11))
        .addGap(0, 0, 0)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCodiTienVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnBuscarTienVend, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edTienVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("DADOS COMPRADOR / VENDEDOR", jPanel1);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    edNomeCidaImovel.setBackground(new java.awt.Color(255, 255, 255));
    edNomeCidaImovel.setForeground(new java.awt.Color(0, 0, 0));

    jLabel16.setBackground(new java.awt.Color(255, 255, 255));
    jLabel16.setForeground(new java.awt.Color(0, 0, 0));
    jLabel16.setText("Cidade");

    jLabel17.setBackground(new java.awt.Color(255, 255, 255));
    jLabel17.setForeground(new java.awt.Color(0, 0, 0));
    jLabel17.setText("UF");

    edUfImovel.setBackground(new java.awt.Color(255, 255, 255));
    edUfImovel.setForeground(new java.awt.Color(0, 0, 0));

    jLabel10.setBackground(new java.awt.Color(255, 255, 255));
    jLabel10.setForeground(new java.awt.Color(0, 0, 0));
    jLabel10.setText("Bairro");

    edBairroImovel.setBackground(new java.awt.Color(255, 255, 255));
    edBairroImovel.setForeground(new java.awt.Color(0, 0, 0));

    jLabel12.setBackground(new java.awt.Color(255, 255, 255));
    jLabel12.setForeground(new java.awt.Color(0, 0, 0));
    jLabel12.setText("Cep");

    edCepImovel.setBackground(new java.awt.Color(255, 255, 255));
    edCepImovel.setForeground(new java.awt.Color(0, 0, 0));
    edCepImovel.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        edCepImovelFocusLost(evt);
      }
    });

    jLabel13.setBackground(new java.awt.Color(255, 255, 255));
    jLabel13.setForeground(new java.awt.Color(0, 0, 0));
    jLabel13.setText("Endereço");

    edEndeImovel.setBackground(new java.awt.Color(255, 255, 255));
    edEndeImovel.setForeground(new java.awt.Color(0, 0, 0));

    jLabel14.setBackground(new java.awt.Color(255, 255, 255));
    jLabel14.setForeground(new java.awt.Color(0, 0, 0));
    jLabel14.setText("Numero");

    edNumeImovel.setBackground(new java.awt.Color(255, 255, 255));
    edNumeImovel.setForeground(new java.awt.Color(0, 0, 0));

    jLabel15.setBackground(new java.awt.Color(255, 255, 255));
    jLabel15.setForeground(new java.awt.Color(0, 0, 0));
    jLabel15.setText("Codigo");

    edCodiCidaImovel.setBackground(new java.awt.Color(255, 255, 255));
    edCodiCidaImovel.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscaCidaImovel.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaCidaImovel.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaCidaImovel.setText("Buscar");
    btnBuscaCidaImovel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCidaImovelActionPerformed(evt);
      }
    });

    jLabel34.setBackground(new java.awt.Color(255, 255, 255));
    jLabel34.setForeground(new java.awt.Color(0, 0, 0));
    jLabel34.setText("Testemunha 1");

    edNomeTest1.setBackground(new java.awt.Color(255, 255, 255));
    edNomeTest1.setForeground(new java.awt.Color(0, 0, 0));

    jLabel35.setBackground(new java.awt.Color(255, 255, 255));
    jLabel35.setForeground(new java.awt.Color(0, 0, 0));
    jLabel35.setText("Testemunha 2");

    edNomeTest2.setBackground(new java.awt.Color(255, 255, 255));
    edNomeTest2.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscaTest3.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaTest3.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaTest3.setText("Buscar");

    btnBuscaTest4.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaTest4.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaTest4.setText("Buscar");

    edCodiTest1.setBackground(new java.awt.Color(255, 255, 255));
    edCodiTest1.setForeground(new java.awt.Color(0, 0, 0));

    edCodiTest2.setBackground(new java.awt.Color(255, 255, 255));
    edCodiTest2.setForeground(new java.awt.Color(0, 0, 0));

    jLabel36.setBackground(new java.awt.Color(255, 255, 255));
    jLabel36.setForeground(new java.awt.Color(0, 0, 0));
    jLabel36.setText("Código");

    jLabel37.setBackground(new java.awt.Color(255, 255, 255));
    jLabel37.setForeground(new java.awt.Color(0, 0, 0));
    jLabel37.setText("Código");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(edBairroImovel)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel15)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(edCodiCidaImovel)
                      .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(edCepImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel13)
                      .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscaCidaImovel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(edNomeCidaImovel)
                          .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(0, 0, Short.MAX_VALUE))))
                      .addComponent(edEndeImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel14)
                      .addComponent(jLabel17))
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(edUfImovel)
                  .addComponent(edNumeImovel)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE)))
            .addGap(19, 19, 19))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jSeparator3)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel37)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(edCodiTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscaTest4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel34)
                    .addGap(349, 349, 349))
                  .addComponent(edNomeTest1)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel36)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(edCodiTest2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscaTest3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edNomeTest2)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel35)
                    .addGap(0, 0, Short.MAX_VALUE)))))
            .addContainerGap())))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel12)
          .addComponent(jLabel13)
          .addComponent(jLabel14))
        .addGap(0, 0, 0)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCepImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edEndeImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNumeImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel15)
          .addComponent(jLabel16)
          .addComponent(jLabel17))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnBuscaCidaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(edNomeCidaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(edUfImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(edCodiCidaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addComponent(jLabel10)
        .addGap(0, 0, 0)
        .addComponent(edBairroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(5, 5, 5)
        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(5, 5, 5)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel37)
          .addComponent(jLabel34))
        .addGap(0, 0, 0)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(edCodiTest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(edNomeTest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnBuscaTest4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel36)
          .addComponent(jLabel35))
        .addGap(0, 0, 0)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCodiTest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeTest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnBuscaTest3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(223, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("DADOS IMOVEL / TESTEMUNHAS", jPanel2);

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setForeground(new java.awt.Color(255, 255, 255));

    jLabel5.setForeground(new java.awt.Color(0, 0, 0));
    jLabel5.setText("Codigo");

    btnBuscaBanco.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaBanco.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaBanco.setText("Buscar");
    btnBuscaBanco.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaBancoActionPerformed(evt);
      }
    });

    edNomeBanc.setBackground(new java.awt.Color(255, 255, 255));
    edNomeBanc.setForeground(new java.awt.Color(0, 0, 0));

    jLabel6.setForeground(new java.awt.Color(0, 0, 0));
    jLabel6.setText("Banco");

    jLabel7.setForeground(new java.awt.Color(0, 0, 0));
    jLabel7.setText("Codigo");

    btnBuscaForo.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaForo.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaForo.setText("Buscar");
    btnBuscaForo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaForoActionPerformed(evt);
      }
    });

    edNomeForo.setBackground(new java.awt.Color(255, 255, 255));
    edNomeForo.setForeground(new java.awt.Color(0, 0, 0));

    jLabel8.setForeground(new java.awt.Color(0, 0, 0));
    jLabel8.setText("Foro");

    edCodiBanc.setBackground(new java.awt.Color(255, 255, 255));
    edCodiBanc.setForeground(new java.awt.Color(0, 0, 0));

    edCodiForo.setBackground(new java.awt.Color(255, 255, 255));
    edCodiForo.setForeground(new java.awt.Color(0, 0, 0));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel5)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(edCodiBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaBanco)))
            .addGap(3, 3, 3)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 380, Short.MAX_VALUE))
              .addComponent(edNomeBanc)))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel7)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(edCodiForo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaForo)))
            .addGap(3, 3, 3)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel8)
              .addComponent(edNomeForo))))
        .addGap(19, 19, 19))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(jLabel6))
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuscaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeBanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCodiBanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jLabel8))
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuscaForo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeForo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCodiForo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(357, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("DADOS BANCO", jPanel3);

    getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void edCepCompFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCepCompFocusLost
    try
    {
      Prog0006Control prog0006 = new Prog0006Control();
      Prog0006Vo prog0006Vo = new Prog0006Vo();
      prog0006Vo = prog0006.buscaCep(edCepComp.getText());
      edEndeComp.setText(prog0006Vo.getEndereco());
      edBairroComp.setText(prog0006Vo.getBairro());
      edCodiCidaComp.setText(prog0006Vo.getCodiCida());
      edNomeCidaComp.setText(prog0006Vo.getNomeCida());
      edUfComp.setText(prog0006Vo.getEstado());
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Prog0009View.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (SQLException ex)
    {
      Logger.getLogger(Prog0009View.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_edCepCompFocusLost

  private void btnBuscaCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCompActionPerformed
    int escolha = JOptionPane.showConfirmDialog(null,"É pessoa fisica:","Tipo Entidade",JOptionPane.YES_NO_OPTION);
    if(escolha == JOptionPane.YES_OPTION)
    {
      setPalavra("compradorFisica");
      buscarLista(palavra);
    }
    else
    {
      setPalavra("compradorJuridica");
      System.out.println(getPalavra());
      buscarLista(palavra);
    }
  }//GEN-LAST:event_btnBuscaCompActionPerformed

  private void btnBuscaCidaCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCidaCompActionPerformed
    
    setPalavra("cidaComp");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaCidaCompActionPerformed

  private void btnBuscaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaVendedorActionPerformed
    int escolha = JOptionPane.showConfirmDialog(null,"É pessoa fisica:","Tipo Entidade",JOptionPane.YES_NO_OPTION);
    if(escolha == JOptionPane.YES_OPTION)
    {
      setPalavra("vendedorFisica");
      buscarLista(palavra);
    }
    else
    {
      setPalavra("vendedorJuridica");
      buscarLista(palavra);
    }
  }//GEN-LAST:event_btnBuscaVendedorActionPerformed

  private void edCepVendFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCepVendFocusLost
    try
    {
      Prog0006Control prog0006 = new Prog0006Control();
      Prog0006Vo prog0006Vo = new Prog0006Vo();
      prog0006Vo = prog0006.buscaCep(edCepVend.getText());
      edEndeVend.setText(prog0006Vo.getEndereco());
      edBairroVend.setText(prog0006Vo.getBairro());
      edCodiCidaVend.setText(prog0006Vo.getCodiCida());
      edNomeCidaVend.setText(prog0006Vo.getNomeCida());
      edUfVend.setText(prog0006Vo.getEstado());
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Prog0009View.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (SQLException ex)
    {
      Logger.getLogger(Prog0009View.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_edCepVendFocusLost

  private void btnBuscaCidaVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCidaVendActionPerformed
    setPalavra("cidaVend");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaCidaVendActionPerformed

  private void edCepImovelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCepImovelFocusLost
    try
    {
      Prog0006Control prog0006 = new Prog0006Control();
      Prog0006Vo prog0006Vo = new Prog0006Vo();
      prog0006Vo = prog0006.buscaCep(edCepImovel.getText());
      edEndeImovel.setText(prog0006Vo.getEndereco());
      edBairroImovel.setText(prog0006Vo.getBairro());
      edCodiCidaImovel.setText(prog0006Vo.getCodiCida());
      edNomeCidaImovel.setText(prog0006Vo.getNomeCida());
      edUfImovel.setText(prog0006Vo.getEstado());
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Prog0009View.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (SQLException ex)
    {
      Logger.getLogger(Prog0009View.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_edCepImovelFocusLost

  private void btnBuscaCidaImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCidaImovelActionPerformed
    setPalavra("cidaImovel");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaCidaImovelActionPerformed

  private void btnBuscaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaBancoActionPerformed
    setPalavra("CBanco");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaBancoActionPerformed

  private void btnBuscaForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaForoActionPerformed
    setPalavra("CForo");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaForoActionPerformed
  
  private void buscarLista(String palavra) 
  {
    switch(palavra)
    {
      case"compradorFisica":
      {
        ListaView cfisi = new ListaView(this);
        cfisi.setVisible(true);
        this.dispose();
        break;
      }
      case"compradorJuridica":
      {
        ListaView cJuri = new ListaView(this);
        cJuri.setVisible(true);
        this.dispose();
        break;
      }
      case"vendedorFisica":
      {
        ListaView vfisi = new ListaView(this);
        vfisi.setVisible(true);
        this.dispose();
        break;
      }
      case"vendedorJuridica":
      {
        ListaView vfisi = new ListaView(this);
        vfisi.setVisible(true);
        this.dispose();
        break;
      }
      case"CBanco":
      {
        ListaView cBanco = new ListaView(this);
        cBanco.setVisible(true);
        this.dispose();
        break;
      }
      case"CForo":
      {
        ListaView cForo = new ListaView(this);
        cForo.setVisible(true);
        this.dispose();
        break;
      }
      case"cidaImovel":
      {
        ListaView listaCidaImovel = new ListaView(this);
        listaCidaImovel.setVisible(true);
        this.dispose();
        break;
      }
      case"cidaComp":
      {
        ListaView listaCidaComp = new ListaView(this);
        listaCidaComp.setVisible(true);
        this.dispose();
        break;
      }
      case"cidaVend":
      {
        ListaView listaCidaVend = new ListaView(this);
        listaCidaVend.setVisible(true);
        this.dispose();
        break;
      }
    }
  }   
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBuscaBanco;
  private javax.swing.JButton btnBuscaCidaComp;
  private javax.swing.JButton btnBuscaCidaImovel;
  private javax.swing.JButton btnBuscaCidaVend;
  private javax.swing.JButton btnBuscaComp;
  private javax.swing.JButton btnBuscaForo;
  private javax.swing.JButton btnBuscaTest3;
  private javax.swing.JButton btnBuscaTest4;
  private javax.swing.JButton btnBuscaVendedor;
  private javax.swing.JButton btnBuscarTienComp;
  private javax.swing.JButton btnBuscarTienVend;
  private javax.swing.JTextField edBairroComp;
  private javax.swing.JTextField edBairroImovel;
  private javax.swing.JTextField edBairroVend;
  private javax.swing.JTextField edCepComp;
  private javax.swing.JTextField edCepImovel;
  private javax.swing.JTextField edCepVend;
  private javax.swing.JTextField edCodiBanc;
  private javax.swing.JTextField edCodiCidaComp;
  private javax.swing.JTextField edCodiCidaImovel;
  private javax.swing.JTextField edCodiCidaVend;
  private javax.swing.JTextField edCodiComp;
  private javax.swing.JTextField edCodiForo;
  private javax.swing.JTextField edCodiTest1;
  private javax.swing.JTextField edCodiTest2;
  private javax.swing.JLabel edCodiTien;
  private javax.swing.JTextField edCodiTienComp;
  private javax.swing.JTextField edCodiTienVend;
  private javax.swing.JTextField edCodiVend;
  private javax.swing.JTextField edEndeComp;
  private javax.swing.JTextField edEndeImovel;
  private javax.swing.JTextField edEndeVend;
  private javax.swing.JTextField edNomeBanc;
  private javax.swing.JTextField edNomeCidaComp;
  private javax.swing.JTextField edNomeCidaImovel;
  private javax.swing.JTextField edNomeCidaVend;
  private javax.swing.JTextField edNomeComp;
  private javax.swing.JTextField edNomeForo;
  private javax.swing.JTextField edNomeTest1;
  private javax.swing.JTextField edNomeTest2;
  private javax.swing.JTextField edNomeVend;
  private javax.swing.JTextField edNumeComp;
  private javax.swing.JTextField edNumeImovel;
  private javax.swing.JTextField edNumeVend;
  private javax.swing.JTextField edTienComp;
  private javax.swing.JTextField edTienVend;
  private javax.swing.JTextField edUfComp;
  private javax.swing.JTextField edUfImovel;
  private javax.swing.JTextField edUfVend;
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
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel28;
  private javax.swing.JLabel jLabel29;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel30;
  private javax.swing.JLabel jLabel31;
  private javax.swing.JLabel jLabel32;
  private javax.swing.JLabel jLabel34;
  private javax.swing.JLabel jLabel35;
  private javax.swing.JLabel jLabel36;
  private javax.swing.JLabel jLabel37;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel lblTienComp;
  // End of variables declaration//GEN-END:variables

  
  private static final long serialVersionUID = 1L;

  public JTextField getEdBairroComp() {
    return edBairroComp;
  }

  public void setEdBairroComp(JTextField edBairroComp) {
    this.edBairroComp = edBairroComp;
  }

  public JTextField getEdBairroImovel() {
    return edBairroImovel;
  }

  public void setEdBairroImovel(JTextField edBairroImovel) {
    this.edBairroImovel = edBairroImovel;
  }

  public JTextField getEdBairroVend() {
    return edBairroVend;
  }

  public void setEdBairroVend(JTextField edBairroVend) {
    this.edBairroVend = edBairroVend;
  }

  public JTextField getEdCepComp() {
    return edCepComp;
  }

  public void setEdCepComp(JTextField edCepComp) {
    this.edCepComp = edCepComp;
  }

  public JTextField getEdCepImovel() {
    return edCepImovel;
  }

  public void setEdCepImovel(JTextField edCepImovel) {
    this.edCepImovel = edCepImovel;
  }

  public JTextField getEdCepVend() {
    return edCepVend;
  }

  public void setEdCepVend(JTextField edCepVend) {
    this.edCepVend = edCepVend;
  }

  public JTextField getEdCodiBanc() {
    return edCodiBanc;
  }

  public void setEdCodiBanc(JTextField edCodiBanc) {
    this.edCodiBanc = edCodiBanc;
  }

  public JTextField getEdCodiCidaComp() {
    return edCodiCidaComp;
  }

  public void setEdCodiCidaComp(JTextField edCodiCidaComp) {
    this.edCodiCidaComp = edCodiCidaComp;
  }

  public JTextField getEdCodiCidaImovel() {
    return edCodiCidaImovel;
  }

  public void setEdCodiCidaImovel(JTextField edCodiCidaImovel) {
    this.edCodiCidaImovel = edCodiCidaImovel;
  }

  public JTextField getEdCodiCidaVend() {
    return edCodiCidaVend;
  }

  public void setEdCodiCidaVend(JTextField edCodiCidaVend) {
    this.edCodiCidaVend = edCodiCidaVend;
  }

  public JTextField getEdCodiComp() {
    return edCodiComp;
  }

  public void setEdCodiComp(JTextField edCodiComp) {
    this.edCodiComp = edCodiComp;
  }

  public JTextField getEdCodiForo() {
    return edCodiForo;
  }

  public void setEdCodiForo(JTextField edCodiForo) {
    this.edCodiForo = edCodiForo;
  }

  public JTextField getEdCodiVend() {
    return edCodiVend;
  }

  public void setEdCodiVend(JTextField edCodiVend) {
    this.edCodiVend = edCodiVend;
  }

  public JTextField getEdEndeComp() {
    return edEndeComp;
  }

  public void setEdEndeComp(JTextField edEndeComp) {
    this.edEndeComp = edEndeComp;
  }

  public JTextField getEdEndeImovel() {
    return edEndeImovel;
  }

  public void setEdEndeImovel(JTextField edEndeImovel) {
    this.edEndeImovel = edEndeImovel;
  }

  public JTextField getEdEndeVend() {
    return edEndeVend;
  }

  public void setEdEndeVend(JTextField edEndeVend) {
    this.edEndeVend = edEndeVend;
  }

  public JTextField getEdNomeBanc() {
    return edNomeBanc;
  }

  public void setEdNomeBanc(JTextField edNomeBanc) {
    this.edNomeBanc = edNomeBanc;
  }

  public JTextField getEdNomeCidaComp() {
    return edNomeCidaComp;
  }

  public void setEdNomeCidaComp(JTextField edNomeCidaComp) {
    this.edNomeCidaComp = edNomeCidaComp;
  }

  public JTextField getEdNomeCidaImovel() {
    return edNomeCidaImovel;
  }

  public void setEdNomeCidaImovel(JTextField edNomeCidaImovel) {
    this.edNomeCidaImovel = edNomeCidaImovel;
  }

  public JTextField getEdNomeCidaVend() {
    return edNomeCidaVend;
  }

  public void setEdNomeCidaVend(JTextField edNomeCidaVend) {
    this.edNomeCidaVend = edNomeCidaVend;
  }

  public JTextField getEdNomeComp() {
    return edNomeComp;
  }

  public void setEdNomeComp(JTextField edNomeComp) {
    this.edNomeComp = edNomeComp;
  }

  public JTextField getEdNomeForo() {
    return edNomeForo;
  }

  public void setEdNomeForo(JTextField edNomeForo) {
    this.edNomeForo = edNomeForo;
  }

  public JTextField getEdNomeVend() {
    return edNomeVend;
  }

  public void setEdNomeVend(JTextField edNomeVend) {
    this.edNomeVend = edNomeVend;
  }

  public JTextField getEdNumeComp() {
    return edNumeComp;
  }

  public void setEdNumeComp(JTextField edNumeComp) {
    this.edNumeComp = edNumeComp;
  }

  public JTextField getEdNumeImovel() {
    return edNumeImovel;
  }

  public void setEdNumeImovel(JTextField edNumeImovel) {
    this.edNumeImovel = edNumeImovel;
  }

  public JTextField getEdNumeVend() {
    return edNumeVend;
  }

  public void setEdNumeVend(JTextField edNumeVend) {
    this.edNumeVend = edNumeVend;
  }

  public JTextField getEdUfComp() {
    return edUfComp;
  }

  public void setEdUfComp(JTextField edUfComp) {
    this.edUfComp = edUfComp;
  }

  public JTextField getEdUfImovel() {
    return edUfImovel;
  }

  public void setEdUfImovel(JTextField edUfImovel) {
    this.edUfImovel = edUfImovel;
  }

  public JTextField getEdUfVend() {
    return edUfVend;
  }

  public void setEdUfVend(JTextField edUfVend) {
    this.edUfVend = edUfVend;
  }

  public JTextField getEdCodi() {
    return edCodi;
  }

  public void setEdCodi(JTextField edCodi) {
    this.edCodi = edCodi;
  }

  public JFormattedTextField getEdData() {
    return edData;
  }

  public void setEdData(JFormattedTextField edData) {
    this.edData = edData;
  }

  public JTextField getEdStatus() {
    return edStatus;
  }

  public void setEdStatus(JTextField edStatus) {
    this.edStatus = edStatus;
  }

  public String getPalavra() {
    return palavra;
  }

  public void setPalavra(String palavra) {
    this.palavra = palavra;
  }

  public JTextField getEdValor() {
    return edValor;
  }

  public void setEdValor(JTextField edValor) {
    this.edValor = edValor;
  }

  
}
