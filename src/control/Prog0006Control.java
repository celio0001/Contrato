package control;

import dao.Prog0006Dao;
import java.sql.SQLException;
import java.util.List;
import vo.CidadeVo;
import vo.Prog0006Vo;
import vo.Prog0006_ListaPessoaFisicaFachada;
import vo.TipoEntidadeVo;

public class Prog0006Control 
{
  private final Prog0006_ListaPessoaFisicaFachada  facadePessoaFisica;
  private final Prog0006_ListaPessoaFisicaFachada  facadeCidade;
  Prog0006Vo prog0006Vo;
  Prog0006Dao prog0006Dao;
  CidadeVo cidadeVo;
  TipoEntidadeVo tipoEntidadeVo;
  
  public Prog0006Control() 
  {
   this.facadePessoaFisica = new Prog0006_ListaPessoaFisicaFachada();
   this.facadeCidade = new Prog0006_ListaPessoaFisicaFachada();
   prog0006Vo = new Prog0006Vo();
   prog0006Dao = new Prog0006Dao(prog0006Vo);
   cidadeVo = new CidadeVo();
  }
  
  public List<Prog0006Vo> findPessoaFisica() 
  {
    return facadePessoaFisica.findPessoaFisica();
  } 

  public List<CidadeVo> findCidade() 
  {
    return facadeCidade.findCidade();
  }
//  public List<CidadeVo> findCidade() 
//  {
//    return facadeCidade.findCidade();
//  }
//================================================================================================
  public Prog0006Vo buscarCidade(String cidaCodi, String cidaNome, String cidaUf) 
  {
    prog0006Vo.setCodiCida(cidaCodi);
    prog0006Vo.setNomeCida(cidaNome);
    prog0006Vo.setEstado(cidaUf);
    
    return prog0006Dao.buscaCidade();
  }
  
  public Prog0006Vo buscaNovaEntidade(String codigo) throws SQLException, ClassNotFoundException 
  {
    //BE = Busca Entidade
    
    Prog0006Vo Prog0006VoBE = new Prog0006Vo();
    Prog0006VoBE.setCodigo(codigo);
    Prog0006Dao prog0006DaoEC = new Prog0006Dao(Prog0006VoBE);
    
    return prog0006DaoEC.buscaNovaEntidade();
  }

  public Prog0006Vo buscaCep(String cep) throws ClassNotFoundException, SQLException
  {
    //BE = Busca Cep
    
    Prog0006Vo Prog0006VoCep = new Prog0006Vo();
    Prog0006VoCep.setCep(cep);
    Prog0006Dao prog0006DaoEC = new Prog0006Dao(Prog0006VoCep);
    
    return prog0006DaoEC.buscaCep();
  }

  public void gravarPessoaFisica(String nome, String cep, String endereco, String numero, String codiCidade, String nomeCidade, String estado,String bairro,String complemento, String rg, String cpf, String foneFixo, String celular, String email, String coditien,String tien, String observacao) throws ClassNotFoundException, SQLException
  {
    //Prog0006Vo pessoaFisicaG = new Prog0006Vo();
    prog0006Vo.setDescricao(nome);
    prog0006Vo.setCep(cep);
    prog0006Vo.setEndereco(endereco);
    prog0006Vo.setNumero(numero);
    prog0006Vo.setCodiCida(codiCidade);
    prog0006Vo.setNomeCida(nomeCidade);
    prog0006Vo.setEstado(estado);
    prog0006Vo.setBairro(bairro);
    prog0006Vo.setComplemento(complemento);
    prog0006Vo.setRg(rg);
    prog0006Vo.setCpf(cpf);
    prog0006Vo.setFoneFixo(foneFixo);
    prog0006Vo.setCelular(celular);
    prog0006Vo.setEmail(email);
    prog0006Vo.setCodiTien(coditien);
    prog0006Vo.setTien(tien);
    prog0006Vo.setObservacao(observacao);
    
    Prog0006Dao gravaFisica = new Prog0006Dao(prog0006Vo);
    gravaFisica.gravarPessoaFisca();
  }

  public void editarPessoa(String codigo, String nome, String nasc, String profi,String cep, String endereco, String numero, String codiCidade, String nomeCidade, String estado,String bairro,String complemento, String rg, String cpf, String foneFixo, String celular, String email,String codiTien,String tien, String observacao) throws ClassNotFoundException, SQLException, ClassNotFoundException, ClassNotFoundException, ClassNotFoundException 
  {
    Prog0006Vo pessoaFisicaE = new Prog0006Vo();
    pessoaFisicaE.setCodigo(codigo);
    pessoaFisicaE.setDescricao(nome);
    pessoaFisicaE.setNascionalidade(nasc);
    pessoaFisicaE.setProfissao(profi);
    pessoaFisicaE.setCep(cep);
    pessoaFisicaE.setEndereco(endereco);
    pessoaFisicaE.setNumero(numero);
    pessoaFisicaE.setCodiCida(codiCidade);
    pessoaFisicaE.setNomeCida(nomeCidade);
    pessoaFisicaE.setEstado(estado);
    pessoaFisicaE.setBairro(bairro);
    pessoaFisicaE.setComplemento(complemento);
    pessoaFisicaE.setRg(rg);
    pessoaFisicaE.setCpf(cpf);
    pessoaFisicaE.setFoneFixo(foneFixo);
    pessoaFisicaE.setCelular(celular);
    pessoaFisicaE.setEmail(email);
    pessoaFisicaE.setCodiTien(codiTien);
    pessoaFisicaE.setTien(tien);
    pessoaFisicaE.setObservacao(observacao);
    
    System.out.println(prog0006Vo.getNascionalidade());
    System.out.println(prog0006Vo.getProfissao());
    System.out.println(prog0006Vo.getCodiTien());
    System.out.println(prog0006Vo.getTien());
    
    Prog0006Dao editaFisica = new Prog0006Dao(pessoaFisicaE);
    editaFisica.editarPessoaFisca();
  }

  public void excluirPessoa(String codigo) throws ClassNotFoundException, SQLException 
  {
    Prog0006Vo pessoaFisicaD = new Prog0006Vo();
    pessoaFisicaD.setCodigo(codigo);
    
    Prog0006Dao pessoaD = new Prog0006Dao(pessoaFisicaD);
    pessoaD.excluirPessoaFisica();
  }  
}