package vo;

import dao.IListaProg0007Dao;
import dao.Prog0007Dao;
import dao.Prog0007ListaDao;
import java.util.List;

public class Prog0007_ListaTipoEntidadeFachada 
{
  private IListaProg0007Dao daoTipoEnti;
  
  public Prog0007_ListaTipoEntidadeFachada()
  {
    this.daoTipoEnti = new Prog0007ListaDao();
  }
  
  public List<Prog0007Vo> findTipoEnti() 
  {
    return daoTipoEnti.findTipoEnti();
  }
}
