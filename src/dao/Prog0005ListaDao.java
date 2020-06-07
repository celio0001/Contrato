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
import vo.Prog0005Vo;

public class Prog0005ListaDao implements IListaProg0005Dao
{

  @Override
  public List<Prog0005Vo> findTipoEnti() {
    List<Prog0005Vo>listaEnti = new ArrayList();
    String sql = "select * from tien";             
    Conexao conexao = new Conexao();   
    try 
    {
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery();
      while(rs.next())
      {
        Prog0005Vo prog0005Vo = new Prog0005Vo(); 
        prog0005Vo.setCodigo(Integer.toString(rs.getInt("tien_codi")));
        prog0005Vo.setDescricao(rs.getString("tien_desc"));
        prog0005Vo.setObservacao(rs.getString("tien_obse"));              
        listaEnti.add(prog0005Vo);
      }
      conexao.desconectar();
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listaEnti;
  }

}
