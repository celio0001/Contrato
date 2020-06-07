package vo;

import dao.IListaProg0007Dao;
import dao.Prog0007ListaDao;
import java.util.List;

public class Prog0007_ListaBancoFachada 
{
  private IListaProg0007Dao daoBanco;

  public Prog0007_ListaBancoFachada()
  {
    this.daoBanco = new Prog0007ListaDao();
  }
  
  public List<Prog0007Vo> findBanco() 
  {
    return daoBanco.findBanco();
  }
}
