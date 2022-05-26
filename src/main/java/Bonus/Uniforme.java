package Bonus;

import Qmp2.Prenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uniforme {
  private List<Prenda> prendas = new ArrayList<>();

  public Uniforme(List<Prenda> prendas){
    this.prendas = prendas;
  }
  public List<Prenda> getPrendas() {
    return prendas;
  }
}
