package Qmp2;

import Qmp2.Categoria;

public enum TipoPrenda {
  POLLERA(Categoria.PARTEINFERIOR),
  PANTALON(Categoria.PARTEINFERIOR),
  REMERA(Categoria.PARTESUPERIOR),
  CAMISA(Categoria.PARTESUPERIOR),
  ZAPATILLAS(Categoria.CALZADO),
  ZAPATOS(Categoria.CALZADO),
  BUFANDA(Categoria.ACCESORIO),
  BLUSA(Categoria.PARTESUPERIOR),
  CHOMBA(Categoria.PARTESUPERIOR);

  private final Categoria categoria;

  private TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

}
