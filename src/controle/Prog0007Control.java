package controle;

import java.sql.SQLException;
import java.util.List;
import dao.Prog0007Dao;
import java.io.FileNotFoundException;
import vo.Prog0007_ListaEnderecoEntidadeFachada;
import vo.Prog0007Vo;
import vo.Prog0007_ListaBancoFachada;
import vo.Prog0007_ListaCidadeFachada;
import vo.Prog0007_ListaEntidadeFachada;
import vo.Prog0007_ListaTipoEntidadeFachada;

public class Prog0007Control 
{
  private final Prog0007_ListaEntidadeFachada facadeEnti;
  private final Prog0007_ListaEnderecoEntidadeFachada facadeEndeEnti;
  private final Prog0007_ListaTipoEntidadeFachada facadeTipoEnti;
  private final Prog0007_ListaCidadeFachada facadeCid ;
  private final Prog0007_ListaBancoFachada facadeBanco ;

  public Prog0007Control()
  {
    this.facadeEnti = new Prog0007_ListaEntidadeFachada();
    this.facadeEndeEnti = new Prog0007_ListaEnderecoEntidadeFachada ();
    this.facadeTipoEnti = new Prog0007_ListaTipoEntidadeFachada();
    this.facadeCid = new Prog0007_ListaCidadeFachada();
    this.facadeBanco = new Prog0007_ListaBancoFachada();
  }

  public List<Prog0007Vo> findEnti() 
  {
    return facadeEnti.findEnti();
  }

  public List<Prog0007Vo> findbuscaEnde(String codigo) 
  {
    Prog0007Vo prog0007Vo = new Prog0007Vo();
    prog0007Vo.setCodigo(codigo);
    return facadeEndeEnti.findbuscaEnde(codigo);
  }
  
  public List<Prog0007Vo> findTipoEnti()
  {
    return facadeTipoEnti.findTipoEnti();
  }

  public List<Prog0007Vo> findCidade() 
  {
    return facadeCid.findCidade();
  }
  
  public List<Prog0007Vo> findBanco() 
  {
    return facadeBanco.findBanco();
  }
//===============================================================================================================================  
  public Prog0007Vo buscaNovaEntidade(String codigo) throws ClassNotFoundException, SQLException, FileNotFoundException 
  {
    //BE = Busca Entidade
    
    Prog0007Vo Prog0007VoBE = new Prog0007Vo();
    
    Prog0007VoBE.setCodigo(codigo);
    
    Prog0007Dao prog0007DaoEC = new Prog0007Dao(Prog0007VoBE);
    
    return prog0007DaoEC.buscaNovaEntidade();
  }
  
  public Prog0007Vo buscaCep(String cep) throws SQLException, ClassNotFoundException {
    Prog0007Vo Prog0007VoCep = new Prog0007Vo();
    
    Prog0007VoCep.setCep(cep);
    
    Prog0007Dao prog0007DaoEC = new Prog0007Dao(Prog0007VoCep);
    
    return prog0007DaoEC.buscaCep();
  }

  public void excluirDadosPrincipais(String codigo) throws SQLException, ClassNotFoundException 
  {
    Prog0007Vo prog0007Ex = new Prog0007Vo();
    prog0007Ex.setCodigo(codigo);
    
    Prog0007Dao prog0007DaoEx = new Prog0007Dao(prog0007Ex);
    prog0007DaoEx.excluirDadosPrincipais();
  }
  
  public void gravarEntidade(String razao, String fantasia, String codiTipoEnti, String cnpj, String rg, String cpf, String fone, String celular, String contato, String ie, String email, String observacao) throws SQLException, ClassNotFoundException 
  {
    Prog0007Vo prog0007VoG = new Prog0007Vo();
    prog0007VoG.setRazao(razao);
    prog0007VoG.setNomeFantasia(fantasia);
    prog0007VoG.setCodiTipoEnti(codiTipoEnti);
    prog0007VoG.setCnpj(cnpj);
    prog0007VoG.setRg(rg);
    prog0007VoG.setCpf(cpf);
    prog0007VoG.setTelefone(fone);
    prog0007VoG.setCelular(celular);
    prog0007VoG.setContato(contato);
    prog0007VoG.setIe(ie);
    prog0007VoG.setEmail(email);
    prog0007VoG.setObservacao(observacao);
    
    Prog0007Dao prog0006DaoG = new Prog0007Dao(prog0007VoG);
    prog0006DaoG.gravarEntidade();
  }

  public void gravarPropriedade(String fantasia, String contato, String fone, String cep, String endereco, String numero, String codiCida, String bairro, String complemento, String ie, String bancoCodi) throws SQLException, ClassNotFoundException 
  {
    Prog0007Vo prog0007voGP = new Prog0007Vo();
    prog0007voGP.setNomeFantasia(fantasia);
    prog0007voGP.setContato(contato);
    prog0007voGP.setTelefone(fone);
    prog0007voGP.setCep(cep);
    prog0007voGP.setEndereco(endereco);
    prog0007voGP.setNumero(numero);
    prog0007voGP.setCodiCida(codiCida);
    prog0007voGP.setBairro(bairro);
    prog0007voGP.setComplemento(complemento);
    prog0007voGP.setIe(ie);
    prog0007voGP.setBancCodi(bancoCodi);
    
    Prog0007Dao prog0007DaoGP = new Prog0007Dao(prog0007voGP);
    prog0007DaoGP.gravarPropriedade();
  }
  
  public void gravarBanco(String codiBanco, String nomeBanco, String agenciaBanco, String contaBanco) throws ClassNotFoundException, SQLException 
  {
    Prog0007Vo prog0007VoGB = new Prog0007Vo();
    prog0007VoGB.setBancCodi(codiBanco);
    prog0007VoGB.setBancDesc(nomeBanco);
    prog0007VoGB.setBancAgencia(agenciaBanco);
    prog0007VoGB.setBancConta(contaBanco);
    
    Prog0007Dao prog0006DaoGB = new Prog0007Dao(prog0007VoGB);
    prog0006DaoGB.gravarBanco();
  }

  public void editarEntidade(String codigo, String razao, String fantasia, String codiTipoEnti, String cnpj, String rg, String cpf, String fone, String celular, String contato, String observacao) throws ClassNotFoundException, SQLException 
  {
    Prog0007Vo prog0007VoE = new Prog0007Vo();
    prog0007VoE.setCodigo(codigo);
    prog0007VoE.setRazao(razao);
    prog0007VoE.setNomeFantasia(fantasia);
    prog0007VoE.setCodiTipoEnti(codiTipoEnti);
    prog0007VoE.setCnpj(cnpj);
    prog0007VoE.setRg(rg);
    prog0007VoE.setCpf(cpf);
    prog0007VoE.setTelefone(fone);
    prog0007VoE.setCelular(celular);
    prog0007VoE.setContato(contato);
    prog0007VoE.setObservacao(observacao);
    
    Prog0007Dao prog0007DaoE = new Prog0007Dao(prog0007VoE);
    prog0007DaoE.editarEntidade();
  }

  public void editarPropriedade(String codiEnti,String fantasia, String contato, String fone, String cep, String endereco, String numero, String codiCida, String bairro, String complemento,String ie,String codiBanc) throws SQLException, ClassNotFoundException 
  {
    Prog0007Vo prog0007voEP = new Prog0007Vo();
    prog0007voEP.setCodiEnde(codiEnti);
    prog0007voEP.setNomeFantasia(fantasia);
    prog0007voEP.setContato(contato);
    prog0007voEP.setTelefone(fone);
    prog0007voEP.setCep(cep);
    prog0007voEP.setEndereco(endereco);
    prog0007voEP.setNumero(numero);
    prog0007voEP.setCodiCida(codiCida);
    prog0007voEP.setBairro(bairro);
    prog0007voEP.setComplemento(complemento);
    prog0007voEP.setIe(ie);
    prog0007voEP.setBancCodi(codiBanc);
    
    Prog0007Dao prog0007DaoEP = new Prog0007Dao(prog0007voEP);
    prog0007DaoEP.editarPropriedade();
  }
  
  public void editarBanco(String codigo,String codiBanco, String nomeBanco, String agenciaBanco, String contaBanco) throws ClassNotFoundException, SQLException 
  {
    Prog0007Vo prog0007VoEB = new Prog0007Vo();
    prog0007VoEB.setCodigo(codigo);
    prog0007VoEB.setBancCodi(codiBanco);
    prog0007VoEB.setBancDesc(nomeBanco);
    prog0007VoEB.setBancAgencia(agenciaBanco);
    prog0007VoEB.setBancConta(contaBanco);
   
    Prog0007Dao prog0007DaoEB = new Prog0007Dao(prog0007VoEB);
    prog0007DaoEB.editarBanco();
  }

  public void excluirPropriedade(String codigo) throws SQLException, ClassNotFoundException 
  {
    Prog0007Vo prog0007Vo = new Prog0007Vo();
    prog0007Vo.setCodigo(codigo);
    
    Prog0007Dao prog0007Dao = new Prog0007Dao(prog0007Vo);
    prog0007Dao.excluirPropriedade();
  }

  public void excluirBanco(String codigo) throws SQLException, ClassNotFoundException 
  {
    Prog0007Vo prog0007Vo = new Prog0007Vo();
    prog0007Vo.setCodigo(codigo);
    
    Prog0007Dao prog0007Dao = new Prog0007Dao(prog0007Vo);
    prog0007Dao.excluirBanco();
  }
}
