package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.CidadeVo;
import vo.Prog0006Vo;
import vo.Prog0007Vo;

public class ListaCidadeTableModel extends AbstractTableModel
{
  private static final int COL_CODIGO = 0;
  private static final int COL_CIDADE = 1;
  private static final int COL_UF = 2;
  
  private List<Prog0007Vo>prog0007Valores ;
  private List<Prog0006Vo>prog0006Valores ;
  private List<CidadeVo> valores ;
  CidadeVo cidade = new CidadeVo();
  
  public ListaCidadeTableModel(List<CidadeVo> cidadeList) 
  {
    this.valores = cidadeList;
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
        return cidade.getNomeCida();  
      case COL_UF:
        return cidade.getEstado();
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
  
  public CidadeVo get(int row)
  {
    return valores.get(row);
  }
  private static final long serialVersionUID = 1L;
}
