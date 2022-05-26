package Qmp2;

import Qmp2.Color;
import Qmp2.Material;

public class Prenda {
  private TipoPrenda tipo;
  private Material material;
  private Trama trama;
  private Color colorPrincipal;
  private Color colorSecundario;

  public static Prenda crearNuevaPrenda(TipoPrenda tipo, Material material, Trama trama, Color colorPrincipal, Color colorSecundario ) {
    Prenda prenda = new Prenda();
    prenda.tipo = tipo;
    prenda.material = material;
    prenda.trama = trama;
    prenda.colorPrincipal = colorPrincipal;
    prenda.colorSecundario = colorSecundario;
    return prenda;
  }

  public TipoPrenda getTipo(){
    return this.tipo;
  }
}
