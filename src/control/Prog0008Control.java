package control;

import dao.Prog0008Dao;
import java.sql.SQLException;
import java.util.List;
import vo.Prog0008Vo;
import vo.Prog0008_ListaForoFachada;

public class Prog0008Control 
{
  private final Prog0008_ListaForoFachada facadeForo;
  Prog0008Vo prog0008Vo = new Prog0008Vo();

  public Prog0008Control() 
  {
    this.facadeForo = new Prog0008_ListaForoFachada();
  }
  
  public List<Prog0008Vo> findForo() 
  {
    return facadeForo.findForo();
  }
  
  public void excluirRegistro(String codigo) throws SQLException, ClassNotFoundException 
  {
    prog0008Vo.setCodigo(codigo);
    
    Prog0008Dao prog0008Dao = new Prog0008Dao(prog0008Vo);
    prog0008Dao.excluirRegistro();
  }

  public void gravarForo(String descricao, String observacao) throws ClassNotFoundException, SQLException 
  {
    prog0008Vo.setDescricao(descricao);
    prog0008Vo.setObservacao(observacao);
    
    Prog0008Dao prog0008Dao = new Prog0008Dao(prog0008Vo);
    prog0008Dao.gravarForo();
  }

  public void editarForo(String codigo, String descricao, String observacao) throws ClassNotFoundException, SQLException 
  {
    prog0008Vo.setCodigo(codigo);
    prog0008Vo.setDescricao(descricao);
    prog0008Vo.setObservacao(observacao);
    
    Prog0008Dao prog0008Dao = new Prog0008Dao(prog0008Vo);
    prog0008Dao.editarForo();
  }

  public Prog0008Vo buscarRegistro(String codigo) throws SQLException, ClassNotFoundException 
  {
    prog0008Vo.setCodigo(codigo);
    
    Prog0008Dao prog0008Dao = new Prog0008Dao(prog0008Vo);
    return prog0008Dao.buscarRegistro();
  }

  

  

}
