package vo;

import dao.Prog0007ListaDao;
import java.util.List;
import dao.IListaProg0007Dao;

public class Prog0007_ListaEntidadeFachada 
{
  private IListaProg0007Dao daoEnti;
  
  public Prog0007_ListaEntidadeFachada()
  {
    this.daoEnti = new Prog0007ListaDao();
  }
  
  public List<Prog0007Vo>findEnti()
  {
    return daoEnti.findEnti();
  }
}
