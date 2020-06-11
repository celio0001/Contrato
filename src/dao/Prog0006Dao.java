  package dao;


import dados.Conexao;
import dados.WebServiceCep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import vo.CidadeVo;
import vo.Prog0006Vo;
import vo.TipoEntidadeVo;

public class Prog0006Dao 
{
  Prog0006Vo prog0006Vo;
  CidadeVo cidadeVo;
  TipoEntidadeVo tipoEntidadeVo;
  
  public Prog0006Dao(Prog0006Vo prog0006Vo) 
  {
    this.prog0006Vo = prog0006Vo;
    cidadeVo = new CidadeVo();
    tipoEntidadeVo = new TipoEntidadeVo();
  }

  public Prog0006Vo buscaNovaEntidade() throws SQLException, ClassNotFoundException 
  {
    int num = Integer.parseInt(prog0006Vo.getCodigo());
    
    String sql = "select fisi_codi,\n"+
                 "       fisi_nome,\n"+
                 "       fisi_cep,\n"+
                 "       fisi_ende,\n"+
                 "       fisi_cida,\n"+
				 "      (select cida_desc from cida where cida_codi = fisi_cida) as 'cidade',\n"+
			     "      (select cida_sigl from cida where cida_codi = fisi_cida) as 'estado',\n"+
                 "       fisi_bair,\n"+
                 "       fisi_nume,\n"+
                 "       fisi_comp,\n"+
                 "       fisi_rg,\n"+
                 "       fisi_cpf,\n"+
                 "       fisi_fone,\n"+
                 "       fisi_celu,\n"+
                 "       fisi_emai,\n"+                            
                 "       fisi_obse,\n"+
                 "       fisi_nasc,\n"+
                 "       fisi_prof,\n"+
                 "       fisi_tien,\n"+
                 "      (select tien_desc from tien where tien_codi = fisi_tien)as 'tien'\n"+
    "from fisi\n"+
    "where fisi_codi="+num;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql);
    
    if(rs.next())
    {
      String dCod          = Integer.toString(rs.getInt("fisi_codi"));
      String dRazao        = rs.getString("fisi_nome");
      String dCep          = rs.getString("fisi_cep"); 
      String dEndereco     = rs.getString("fisi_ende");
      String dCodiCida     = rs.getString("fisi_cida"); 
      String dNomeCida     = rs.getString("cidade"); 
      String dSiglaEsta    = rs.getString("estado"); 
      String dBairro       = rs.getString("fisi_bair");
      String dnumero       = rs.getString("fisi_nume"); 
      String dComplemento  = rs.getString("fisi_comp");
      String dRg           = rs.getString("fisi_rg");    
      String dCpf          = rs.getString("fisi_cpf");
      String dFone         = rs.getString("fisi_fone");   
      String dCelu         = rs.getString("fisi_celu");          
      String dEmail        = rs.getString("fisi_emai");
      String dCodiTien        = rs.getString("fisi_tien");     
      String dObservacao   = rs.getString("fisi_obse");
      String dNascionalidade   = rs.getString("fisi_nasc");
      String dProfissao   = rs.getString("fisi_prof");
      String dTien        = rs.getString("tien");
                       
      prog0006Vo.setCodigo(dCod);
      prog0006Vo.setDescricao(dRazao);
      prog0006Vo.setCep(dCep);
      prog0006Vo.setEndereco(dEndereco);
      prog0006Vo.setCodiCida(dCodiCida); 
      prog0006Vo.setNomeCida(dNomeCida);
      prog0006Vo.setEstado(dSiglaEsta);
      prog0006Vo.setBairro(dBairro);
      prog0006Vo.setNumero(dnumero);
      prog0006Vo.setComplemento(dComplemento);
      prog0006Vo.setRg(dRg);
      prog0006Vo.setCpf(dCpf);
      prog0006Vo.setFoneFixo(dFone);
      prog0006Vo.setCelular(dCelu);
      prog0006Vo.setEmail(dEmail);
      prog0006Vo.setCodiTien(dCodiTien);
      prog0006Vo.setObservacao(dObservacao);
      prog0006Vo.setNascionalidade(dNascionalidade);
      prog0006Vo.setProfissao(dProfissao);
      prog0006Vo.setTien(dTien);
    }
    conexao.desconectar();
    return prog0006Vo;
  }
//=================================================================================================== 
   public Prog0006Vo buscaCep() throws ClassNotFoundException, SQLException 
  {
   //Faz a busca para o cep 58043-280
    
    String cep = prog0006Vo.getCep();
    WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
    //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.

    //caso a busca ocorra bem, imprime os resultados.
    if (webServiceCep.wasSuccessful()) 
    { 
      String dEndereco = (webServiceCep.getLogradouroFull());
      String dCidade = (webServiceCep.getCidade());
      String dBairro = (webServiceCep.getBairro());
      String dSiglEsta = (webServiceCep.getUf());
      
      prog0006Vo.setEndereco(dEndereco);
      prog0006Vo.setNomeCida(dCidade);
      prog0006Vo.setBairro(dBairro);
      prog0006Vo.setEstado(dSiglEsta);
    }
    String nomeCidade = prog0006Vo.getNomeCida();
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    stm = con.prepareStatement("select cida_codi from cida where cida_desc like ?");
    stm.setString(1, "%"+nomeCidade+"%");
    rs = stm.executeQuery();
 
    while(rs.next())
    {  
      String dCodiCida  = Integer.toString(rs.getInt("cida_codi"));             
      prog0006Vo.setCodiCida(dCodiCida);       
    }
    conexao.desconectar();
    System.out.println(prog0006Vo.getCodiCida());
    return prog0006Vo;
  }

  public void gravarPessoaFisca() throws ClassNotFoundException, SQLException 
  {
    int valor = Integer.parseInt(tipoEntidadeVo.getTienCodi());
    String sql1 = "SELECT (coalesce(max(fisi_codi),0)+1) as sequ FROM fisi";
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql1);
    if (rs.next())
    {
      String dCodi = Integer.toString(rs.getInt("sequ"));
      prog0006Vo.setCodigo(dCodi);
    }
    String sql = "INSERT INTO fisi(fisi_codi,               " + 
                  "                fisi_nome,               " + 
                  "                fisi_cep,                " + 
                  "                fisi_ende,                " + 
                  "                fisi_cida,               " + 
                  "                fisi_bairro,              " + 
                  "                fisi_nume,               " + 
                  "                fisi_comp,               " + 
                  "                fisi_rg,                 " + 
                  "                fisi_cpf,                " + 
                  "                fisi_fone,               " + 
                  "                fisi_celu,               " + 
                  "                fisi_email,              " + 
                  "                fisi_obse,               " + 
                  "                fisi_tien)               " + 
            "VALUES('"           + prog0006Vo.getCodigo()     + "',"
                 + "'"           + prog0006Vo.getDescricao()  + "',"
                 + "'"           + prog0006Vo.getCep()        + "',"
                 + "'"           + prog0006Vo.getEndereco()+ "',"
                 + "'"           + cidadeVo.getCodiCida()   + "',"
                 + "'"           + prog0006Vo.getBairro()     + "',"
                 + "'"           + prog0006Vo.getNumero()     + "',"
                 + "'"           + prog0006Vo.getComplemento()+ "',"
                 + "'"           + prog0006Vo.getRg()         + "',"
                 + "'"           + prog0006Vo.getCpf()        + "',"
                 + "'"           + prog0006Vo.getFoneFixo()   + "',"
                 + "'"           + prog0006Vo.getCelular()    + "',"
                 + "'"           + prog0006Vo.getEmail()      + "',"
                 + "'"           + prog0006Vo.getObservacao() + "',"
                 + "'"           + valor+ "')";
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }

//  public void excluirFilme() throws ClassNotFoundException, SQLException 
//  {
//    int num = Integer.parseInt(filmeVo.getCodigo());
//    String sql = "DELETE FROM filme WHERE filme_codi = " + num;
//    Conexao conexao = new Conexao();
//    Connection con = conexao.conectar();
//    Statement sessao = con.createStatement();
//    sessao.executeUpdate(sql);
//    conexao.desconectar();
//  }

  public void editarPessoaFisca() throws ClassNotFoundException, SQLException 
  {
    int num = Integer.parseInt(prog0006Vo.getCodigo());
    int valor = Integer.parseInt(prog0006Vo.getCodiTien());
    int cida = Integer.parseInt(prog0006Vo.getCodiCida());
    String sql = "UPDATE fisi SET fisi_nome  = '" + prog0006Vo.getDescricao() + 
                 "'," + "         fisi_cep = '" + prog0006Vo.getCep() + 
                 "'," + "         fisi_ende = '" + prog0006Vo.getEndereco()+ 
                 "'," + "          fisi_cida  = '" + cida + 
                 "'," + "          fisi_bair  = '" + prog0006Vo.getBairro() + 
                 "'," + "          fisi_nume = '" + prog0006Vo.getNumero()+ 
                 "'," + "          fisi_comp = '" + prog0006Vo.getComplemento()+ 
                 "'," + "          fisi_rg = '" + prog0006Vo.getRg()+ 
                 "'," + "          fisi_cpf = '" + prog0006Vo.getCpf()+ 
                 "'," + "          fisi_fone = '" + prog0006Vo.getFoneFixo()+ 
                 "'," + "          fisi_celu = '" + prog0006Vo.getCelular()+ 
                 "'," + "          fisi_emai = '" + prog0006Vo.getEmail()+ 
                 "'," + "          fisi_obse    = '" + prog0006Vo.getObservacao()+
                 "'," + "          fisi_nasc    = '" + prog0006Vo.getNascionalidade()+
                 "'," + "          fisi_prof    = '" + prog0006Vo.getProfissao()+
                 "'," + "          fisi_tien = '" + valor+                   
                 "' " + "WHERE     fisi_codi    =  " + num;
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }

  public void excluirPessoaFisica() throws ClassNotFoundException, SQLException 
  {
    int num = Integer.parseInt(prog0006Vo.getCodigo());
    String sql = "Delete from fisi where fisi_codi ="+num;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }

  public Prog0006Vo buscaCidade() 
  {
    return null;
    //int Valor = Integer.parseInt(cidadeVo.getCodiCida());
    
  }
}
