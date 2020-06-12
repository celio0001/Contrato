package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.Prog0009Vo;

public class ListaProg0009TableModel extends AbstractTableModel     
{
  private List<Prog0009Vo>valores = new ArrayList<>();
  Prog0009Vo entidade = new Prog0009Vo();
  
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public int getColumnCount() 
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) 
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  private static final long serialVersionUID = 1L;
}
