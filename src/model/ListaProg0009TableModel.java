package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.Prog0009Vo;

public class ListaProg0009TableModel extends AbstractTableModel     
{
  private List<Prog0009Vo>valores = new ArrayList<>();
  Prog0009Vo contrato = new Prog0009Vo();
  
  // CAMPOS COMUNS ENTRE AS TELAS
  private static final int COL_CODIGO_CONTRATO = 0;
  private static final int COL_DATA = 1;
  private static final int COL_VALOR = 2;
  private static final int COL_STATUS = 3;
  private static final int COL_COD_COMP = 4;
  private static final int COL_COMP = 5;
  private static final int COL_CEP_COMP = 6;
  private static final int COL_ENDE_COMP = 7;
  private static final int COL_NUME_COMP = 8;
  private static final int COL_COD_CIDA_COMP = 9;
  private static final int COL_CIDA_COMP = 10;
  private static final int COL_UF_COMP = 11;
  private static final int COL_BAIRRO_COMP = 12;
  private static final int COL_CODI_VEND = 13;
  private static final int COL_VEND = 14;
  private static final int COL_CEP_VEND = 15;
  private static final int COL_ENDE_VEND = 16;
  private static final int COL_NUME_VEND = 17;
  private static final int COL_COD_CIDA_VEND = 18;
  private static final int COL_CIDA_VEND = 19;
  private static final int COL_UF_VEND = 20;
  private static final int COL_BAIRRO_VEND = 21;
  private static final int COL_COD_IMOVEL = 22;
  private static final int COL_IMOVEL = 23;
  private static final int COL_CEP_IMOVEL = 24;
  private static final int COL_ENDE_IMOVEL = 25;
  private static final int COL_NUME_IMOVEL = 26;
  private static final int COL_COD_CIDA_IMOVEL = 27;
  private static final int COL_CIDA_IMOVEL = 28;
  private static final int COL_UF_IMOVEL = 29;
  private static final int COL_BAIRRO_IMOVEL = 30;
  private static final int COL_COD_TESTEMUNA_1 = 31;
  private static final int COL_TESTEMUNA_1 = 32;
  private static final int COL_COD_TESTEMUNA_2 = 33;
  private static final int COL_TESTEMUNA_2 = 34;
  private static final int COL_COD_BANCO = 35;
  private static final int COL_BANCO = 36;
  private static final int COL_COD_FORO = 37;
  private static final int COL_FORO = 38;
  
  public ListaProg0009TableModel(List<Prog0009Vo> valores)
  {
    this.valores = valores;
  }
  
  @Override
  public int getRowCount() 
  {
    return valores.size();
  }

  @Override
  public int getColumnCount() 
  {
    return 3;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) 
  {
     contrato = valores.get(rowIndex);
    switch (columnIndex) 
    {
      case COL_CODIGO_CONTRATO:
        return contrato.getCodigo();
      case COL_DATA:
        return contrato.getData();
      case COL_VALOR:
        return contrato.getValor();
      case COL_STATUS:
        return contrato.getStatu();
      case COL_COD_COMP:
        return contrato.getCodiComp();
      case COL_COMP:
        return contrato.getComp();
      case COL_CEP_COMP:
        return contrato.getCepComp();
      case COL_ENDE_COMP:
        return contrato.getEndeComp();
      case COL_NUME_COMP:
        return contrato.getNumeComp();
      case COL_COD_CIDA_COMP:
        return contrato.getCodiCidaComp();
      case COL_CIDA_COMP:
        return contrato.getCidaComp();
      case COL_UF_COMP:
        return contrato.getUfComp();
      case COL_BAIRRO_COMP:
        return contrato.getBairroComp();
      case COL_CODI_VEND:
        return contrato.getCodiVend();
      case COL_VEND:
        return contrato.getVend();
      case COL_CEP_VEND:
        return contrato.getCepVend();
      case COL_ENDE_VEND:
        return contrato.getEndeVend();
      case COL_NUME_VEND:
        return contrato.getNumeVend();
      case COL_COD_CIDA_VEND:
        return contrato.getCodiCidaVend();
      case COL_CIDA_VEND:
        return contrato.getCidaVend();
      case COL_UF_VEND:
        return contrato.getUfVend();
      case COL_BAIRRO_VEND:
        return contrato.getBairroVend();
      case COL_COD_IMOVEL:
        return contrato.getCodiImovel();
      case COL_IMOVEL:
        return contrato.getImovel();
      case COL_CEP_IMOVEL:
        return contrato.getCepImovel();
      case COL_ENDE_IMOVEL:
        return contrato.getEndeImovel();
      case COL_NUME_IMOVEL:
        return contrato.getNumeImovel();
      case COL_COD_CIDA_IMOVEL:
        return contrato.getCodiCidaImovel();
      case COL_CIDA_IMOVEL:
        return contrato.getCidaImovel();
      case COL_UF_IMOVEL:
        return contrato.getUfImovel();
      case COL_BAIRRO_IMOVEL:
        return contrato.getBairroImovel();
      case COL_COD_TESTEMUNA_1:
        return contrato.getCodTeste1();
      case COL_TESTEMUNA_1:
        return contrato.getTeste1();
      case COL_COD_TESTEMUNA_2:
        return contrato.getCodiTeste2();
      case COL_TESTEMUNA_2:
        return contrato.getTestemunha2();
      case COL_COD_BANCO:
        return contrato.getCodiBanco();
      case COL_BANCO:
        return contrato.getBanco();  
      case COL_COD_FORO:
        return contrato.getCodiForo();
      case COL_FORO:
        return contrato.getForo();
    }
    return null;
  }

  @Override
  public String getColumnName(int column) 
  {
    String coluna;
    switch(column)
    {
      case COL_CODIGO_CONTRATO:
        coluna = "Codigo Contrato";
        break;
      case COL_IMOVEL:
        coluna = "Descrição Imovel";
        break;
      case COL_DATA:
        coluna = "Data Contrato";
        break;
      default:
        throw new IllegalArgumentException("Coluna invalida");
    }
    return coluna;
  }
  
  @Override
  public Class<?> getColumnClass(int columnIndex) 
  {
    switch (columnIndex) 
    {
      case COL_CODIGO_CONTRATO:
        return Integer.class;
      case COL_DATA:
        return String.class;
      case COL_VALOR:
        return String.class;
      case COL_STATUS:
        return String.class;
      case COL_COD_COMP:
        return Integer.class;
      case COL_COMP:
        return String.class;
      case COL_CEP_COMP:
        return String.class;
      case COL_ENDE_COMP:
        return String.class;
      case COL_NUME_COMP:
        return String.class;
      case COL_COD_CIDA_COMP:
        return Integer.class;
      case COL_CIDA_COMP:
        return String.class;  
      case COL_UF_COMP:
        return String.class;
      case COL_BAIRRO_COMP:
        return String.class;
      case COL_CODI_VEND:
        return Integer.class;
      case COL_VEND:
        return String.class;
      case COL_CEP_VEND:
        return String.class;
      case COL_ENDE_VEND:
        return String.class;
      case COL_NUME_VEND:
        return String.class;
      case COL_COD_CIDA_VEND:
        return Integer.class;  
      case COL_CIDA_VEND:
        return String.class;
      case COL_UF_VEND:
        return String.class;
      case COL_BAIRRO_VEND:
        return String.class;  
      case COL_COD_IMOVEL:
        return Integer.class;  
      case COL_IMOVEL:
        return String.class;  
      case COL_CEP_IMOVEL:
        return String.class;  
      case COL_ENDE_IMOVEL:
        return String.class;  
      case COL_NUME_IMOVEL:
        return String.class;  
      case COL_COD_CIDA_IMOVEL:
        return Integer.class;  
      case COL_CIDA_IMOVEL:
        return String.class;  
      case COL_UF_IMOVEL:
        return String.class;  
      case COL_BAIRRO_IMOVEL:
        return String.class;  
      case COL_COD_TESTEMUNA_1:
        return Integer.class;  
      case COL_TESTEMUNA_1:
        return String.class;  
      case COL_COD_TESTEMUNA_2:
        return Integer.class;  
      case COL_TESTEMUNA_2:
        return String.class;  
      case COL_COD_BANCO:
        return Integer.class; 
      case COL_BANCO:
        return String.class;  
      case COL_COD_FORO:
        return Integer.class;  
      case COL_FORO:
        return String.class;  
      default:
        throw new IllegalArgumentException("Coluna invalida");
    }
  } 
  
  public Prog0009Vo get(int row)
  {
    return valores.get(row);
  }
  
  private static final long serialVersionUID = 1L;
}
