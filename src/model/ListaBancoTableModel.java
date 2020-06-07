package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.Prog0007Vo;

public class ListaBancoTableModel extends AbstractTableModel
{
  private static final int COL_CODIGO = 0;
  private static final int COL_DESCRICAO = 1;
  private static final int COL_DOCUMENTO = 2;
  private static final int COL_SITE = 3;
  
  private final List<Prog0007Vo>valores ;
  Prog0007Vo banco = new Prog0007Vo();
  
  public ListaBancoTableModel(List<Prog0007Vo> valores) 
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
  public Object getValueAt(int rowIndex, int colummIndex) 
  {
    banco = valores.get(rowIndex);
    switch(colummIndex)
    {
      case COL_CODIGO:
        return banco.getBancCodi();
      case COL_DESCRICAO:
        return banco.getBancDesc();
      case COL_DOCUMENTO:
        return banco.getBancDocu();
      case COL_SITE:
        return banco.getBancSite();
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
      case COL_DESCRICAO:
        coluna = "Nome Banco";
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
      case COL_DESCRICAO:
        return String.class;
      case COL_DOCUMENTO:
        return String.class;
      case COL_SITE:
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
