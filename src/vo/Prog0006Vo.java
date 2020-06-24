package vo;

import dao.Prog0006Dao;

public class Prog0006Vo 
{
  //  COMUM NAS TELAS
  private String codigo;
  private String descricao;
  //TELA PESSOA FISICA
  private String endereco;
  private String numero;
  private String cep;
  private String cpf;
  private String codiCida;
  private String nomeCida;
  private String estado;
  private String foneFixo;
  private String celular;
  private String email;
  private String observacao; 
  private String bairro;
  private String rg;
  private String complemento;
  private String nascionalidade;
  private String profissao;
  private String codiTien;
  private String tien;
  private String estadoCivil;

  public String getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(String EstadoCivil) {
    this.estadoCivil = EstadoCivil;
  }
  
  
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String Codigo) {
    this.codigo = Codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String Descricao) {
    this.descricao = Descricao;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String Endereco) {
    this.endereco = Endereco;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String Numero) {
    this.numero = Numero;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String Cpf) {
    this.cpf = Cpf;
  }

  public String getCodiCida() {
    return codiCida;
  }

  public void setCodiCida(String CodiCida) {
    this.codiCida = CodiCida;
  }

  public String getNomeCida() {
    return nomeCida;
  }

  public void setNomeCida(String NomeCida) {
    this.nomeCida = NomeCida;
  }

  public String getFoneFixo() {
    return foneFixo;
  }

  public void setFoneFixo(String FoneFixo) {
    this.foneFixo = FoneFixo;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String Celular) {
    this.celular = Celular;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String Email) {
    this.email = Email;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String Observacao) {
    this.observacao = Observacao;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String Estado) {
    this.estado = Estado;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String Bairro) {
    this.bairro = Bairro;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String Rg) {
    this.rg = Rg;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String Complemento) {
    this.complemento = Complemento;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String Cep) {
    this.cep = Cep;
  } 

  public String getNascionalidade() {
    return nascionalidade;
  }

  public void setNascionalidade(String Nascionalidade) {
    this.nascionalidade = Nascionalidade;
  }

  public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String Profissao) {
    this.profissao = Profissao;
  }

  public String getCodiTien() {
    return codiTien;
  }

  public void setCodiTien(String CodiTien) {
    this.codiTien = CodiTien;
  }

  public String getTien() {
    return tien;
  }

  public void setTien(String Tien) {
    this.tien = Tien;
  }
}
