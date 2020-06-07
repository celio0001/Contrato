package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.Prog0008Vo;

public class Prog0008TableModel extends AbstractTableModel
{

  private static final int COL_CODIGO = 0;
  private static final int COL_TIPOENTI = 1;
  private static final int COL_OBSERVACAO = 2;
  
  
  private List<Prog0008Vo>valores = new ArrayList<>() ;
  
  Prog0008Vo lista = new Prog0008Vo();

  public Prog0008TableModel(List<Prog0008Vo> valores) 
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
    return 2;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) 
  {
    lista = valores.get(rowIndex);
    switch (columnIndex) {
      case COL_CODIGO:
        return lista.getCodigo();        
      case COL_TIPOENTI:
        return lista.getDescricao();  
      case COL_OBSERVACAO:
        return lista.getObservacao(); 
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
      case COL_TIPOENTI:
        coluna = "Comarca";
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
      case COL_TIPOENTI:
        return String.class;
      case COL_OBSERVACAO:
        return String.class;
      default:
        throw new IllegalArgumentException("Coluna invalida");
    }
  }
  
  public Prog0008Vo get(int row)
  {
    return valores.get(row);
  }
  
  private static final long serialVersionUID = 1L;
  
}
