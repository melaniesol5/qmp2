package Qmp2;

import Qmp2.Color;
import Qmp2.Material;

public class Prenda {
  private TipoPrenda tipo;
  private Material material;
  private Trama trama;
  private Color colorPrincipal;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipo, Material material, Trama trama, Color colorPrincipal, Color colorSecundario ) {
    this.tipo = tipo;
    this.material = material;
    this.trama = trama;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  public TipoPrenda getTipo(){
    return this.tipo;
  }
}
