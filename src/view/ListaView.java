package view;

import control.Prog0005Control;
import control.Prog0006Control;
import control.Prog0007Control;
import control.Prog0008Control;
import java.util.List;
import model.ListaBancoTableModel;
import model.ListaCidadeTableModel;
import model.ListaProg0007TableModel;
import model.ListaTipoEntidadeTableModel;
import model.Prog0005TableModel;
import model.Prog0006TableModel;
import model.Prog0008TableModel;
import vo.Prog0005Vo;
import vo.Prog0006Vo;
import vo.Prog0007Vo;
import vo.Prog0008Vo;
import vo.Prog0009Vo;

public final class ListaView extends javax.swing.JFrame 
{
  private String palavra;
  private List<Prog0005Vo>prog0005List;
  private List<Prog0006Vo>prog0006List;
  private List<Prog0007Vo>prog0007List; 
  private List<Prog0008Vo>prog0008List; 
  private List<Prog0009Vo>prog0009List; 
  //Prog0007View lista = new Prog0007View();
  private Prog0005View lista0005;
  private Prog0006View lista0006;
  private Prog0007View lista0007;
  private Prog0008View lista0008;
  private Prog0009View lista0009;
  //private Prog0006View lista0007; 
  
  public ListaView() 
  {
    initComponents();
  }
  
  public ListaView(Prog0005View listar)
  {
    lista0005 = listar;
    initComponents();
    super.setExtendedState( MAXIMIZED_BOTH );
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    super.setTitle("..::PROG0005::..");
    setPalavra("");
    setPalavra("tipoEnti");
    mostrarNovaTabelaEntidade();
  }
  
  ListaView(Prog0006View listar) 
  {
    lista0006 = listar;
    initComponents();
    super.setExtendedState( MAXIMIZED_BOTH );
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    super.setTitle("..::PROG0006::..");
    switch(listar.getPalavra())
    {
      case"listaPessoaFisica":
      {
        setPalavra("");
        setPalavra("pessoaFisica");
        mostrarTabelaPessoaFisica();
        break;
      }
      case"listaCidade":
      {
        setPalavra("");
        setPalavra("listaCidade");
        mostrarTabelaCidade();
        break;
      }
      case"tipoEnti":
      {
        setPalavra("");
        setPalavra("listatipoEnti");
        mostrarTabelaTipoEntidade();
        break;
      }
    }
  }
  
  public ListaView(Prog0007View listar)
  {
    lista0007 = listar;
    initComponents();
    super.setExtendedState( MAXIMIZED_BOTH );
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    super.setTitle("..::PROG0007::..");
    switch(listar.getPalavra())
    {
      case "entidade":
        setPalavra("");
        setPalavra("entidade");
        mostrarTabelaEntidade();
        break;
      case "tipoEnti":
        setPalavra("");
        setPalavra("tipoEntidade");
        mostrarTabelaTipoEntidade();
        break;
      case "cidaEnde":
        setPalavra("");
        setPalavra("cidaEnde");
        mostrarTabelaCidade();
        break;
      case "bancoEnde":
        setPalavra("");
        setPalavra("bancoEnde");
        mostrarTabelaBanco();
        break;
      case "banco":
        setPalavra("");
        setPalavra("banco");
        mostrarTabelaBanco();
        break;
    }
  }

  ListaView(Prog0008View listar) 
  {
    lista0008 = listar;
    initComponents();
    super.setExtendedState( MAXIMIZED_BOTH );
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    super.setTitle("..::PROG0008::..");
    setPalavra("");
    setPalavra("foro");
    mostrarTabelaForo();
  }

  ListaView(Prog0009View listar) 
  {
    lista0009 = listar;
    initComponents();
    super.setExtendedState( MAXIMIZED_BOTH );
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    super.setTitle("..::PROG0009::..");
    switch(listar.getPalavra())
    {
      case"compradorFisica":
      {
        setPalavra("");
        setPalavra("compradorFisica");
        mostrarTabelaPessoaFisica();
        break;
      }
      case"compradorJuridica":
      {
        setPalavra("");
        setPalavra("compradorJuridica");
        mostrarTabelaEntidade();
        break;
      }
      case"vendedorFisica":
      {
        setPalavra("");
        setPalavra("vendedorFisica");
        mostrarTabelaPessoaFisica();
        break;
      }
      case"vendedorJuridica":
      {
        setPalavra("");
        setPalavra("vendedorJuridica");
        mostrarTabelaEntidade();
        break;
      }
      case"CBanco":
      {
        setPalavra("");
        setPalavra("cBanco");
        mostrarTabelaBanco();
        break;
      }
      case"CForo":
      {
        setPalavra("");
        setPalavra("cForo");
        mostrarTabelaForo();
        break;
      }
      case"cidaComp":
      {
        setPalavra("");
        setPalavra("cidaComp");
         mostrarTabelaCidade();
        break;
      }
      case"cidaVend":
      {
        setPalavra("");
        setPalavra("cidaVend");
         mostrarTabelaCidade();
        break;
      }
      case"cidaImovel":
      {
        setPalavra("");
        setPalavra("cidaImovel");
        mostrarTabelaCidade();
        break;
      }
    }
  }

 //=======================================================================
  private void mostrarTabelaEntidade()
  {
    prog0007List = new Prog0007Control().findEnti();
    if(prog0007List != null)
      tblGridView.setModel(new ListaProg0007TableModel(prog0007List)); 
  }
  
  private void mostrarTabelaTipoEntidade()
  {
    prog0007List = new Prog0007Control().findTipoEnti();
    if(prog0007List != null)
      tblGridView.setModel(new ListaTipoEntidadeTableModel(prog0007List));   
  }
  
  private void mostrarTabelaCidade() 
  {
    prog0007List = new Prog0007Control().findCidade();
    if(prog0007List != null)
      tblGridView.setModel(new ListaCidadeTableModel(prog0007List)); 
  }
    
  private void mostrarTabelaBanco() 
  {
    prog0007List = new Prog0007Control().findBanco();
    if(prog0007List != null)
      tblGridView.setModel(new ListaBancoTableModel(prog0007List));
  }
  
  private void mostrarNovaTabelaEntidade() 
  {
    prog0005List = new Prog0005Control().findTipoEnti();
    if(prog0005List != null)
      tblGridView.setModel(new Prog0005TableModel(prog0005List));
  }
  
  private void mostrarTabelaForo() 
  {
    prog0008List = new Prog0008Control().findForo();
    if(prog0008List != null)
      tblGridView.setModel(new Prog0008TableModel(prog0008List));
    
  }
  
  private void mostrarTabelaPessoaFisica()
  {
    prog0006List = new Prog0006Control().findPessoaFisica();
    if(prog0006List != null)
      tblGridView.setModel(new Prog0006TableModel(prog0006List));
  }
//=============================================================================================================================================
  
@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblGridView = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setForeground(new java.awt.Color(0, 0, 0));

    tblGridView.setBackground(new java.awt.Color(255, 255, 255));
    tblGridView.setForeground(new java.awt.Color(0, 0, 0));
    tblGridView.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblGridViewMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tblGridView);

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
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        .addContainerGap())
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
   switch(getPalavra())
   {
     
     case "entidade":
      {
        int linha = tblGridView.getSelectedRow();    
        ListaProg0007TableModel item = new ListaProg0007TableModel(prog0007List);
       
        lista0007.getEdCodi().setText((String) item.getValueAt(linha, 0));
        lista0007.getEdDesc().setText((String) item.getValueAt(linha, 1));
        lista0007.getEdFant().setText((String) item.getValueAt(linha, 2));
        lista0007.getJftCpf().setText((String) item.getValueAt(linha, 3));
        lista0007.getJftRg().setText((String) item.getValueAt(linha, 4));
        lista0007.getJftCnpj().setText((String) item.getValueAt(linha, 5));
        lista0007.getJftFone().setText((String) item.getValueAt(linha, 6));
        lista0007.getJftCelu().setText((String) item.getValueAt(linha, 7));
        lista0007.getEdContato().setText((String) item.getValueAt(linha, 8));
        lista0007.getEdEmail().setText((String) item.getValueAt(linha, 9));
        lista0007.getJtaObse().setText((String) item.getValueAt(linha, 10));
        lista0007.getEdIeEnde().setText((String) item.getValueAt(linha, 11));
        lista0007.getEdCodiTien().setText((String) item.getValueAt(linha, 12));
        lista0007.getEdTien().setText((String) item.getValueAt(linha, 13));        
        lista0007.setVisible(true);
        lista0007.mostrarRegistro();
        setPalavra("");
        this.dispose();
        break;
      }
      case"tipoEntidade":
      {
        int linha = tblGridView.getSelectedRow();
        ListaTipoEntidadeTableModel item = new ListaTipoEntidadeTableModel(prog0007List);

        lista0007.getEdCodiTien().setText((String) item.getValueAt(linha, 0));
        lista0007.getEdTien().setText((String) item.getValueAt(linha, 1));
        lista0007.getJtaObse().setText((String) item.getValueAt(linha, 2));
        lista0007.setVisible(true);
        this.dispose();
        break;
      }
      case"cidaEnde":
      {
        int linha = tblGridView.getSelectedRow();   
        ListaCidadeTableModel item = new ListaCidadeTableModel(prog0007List);

        lista0007.getEdCodiCidaEnde().setText((String) item.getValueAt(linha, 0));
        lista0007.getEdNomeCidaEnde().setText((String) item.getValueAt(linha, 1));
        lista0007.getEdUfEnde().setText((String) item.getValueAt(linha, 2));
        lista0007.setVisible(true);
        this.dispose();
        break;
        
      }
      case"bancoEnde":
      {
        int linha = tblGridView.getSelectedRow();   
        ListaBancoTableModel item = new ListaBancoTableModel(prog0007List);
       
        lista0007.getEdCodiBancEnde().setText((String) item.getValueAt(linha, 0));
        lista0007.getEdNomeBancEnde().setText((String) item.getValueAt(linha, 1));
        lista0007.setVisible(true);
        this.dispose();
        break;
      }
      case"banco":
      {
        int linha = tblGridView.getSelectedRow();  
        ListaBancoTableModel item = new ListaBancoTableModel(prog0007List);
       
        lista0007.getEdBancCodi().setText((String) item.getValueAt(linha, 0));
        lista0007.getEdBancNome().setText((String) item.getValueAt(linha, 1));
        lista0007.setVisible(true);
        this.dispose();
        break;
      }
      case"tipoEnti":
      {
        int linha = tblGridView.getSelectedRow();
        Prog0005TableModel item = new Prog0005TableModel(prog0005List);

        lista0005.getEdCodi().setText((String) item.getValueAt(linha, 0));
        lista0005.getEdDesc().setText((String) item.getValueAt(linha, 1));
        lista0005.getJtaObs().setText((String) item.getValueAt(linha, 2));
        lista0005.setVisible(true);
        this.dispose();
        break;
      }
      case"foro":
      {
        int linha = tblGridView.getSelectedRow();
        Prog0008TableModel item = new Prog0008TableModel(prog0008List);
        
        lista0008.getEdCodi().setText((String) item.getValueAt(linha, 0));
        lista0008.getEdDesc().setText((String) item.getValueAt(linha, 1));
        lista0008.getJtaObse().setText((String) item.getValueAt(linha, 2));
        lista0008.setVisible(true);
        this.dispose();
        break;
      }
      case"pessoaFisica":
      {
        int linha = tblGridView.getSelectedRow();
        Prog0006TableModel item = new Prog0006TableModel(prog0006List);
        
        lista0006.getEdCodi().setText((String) item.getValueAt(linha, 0));
        lista0006.getEdDesc().setText((String) item.getValueAt(linha, 1));
        lista0006.getEdNasc().setText((String) item.getValueAt(linha, 3));
        lista0006.getEdProfi().setText((String) item.getValueAt(linha, 4));
        lista0006.getEdCep().setText((String) item.getValueAt(linha, 6));
        lista0006.getEdEnde().setText((String) item.getValueAt(linha, 2));
        lista0006.getEdNume().setText((String) item.getValueAt(linha, 5));
        lista0006.getEdCodiCida().setText((String) item.getValueAt(linha, 8));
        lista0006.getEdNomeCida().setText((String) item.getValueAt(linha, 9));
        lista0006.getEdSiglaEsta().setText((String) item.getValueAt(linha, 14));
        lista0006.getEdBairro().setText((String) item.getValueAt(linha, 15));
        lista0006.getEdComp().setText((String) item.getValueAt(linha, 17));
        lista0006.getEdRg().setText((String) item.getValueAt(linha, 16));
        lista0006.getEdCpf().setText((String) item.getValueAt(linha, 7));
        lista0006.getEdFoneFixo().setText((String) item.getValueAt(linha, 10));
        lista0006.getEdCelu().setText((String) item.getValueAt(linha, 11));
        lista0006.getEdEmail().setText((String) item.getValueAt(linha, 12));
        lista0006.getEdObse().setText((String) item.getValueAt(linha, 13));
        
        lista0006.setVisible(true);
        this.dispose();
        break;
      }
      case"listaCidade":
      {
        int linha = tblGridView.getSelectedRow();
        ListaCidadeTableModel item = new ListaCidadeTableModel(prog0007List);
        
        lista0006.getEdCodiCida().setText((String) item.getValueAt(linha, 0));
        lista0006.getEdNomeCida().setText((String) item.getValueAt(linha, 1));
        lista0006.getEdSiglaEsta().setText((String) item.getValueAt(linha, 2));
        lista0006.setVisible(true);
        this.dispose();
        break;
      }
      case"listatipoEnti":
      {
        int linha = tblGridView.getSelectedRow();
        ListaTipoEntidadeTableModel item = new ListaTipoEntidadeTableModel(prog0007List);

        lista0006.getEdTienCodi().setText((String) item.getValueAt(linha, 0));
        lista0006.getEdTienNome().setText((String) item.getValueAt(linha, 1));
        lista0006.setVisible(true);
        this.dispose();
        break;
      }
      case"compradorFisica":
      {
        int linha = tblGridView.getSelectedRow();
        Prog0006TableModel item = new Prog0006TableModel(prog0006List);
        
        lista0009.getEdCodiComp().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeComp().setText((String) item.getValueAt(linha, 1));
        
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
      case"compradorJuridica":
      {
        int linha = tblGridView.getSelectedRow();    
        ListaProg0007TableModel item = new ListaProg0007TableModel(prog0007List);
       
        lista0009.getEdCodiComp().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeComp().setText((String) item.getValueAt(linha, 1));
        
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
      case"vendedorFisica":
      {
        int linha = tblGridView.getSelectedRow();
        Prog0006TableModel item = new Prog0006TableModel(prog0006List);
        
        lista0009.getEdCodiVend().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeVend().setText((String) item.getValueAt(linha, 1));
        
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
      case"vendedorJuridica":
      {
        int linha = tblGridView.getSelectedRow();    
        ListaProg0007TableModel item = new ListaProg0007TableModel(prog0007List);
       
        lista0009.getEdCodiVend().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeVend().setText((String) item.getValueAt(linha, 1));
        
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
      case"cBanco":
      {
        int linha = tblGridView.getSelectedRow();  
        ListaBancoTableModel item = new ListaBancoTableModel(prog0007List);
       
        lista0009.getEdCodiBanc().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeBanc().setText((String) item.getValueAt(linha, 1));
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
      case"cForo":
      {
        int linha = tblGridView.getSelectedRow();
        Prog0008TableModel item = new Prog0008TableModel(prog0008List);
        
        lista0009.getEdCodiForo().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeForo().setText((String) item.getValueAt(linha, 1));
        
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
      case"cidaComp":
      {
        int linha = tblGridView.getSelectedRow();   
        ListaCidadeTableModel item = new ListaCidadeTableModel(prog0007List);

        lista0009.getEdCodiCidaComp().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeCidaComp().setText((String) item.getValueAt(linha, 1));
        lista0009.getEdUfComp().setText((String) item.getValueAt(linha, 2));
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
      case"cidaVend":
      {
        int linha = tblGridView.getSelectedRow();   
        ListaCidadeTableModel item = new ListaCidadeTableModel(prog0007List);

        lista0009.getEdCodiCidaVend().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeCidaVend().setText((String) item.getValueAt(linha, 1));
        lista0009.getEdUfVend().setText((String) item.getValueAt(linha, 2));
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
      case"cidaImovel":
      {
        int linha = tblGridView.getSelectedRow();   
        ListaCidadeTableModel item = new ListaCidadeTableModel(prog0007List);

        lista0009.getEdCodiCidaImovel().setText((String) item.getValueAt(linha, 0));
        lista0009.getEdNomeCidaImovel().setText((String) item.getValueAt(linha, 1));
        lista0009.getEdUfImovel().setText((String) item.getValueAt(linha, 2));
        lista0009.setVisible(true);
        this.dispose();
        break;
      }
   }
  }//GEN-LAST:event_tblGridViewMouseClicked

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblGridView;
  // End of variables declaration//GEN-END:variables

  public String getPalavra() 
  {
    return palavra;
  }

  public void setPalavra(String palavra) 
  {
    this.palavra = palavra;
  }
  
  private static final long serialVersionUID = 1L;
}
