package Bonus;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sugerencias {
  private List<Uniforme> uniformesArmados;

  public void agregarUniformes(Uniforme ... uniformes){
    Collections.addAll(this.uniformesArmados, uniformes);
  }

  public Uniforme uniformeSugerido() {
    if(uniformesArmados.size() == 0){
      throw new NoHayUniformesArmadosException("No encontramos sugerencias de uniformes");
    }
    Random randomGenerator = new Random();
    int index = randomGenerator.nextInt(uniformesArmados.size());
    return uniformesArmados.get(index);
  }

}
