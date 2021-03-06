package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.Prog0005Vo;
import vo.Prog0007Vo;

public class ListaTipoEntidadeTableModel extends AbstractTableModel  
{
  private static final int COL_CODIGO = 0;
  private static final int COL_TIPOENTI = 1;
  private static final int COL_OBSERVACAO = 2;
  
  private List<Prog0007Vo>valores = new ArrayList<>() ;
  Prog0007Vo tipoEntidade = new Prog0007Vo();

  public ListaTipoEntidadeTableModel(List<Prog0007Vo> valores) 
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
    tipoEntidade = valores.get(rowIndex);
    switch (columnIndex) {
      case COL_CODIGO:
        return tipoEntidade.getCodiTipoEnti();        
      case COL_TIPOENTI:
        return tipoEntidade.getTipoEnti();  
      case COL_OBSERVACAO:
        return tipoEntidade.getObservacao(); 
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
        coluna = "Tipo Entidade";
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
  
  public Prog0007Vo get(int row)
  {
    return valores.get(row);
  }
  
  private static final long serialVersionUID = 1L;
}
