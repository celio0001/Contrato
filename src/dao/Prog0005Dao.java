package dao;

import dados.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.Prog0005Vo;
import vo.Prog0007Vo;

public class Prog0005Dao 
{
  Prog0005Vo prog0005Vo = new Prog0005Vo();

  public Prog0005Dao(Prog0005Vo prog0005Vo) {
    this.prog0005Vo = prog0005Vo;
  }

  public Prog0005Dao() 
  {
    
  }
  
  
  public Prog0005Vo buscarEntidade() throws SQLException, ClassNotFoundException 
  {
    System.out.println(prog0005Vo.getCodigo());
    int valor = Integer.parseInt(prog0005Vo.getCodigo());
    
    String sql ="select tien_desc,\n"+
                "       tien_obse\n"+
                "From tien where tien_codi =" + valor;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql);
    
    if(rs.next())
    {
      String dDesc = rs.getString("tien_Desc");
      String dObse = rs.getString("tien_obse");
      
      prog0005Vo.setDescricao(dDesc);
      prog0005Vo.setObservacao(dObse);
    }
    conexao.desconectar();
    return prog0005Vo;
  }

  public void gravarTipoEntidade() throws SQLException, ClassNotFoundException 
  {
    int valor;
    String sqlAux = "select (coalesce(max(tien_codi),0)+1) as sequ from tien";
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sqlAux);
    if (rs.next()) 
    {
      prog0005Vo.setCodigo(Integer.toString(rs.getInt("sequ")));  
      
    } 
    valor = Integer.parseInt(prog0005Vo.getCodigo());
    String sql = "insert into tien(tien_codi,"+
                 "                 tien_desc,"+
                 "                 tien_obse)"+
                 "value('"        +valor+"',"
                +"'"              +prog0005Vo.getDescricao()+"',"
                +"'"              +prog0005Vo.getObservacao()+"')";
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }

  public void excluirRegistro() throws SQLException, ClassNotFoundException 
  {
    int valor = Integer.parseInt(prog0005Vo.getCodigo());
    
    String sql = "delete from tien where tien_codi ="+valor;
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
  }

  public void editarRegistro() throws ClassNotFoundException, SQLException 
  {
    int valor = Integer.parseInt(prog0005Vo.getCodigo());
    
    String sql = "Update tien set tien_desc = '"+ prog0005Vo.getDescricao()+"',"
                 +"                tien_obse = '"+ prog0005Vo.getObservacao()+"'"
                 +"Where tien_codi ="+valor;
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }

}
