import java.util.ArrayList;
import java.util.List;

public class Assunto {
  String nome;
  protected List <Aula> aulas = new ArrayList<>();
  
  public List<Aula> getAulas() {
    System.out.println(this.nome.concat(": "));
    for (Aula aula : aulas) {
      for (int i = 0; i < aulas.size(); i++) {
        System.out.println("- " + aula.nome);
      }
    }
    return aulas;
  }

  public void setAulas(Aula aula) {
    this.aulas.add(aula);
  }
}