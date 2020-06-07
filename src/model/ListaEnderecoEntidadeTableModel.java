
package model;

import java.util.ArrayList;
import vo.Prog0007Vo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ListaEnderecoEntidadeTableModel extends AbstractTableModel
{
  private static final int COL_CODIGO = 0;
  private static final int COL_DESCRICAO = 1;
  private static final int COL_CONTATO = 2;
  private static final int COL_TELEFONE = 3;
  private static final int COL_CEP = 4;
  private static final int COL_ENDERECO = 5;
  private static final int COL_NUMERO = 6;
  private static final int COL_CODIGO_CIDADE = 7;
  private static final int COL_NOME_CIDADE = 8;
  private static final int COL_UF = 9;
  private static final int COL_BAIRRO = 10;
  private static final int COL_COMPLEMENTO = 11; 
  private static final int COL_CODIGO_BANCO = 12;
  private static final int COL_DESCRICAO_BANCO = 13;
  private static final int COL_CONTA_BANCO = 14;  
  private static final int COL_AGENCIA_BANCO = 15;
  private static final int COL_IE = 16;

  private List<Prog0007Vo>valores = new ArrayList<>();
  Prog0007Vo propriedade = new Prog0007Vo();
  
  public ListaEnderecoEntidadeTableModel(List<Prog0007Vo> valores) 
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
    return 4;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    propriedade = valores.get(rowIndex);
    switch (columnIndex) 
    {
      case COL_CODIGO:
        return propriedade.getCodigo();
      case COL_DESCRICAO:
        return propriedade.getNomeFantasia();  
      case COL_CONTATO:
        return propriedade.getContato();       
      case COL_TELEFONE:
        return propriedade.getTelefone();
      case COL_CEP:
        return propriedade.getCep();
      case COL_ENDERECO:
        return propriedade.getEndereco();
      case COL_NUMERO:
        return propriedade.getNumero();
      case COL_CODIGO_CIDADE:
        return propriedade.getCodiCida();
      case COL_NOME_CIDADE:
        return propriedade.getNomeCidade();
      case COL_UF:
        return propriedade.getUf();
      case COL_BAIRRO:
        return propriedade.getBairro();
      case COL_COMPLEMENTO:
        return propriedade.getComplemento();
      case COL_CODIGO_BANCO:
        return propriedade.getBancCodi();
      case COL_DESCRICAO_BANCO:
        return propriedade.getBancDesc();
      case COL_CONTA_BANCO:
        return propriedade.getBancConta();
      case COL_AGENCIA_BANCO:
        return propriedade.getBancAgencia();
      case COL_IE:
        return propriedade.getIe();
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
        coluna = "Razao Social";
        break;
      case COL_CONTATO:
        coluna = "contato";
        break;
      case COL_TELEFONE:
        coluna = "Telefone";
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
      case COL_CONTATO:
        return String.class;
      case COL_TELEFONE:
        return String.class;
      case COL_CEP:
        return String.class;
      case COL_ENDERECO:
        return String.class;
      case COL_NUMERO:
        return String.class;
      case COL_CODIGO_CIDADE:
        return Integer.class;
      case COL_NOME_CIDADE:
        return String.class;
      case COL_UF:
        return String.class;
      case COL_BAIRRO:
        return String.class;
      case COL_COMPLEMENTO:
        return String.class;
      case COL_CODIGO_BANCO:
        return Integer.class;
      case COL_DESCRICAO_BANCO:
        return String.class;
      case COL_CONTA_BANCO:
        return String.class;
      case COL_AGENCIA_BANCO:
        return String.class;
      case COL_IE:
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
