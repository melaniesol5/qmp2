package Bonus;

import Qmp2.*;

public class Administrador {

  public void construirUniformeParaColegioSanJuan(UniformeBuilder creadorDeUniforme){
    Color Blanco = new Color("#fff");
    Color Gris = new Color("#6b6e6c");
    Color Verde = new Color("#58eb34");

    Prenda chombaPiqueverde = this.crearPrenda(TipoPrenda.CHOMBA,Material.PIQUE,null, Verde, null);
    Prenda pantalonAcetatoGris =this.crearPrenda(TipoPrenda.PANTALON,Material.ACETATO,null, Gris, null);
    Prenda zapatillasBlancas = this.crearPrenda(TipoPrenda.ZAPATILLAS,Material.CUERO,null, Blanco, null);


    Uniforme uniformeSanJuan = creadorDeUniforme.agregarPrenda(chombaPiqueverde, pantalonAcetatoGris, zapatillasBlancas).crearUniforme();

    Institucion sanJuan = new Institucion("San Juan", Clase.PUBLICA);
    sanJuan.asignarUniforme(uniformeSanJuan);

  }

  public void construirParaElInstitutoJohnson(UniformeBuilder creadorDeUniforme) {
    Color Blanco = new Color("#fff");
    Color Negro = new Color("#000");
    Prenda camisaBlanca = this.crearPrenda(TipoPrenda.CAMISA,Material.SEDA,null, Blanco, null);
    Prenda pantalonDeVestirNegro = this.crearPrenda(TipoPrenda.PANTALON,Material.GABARDINA,null, Negro, null);
    Prenda zapatosNegros = this.crearPrenda(TipoPrenda.ZAPATOS,Material.CUERO,null, Negro, null);

    Uniforme uniformeInstitutoJohnson = creadorDeUniforme.agregarPrenda(camisaBlanca, pantalonDeVestirNegro, zapatosNegros).crearUniforme();

    Institucion institutoJohnson = new Institucion("instituto Johnson", Clase.PRIVADA);
    institutoJohnson.asignarUniforme(uniformeInstitutoJohnson);

  }

  public Prenda crearPrenda(TipoPrenda tipo, Material material, Trama trama, Color colorp, Color colors) {
    Borrador borrador = new Borrador();
    borrador = borrador.setTipoPrenda(tipo).setMaterial(material).setColorPrincipal(colorp);
    if (trama != null){
      borrador.setTrama(trama);
    }
    if(colors != null){
      borrador.setColorSecundario(colors);
    }
    return borrador.crearPrenda();
  }

}
