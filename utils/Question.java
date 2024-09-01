package utils;

import java.util.*;

import controllers.Features;
import controllers.Filter;

public class Question {
  private String Pergunta;
  private String caracteristica;

  public Question(String Pergunta, String caracteristica) {
    this.Pergunta = Pergunta;
    this.caracteristica = caracteristica;
  }

  public String getPergunta() {
    return Pergunta;
  }

  public String getFeatures() {
    return caracteristica;
  }

  public static List<Question> obterPerguntasRelevantes(List<Features> personagens, int perguntasFeitas,
      Features personagemDescoberto) {
    List<Question> todasPerguntas = criarListaPerguntas();
    List<Question> perguntasRelevantes = new ArrayList<>();

    if (perguntasFeitas < 6 || (perguntasFeitas >= 6 && personagemDescoberto == null)) {
      if (personagens.size() == 1 || personagemDescoberto != null) {
        // Se sobrou apenas 1 personagem ou já descobrimos o personagem, mas ainda não
        // fizemos 6 perguntas,
        // retorna perguntas aleatórias
        Collections.shuffle(todasPerguntas);
        return todasPerguntas.subList(0, Math.min(6 - perguntasFeitas, todasPerguntas.size()));
      }

      for (Question pergunta : todasPerguntas) {
        if (perguntaERelevante(pergunta, personagens)) {
          perguntasRelevantes.add(pergunta);
        }
      }

      perguntasRelevantes.sort((p1, p2) -> Double.compare(
          calcularEntropiaInformacao(p2, personagens),
          calcularEntropiaInformacao(p1, personagens)));
    }

    return perguntasRelevantes;
  }

  private static boolean perguntaERelevante(Question pergunta, List<Features> personagens) {
    boolean temVerdadeiro = false;
    boolean temFalso = false;

    for (Features p : personagens) {
      boolean valor = Filter.getFeatures(p, pergunta.getFeatures());
      if (valor) {
        temVerdadeiro = true;
      } else {
        temFalso = true;
      }

      if (temVerdadeiro && temFalso) {
        return true;
      }
    }

    return false;
  }

  private static double calcularEntropiaInformacao(Question pergunta, List<Features> personagens) {
    int total = personagens.size();
    int verdadeiros = 0;

    for (Features p : personagens) {
      if (Filter.getFeatures(p, pergunta.getFeatures())) {
        verdadeiros++;
      }
    }

    double proporcaoVerdadeiros = (double) verdadeiros / total;
    double proporcaoFalsos = 1 - proporcaoVerdadeiros;

    if (proporcaoVerdadeiros == 0 || proporcaoFalsos == 0) {
      return 0;
    }

    return -proporcaoVerdadeiros * Math.log(proporcaoVerdadeiros) / Math.log(2)
        - proporcaoFalsos * Math.log(proporcaoFalsos) / Math.log(2);
  }

  public static List<Question> criarListaPerguntas() {
    List<Question> perguntas = new ArrayList<>();
    // Perguntas especificas para Dragon Ball z
    perguntas.add(new Question("O personagem é homem?", "masculino"));
    perguntas.add(new Question("O personagem é mulher?", "feminino"));
    perguntas.add(new Question("O personagem tem sexo indefinido?", "indefinido"));

    perguntas.add(new Question("O personagem tem filho(s)?", "tem filho"));
    perguntas.add(new Question("O personagem tem irmão(s)?", "tem irmao"));

    perguntas.add(new Question("O personagem é de um anime Japonês?", "animeJapones"));
    perguntas.add(new Question("O personagem é de um anime Chinês?", "animeChines"));
    perguntas.add(new Question("O personagem tem origem Inglesa", "Inglesa"));

    perguntas.add(new Question("O personagem é um herói?", "heroi"));
    perguntas.add(new Question("O personagem é um vilão?", "vilao"));
    perguntas.add(new Question("O personagem é um anti-herói?", "anti-heroi"));
    perguntas.add(new Question("O personagem é neutro?", "neutro"));
    perguntas.add(new Question("O personagem é protagonista?", "protagonista"));
    perguntas.add(new Question("O personagem é co-protagonista?", "co-protagonista"));
    perguntas.add(new Question("O personagem é antagonista?", "antagonista"));
    perguntas.add(new Question("O personagem é coadjuvante?", "coadjuvante"));
    perguntas.add(new Question("O personagem é figurante", "figurante"));

    perguntas.add(new Question("O personagem tem transformação?", "tem transformacao"));

    perguntas.add(new Question("O personagem tem poder?", "tem poder"));
    perguntas.add(new Question("O personagem usa ki?", "ki"));
    perguntas.add(new Question("O personagem usa cosmo?", "cosmo"));
    perguntas.add(new Question("O personagem usa magia?", "magia"));
    perguntas.add(new Question("O personagem usa mana?", "mana"));

    perguntas.add(new Question("O personagem tem caráter?", "carater"));
    perguntas.add(new Question("O personagem é inteligente?", "inteligente"));
    perguntas.add(new Question("O personagem é estrategista?", "estrategista"));
    perguntas.add(new Question("O personagem é safado", "safado"));
    perguntas.add(new Question("O personagem é arrogante", "arrogante"));
    perguntas.add(new Question("O personagem é manipulador?", "manipulador"));

    perguntas.add(new Question("O personagem é da raça saiyajin?", "saiyajin"));
    perguntas.add(new Question("O personagem é da raça humano?", "humano"));
    perguntas.add(new Question("O personagem é da raça android?", "android"));
    perguntas.add(new Question("O personagem é da raça namekuseijin?", "namekuseijin"));
    perguntas.add(new Question("O personagem é da raça freeza", "freeza"));
    perguntas.add(new Question("O personagem é da raça kaioshin", "kaioshin"));
    perguntas.add(new Question("O personagem é da raça anjo", "anjo"));
    perguntas.add(new Question("O personagem é da raça hakaishin", "hakaishin"));
    perguntas.add(new Question("O personagem é da raça majin", "majin"));
    perguntas.add(new Question("O personagem é da raça alienigena", "alienigena"));

    perguntas.add(new Question("O personagem tem cicatriz", "cicatriz"));

    // Perguntas especificas para Sololeveling
    perguntas.add(new Question("O personagem é um líder?", "lider"));
    perguntas.add(new Question("O personagem é uma caçador?", "cacador"));
    perguntas.add(new Question("O personagem é um monarca?", "monarca"));
    perguntas.add(new Question("O personagem é um governante?", "governante"));
    perguntas.add(new Question("O personagem tem rank Nacional?", "nacional"));
    perguntas.add(new Question("O personagem tem rank S?", "S"));
    perguntas.add(new Question("O personagem tem rank A", "A"));
    perguntas.add(new Question("O personagem tem rank B", "B"));
    perguntas.add(new Question("O personagem tem rank C", "C"));
    perguntas.add(new Question("O personagem tem rank D", "D"));
    perguntas.add(new Question("O personagem tem rank E", "E"));

    perguntas.add(new Question("O personagem pode invocar?", "podeInvocar"));
    perguntas.add(new Question("O personagem tem todos os poderes?", "tudo"));
    perguntas.add(new Question("O personagem é um espadachim?", "espadachim"));
    perguntas.add(new Question("O personagem é um mago?", "mago"));
    perguntas.add(new Question("O personagem é um lutador?", "lutador"));
    perguntas.add(new Question("O personagem é um tank?", "tank"));
    perguntas.add(new Question("O personagem é um arqueiro?", "arqueiro"));
    perguntas.add(new Question("O personagem é um assassino?", "assassino"));
    perguntas.add(new Question("O personagem é um curandeiro?", "curandeiro"));
    perguntas.add(new Question("O personagem é um suporte?", "suporte"));

    // Perguntas especificas para Cavaleiros do Zodiaco
    perguntas.add(new Question("O personagem é de Cavaleiro é do signo de pegaso", "signoPegaso"));
    perguntas.add(new Question("O personagem é de Cavaleiro é do signo de dragão", "signoDragao"));
    perguntas.add(new Question("O personagem é de Cavaleiro usa armadura de bronze", "armaduraBronze"));
    // Perguntas especificas para Harry Potter
    perguntas.add(new Question("O personagem é de Harry Potter?", "HarryPotter"));
    perguntas.add(new Question("O personagem é de Grifinória?", "casaGrifinoria"));
    perguntas.add(new Question("O personagem é de Corvinal?", "casaCorvinal"));
    perguntas.add(new Question("O personagem tem animal de estimação?", "animalEstimacao"));
    perguntas.add(new Question("O personagem é ancestral de Salazar Slytherin?", "ancestralSalazar"));
    perguntas.add(new Question("O personagem esteve na Câmara Secreta?", "esteveNaCamaraSecreta"));
    perguntas.add(new Question("Os pais do personagem são trouxas?", "paisTrouxas"));

    return perguntas;
  }

  public static boolean continuarPerguntando(List<Features> personagens, int perguntasFeitas,
      Features personagemDescoberto) {
    return perguntasFeitas < 6 || (perguntasFeitas >= 6 && personagemDescoberto == null);
  }
}