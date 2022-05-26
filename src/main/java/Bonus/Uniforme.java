package Bonus;

import Qmp2.Prenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uniforme {
  private List<Prenda> prendas = new ArrayList<>();

  public static Uniforme crearNuevoUniforme(List<Prenda> prendas){
    Uniforme uniforme = new Uniforme();
    uniforme.prendas = prendas;
    return uniforme;
  }
  public List<Prenda> getPrendas() {
    return prendas;
  }
}
