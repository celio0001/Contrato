package control;


import dao.Prog0009Dao;
import java.sql.SQLException;
import java.util.List;
import vo.Prog0009Vo;
import vo.Prog0009_ListaPessoaFisicaFachada;

public class Prog0009Control 
{
   private final Prog0009_ListaPessoaFisicaFachada facadePessoaFisca;
   private final Prog0009Vo prog0009Vo ;
   private Prog0009Dao prog0009Dao ;

  public Prog0009Control()
  {
    this.facadePessoaFisca = new Prog0009_ListaPessoaFisicaFachada();
    this.prog0009Vo = new Prog0009Vo();
    this.prog0009Dao = new Prog0009Dao(prog0009Vo);
  }
  
  public List<Prog0009Vo> findPessoaFisica() 
  {
    return facadePessoaFisca.findPessoaFisica();
  }

  public Prog0009Vo buscarContrato(String codigo) throws SQLException, ClassNotFoundException, NumberFormatException
  {
    prog0009Vo.setCodigo(codigo);
    
    prog0009Dao = new Prog0009Dao(prog0009Vo);
    return prog0009Dao.buscarContrato();
  }

  public void gravarContrato(String data, String valor, String status, String codiComp, String cepComp, String endeComp, String numeComp, 
                             String bairroComp, String codiCidaComp, String codiVend, String cepVend, String endeVend, String numeVend, 
                             String bairroVend, String codiCidaVend, String codiCidaImovel, String cepImovel, String endeImovel, String numeImovel, 
                             String bairroImovel, String codiFopa, String nomeTest1, String nomeTeste2, String codiBanco, 
                             String codiForo, String codiTienComp,  String codiTienVend,    String formaPagamento, 
                             String quantParc, String diasParc1,  String diasEntreParc  ) throws ClassNotFoundException, SQLException, NumberFormatException
  {
    prog0009Vo.setData(data);
    prog0009Vo.setValor(valor);
    prog0009Vo.setStatu(status);
    prog0009Vo.setCodiComp(codiComp);
    prog0009Vo.setCepComp(cepComp);
    prog0009Vo.setEndeComp(endeComp);
    prog0009Vo.setNumeComp(numeComp);
    prog0009Vo.setBairroComp(bairroComp);
    prog0009Vo.setCodiCidaComp(codiCidaComp);
    prog0009Vo.setCodiVend(codiVend);
    prog0009Vo.setCepVend(cepVend);
    prog0009Vo.setEndeVend(endeVend);
    prog0009Vo.setNumeVend(numeVend);
    prog0009Vo.setBairroVend(bairroVend);
    prog0009Vo.setCodiCidaVend(codiCidaVend);
    prog0009Vo.setCodiCidaImovel(codiCidaImovel);
    prog0009Vo.setTeste1(nomeTest1);
    prog0009Vo.setTestemunha2(nomeTeste2);
    prog0009Vo.setCodiBanco(codiBanco);
    prog0009Vo.setCodiForo(codiForo);
    prog0009Vo.setCodiTienComp(codiTienComp);
    prog0009Vo.setCodiTienVend(codiTienVend);
    prog0009Vo.setCepImovel(cepImovel);
    prog0009Vo.setEndeImovel(endeImovel);
    prog0009Vo.setNumeImovel(numeImovel);
    prog0009Vo.setBairroImovel(bairroImovel);
    prog0009Vo.setCodiFopa(codiFopa);
    prog0009Vo.setFormapagamento(formaPagamento);
    prog0009Vo.setQuantParc(quantParc);
    prog0009Vo.setDiasParc1(diasParc1);
    prog0009Vo.setDiasEntreParc(diasEntreParc);
    
    prog0009Dao.gravarContrato();     
  }

  public void excluirContrato(String codigo) throws ClassNotFoundException, SQLException, NumberFormatException
  {
    prog0009Vo.setCodigo(codigo);
    
    prog0009Dao.excluirContrato();
  }

  public void editarContrato(String codigo, String data, String valor, String status, String codiComp, String cepComp, String endeComp, String numeComp, 
                             String bairroComp, String codiCidaComp, String codiVend, String cepVend, String endeVend, String numeVend, 
                             String bairroVend, String codiCidaVend, String codiCidaImovel, String cepImovel, String endeImovel, String numeImovel, 
                             String bairroImovel, String codiFopa, String nomeTest1, String nomeTeste2, String codiBanco, 
                             String codiForo, String codiTienComp,  String codiTienVend,    String formaPagamento, 
                             String quantParc, String diasParc1,  String diasEntreParc  ) throws ClassNotFoundException, SQLException, NumberFormatException
  {
    prog0009Vo.setCodigo(codigo);
    prog0009Vo.setData(data);
    prog0009Vo.setValor(valor);
    prog0009Vo.setStatu(status);
    prog0009Vo.setCodiComp(codiComp);
    prog0009Vo.setCepComp(cepComp);
    prog0009Vo.setEndeComp(endeComp);
    prog0009Vo.setNumeComp(numeComp);
    prog0009Vo.setBairroComp(bairroComp);
    prog0009Vo.setCodiCidaComp(codiCidaComp);
    prog0009Vo.setCodiVend(codiVend);
    prog0009Vo.setCepVend(cepVend);
    prog0009Vo.setEndeVend(endeVend);
    prog0009Vo.setNumeVend(numeVend);
    prog0009Vo.setBairroVend(bairroVend);
    prog0009Vo.setCodiCidaVend(codiCidaVend);
    prog0009Vo.setCodiCidaImovel(codiCidaImovel);
    prog0009Vo.setTeste1(nomeTest1);
    prog0009Vo.setTestemunha2(nomeTeste2);
    prog0009Vo.setCodiBanco(codiBanco);
    prog0009Vo.setCodiForo(codiForo);
    prog0009Vo.setCodiTienComp(codiTienComp);
    prog0009Vo.setCodiTienVend(codiTienVend);
    prog0009Vo.setCepImovel(cepImovel);
    prog0009Vo.setEndeImovel(endeImovel);
    prog0009Vo.setNumeImovel(numeImovel);
    prog0009Vo.setBairroImovel(bairroImovel);
    prog0009Vo.setCodiFopa(codiFopa);
    prog0009Vo.setFormapagamento(formaPagamento);
    prog0009Vo.setQuantParc(quantParc);
    prog0009Vo.setDiasParc1(diasParc1);
    prog0009Vo.setDiasEntreParc(diasEntreParc);
    
    prog0009Dao.editarContrato();
  }
}
