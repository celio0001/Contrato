package controle;

import dao.Prog0005Dao;
import java.sql.SQLException;
import java.util.List;
import vo.Prog0007_ListaTipoEntidadeFachada;
import vo.Prog0005Vo;
import vo.Prog0005_ListaTipoEntidadeFachada;

public class Prog0005Control 
{
  private final Prog0005_ListaTipoEntidadeFachada facadeTipoEnti;
  Prog0005Vo prog0005Vo = new Prog0005Vo();
  public Prog0005Control()
  {
    this.facadeTipoEnti = new Prog0005_ListaTipoEntidadeFachada();
  }

  public List<Prog0005Vo> findTipoEnti() 
  {
    return facadeTipoEnti.findTipoEnti();
  }

  public Prog0005Vo buscarTipoEntidade(String codigo) throws SQLException, ClassNotFoundException 
  {
    Prog0005Vo prog0005Vo = new Prog0005Vo();
    prog0005Vo.setCodigo(codigo);
    
    Prog0005Dao prog0005Dao = new Prog0005Dao(prog0005Vo);
    
    return prog0005Dao.buscarEntidade();
  }

  public void graverTipoEntidade(String descricao, String observacao) throws SQLException, ClassNotFoundException 
  {
    Prog0005Vo prog0005Vo = new Prog0005Vo();
    
    prog0005Vo.setDescricao(descricao);
    prog0005Vo.setObservacao(observacao);
    
    Prog0005Dao prog0005Dao = new Prog0005Dao(prog0005Vo);
    prog0005Dao.gravarTipoEntidade();
    
  }

  public void excluirTipoEntidade(String codigo) throws SQLException, ClassNotFoundException 
  {
    Prog0005Vo prog0005Vo = new Prog0005Vo();
    prog0005Vo.setCodigo(codigo);
    
    Prog0005Dao prog0005Dao = new Prog0005Dao(prog0005Vo);
    prog0005Dao.excluirRegistro();
  }

  public void editarTipoEntidade(String codigo, String descricao, String observacao) throws ClassNotFoundException, SQLException 
  {
    prog0005Vo.setCodigo(codigo);
    prog0005Vo.setDescricao(descricao);
    prog0005Vo.setObservacao(observacao);
    
    Prog0005Dao prog0005Dao = new Prog0005Dao(prog0005Vo);
    prog0005Dao.editarRegistro();
  }
  
  
}
