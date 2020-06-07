package view;

import control.Prog0006Control;
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
  private String palavra;
  Prog0009Vo prog0009Vo = new Prog0009Vo();
  
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
    super.setSize(650, 580);
    super.setLocationRelativeTo(null);
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    edCodi.addFocusListener((FocusListener) this);
  }

  @Override
  public void focusGained(FocusEvent fe) 
  {
    
  }

  @Override
  public void focusLost(FocusEvent fe) 
  {
    
  }

  @Override
  public void btnBuscarActionPerformed(ActionEvent e) 
  {
    
  }

  @Override
  public void btnGravarActionPerformed(ActionEvent e) 
  {
    
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

    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    btnBuscaComp = new javax.swing.JButton();
    edCodiComp = new javax.swing.JTextField();
    edNomeComp = new javax.swing.JTextField();
    edCodiVend = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    btnBuscaVendedor = new javax.swing.JButton();
    edNomeVend = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    edCodiBanc = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    btnBuscaBanco = new javax.swing.JButton();
    edNomeBanc = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    edCodiForo = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    btnBuscaForo = new javax.swing.JButton();
    edNomeForo = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel9 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    edCep = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    edEnde = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    edNume = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    edCodiCida = new javax.swing.JTextField();
    btnBuscaCidade = new javax.swing.JButton();
    edNomeCida = new javax.swing.JTextField();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    edUf = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    edBairro = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    edCep1 = new javax.swing.JTextField();
    jLabel19 = new javax.swing.JLabel();
    edEnde1 = new javax.swing.JTextField();
    jLabel20 = new javax.swing.JLabel();
    edNume1 = new javax.swing.JTextField();
    jLabel21 = new javax.swing.JLabel();
    edCodiCida1 = new javax.swing.JTextField();
    btnBuscaCidade1 = new javax.swing.JButton();
    edNomeCida1 = new javax.swing.JTextField();
    jLabel22 = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    edUf1 = new javax.swing.JTextField();
    jLabel24 = new javax.swing.JLabel();
    edBairro1 = new javax.swing.JTextField();
    jSeparator2 = new javax.swing.JSeparator();
    jLabel25 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();
    edCep2 = new javax.swing.JTextField();
    jLabel27 = new javax.swing.JLabel();
    edEnde2 = new javax.swing.JTextField();
    jLabel28 = new javax.swing.JLabel();
    edNume2 = new javax.swing.JTextField();
    jLabel29 = new javax.swing.JLabel();
    edCodiCida2 = new javax.swing.JTextField();
    btnBuscaCidade2 = new javax.swing.JButton();
    edNomeCida2 = new javax.swing.JTextField();
    jLabel30 = new javax.swing.JLabel();
    jLabel31 = new javax.swing.JLabel();
    edUf2 = new javax.swing.JTextField();
    jLabel32 = new javax.swing.JLabel();
    edBairro2 = new javax.swing.JTextField();
    jSeparator3 = new javax.swing.JSeparator();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setForeground(new java.awt.Color(255, 255, 255));

    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("Codigo");

    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("Comprador");

    btnBuscaComp.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaComp.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaComp.setText("Buscar");
    btnBuscaComp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCompActionPerformed(evt);
      }
    });

    edCodiComp.setBackground(new java.awt.Color(255, 255, 255));
    edCodiComp.setForeground(new java.awt.Color(0, 0, 0));

    edNomeComp.setBackground(new java.awt.Color(255, 255, 255));
    edNomeComp.setForeground(new java.awt.Color(0, 0, 0));

    edCodiVend.setBackground(new java.awt.Color(255, 255, 255));
    edCodiVend.setForeground(new java.awt.Color(0, 0, 0));

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

    edCodiBanc.setBackground(new java.awt.Color(255, 255, 255));
    edCodiBanc.setForeground(new java.awt.Color(0, 0, 0));

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

    edCodiForo.setBackground(new java.awt.Color(255, 255, 255));
    edCodiForo.setForeground(new java.awt.Color(0, 0, 0));

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

    jLabel9.setBackground(new java.awt.Color(255, 255, 255));
    jLabel9.setForeground(new java.awt.Color(0, 0, 0));
    jLabel9.setText("DADOS IMOVEL");

    jLabel12.setBackground(new java.awt.Color(255, 255, 255));
    jLabel12.setForeground(new java.awt.Color(0, 0, 0));
    jLabel12.setText("Cep");

    edCep.setBackground(new java.awt.Color(255, 255, 255));
    edCep.setForeground(new java.awt.Color(0, 0, 0));
    edCep.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        edCepFocusLost(evt);
      }
    });

    jLabel13.setBackground(new java.awt.Color(255, 255, 255));
    jLabel13.setForeground(new java.awt.Color(0, 0, 0));
    jLabel13.setText("Endereço");

    edEnde.setBackground(new java.awt.Color(255, 255, 255));
    edEnde.setForeground(new java.awt.Color(0, 0, 0));

    jLabel14.setBackground(new java.awt.Color(255, 255, 255));
    jLabel14.setForeground(new java.awt.Color(0, 0, 0));
    jLabel14.setText("Numero");

    edNume.setBackground(new java.awt.Color(255, 255, 255));
    edNume.setForeground(new java.awt.Color(0, 0, 0));

    jLabel15.setBackground(new java.awt.Color(255, 255, 255));
    jLabel15.setForeground(new java.awt.Color(0, 0, 0));
    jLabel15.setText("Codigo");

    edCodiCida.setBackground(new java.awt.Color(255, 255, 255));
    edCodiCida.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscaCidade.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaCidade.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaCidade.setText("Buscar");
    btnBuscaCidade.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCidadeActionPerformed(evt);
      }
    });

    edNomeCida.setBackground(new java.awt.Color(255, 255, 255));
    edNomeCida.setForeground(new java.awt.Color(0, 0, 0));

    jLabel16.setBackground(new java.awt.Color(255, 255, 255));
    jLabel16.setForeground(new java.awt.Color(0, 0, 0));
    jLabel16.setText("Cidade");

    jLabel17.setBackground(new java.awt.Color(255, 255, 255));
    jLabel17.setForeground(new java.awt.Color(0, 0, 0));
    jLabel17.setText("UF");

    edUf.setBackground(new java.awt.Color(255, 255, 255));
    edUf.setForeground(new java.awt.Color(0, 0, 0));

    jLabel10.setBackground(new java.awt.Color(255, 255, 255));
    jLabel10.setForeground(new java.awt.Color(0, 0, 0));
    jLabel10.setText("Bairro");

    edBairro.setBackground(new java.awt.Color(255, 255, 255));
    edBairro.setForeground(new java.awt.Color(0, 0, 0));

    jLabel11.setBackground(new java.awt.Color(255, 255, 255));
    jLabel11.setForeground(new java.awt.Color(0, 0, 0));
    jLabel11.setText("DADOS CONPRADOR");

    jLabel18.setBackground(new java.awt.Color(255, 255, 255));
    jLabel18.setForeground(new java.awt.Color(0, 0, 0));
    jLabel18.setText("Cep");

    edCep1.setBackground(new java.awt.Color(255, 255, 255));
    edCep1.setForeground(new java.awt.Color(0, 0, 0));
    edCep1.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        edCep1FocusLost(evt);
      }
    });

    jLabel19.setBackground(new java.awt.Color(255, 255, 255));
    jLabel19.setForeground(new java.awt.Color(0, 0, 0));
    jLabel19.setText("Endereço");

    edEnde1.setBackground(new java.awt.Color(255, 255, 255));
    edEnde1.setForeground(new java.awt.Color(0, 0, 0));

    jLabel20.setBackground(new java.awt.Color(255, 255, 255));
    jLabel20.setForeground(new java.awt.Color(0, 0, 0));
    jLabel20.setText("Numero");

    edNume1.setBackground(new java.awt.Color(255, 255, 255));
    edNume1.setForeground(new java.awt.Color(0, 0, 0));

    jLabel21.setBackground(new java.awt.Color(255, 255, 255));
    jLabel21.setForeground(new java.awt.Color(0, 0, 0));
    jLabel21.setText("Codigo");

    edCodiCida1.setBackground(new java.awt.Color(255, 255, 255));
    edCodiCida1.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscaCidade1.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaCidade1.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaCidade1.setText("Buscar");
    btnBuscaCidade1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCidade1ActionPerformed(evt);
      }
    });

    edNomeCida1.setBackground(new java.awt.Color(255, 255, 255));
    edNomeCida1.setForeground(new java.awt.Color(0, 0, 0));

    jLabel22.setBackground(new java.awt.Color(255, 255, 255));
    jLabel22.setForeground(new java.awt.Color(0, 0, 0));
    jLabel22.setText("Cidade");

    jLabel23.setBackground(new java.awt.Color(255, 255, 255));
    jLabel23.setForeground(new java.awt.Color(0, 0, 0));
    jLabel23.setText("UF");

    edUf1.setBackground(new java.awt.Color(255, 255, 255));
    edUf1.setForeground(new java.awt.Color(0, 0, 0));

    jLabel24.setBackground(new java.awt.Color(255, 255, 255));
    jLabel24.setForeground(new java.awt.Color(0, 0, 0));
    jLabel24.setText("Bairro");

    edBairro1.setBackground(new java.awt.Color(255, 255, 255));
    edBairro1.setForeground(new java.awt.Color(0, 0, 0));

    jLabel25.setBackground(new java.awt.Color(255, 255, 255));
    jLabel25.setForeground(new java.awt.Color(0, 0, 0));
    jLabel25.setText("DADOS VENDEDOR");

    jLabel26.setBackground(new java.awt.Color(255, 255, 255));
    jLabel26.setForeground(new java.awt.Color(0, 0, 0));
    jLabel26.setText("Cep");

    edCep2.setBackground(new java.awt.Color(255, 255, 255));
    edCep2.setForeground(new java.awt.Color(0, 0, 0));
    edCep2.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        edCep2FocusLost(evt);
      }
    });

    jLabel27.setBackground(new java.awt.Color(255, 255, 255));
    jLabel27.setForeground(new java.awt.Color(0, 0, 0));
    jLabel27.setText("Endereço");

    edEnde2.setBackground(new java.awt.Color(255, 255, 255));
    edEnde2.setForeground(new java.awt.Color(0, 0, 0));

    jLabel28.setBackground(new java.awt.Color(255, 255, 255));
    jLabel28.setForeground(new java.awt.Color(0, 0, 0));
    jLabel28.setText("Numero");

    edNume2.setBackground(new java.awt.Color(255, 255, 255));
    edNume2.setForeground(new java.awt.Color(0, 0, 0));

    jLabel29.setBackground(new java.awt.Color(255, 255, 255));
    jLabel29.setForeground(new java.awt.Color(0, 0, 0));
    jLabel29.setText("Codigo");

    edCodiCida2.setBackground(new java.awt.Color(255, 255, 255));
    edCodiCida2.setForeground(new java.awt.Color(0, 0, 0));

    btnBuscaCidade2.setBackground(new java.awt.Color(0, 0, 0));
    btnBuscaCidade2.setForeground(new java.awt.Color(255, 255, 255));
    btnBuscaCidade2.setText("Buscar");
    btnBuscaCidade2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscaCidade2ActionPerformed(evt);
      }
    });

    edNomeCida2.setBackground(new java.awt.Color(255, 255, 255));
    edNomeCida2.setForeground(new java.awt.Color(0, 0, 0));

    jLabel30.setBackground(new java.awt.Color(255, 255, 255));
    jLabel30.setForeground(new java.awt.Color(0, 0, 0));
    jLabel30.setText("Cidade");

    jLabel31.setBackground(new java.awt.Color(255, 255, 255));
    jLabel31.setForeground(new java.awt.Color(0, 0, 0));
    jLabel31.setText("UF");

    edUf2.setBackground(new java.awt.Color(255, 255, 255));
    edUf2.setForeground(new java.awt.Color(0, 0, 0));

    jLabel32.setBackground(new java.awt.Color(255, 255, 255));
    jLabel32.setForeground(new java.awt.Color(0, 0, 0));
    jLabel32.setText("Bairro");

    edBairro2.setBackground(new java.awt.Color(255, 255, 255));
    edBairro2.setForeground(new java.awt.Color(0, 0, 0));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(221, 221, 221)
        .addComponent(jLabel11)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(217, 217, 217)
            .addComponent(jLabel25)
            .addGap(273, 273, 273))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(edCodiVend, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscaVendedor))
                  .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(edNomeVend)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel29)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(edCodiCida2)
                      .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(edCep2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel27)
                      .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscaCidade2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(edNomeCida2)
                          .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addGap(0, 0, Short.MAX_VALUE))))
                      .addComponent(edEnde2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel28)
                      .addComponent(jLabel31))
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(edNume2)
                  .addComponent(edUf2)))
              .addComponent(edBairro2)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(edCodiComp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscaComp)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(edNomeComp)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel21)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(edCodiCida1)
                      .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(edCep1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel19)
                      .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscaCidade1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(edNomeCida1)
                          .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addGap(0, 0, Short.MAX_VALUE))))
                      .addComponent(edEnde1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(edNume1)
                  .addComponent(edUf1)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel20)
                      .addComponent(jLabel23))
                    .addGap(0, 0, Short.MAX_VALUE))))
              .addComponent(edBairro1)
              .addComponent(jSeparator2)
              .addComponent(jSeparator3))
            .addGap(10, 10, 10))))
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(239, 239, 239)
            .addComponent(jLabel9)
            .addGap(280, 280, 280))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel5)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(edCodiBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscaBanco)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(edNomeBanc)))
              .addComponent(jSeparator1)
              .addComponent(edBairro)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel15)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(edCodiCida)
                      .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(edCep, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel13)
                      .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscaCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(edNomeCida)
                          .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(0, 0, Short.MAX_VALUE))))
                      .addComponent(edEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel14)
                      .addComponent(jLabel17))
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(edUf)
                  .addComponent(edNume)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel7)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(edCodiForo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBuscaForo)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel8)
                  .addComponent(edNomeForo))))
            .addGap(10, 10, 10))))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel11)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuscaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCodiComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel18)
          .addComponent(jLabel19)
          .addComponent(jLabel20))
        .addGap(0, 0, 0)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edEnde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNume1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel21)
          .addComponent(jLabel22)
          .addComponent(jLabel23))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnBuscaCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(edNomeCida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(edUf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(edCodiCida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addComponent(jLabel24)
        .addGap(0, 0, 0)
        .addComponent(edBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel25)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel4))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuscaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCodiVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel26)
          .addComponent(jLabel27)
          .addComponent(jLabel28))
        .addGap(0, 0, 0)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edEnde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNume2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel29)
          .addComponent(jLabel30)
          .addComponent(jLabel31))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnBuscaCidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(edNomeCida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(edUf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(edCodiCida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addComponent(jLabel32)
        .addGap(0, 0, 0)
        .addComponent(edBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(jLabel6))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuscaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCodiBanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeBanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jLabel8))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuscaForo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edCodiForo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNomeForo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel12)
          .addComponent(jLabel13)
          .addComponent(jLabel14))
        .addGap(0, 0, 0)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(edCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel15)
          .addComponent(jLabel16)
          .addComponent(jLabel17))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnBuscaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(edNomeCida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(edUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(edCodiCida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addComponent(jLabel10)
        .addGap(0, 0, 0)
        .addComponent(edBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(14, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

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

  private void btnBuscaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaBancoActionPerformed
    setPalavra("CBanco");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaBancoActionPerformed

  private void btnBuscaForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaForoActionPerformed
    setPalavra("CForo");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaForoActionPerformed

  private void btnBuscaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCidadeActionPerformed
    setPalavra("CCidade");
    buscarLista(palavra);
  }//GEN-LAST:event_btnBuscaCidadeActionPerformed

  private void edCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCepFocusLost
    try 
    {
      Prog0006Control prog0006 = new Prog0006Control();
      Prog0006Vo prog0006Vo = new Prog0006Vo();
      prog0006Vo = prog0006.buscaCep(edCep.getText());
      edEnde.setText(prog0006Vo.getEndereco());
      edBairro.setText(prog0006Vo.getBairro());
      edCodiCida.setText(prog0006Vo.getCodiCida());
      edNomeCida.setText(prog0006Vo.getNomeCida());
      edUf.setText(prog0006Vo.getEstado());
    } 
    catch (ClassNotFoundException ex) 
    {
      Logger.getLogger(Prog0006View.class.getName()).log(Level.SEVERE, null, ex);
    } 
    catch (SQLException ex) 
    {
      Logger.getLogger(Prog0006View.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_edCepFocusLost

  private void edCep1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCep1FocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_edCep1FocusLost

  private void btnBuscaCidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCidade1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnBuscaCidade1ActionPerformed

  private void edCep2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCep2FocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_edCep2FocusLost

  private void btnBuscaCidade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCidade2ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnBuscaCidade2ActionPerformed

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
      case"CCidade":
      {
        ListaView cCida = new ListaView(this);
        cCida.setVisible(true);
        this.dispose();
        break;
      }
    }
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBuscaBanco;
  private javax.swing.JButton btnBuscaCidade;
  private javax.swing.JButton btnBuscaCidade1;
  private javax.swing.JButton btnBuscaCidade2;
  private javax.swing.JButton btnBuscaComp;
  private javax.swing.JButton btnBuscaForo;
  private javax.swing.JButton btnBuscaVendedor;
  private javax.swing.JTextField edBairro;
  private javax.swing.JTextField edBairro1;
  private javax.swing.JTextField edBairro2;
  private javax.swing.JTextField edCep;
  private javax.swing.JTextField edCep1;
  private javax.swing.JTextField edCep2;
  private javax.swing.JTextField edCodiBanc;
  private javax.swing.JTextField edCodiCida;
  private javax.swing.JTextField edCodiCida1;
  private javax.swing.JTextField edCodiCida2;
  private javax.swing.JTextField edCodiComp;
  private javax.swing.JTextField edCodiForo;
  private javax.swing.JTextField edCodiVend;
  private javax.swing.JTextField edEnde;
  private javax.swing.JTextField edEnde1;
  private javax.swing.JTextField edEnde2;
  private javax.swing.JTextField edNomeBanc;
  private javax.swing.JTextField edNomeCida;
  private javax.swing.JTextField edNomeCida1;
  private javax.swing.JTextField edNomeCida2;
  private javax.swing.JTextField edNomeComp;
  private javax.swing.JTextField edNomeForo;
  private javax.swing.JTextField edNomeVend;
  private javax.swing.JTextField edNume;
  private javax.swing.JTextField edNume1;
  private javax.swing.JTextField edNume2;
  private javax.swing.JTextField edUf;
  private javax.swing.JTextField edUf1;
  private javax.swing.JTextField edUf2;
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
  private javax.swing.JLabel jLabel32;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  // End of variables declaration//GEN-END:variables

  private static final long serialVersionUID = 1L;

  public String getPalavra() {
    return palavra;
  }

  public void setPalavra(String palavra) {
    this.palavra = palavra;
  }

  public JTextField getEdBairro() {
    return edBairro;
  }

  public void setEdBairro(JTextField edBairro) {
    this.edBairro = edBairro;
  }

  public JTextField getEdCep() {
    return edCep;
  }

  public void setEdCep(JTextField edCep) {
    this.edCep = edCep;
  }

  public JTextField getEdCodiBanc() {
    return edCodiBanc;
  }

  public void setEdCodiBanc(JTextField edCodiBanc) {
    this.edCodiBanc = edCodiBanc;
  }

  public JTextField getEdCodiCida() {
    return edCodiCida;
  }

  public void setEdCodiCida(JTextField edCodiCida) {
    this.edCodiCida = edCodiCida;
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

  public JTextField getEdEnde() {
    return edEnde;
  }

  public void setEdEnde(JTextField edEnde) {
    this.edEnde = edEnde;
  }

  public JTextField getEdNomeBanc() {
    return edNomeBanc;
  }

  public void setEdNomeBanc(JTextField edNomeBanc) {
    this.edNomeBanc = edNomeBanc;
  }

  public JTextField getEdNomeCida() {
    return edNomeCida;
  }

  public void setEdNomeCida(JTextField edNomeCida) {
    this.edNomeCida = edNomeCida;
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

  public JTextField getEdNume() {
    return edNume;
  }

  public void setEdNume(JTextField edNume) {
    this.edNume = edNume;
  }

  public JTextField getEdUf() {
    return edUf;
  }

  public void setEdUf(JTextField edUf) {
    this.edUf = edUf;
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
}
