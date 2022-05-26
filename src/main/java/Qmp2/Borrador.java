package Qmp2;

import static java.util.Objects.requireNonNull;

public class Borrador {
  private TipoPrenda tipo;
  private Material material;
  private Trama trama;
  private Color colorPrincipal;
  private Color colorSecundario;

  public Borrador(){
    this.trama = Trama.LISA;
  }
  public Borrador setTipoPrenda(TipoPrenda tipo){
    this.tipo = tipo;
    return this;
  }
  public Borrador setMaterial(Material material){
    this.material = material;
    return this;
  }
  public Borrador setTrama(Trama trama){
    this.trama = trama;
    return this;
  }
  public Borrador setColorPrincipal(Color colorPrincipal){
    this.colorPrincipal = colorPrincipal;
    return this;
  }
  public Borrador setColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
    return this;
  }
  private void validarPrenda(){
    requireNonNull(tipo, "tipo no deberia ser null");
    requireNonNull(material, "material no deberia ser null");
    requireNonNull(trama, "trama no deberia ser null");
    requireNonNull(colorPrincipal, "colorPrincipal no deberia ser null");
  }
  public Prenda crearPrenda() {
    this.validarPrenda();
    return new Prenda(tipo, material, trama, colorPrincipal,colorSecundario);
  }
}
