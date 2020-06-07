package dao;

import dados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.naming.spi.DirStateFactory;
import vo.Prog0008Vo;

public class Prog0008Dao 
{

  Prog0008Vo prog0008Vo = new Prog0008Vo();
  
  public Prog0008Dao(Prog0008Vo prog0008Vo)
  {
    this.prog0008Vo = prog0008Vo;
  }
  
  public void excluirRegistro() throws SQLException, ClassNotFoundException 
  {
    int valor = Integer.parseInt(prog0008Vo.getCodigo());
    
    String sql = "select from foro where foro_codi ="+valor;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    conexao.desconectar();
    
  }

  public void gravarForo() throws ClassNotFoundException, SQLException 
  {
    String sqlAux = "select (coalesce(max(foro_codi),0)+1) as sequ from foro";
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sqlAux);
    
    if(rs.next())
    {
      prog0008Vo.setCodigo(Integer.toString(rs.getInt("sequ")));
    }
    
    int valor = Integer.parseInt(prog0008Vo.getCodigo());
    
    String sql = "Insert into foro(foro_codi,"+
                 "                 foro_desc,"+
                 "                 foro_obse)"+
                 "value('"        +valor+"',"
                +"'"              +prog0008Vo.getDescricao()+"',"
                +"'"              +prog0008Vo.getObservacao()+"')";
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }

  public void editarForo() throws ClassNotFoundException, SQLException 
  {
    int valor = Integer.parseInt(prog0008Vo.getCodigo());
    
    String sql = "Update foro set foro_desc = '"+ prog0008Vo.getDescricao()+"',"
                 +"                foro_obse = '"+ prog0008Vo.getObservacao()+"'"
                 +"Where foro_codi ="+valor;
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }

  public Prog0008Vo buscarRegistro() throws SQLException, ClassNotFoundException 
  {
    int valor = Integer.parseInt(prog0008Vo.getCodigo());
    
    String sql = "Select foro_desc,\n"+
                 "       foro_obse\n"+
                 "from foro where foro_codi ="+valor;
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql);
    if(rs.next())
    {
      String dDesc = rs.getString("foro_desc");
      String dObse = rs.getString("foro_obse");
      
      prog0008Vo.setDescricao(dDesc);
      prog0008Vo.setObservacao(dObse);
      
    }
    conexao.desconectar();
    return prog0008Vo;
  }

  

}
