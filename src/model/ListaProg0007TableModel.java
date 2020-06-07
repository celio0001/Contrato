
package model;

import java.util.ArrayList;
import vo.Prog0007Vo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ListaProg0007TableModel extends AbstractTableModel     
{
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
  private static final long serialVersionUID = 1L;
  
  private List<Prog0007Vo>valores = new ArrayList<>();
  Prog0007Vo entidade = new Prog0007Vo();
  
  public ListaProg0007TableModel(List<Prog0007Vo> valores)
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
    entidade = valores.get(rowIndex);
    switch (columnIndex) 
    {
     // CAMPOS COMUNS ENTRE AS TELAS
      case COL_CODIGO:
        return entidade.getCodigo();
      case COL_RAZAO_SOCIAL:
        return entidade.getRazao();  
      case COL_NOME_FANTASIA:
        return entidade.getNomeFantasia();
      case COL_CPF:
        return entidade.getCpf();
      case COL_RG:
        return entidade.getRg();
      case COL_CNPJ:
        return entidade.getCnpj();
      case COL_TELEFONE:
        return entidade.getTelefone();
      case COL_CELULAR:
        return entidade.getCelular();
      case COL_CONTATO:
        return entidade.getContato(); 
      case COL_EMAIL:
        return entidade.getEmail();
      case COL_OBSERVACAO:
        return entidade.getObservacao(); 
      case COL_IE:
        return entidade.getIe(); 
      case COL_CODIGO_ENTIDADE:
        return entidade.getCodiTipoEnti();
      case COL_TIPO_ENTIDADE:
        return entidade.getTipoEnti();
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
  public Prog0007Vo get(int row)
  {
    return valores.get(row);
  }
}
