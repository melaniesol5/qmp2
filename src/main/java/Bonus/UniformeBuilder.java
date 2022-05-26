package Bonus;

import Qmp2.Categoria;
import Qmp2.Prenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniformeBuilder {

  List<Prenda> prendas = new ArrayList<>();

  public UniformeBuilder agregarPrenda(Prenda ... prendas){
    Collections.addAll(this.prendas, prendas);
    return this;
  }

  public Uniforme crearUniforme(){
    if(!this.validarUniforme()) {
      throw new UniformeInvalidoException("No se ha podido crear el uniforme.");
    }
    return new Uniforme(this.prendas);
  }

  private Boolean validarUniforme() {
    return this.existe(Categoria.PARTEINFERIOR)
        && this.existe(Categoria.PARTESUPERIOR)
        && this.existe(Categoria.CALZADO);
  }
  private Boolean existe(Categoria cat){
    return this.prendas.stream().map(prenda -> prenda.getTipo().getCategoria()).anyMatch(categoria -> categoria == cat);
  }

}
