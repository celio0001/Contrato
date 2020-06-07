package vo;

import dao.IListaProg0008Dao;
import dao.Prog0008ListaDao;
import java.util.List;

public class Prog0008_ListaForoFachada 
{

  private IListaProg0008Dao daoForo;

 public Prog0008_ListaForoFachada()
 {
   this.daoForo = new Prog0008ListaDao();
 }
  
  public List<Prog0008Vo> findForo() 
  {
    return daoForo.findForo();
  }

}
