package Bonus;

public class Institucion {
  private Clase clase;
  private String nombre;
  private Uniforme uniforme;

  Institucion(String nombre, Clase clase){
    this.nombre = nombre;
    this.clase = clase;
  }

  public void asignarUniforme(Uniforme uniforme){
    this.uniforme = uniforme;
  }
}
