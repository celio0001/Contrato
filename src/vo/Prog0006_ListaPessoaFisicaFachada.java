package vo;

import dao.IListaProg0006Dao;
import dao.Prog0006ListaDao;
import java.util.List;

public class Prog0006_ListaPessoaFisicaFachada 
{

  private IListaProg0006Dao daoPessoaFisica;
  private IListaProg0006Dao daoCidade;
  
  public Prog0006_ListaPessoaFisicaFachada()
  {
    this.daoPessoaFisica = new Prog0006ListaDao();
    this.daoCidade = new Prog0006ListaDao();
  }
  
  public List<Prog0006Vo> findPessoaFisica() 
  {
    return daoPessoaFisica.findPessoaFisica();
  }

  public List<CidadeVo> findCidade() 
  {
    return daoCidade.findCidade();
  }

}
