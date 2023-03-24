import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Disciplina> disciplinas = new ArrayList<>();

    public static void main(String[] args) throws Exception {
       for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getConteudos());
        } 
    }

    public App() {
        gerarDisciplinasEConteudo();
    }

    void gerarDisciplinasEConteudo(){
        List<String> disciplinasDeCalculo = new ArrayList<>();
        disciplinasDeCalculo.add("Limite");
        disciplinasDeCalculo.add("Derivada");
        disciplinasDeCalculo.add("Integral");

        List<String> disciplinasDeFisica = new ArrayList<>();
        disciplinasDeFisica.add("Leis de Newton");
        disciplinasDeFisica.add("Estática");
        disciplinasDeFisica.add("Eletricidade");
        
        Disciplina calculo = new Disciplina("cálculo", disciplinasDeCalculo);
        Disciplina fisica = new Disciplina("física", disciplinasDeFisica);

        disciplinas.add(calculo);
        disciplinas.add(fisica);
    }
}
