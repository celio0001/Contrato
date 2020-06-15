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

  public void gravarContrato() throws ClassNotFoundException, SQLException 
  {
    int valorCodi;
    int codiComp = Integer.parseInt(prog0009Vo.getCodiComp());
    int codiVend = Integer.parseInt(prog0009Vo.getCodiVend());
    int codiBanc = Integer.parseInt(prog0009Vo.getCodiBanco());
    int codiForo = Integer.parseInt(prog0009Vo.getCodiForo());
    int codiTienComp = Integer.parseInt(prog0009Vo.getCodiTienComp());    
    int codiTienVend = Integer.parseInt(prog0009Vo.getCodiTienVend());
    int valorNumeComp = Integer.parseInt(prog0009Vo.getNumeComp());
    int codiCidaComp = Integer.parseInt(prog0009Vo.getCodiCidaComp());
    int valorNumeVend = Integer.parseInt(prog0009Vo.getNumeVend());
    int codiCidaVend = Integer.parseInt(prog0009Vo.getCodiCidaVend());
    int valorNumeImovel = Integer.parseInt(prog0009Vo.getNumeImovel());
    int codiCidaImovel = Integer.parseInt(prog0009Vo.getCodiCidaImovel());
    int codiFopa = Integer.parseInt(prog0009Vo.getFopa());
    String sqlAux ="select (coalesce(max(cont_codi),0)+1) as sequ from cont";
    
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sqlAux);
    if (rs.next()) 
    {
      prog0009Vo.setCodigo(Integer.toString(rs.getInt("sequ")));  
      
    } 
    valorCodi = Integer.parseInt(prog0009Vo.getCodigo());
    String sql = "insert into cont(cont_codi,"+
                 "                 cont_comp,"+
                 "                 cont_vend,"+
                 "                 cont_banc,"+
                 "                 cont_foro,"+
                 "                 cont_valo,"+
                 "                 cont_fopa,"+
                 "                 cont_data,"+
                 "                 cont_stat,"+
                 "                 cont_tien,"+
                 "                 cont_cep_comp,"+
                 "                 cont_ende_comp,"+
                 "                 cont_nume_comp,"+
                 "                 cont_cida_comp,"+
                 "                 cont_bair_comp,"+
                 "                 cont_cep_vend,"+
                 "                 cont_ende_vend,"+
                 "                 cont_nume_vend,"+
                 "                 cont_cida_vend,"+
                 "                 cont_bair_vend,"+
                 "                 cont_test1,"+
                 "                 cont_test2,"+
                 "                 cont_cida_imov,"+
                 "                 cont_cep_imov,"+
                 "                 cont_ende_imov,"+
                 "                 cont_nume_imov,"+
                 "                 cont_bair_imov,"+
                 "                 cont_tien_comp,"+
                 "                 cont_tien_vend)"+
                 "value('"        +valorCodi+"',"
                +"'"              +codiComp+"',"
                +"'"              +codiVend+"',"
                +"'"              +codiBanc+"',"
                +"'"              +codiForo+"',"
                +"'"              +prog0009Vo.getValor()+"',"
                +"'"              +codiFopa+"',"
                +"'"              +prog0009Vo.getData()+"',"
                +"'"              +prog0009Vo.getStatu()+"',"
                +"'"              +prog0009Vo.getCepComp()+"',"
                +"'"              +prog0009Vo.getEndeComp()+"',"
                +"'"              +valorNumeComp+"',"
                +"'"              +codiCidaComp+"',"
                +"'"              +prog0009Vo.getBairroComp()+"',"
                +"'"              +prog0009Vo.getCepVend()+"',"
                +"'"              +prog0009Vo.getEndeVend()+"',"
                +"'"              +valorNumeVend+"',"
                +"'"              +codiCidaVend+"',"
                +"'"              +prog0009Vo.getBairroVend()+"',"
                +"'"              +prog0009Vo.getTeste1()+"',"
                +"'"              +prog0009Vo.getTestemunha2()+"',"
                +"'"              +prog0009Vo.getCepImovel()+"',"
                +"'"              +prog0009Vo.getEndeImovel()+"',"
                +"'"              +valorNumeImovel+"',"  
                +"'"              +codiCidaImovel+"',"
                +"'"              +prog0009Vo.getBairroImovel()+"',"
                +"'"              +codiTienComp+"',"
                +"'"              +codiTienVend+"')";
    sessao.executeUpdate(sql);
    conexao.desconectar(); 
  }
}
