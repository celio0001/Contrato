package vo;

import dao.IListaProg0007Dao;
import dao.Prog0007ListaDao;
import java.util.List;

public class Prog0007_ListaCidadeFachada 
{
  private IListaProg0007Dao daoCidade;
  
  public Prog0007_ListaCidadeFachada()
  {
    this.daoCidade = new Prog0007ListaDao();
  }
  
  public List<CidadeVo> findCidade() 
  {
    return daoCidade.findCidade();
  }
}
