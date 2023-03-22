import java.util.ArrayList;
import java.util.List;

public class Disciplina{
  String nome;
  private List <Assunto> assuntos = new ArrayList<>();

  public void getAssuntos() {
    System.out.println(this.nome.concat(": "));
    for (Assunto assunto : assuntos) {
      for (int i = 0; i < assuntos.size(); i++) {
        System.out.println("- " + assunto.nome);
      }
    }
  }

  public void setAssuntos(Assunto assunto) {
    this.assuntos.add(assunto);
  }
}