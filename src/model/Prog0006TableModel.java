package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.Prog0006Vo;

public class Prog0006TableModel extends AbstractTableModel
{
  
  private static final int COL_CODIGO = 0;
  private static final int COL_NOME = 1;
  private static final int COL_ENDERECO = 2;
  private static final int COL_NACIONALIDADE = 3;
  private static final int COL_PROFISSAO = 4;
  private static final int COL_NUMERO = 5;
  private static final int COL_CEP = 6;
  private static final int COL_CPF = 7;
  private static final int COL_CODICIDA = 8;
  private static final int COL_NOMECIDA = 9;
  private static final int COL_FONEFIXO = 10;
  private static final int COL_CELULAR = 11;
  private static final int COL_EMAIL = 12;
  private static final int COL_OBSERVACAO = 13;
  private static final int COL_ESTADO = 14;
  private static final int COL_BAIRRO = 15;
  private static final int COL_RG = 16;
  private static final int COL_COMPLEMENTO = 17;
  private static final int COL_CODITIEN = 18;
  private static final int COL_TIEN = 19;
  
  
  private List<Prog0006Vo>valores = new ArrayList<>() ;
  Prog0006Vo lista = new Prog0006Vo();
  
  public Prog0006TableModel(List<Prog0006Vo> valores)
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
    switch(columnIndex)
    {
      case COL_CODIGO:
        return lista.getCodigo();        
      case COL_NOME:
        return lista.getDescricao();
      case COL_NACIONALIDADE:
        return lista.getNascionalidade();
      case COL_PROFISSAO:
        return lista.getProfissao();
      case COL_ENDERECO:
        return lista.getEndereco();
      case COL_NUMERO:
        return lista.getNumero();
      case COL_CEP:
        return lista.getCep();
      case COL_CPF:
        return lista.getCpf();
      case COL_CODICIDA:
        return lista.getCodiCida();
      case COL_NOMECIDA:
        return lista.getNomeCida();
      case COL_FONEFIXO:
        return lista.getFoneFixo();
      case COL_CELULAR:  
        return lista.getCelular();
      case COL_EMAIL:
        return lista.getEmail();
      case COL_OBSERVACAO:
        return lista.getObservacao();
      case COL_ESTADO:
        return lista.getEstado();
      case COL_BAIRRO:
        return lista.getBairro();
      case COL_RG:
        return lista.getRg();
      case COL_COMPLEMENTO:
        return lista.getComplemento();
      case COL_CODITIEN:
        return lista.getCodiTien();
      case COL_TIEN:
        return lista.getTien();
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
      case COL_NOME:
        coluna = "Nome";
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
      case COL_NOME:
        return String.class;
      case COL_NACIONALIDADE:
        return String.class;
      case COL_PROFISSAO:
        return String.class;
      case COL_ENDERECO:
        return String.class;
      case COL_NUMERO:
        return Integer.class;
      case COL_CEP:
        return String.class;
      case COL_CPF:
        return String.class;
      case COL_CODICIDA:
        return Integer.class;
      case COL_NOMECIDA:
        return String.class;
      case COL_FONEFIXO:
        return String.class;
      case COL_CELULAR:  
        return String.class;
      case COL_EMAIL:
        return String.class;
      case COL_OBSERVACAO:
        return String.class;
      case COL_ESTADO:
        return String.class;
      case COL_BAIRRO:
        return String.class;
      case COL_RG:
        return String.class;
      case COL_COMPLEMENTO:
        return String.class;
      case COL_CODITIEN:
        return Integer.class;
      case COL_TIEN:
        return String.class;
      default:
        throw new IllegalArgumentException("Coluna invalida");
    }
  }
  
  public Prog0006Vo get(int row)
  {
    return valores.get(row);
  }
  
  private static final long serialVersionUID = 1L;
}
