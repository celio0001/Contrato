package controle;

import dao.Prog0006Dao;
import java.sql.SQLException;
import java.util.List;
import vo.Prog0006Vo;
import vo.Prog0006_ListaPessoaFisicaFachada;

public class Prog0006Control 
{
  private final Prog0006_ListaPessoaFisicaFachada  facadePessoaFisica;
  
  public Prog0006Control() 
  {
   this.facadePessoaFisica = new Prog0006_ListaPessoaFisicaFachada();
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

  public void gravarPessoaFisica(String nome, String cep, String endereco, String numero, String codiCidade, String nomeCidade, String estado,String bairro,String complemento, String rg, String cpf, String foneFixo, String celular, String email, String observacao) throws ClassNotFoundException, SQLException
  {
    Prog0006Vo pessoaFisicaG = new Prog0006Vo();
    pessoaFisicaG.setDescricao(nome);
    pessoaFisicaG.setCep(cep);
    pessoaFisicaG.setEndereco(endereco);
    pessoaFisicaG.setNumero(numero);
    pessoaFisicaG.setCodiCida(codiCidade);
    pessoaFisicaG.setNomeCida(nomeCidade);
    pessoaFisicaG.setEstado(estado);
    pessoaFisicaG.setBairro(bairro);
    pessoaFisicaG.setComplemento(complemento);
    pessoaFisicaG.setRg(rg);
    pessoaFisicaG.setCpf(cpf);
    pessoaFisicaG.setFoneFixo(foneFixo);
    pessoaFisicaG.setCelular(celular);
    pessoaFisicaG.setEmail(email);
    pessoaFisicaG.setObservacao(observacao);
    
    Prog0006Dao gravaFisica = new Prog0006Dao(pessoaFisicaG);
    gravaFisica.gravarPessoaFisca();
  }

  public void editarPessoa(String codigo, String nome, String cep, String endereco, String numero, String codiCidade, String nomeCidade, String estado,String bairro,String complemento, String rg, String cpf, String foneFixo, String celular, String email, String observacao) throws ClassNotFoundException, SQLException, ClassNotFoundException, ClassNotFoundException, ClassNotFoundException 
  {
    Prog0006Vo pessoaFisicaE = new Prog0006Vo();
    pessoaFisicaE.setCodigo(codigo);
    pessoaFisicaE.setDescricao(nome);
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
    pessoaFisicaE.setObservacao(observacao);
    
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

  public List<Prog0006Vo> findPessoaFisica() 
  {
    return facadePessoaFisica.findPessoaFisica();
  }
}
