package dao;

import java.util.List;
import vo.Prog0007Vo;

public interface IListaProg0007Dao 
{
  List<Prog0007Vo>findEnti();
  public List<Prog0007Vo> findbuscaEnde(String codigo);
  public List<Prog0007Vo> findTipoEnti();
  public List<Prog0007Vo> findCidade();
  public List<Prog0007Vo> findBanco();
}
