package dao;

import dados.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.Prog0008Vo;

public class Prog0008ListaDao implements IListaProg0008Dao
{

  @Override
  public List<Prog0008Vo> findForo() 
  {
    List<Prog0008Vo>listaEnti = new ArrayList();    
    try 
    {
      String sql = "select * from foro";             
      Conexao conexao = new Conexao(); 
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery();
      while(rs.next())
      {
        Prog0008Vo prog0008Vo = new Prog0008Vo(); 
        prog0008Vo.setCodigo(Integer.toString(rs.getInt("foro_codi")));
        prog0008Vo.setDescricao(rs.getString("foro_desc"));
        prog0008Vo.setObservacao(rs.getString("foro_obse"));              
        listaEnti.add(prog0008Vo);
      }
      conexao.desconectar();
    } 
    catch (ClassNotFoundException ex) 
    {
      Logger.getLogger(Prog0008ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    } 
    catch (SQLException ex) 
    {
      Logger.getLogger(Prog0008ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    }
      
    return listaEnti;
  }

}
