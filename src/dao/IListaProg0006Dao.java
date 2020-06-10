package dao;

import java.util.List;
import vo.CidadeVo;
import vo.Prog0006Vo;

public interface IListaProg0006Dao 
{

  public List<Prog0006Vo> findPessoaFisica();
  public List<CidadeVo> findCidade();

}
