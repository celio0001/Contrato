
package dao;

import vo.Prog0007Vo;
import dados.Conexao;
import dados.WebServiceCep;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prog0007Dao 
{
  Prog0007Vo prog0007Vo = new Prog0007Vo();
 
  public Prog0007Dao(Prog0007Vo prog0007Vo) 
  {
    this.prog0007Vo = prog0007Vo;
  }
  
 public Prog0007Vo buscaNovaEntidade() throws ClassNotFoundException, SQLException, FileNotFoundException 
  {
    int num = Integer.parseInt(prog0007Vo.getCodigo());
    String sql = " SELECT enti.enti_id           ,\n" +
                 "        enti.enti_codi         ,\n" +
                 "        enti.enti_raza         ,\n" +
                 "        enti.enti_fant         ,\n" +
                 "        enti.enti_cpf          ,\n" +
                 "        enti.enti_rg           ,\n" +        
                 "        enti.enti_cnpj         ,\n" +                                           
                 "        enti.enti_fone         ,\n" +
                 "        enti.enti_celu         ,\n" +
                 "        enti.enti_cont         ,\n" +
                 "        enti.enti_emai         ,\n" +
                 "        enti.enti_obse         ,\n" +
                 "        enti.enti_ie           ,\n" + 
                 "        enti.enti_tien         ,\n" +
                 "(select tien_desc from tien where tien_codi = enti_tien)as tien_desc \n" +
                 "FROM\n" +
                 "        enti ,\n" +
                 "        tien\n" +
                 "WHERE   enti_codi ="+num;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();   
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql);
    
    if(rs.next())
    {
      String dCod          = Integer.toString(rs.getInt("enti_id"));
      String dRazao        = rs.getString("enti_raza");
      String dFant         = rs.getString("enti_fant");
      String dCpf          = rs.getString("enti_cpf");
      String dRg           = rs.getString("enti_rg");
      String dCnpj         = rs.getString("enti_cnpj");
      String dFone         = rs.getString("enti_fone"); 
      String dCelu         = rs.getString("enti_celu");
      String dCont         = rs.getString("enti_cont"); 
      String dEmail        = rs.getString("enti_emai");
      String dObservacao   = rs.getString("enti_obse"); 
      String dIe           = rs.getString("enti_ie");
      String dCodiTien     = Integer.toString(rs.getInt("enti_tien"));
      String dNomeTien     = rs.getString("tien_desc");
      
      prog0007Vo.setCodigo(dCod);
      prog0007Vo.setRazao(dRazao);
      prog0007Vo.setNomeFantasia(dFant);
      prog0007Vo.setCpf(dCpf);
      prog0007Vo.setCnpj(dCnpj);
      prog0007Vo.setIe(dIe);
      prog0007Vo.setTelefone(dFone);
      prog0007Vo.setContato(dCont);
      prog0007Vo.setEmail(dEmail);
      prog0007Vo.setObservacao(dObservacao);
      prog0007Vo.setCelular(dCelu);
      prog0007Vo.setCodiTipoEnti(dCodiTien);
      prog0007Vo.setTipoEnti(dNomeTien); 
      prog0007Vo.setRg(dRg);    
    }
    conexao.desconectar();
    return prog0007Vo;
  }
 //=============================================================================================================

  public Prog0007Vo buscaCep() throws SQLException, ClassNotFoundException {
    //Faz a busca para o cep 58043-280
    
    String cep = prog0007Vo.getCep();
    WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
    //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.

    //caso a busca ocorra bem, imprime os resultados.
    if (webServiceCep.wasSuccessful()) 
    { 
      String dEndereco = (webServiceCep.getLogradouroFull());
      String dCidade = (webServiceCep.getCidade());
      String dBairro = (webServiceCep.getBairro());
      String dSiglEsta = (webServiceCep.getUf());
      
      prog0007Vo.setEndereco(dEndereco);
      prog0007Vo.setNomeCidade(dCidade);
      prog0007Vo.setBairro(dBairro);
      prog0007Vo.setUf(dSiglEsta);
    }
    
    String nomeCidade = prog0007Vo.getNomeCidade();

    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    stm = con.prepareStatement("select cida_codi from cida where cida_desc like ?");
    stm.setString(1, "%"+nomeCidade+"%");
    rs=stm.executeQuery();
 
    while(rs.next())
    {  
      String dCodiCida  = Integer.toString(rs.getInt("cida_codi"));                    
      prog0007Vo.setCodiCida(dCodiCida);       
    }
    conexao.desconectar();
    return prog0007Vo;
  }

  public void excluirDadosPrincipais() throws SQLException, ClassNotFoundException 
  {
    int num = Integer.parseInt(prog0007Vo.getCodigo());
    
    String sql = "Delete from enti where enti_codi ="+num;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql); 
    conexao.desconectar();
  }

  public void gravarEntidade() throws SQLException, ClassNotFoundException 
  { 
    int codiTien = Integer.parseInt(prog0007Vo.getCodiTipoEnti());
    String sql = "select (coalesce(max(enti_codi),0)+1) as sequ from enti";
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql);
    if (rs.next()) 
    {
      prog0007Vo.setCodigo(Integer.toString(rs.getInt("sequ")));  
    } 
    prog0007Vo.setSequencia(prog0007Vo.getCodigo());  
    String sql1 = "insert into enti(enti_codi,"+
                  "                 enti_raza,"+
                  "                 enti_fant,"+
                  "                 enti_cpf,"+
                  "                 enti_rg,"+
                  "                 enti_cnpj,"+
                  "                 enti_fone,"+
                  "                 enti_celu,"+
                  "                 enti_cont,"+
                  "                 enti_emai,"+
                  "                 enti_obse,"+
                  "                 enti_ie,"+         
                  "                 enti_tien)"+
                  "value('"        +prog0007Vo.getCodigo() + "',"
                + "'"              +prog0007Vo.getRazao() + "',"
                + "'"              +prog0007Vo.getNomeFantasia() +"',"
                + "'"              +prog0007Vo.getCpf()+"',"
                + "'"              +prog0007Vo.getRg()+"',"
                + "'"              +prog0007Vo.getCnpj()+"',"  
                + "'"              +prog0007Vo.getTelefone()+"',"
                + "'"              +prog0007Vo.getCelular()+"',"
                + "'"              +prog0007Vo.getContato()+"',"          
                + "'"              +prog0007Vo.getEmail()+"',"          
                + "'"              +prog0007Vo.getObservacao() + "',"
                + "'"              +prog0007Vo.getIe()+ "',"
                + "'"              +codiTien + "')";   
    sessao.executeUpdate(sql1);
    conexao.desconectar();
  }

  public void gravarPropriedade() throws SQLException, ClassNotFoundException 
  {
    
    int codiBanc = Integer.parseInt(prog0007Vo.getBancCodi());
    
    String sqlaux = "select enti_codi from enti where enti_codi = (SELECT MAX(enti_codi)from enti) ";
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sqlaux);
    
    if (rs.next()) 
    {
      prog0007Vo.setCodigo(Integer.toString(rs.getInt("enti_codi")));  
    }    
    String sql = "insert into ende(ende_enti,"+
                 "                 ende_cep,"+
                 "                 ende_ende,"+
                 "                 ende_nume,"+
                 "                 ende_cida,"+
                 "                 ende_desc,"+
                 "                 ende_bair,"+
                 "                 ende_cont,"+
                 "                 ende_fone,"+
                 "                 ende_comp,"+
                 "                 ende_ie,"+
                 "                 ende_banc)"+
                 "value('"        +prog0007Vo.getCodigo()+ "',"
                 + "'"            +prog0007Vo.getCep() + "',"
                 + "'"            +prog0007Vo.getEndereco() + "',"
                 + "'"            +prog0007Vo.getNumero() + "',"
                 + "'"            +prog0007Vo.getCodiCida() + "',"
                 + "'"            +prog0007Vo.getDesc() + "',"
                 + "'"            +prog0007Vo.getBairro() + "',"
                 + "'"            +prog0007Vo.getContato() + "',"
                 + "'"            +prog0007Vo.getTelefone() + "',"
                 + "'"            +prog0007Vo.getComplemento() + "',"
                 + "'"            +prog0007Vo.getIe() + "',"
                 + "'"            +codiBanc + "')"; 
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }

  public void gravarBanco() throws ClassNotFoundException, SQLException 
  {
//    int vCodi = Integer.parseInt(prog0006Vo.getCodigo());
    // vCodiBanc = Integer.parseInt(prog0006Vo.getBancCodi());
    String sqlaux = "select enti_codi from enti where enti_codi = (SELECT MAX(enti_codi)from enti) ";
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessaoAux = con.createStatement();
    ResultSet rs = sessaoAux.executeQuery(sqlaux);
    
    if (rs.next()) 
    {
      prog0007Vo.setCodigo(Integer.toString(rs.getInt("enti_codi"))); 
    } 
    String sql = "Insert into baen( baen_enti,"+
                 "                  baen_banc,"+
                 "                  baen_nome_banc,"+
                 "                  baen_agen,"+
                 "                  baen_cont)"+
                 "value('"        +prog0007Vo.getCodigo() + "',"
                +"'"              +prog0007Vo.getBancCodi() + "',"
                +"'"              +prog0007Vo.getBancDesc()+ "',"
                +"'"              +prog0007Vo.getBancAgencia()+"',"
                +"'"              +prog0007Vo.getBancConta()+"')";   
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    conexao.desconectar();  
  }

  public void editarEntidade() throws ClassNotFoundException, SQLException 
  {
    int num = Integer.parseInt(prog0007Vo.getCodigo());
    int tipoEnti = Integer.parseInt(prog0007Vo.getCodiTipoEnti());
    String sql = "update enti set enti_raza = '" + prog0007Vo.getRazao()+ "',"
                +"                enti_fant = '" + prog0007Vo.getNomeFantasia() + "',"
                +"                enti_tien = '" + tipoEnti +"',"
                +"                enti_cnpj = '" + prog0007Vo.getCnpj() + "',"
                +"                enti_rg = '" + prog0007Vo.getRg() + "',"
                +"                enti_cpf = '" + prog0007Vo.getCpf() + "',"
                +"                enti_fone = '" + prog0007Vo.getTelefone() + "',"
                +"                enti_celu = '" + prog0007Vo.getCelular() + "',"
                +"                enti_cont = '" + prog0007Vo.getContato() + "',"
                +"                enti_obse = '" + prog0007Vo.getObservacao() + "'"
                                + "where enti_codi= "  + num;    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    
    conexao.desconectar();
  }

  public void editarPropriedade() throws ClassNotFoundException, SQLException 
  { 
    int num = Integer.parseInt(prog0007Vo.getCodiEnde());
    int codiBanc = Integer.parseInt(prog0007Vo.getBancCodi());
    String sql = "update ende set ende_cep = '" + prog0007Vo.getCep()+ "',"
                +"                ende_ende = '" + prog0007Vo.getEndereco()+ "',"
                +"                ende_nume = '" + prog0007Vo.getNumero()+ "',"
                +"                ende_cida = '" + prog0007Vo.getCodiCida()+ "',"
                +"                ende_desc = '" + prog0007Vo.getNomeFantasia()+ "',"
                +"                ende_bair = '" + prog0007Vo.getBairro()+ "',"
                +"                ende_cont = '" + prog0007Vo.getContato()+ "',"
                +"                ende_fone = '" + prog0007Vo.getTelefone()+ "',"
                +"                ende_comp = '" + prog0007Vo.getComplemento()+ "',"
                +"                ende_ie = '" + prog0007Vo.getIe()+ "',"
                +"                ende_banc = '" + codiBanc+ "'"
                + "where ende_enti= "+ num;  
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);  
    conexao.desconectar();
  }

  public void editarBanco() throws ClassNotFoundException, SQLException 
  {
    int num = Integer.parseInt(prog0007Vo.getCodigo());
    int bancCodi = Integer.parseInt(prog0007Vo.getBancCodi());
    String sql = "update baen set baen_banc = '" +bancCodi + "',"
                +"                baen_nome_banc = '" + prog0007Vo.getBancDesc()+ "',"
                +"                baen_agen = '" + prog0007Vo.getBancAgencia()+ "',"
                +"                baen_cont = '" + prog0007Vo.getBancConta()+ "'"                                
                + "where baen_enti ="  + num;  
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql); 
    conexao.desconectar();
  }

  public void excluirPropriedade() throws SQLException, ClassNotFoundException 
  {
    int valor = Integer.parseInt(prog0007Vo.getCodigo());
    
    String sql = "Delete from ende where ende_enti ="+valor;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    
    conexao.desconectar();
  }

  public void excluirBanco() throws SQLException, ClassNotFoundException 
  {
    int valor = Integer.parseInt(prog0007Vo.getCodigo());
    
    String sql = "Delete from baen where baen_enti ="+valor;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    
    conexao.desconectar();
  }
}
