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
    
    String sql ="select *                                                  ,\n"+
                "       (case                                                         "+
				"         WHEN cont_tien_comp = 1 then                                "+ 
				"          (SELECT fisi_nome from fisi WHERE fisi_codi = cont_codi)   "+
				"         WHEN cont_tien_comp = 2 THEN                                "+
				"          (SELECT enti_raza from enti where enti_codi = cont_codi)   "+
			    "       end)as'comprador'                                          ,\n"+              
                "       (case                                                         "+
				"         WHEN cont_tien_vend = 1 then                                "+ 
				"          (SELECT fisi_nome from fisi WHERE fisi_codi = cont_codi)   "+
				"         WHEN cont_tien_vend = 2 THEN                                "+
				"          (SELECT enti_raza from enti where enti_codi = cont_codi)   "+
			    "       end)as'vendedor'                                          ,\n"+
                "      (select banc_desc from banc where banc_nume = cont_banc)as 'banco',\n"+
                "      (select foro_desc from foro where foro_codi = cont_foro)as 'foro',\n"+
                "       (select cida_desc from cida where cida_codi = cont_cida_comp)as 'cidade_comprador',\n"+
                "       (select cida_sigl from cida where cida_codi = cont_cida_comp)as 'estado_comprador',\n"+
                "       (select cida_desc from cida where cida_codi = cont_cida_vend)as 'cidade_vendedor',\n"+
                "       (select cida_sigl from cida where cida_codi = cont_cida_vend)as 'estado_vendedor',\n"+
                "       (select tien_desc from tien where tien_codi = cont_tien_comp)as 'tienComp',\n"+
                "       (select tien_desc from tien where tien_codi = cont_tien_vend)as 'tienVend',\n"+
                "       (select cida_sigl from cida where cida_codi = cont_cida_imov)as 'estado_imovel',\n"+
                "       (select fopa_quan_parc from fopa where fopa_codi = cont_fopa)as 'qauntParc',\n"+
                "       (select fopa_dias_entr from fopa where fopa_codi = cont_fopa)as 'diasEntreParc',\n"+
                "       (select fopa_prim_parc from fopa where fopa_codi = cont_fopa)as 'PrimeParc',\n"+
                "       (select fopa_desc from fopa where fopa_codi = cont_fopa)as 'fopa'\n"+
                "from cont "+
                "where cont_codi ="+valor;
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql);
    
    if(rs.next())
    {
      prog0009Vo.setCodiComp(Integer.toString(rs.getInt("cont_comp")));
      prog0009Vo.setCodiVend(Integer.toString(rs.getInt("cont_vend")));
      prog0009Vo.setCodiBanco(Integer.toString(rs.getInt("cont_banc")));
      prog0009Vo.setCodiForo(Integer.toString(rs.getInt("cont_foro")));
      prog0009Vo.setValor(rs.getString("cont_foro"));
      prog0009Vo.setData(rs.getString("cont_data"));
      prog0009Vo.setStatu(rs.getString("cont_stat"));
      prog0009Vo.setCepComp(rs.getString("cont_cep_comp"));
      prog0009Vo.setEndeComp(rs.getString("cont_ende_comp"));
      prog0009Vo.setNumeComp(Integer.toString(rs.getInt("cont_nume_comp")));
      prog0009Vo.setCidaComp(Integer.toString(rs.getInt("cont_cida_comp")));
      prog0009Vo.setBairroComp(rs.getString("cont_bair_comp"));
      prog0009Vo.setCodiCidaComp(rs.getString("cont_cida_comp"));
      prog0009Vo.setCepVend(rs.getString("cont_cep_vend"));
      prog0009Vo.setEndeVend(rs.getString("cont_ende_vend"));
      prog0009Vo.setNumeVend(Integer.toString(rs.getInt("cont_nume_vend")));
      prog0009Vo.setCidaVend(Integer.toString(rs.getInt("cont_cida_vend")));
      prog0009Vo.setBairroVend(rs.getString("cont_bair_vend"));
      prog0009Vo.setCodiCidaVend(rs.getString("cont_cida_vend"));
      prog0009Vo.setTeste1(rs.getString("cont_test1"));
      prog0009Vo.setTestemunha2(rs.getString("cont_test2"));
      prog0009Vo.setCepImovel(rs.getString("cont_cep_imov"));
      prog0009Vo.setEndeImovel(rs.getString("cont_ende_imov"));
      prog0009Vo.setNumeImovel(Integer.toString(rs.getInt("cont_nume_imov")));
      prog0009Vo.setCidaImovel(Integer.toString(rs.getInt("cont_cida_imov")));
      prog0009Vo.setBairroImovel(rs.getString("cont_bair_imov"));
      prog0009Vo.setCodiCidaImovel(rs.getString("cont_cida_imov"));
      prog0009Vo.setCodiTienComp(Integer.toString(rs.getInt("cont_tien_comp")));
      prog0009Vo.setCodiTienVend(Integer.toString(rs.getInt("cont_tien_vend")));
      prog0009Vo.setComp(rs.getString("comprador"));
      prog0009Vo.setVend(rs.getString("vendedor"));
      prog0009Vo.setBanco(rs.getString("banco"));
      prog0009Vo.setForo(rs.getString("foro"));
      prog0009Vo.setCidaComp(rs.getString("cidade_comprador"));
      prog0009Vo.setUfComp(rs.getString("estado_comprador"));
      prog0009Vo.setCidaVend(rs.getString("cidade_vendedor"));
      prog0009Vo.setUfVend(rs.getString("estado_vendedor"));
      prog0009Vo.setUfImovel(rs.getString("estado_imovel"));
      prog0009Vo.setTienComp(rs.getString("tienComp"));
      prog0009Vo.setTienVend(rs.getString("tienVend"));
      prog0009Vo.setCodiFopa(rs.getString("cont_fopa"));
      prog0009Vo.setQuantParc(rs.getString("qauntParc"));
      prog0009Vo.setDiasEntreParc(rs.getString("diasEntreParc"));
      prog0009Vo.setDiasParc1(rs.getString("PrimeParc"));
      prog0009Vo.setFormapagamento(rs.getString("fopa"));
      prog0009Vo.setCodiBanco(rs.getString("cont_banc"));
      

    }
    return prog0009Vo;
  }

  public void gravarContrato() throws ClassNotFoundException, SQLException, NumberFormatException
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
    int codiFopa = Integer.parseInt(prog0009Vo.getCodiFopa());
    
    
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
                 "                 cont_cep_imov,"+
                 "                 cont_ende_imov,"+
                 "                 cont_nume_imov,"+
                 "                 cont_cida_imov,"+
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

  public void excluirContrato() throws ClassNotFoundException, SQLException, NumberFormatException
  {
    int valor = Integer.parseInt(prog0009Vo.getCodigo());
    
    String sql = " delete from cont where cont_codi ="+valor;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    conexao.desconectar();
  }
}
