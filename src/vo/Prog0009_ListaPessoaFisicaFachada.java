package vo;

import dao.IListaProg0009Dao;
import java.util.List;

public class Prog0009_ListaPessoaFisicaFachada 
{
  private IListaProg0009Dao daoPessoaFisica;
  public List<Prog0009Vo> findPessoaFisica() 
  {
    return daoPessoaFisica.findPessoaFisica();
  }

}
