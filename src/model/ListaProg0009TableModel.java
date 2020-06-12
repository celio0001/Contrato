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
  private static final int COL_CODIGO = 0;
  private static final int COL_RAZAO_SOCIAL = 1;
  private static final int COL_NOME_FANTASIA = 2;
  private static final int COL_CPF = 3;
  private static final int COL_RG = 4;
  private static final int COL_CNPJ = 5;
  private static final int COL_TELEFONE = 6;
  private static final int COL_CELULAR = 7;
  private static final int COL_CONTATO = 8;
  private static final int COL_EMAIL = 9;
  private static final int COL_OBSERVACAO = 10;
  private static final int COL_IE = 11;
  private static final int COL_CODIGO_ENTIDADE = 12;
  private static final int COL_TIPO_ENTIDADE = 13;
  
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String getColumnName(int column) 
  {
    String coluna;
    switch(column)
    {
      case COL_CODIGO:
        coluna = "Codigo";
        break;
      case COL_RAZAO_SOCIAL:
        coluna = "Razão Social";
        break;
      case COL_NOME_FANTASIA:
        coluna = "Nome Fantasia";
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
      // CAMPOS COMUNS ENTRE AS TELAS
      case COL_CODIGO:
        return Integer.class;
      case COL_RAZAO_SOCIAL:
        return String.class;
      case COL_NOME_FANTASIA:
        return String.class;
      case COL_CPF:
        return String.class;
      case COL_RG:
        return String.class;
      case COL_CNPJ:
        return String.class;
      case COL_TELEFONE:
        return String.class;
      case COL_CELULAR:
        return String.class;
      case COL_CONTATO:
        return String.class;
      case COL_EMAIL:
        return String.class;
      case COL_OBSERVACAO:
        return String.class;
      case COL_IE:
        return String.class;
      case COL_CODIGO_ENTIDADE:
        return Integer.class;
      case COL_TIPO_ENTIDADE:
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
