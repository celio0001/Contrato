package controle;

import java.util.List;
import vo.Prog0006Vo;
import vo.Prog0009Vo;
import vo.Prog0009_ListaPessoaFisicaFachada;

public class Prog0009Control 
{
   private final Prog0009_ListaPessoaFisicaFachada facadePessoaFisca;
  Prog0006Vo prog0006Vo = new Prog0006Vo();
  
  public Prog0009Control()
  {
    this.facadePessoaFisca = new Prog0009_ListaPessoaFisicaFachada();
  }
  
  public List<Prog0009Vo> findPessoaFisica() 
  {
    return facadePessoaFisca.findPessoaFisica();
  }

}
