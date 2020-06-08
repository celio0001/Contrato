package control;

import dao.Prog0009Dao;
import java.sql.SQLException;
import java.util.List;
import vo.Prog0009Vo;
import vo.Prog0009_ListaPessoaFisicaFachada;

public class Prog0009Control 
{
   private final Prog0009_ListaPessoaFisicaFachada facadePessoaFisca;
   private Prog0009Vo prog0009Vo ;
   private Prog0009Dao prog0009Dao ;

  public Prog0009Control()
  {
    this.facadePessoaFisca = new Prog0009_ListaPessoaFisicaFachada();
    this.prog0009Vo = new Prog0009Vo();
  }
  
  public List<Prog0009Vo> findPessoaFisica() 
  {
    return facadePessoaFisca.findPessoaFisica();
  }

  public Prog0009Vo buscarContrato(String codigo) throws SQLException, ClassNotFoundException 
  {
    prog0009Vo.setCodigo(codigo);
    
    prog0009Dao = new Prog0009Dao(prog0009Vo);
    return prog0009Dao.buscarContrato();
  }

  

}
