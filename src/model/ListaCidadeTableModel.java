package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.Prog0007Vo;

public class ListaCidadeTableModel extends AbstractTableModel
{
  private static final int COL_CODIGO = 0;
  private static final int COL_CIDADE = 1;
  private static final int COL_UF = 2;
  
  private final List<Prog0007Vo>valores ;
  Prog0007Vo cidade = new Prog0007Vo();

  public ListaCidadeTableModel(List<Prog0007Vo> valores) 
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
    cidade = valores.get(rowIndex);
    switch (columnIndex) {
      case COL_CODIGO:
        return cidade.getCodiCida();
      case COL_CIDADE:
        return cidade.getNomeCidade();  
      case COL_UF:
        return cidade.getUf();
      default:
        break;
    }
    return null;
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
      case COL_CIDADE:
        coluna = "Cidade";
        break;
      case COL_UF:
        coluna = "Uf";
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
      case COL_CODIGO:
        return Integer.class;
      case COL_CIDADE:
        return String.class;
      case COL_UF:
        return String.class;
      default:
        throw new IllegalArgumentException("Coluna invalida");
    }
  }
  
  public Prog0007Vo get(int row)
  {
    return valores.get(row);
  }
  private static final long serialVersionUID = 1L;
}
