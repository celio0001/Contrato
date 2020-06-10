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
import vo.CidadeVo;
import vo.Prog0006Vo;

public class Prog0006ListaDao implements IListaProg0006Dao 
{

  List<Prog0006Vo>listaPessoaFisica;
  List<CidadeVo>listaCidade;

  
  
  public Prog0006ListaDao()
  {
    listaPessoaFisica = new ArrayList();
    listaCidade = new ArrayList();
    
  }
  
  //BUSCA LISTA DE PESSOA FISICA DA CLASSE PRO0006VIEW
  @Override
  public List<Prog0006Vo> findPessoaFisica() 
  { 
    String sql = "select *,"+
                 "(select cida_desc from cida where fisi_cida = cida_codi) as 'nome_cida',"+
                 "(select cida_sigl from cida where fisi_cida = cida_codi) as 'sigl_cida',"+
                 "(select tien_desc from tien where tien_codi = fisi_codi) as 'tien_desc'"+
                 "from fisi";            
    try 
    {
      Conexao conexao = new Conexao(); 
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery();
      while(rs.next())
      {
        Prog0006Vo prog0006Vo = new Prog0006Vo(); 
        prog0006Vo.setCodigo(Integer.toString(rs.getInt("fisi_codi")));
        prog0006Vo.setDescricao(rs.getString("fisi_nome"));
        prog0006Vo.setCep(rs.getString("fisi_cep"));
        prog0006Vo.setEndereco(rs.getString("fisi_ende"));
        prog0006Vo.setCodiCida(Integer.toString(rs.getInt("fisi_cida")));
        prog0006Vo.setNomeCida(rs.getString("nome_cida"));
        prog0006Vo.setEstado(rs.getString("sigl_cida"));
        prog0006Vo.setBairro(rs.getString("fisi_bair"));  
        prog0006Vo.setNumero(rs.getString("fisi_nume"));  
        prog0006Vo.setComplemento(rs.getString("fisi_comp"));  
        prog0006Vo.setRg(rs.getString("fisi_rg"));  
        prog0006Vo.setCpf(rs.getString("fisi_cpf"));  
        prog0006Vo.setFoneFixo(rs.getString("fisi_fone"));  
        prog0006Vo.setCelular(rs.getString("fisi_celu"));  
        prog0006Vo.setEmail(rs.getString("fisi_emai"));  
        prog0006Vo.setObservacao(rs.getString("fisi_obse")); 
        prog0006Vo.setNascionalidade(rs.getString("fisi_nasc"));
        prog0006Vo.setProfissao(rs.getString("fisi_prof"));
        prog0006Vo.setCodiTien(rs.getString("fisi_tien"));
        prog0006Vo.setTien(rs.getString("tien_desc"));
        
        
        listaPessoaFisica.add(prog0006Vo);
      }
      conexao.desconectar();
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listaPessoaFisica;
    
  }

  //BUSCA LISTA DE CIDADE DA CLASSE PROG0006VIEW
  @Override
  public List<CidadeVo> findCidade() 
  {
    String sql = "select * from cida";
    
    try 
    {
      Conexao conexao = new Conexao(); 
      Connection con = conexao.conectar();
      PreparedStatement sessao = con.prepareStatement(sql);
      ResultSet rs = sessao.executeQuery();
      while(rs.next())
      {  
        CidadeVo cidadeVo = new CidadeVo();
        cidadeVo.setCodiCida(Integer.toString(rs.getInt("cida_codi")));
        cidadeVo.setNomeCida(rs.getString("cida_desc"));
        cidadeVo.setEstado(rs.getString("cida_sigl"));
  
        listaCidade.add(cidadeVo);
      }
      conexao.desconectar();
    } 
    catch (ClassNotFoundException | SQLException ex) 
    {
      Logger.getLogger(Prog0007ListaDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listaCidade;
  }

}
