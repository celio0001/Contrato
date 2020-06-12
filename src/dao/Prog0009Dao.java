package dao;

import dados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import vo.Prog0009Vo;

public class Prog0009Dao 
{

  Prog0009Vo prog0009Vo = new Prog0009Vo();
  
  public Prog0009Dao(Prog0009Vo prog0009Vo) 
  {
    this.prog0009Vo = prog0009Vo;
  }

  public Prog0009Vo buscarContrato() throws SQLException, ClassNotFoundException 
  {
    int valor =  Integer.parseInt(prog0009Vo.getCodigo());
    
    String sql ="select * from cont where cont_codi ="+valor;
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql);
    
    if(rs.next())
    {
      
    }
    return prog0009Vo;
  }

  public Prog0009Vo gravarContrato() 
  {
    return null;
    
  }

}
