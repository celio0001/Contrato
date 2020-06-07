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
import vo.Prog0007Vo;

public class Prog0007ListaDao implements IListaProg0007Dao
{
  @Override
  public List<Prog0007Vo> findEnti() 
  {
    List<Prog0007Vo> listaEnti = new ArrayList(); 
    String sql = "select * ,"
               + "(select tien_desc from tien where tien_codi = enti_tien) as 'descricao'"
               + "from enti";   
    try 
    {
      Conexao conexao = new Conexao();
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery(sql);
      
      while(rs.next())
      {
        Prog0007Vo prog0007Vo = new Prog0007Vo();
        prog0007Vo.setCodigo(rs.getString("enti_codi"));
        prog0007Vo.setRazao(rs.getString("enti_raza"));
        prog0007Vo.setNomeFantasia(rs.getString("enti_fant"));
        prog0007Vo.setCpf(rs.getString("enti_cpf"));
        prog0007Vo.setRg(rs.getString("enti_rg"));
        prog0007Vo.setCnpj(rs.getString("enti_cnpj"));
        prog0007Vo.setTelefone(rs.getString("enti_fone"));
        prog0007Vo.setCelular(rs.getString("enti_celu"));
        prog0007Vo.setContato(rs.getString("enti_cont"));
        prog0007Vo.setEmail(rs.getString("enti_emai"));
        prog0007Vo.setObservacao(rs.getString("enti_obse"));
        prog0007Vo.setIe(rs.getString("enti_ie"));
        prog0007Vo.setCodiTipoEnti(rs.getString("enti_tien"));
        prog0007Vo.setTipoEnti(rs.getString("descricao"));
                 
        listaEnti.add(prog0007Vo); 
      }
      conexao.desconectar();
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    } 
    return listaEnti;
  }

  @Override
  public List<Prog0007Vo> findbuscaEnde(String codigo) 
  {
    int num = Integer.parseInt(codigo);
    List<Prog0007Vo>listaEndereco = new ArrayList(); 
    String sql = "select ende_id,                      "+
                 "       ende_enti,                    "+
                 "       ende_cep,                     "+
                 "       ende_ende,                    "+
                 "       ende_nume,                    "+
                 "       ende_cida,                    "+
                 "      (select cida_desc from cida where ende_cida = cida_codi) as 'cida_desc', "+
                 "      (select cida_sigl from cida where ende_cida = cida_codi) as 'cida_sigl', "+
                 "       ende_desc,                    "+
                 "       ende_bair,                    "+
                 "       ende_cont,                    "+
                 "       ende_fone,                    "+
                 "       ende_comp,                    "+
                 "       ende_ie,                      "+
                 "       ende_banc,                    "+
                 "      (select baen_nome_banc from baen where ende_enti = baen_enti) as 'banc_desc',       "+
                 "      (select baen_cont from baen where ende_enti = baen_enti) as 'banc_cont',            "+
                 "      (select baen_agen from baen where ende_enti = baen_enti) as 'banc_agen'             "+
                 " FROM ende                                "+
                 "where ende_enti = "+num;        
    try
    { 
      Conexao conexao = new Conexao();
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery(sql);
      while(rs.next())
      {
        Prog0007Vo prog0007Vo = new Prog0007Vo(); 
        prog0007Vo.setCodigo      (Integer.toString(rs.getInt("ende_enti")));
        prog0007Vo.setCep         (rs.getString("ende_cep")); 
        prog0007Vo.setEndereco    (rs.getString("ende_ende"));
        prog0007Vo.setNumero      (Integer.toString(rs.getInt("ende_nume")));
        prog0007Vo.setCodiCida    (Integer.toString(rs.getInt("ende_cida"))); 
        prog0007Vo.setNomeCidade  (rs.getString("cida_desc"));
        prog0007Vo.setUf          (rs.getString("cida_sigl"));      
        prog0007Vo.setNomeFantasia(rs.getString("ende_desc"));        
        prog0007Vo.setBairro      (rs.getString("ende_bair"));        
        prog0007Vo.setContato     (rs.getString("ende_cont"));       
        prog0007Vo.setTelefone(rs.getString("ende_fone"));
        prog0007Vo.setComplemento (rs.getString("ende_comp"));
        prog0007Vo.setIe          (rs.getString("ende_ie")); 
        prog0007Vo.setBancCodi(Integer.toString(rs.getInt("ende_banc")));
        prog0007Vo.setBancDesc(rs.getString("banc_desc"));
        prog0007Vo.setBancConta(rs.getString("banc_cont")); 
        prog0007Vo.setBancAgencia(rs.getString("banc_agen"));     
        listaEndereco.add(prog0007Vo);
      }  
      conexao.desconectar();
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    }  
    return listaEndereco;
  }

  @Override
  public List<Prog0007Vo> findTipoEnti() 
  {
    List<Prog0007Vo>listaEnti = new ArrayList();
    String sql = "select * from tien";             
    Conexao conexao = new Conexao();   
    try 
    {
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery();
      while(rs.next())
      {
        Prog0007Vo prog0007Vo = new Prog0007Vo(); 
        prog0007Vo.setCodiTipoEnti(Integer.toString(rs.getInt("tien_codi")));
        prog0007Vo.setTipoEnti(rs.getString("tien_desc"));
        prog0007Vo.setObservacao(rs.getString("tien_obse"));              
        listaEnti.add(prog0007Vo);
      }
      conexao.desconectar();
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listaEnti;
  }

  @Override
  public List<Prog0007Vo> findCidade() 
  {
    List<Prog0007Vo>listaCida = new ArrayList();
    
    String sql = "select * from cida";             
    try 
    {
      Conexao conexao = new Conexao();
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery();

      while(rs.next())
      {
        Prog0007Vo prog0007Vo = new Prog0007Vo(); 

        prog0007Vo.setCodiCida(rs.getString("cida_codi"));
        prog0007Vo.setNomeCidade(rs.getString("cida_desc"));
        prog0007Vo.setUf(rs.getString("cida_sigl"));
        listaCida.add(prog0007Vo);
      }
      conexao.desconectar();
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listaCida;
  }

  @Override
  public List<Prog0007Vo> findBanco() 
  {
    List<Prog0007Vo>listaBanco = new ArrayList();
    
    String sql = "select * from banc";             
    try 
    {
      Conexao conexao = new Conexao();
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery();

      while(rs.next())
      {
        Prog0007Vo prog0007Vo = new Prog0007Vo(); 

        prog0007Vo.setBancCodi(rs.getString("banc_nume"));
        prog0007Vo.setBancDesc(rs.getString("banc_desc"));
        prog0007Vo.setBancDocu(rs.getString("banc_docu"));
        prog0007Vo.setBancSite(rs.getString("banc_site"));
        listaBanco.add(prog0007Vo);
      }
      conexao.desconectar();
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listaBanco;
  }
}
