package control;

import java.util.List;
import vo.Prog0005Vo;
import vo.Prog0007_ListaTipoEntidadeFachada;
import vo.TipoEntidadeVo;

public class TipoEntidadeControl 
{
  private final Prog0007_ListaTipoEntidadeFachada facadeTipoEnti;
  
  public TipoEntidadeControl()
  {
    this.facadeTipoEnti = new Prog0007_ListaTipoEntidadeFachada();
  }

  public List<Prog0005Vo> findTipoEnti() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  
  

}
