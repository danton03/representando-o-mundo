import java.util.ArrayList;
import java.util.List;

public class Disciplina{
  String nome;
  private List <String> conteudos = new ArrayList<>();

  public String getConteudos() {
    String ListaDeConteudos = this.nome+": ";
    for (int i = 0; i < conteudos.size(); i++) {
      ListaDeConteudos += "\n- " + conteudos.get(i);
    }
    return ListaDeConteudos;
  }

  public Disciplina(String nome, List<String> conteudos) {
    this.nome = nome;
    this.conteudos = conteudos;
  }

}