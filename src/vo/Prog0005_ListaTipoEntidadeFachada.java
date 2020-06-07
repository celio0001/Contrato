package vo;

import dao.IListaProg0005Dao;
import dao.Prog0005ListaDao;
import java.util.List;

public class Prog0005_ListaTipoEntidadeFachada 
{
  private IListaProg0005Dao daoTipoEnti;
  
  public Prog0005_ListaTipoEntidadeFachada()
  {
    this.daoTipoEnti = new Prog0005ListaDao();
  }
  
  public List<Prog0005Vo> findTipoEnti() 
  {
    return daoTipoEnti.findTipoEnti();
  }

}
