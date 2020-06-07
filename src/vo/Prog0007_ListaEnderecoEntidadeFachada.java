
package vo;

import dao.Prog0007ListaDao;
import java.util.List;
import dao.IListaProg0007Dao;

public class Prog0007_ListaEnderecoEntidadeFachada 
{
  private IListaProg0007Dao daoTipoEnti;
  private IListaProg0007Dao daoComarca;
  private IListaProg0007Dao daoVeiculo;
  private IListaProg0007Dao daoBanco;
  private IListaProg0007Dao daoBuscaEnde;
  private IListaProg0007Dao daoEndebanco;
  
  public Prog0007_ListaEnderecoEntidadeFachada()
  {
    this.daoTipoEnti = new Prog0007ListaDao();
    this.daoComarca = new Prog0007ListaDao();
    this.daoVeiculo = new Prog0007ListaDao();
    this.daoBanco = new Prog0007ListaDao();
    this.daoBuscaEnde = new Prog0007ListaDao();
  } 
 
//  public List<ProgVo>findTipoEnti()
//  {
//    return daoTipoEnti.findTipoEnti();
//  }
  //-------------------------------------------
//  public List<ProgVo>findComarca()
//  {
//    return daoComarca.findComarca();  
//  }
  //-------------------------------------------
//  public List<ProgVo>findVeiculo()
//  {
//    return daoVeiculo.findVeiculo();  
//  }
  //-------------------------------------------
//  public List<ProgVo> findBanco() 
//  {
//    return daoBanco.findBanco(); 
//  }
 //-------------------------------------------
  public List<Prog0007Vo> findbuscaEnde(String codigo)
  {
    return daoBuscaEnde.findbuscaEnde(codigo);
  }

//  public List<ProgVo> findEndeBanco() 
//  {
//    return daoEndebanco.findEndeBanco(); 
//  }
}
