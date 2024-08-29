package utils;

import java.util.*;

import controllers.Caracteristica;
import controllers.Filtro;

public class Pergunta {
  private String texto;
  private String caracteristica;

  public Pergunta(String texto, String caracteristica) {
    this.texto = texto;
    this.caracteristica = caracteristica;
  }

  public String getTexto() {
    return texto;
  }

  public String getCaracteristica() {
    return caracteristica;
  }

  public static List<Pergunta> obterPerguntasRelevantes(List<Caracteristica> personagens, int perguntasFeitas,
      Caracteristica personagemDescoberto) {
    List<Pergunta> todasPerguntas = criarListaPerguntas();
    List<Pergunta> perguntasRelevantes = new ArrayList<>();

    if (perguntasFeitas < 10 || (perguntasFeitas >= 10 && personagemDescoberto == null)) {
      if (personagens.size() == 1 || personagemDescoberto != null) {
        // Se sobrou apenas 1 personagem ou já descobrimos o personagem, mas ainda não
        // fizemos 10 perguntas,
        // retorna perguntas aleatórias
        Collections.shuffle(todasPerguntas);
        return todasPerguntas.subList(0, Math.min(10 - perguntasFeitas, todasPerguntas.size()));
      }

      for (Pergunta pergunta : todasPerguntas) {
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

  private static boolean perguntaERelevante(Pergunta pergunta, List<Caracteristica> personagens) {
    boolean temVerdadeiro = false;
    boolean temFalso = false;

    for (Caracteristica p : personagens) {
      boolean valor = Filtro.getCaracteristica(p, pergunta.getCaracteristica());
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

  private static double calcularEntropiaInformacao(Pergunta pergunta, List<Caracteristica> personagens) {
    int total = personagens.size();
    int verdadeiros = 0;

    for (Caracteristica p : personagens) {
      if (Filtro.getCaracteristica(p, pergunta.getCaracteristica())) {
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

  public static List<Pergunta> criarListaPerguntas() {
    List<Pergunta> perguntas = new ArrayList<>();
    // Perguntas especificas para Dragon Ball z
    perguntas.add(new Pergunta("O personagem é homem?", "masculino"));
    perguntas.add(new Pergunta("O personagem é mulher?", "feminino"));
    perguntas.add(new Pergunta("O personagem tem sexo indefinido?", "indefinido"));

    perguntas.add(new Pergunta("O personagem tem filho(s)?", "tem filho"));
    perguntas.add(new Pergunta("O personagem tem irmão(s)?", "tem irmao"));

    perguntas.add(new Pergunta("O personagem é de um anime Japonês?", "animeJapones"));
    perguntas.add(new Pergunta("O personagem é de um anime Chinês?", "animeChines"));
    perguntas.add(new Pergunta("O personagem tem origem Inglesa", "Inglesa"));

    perguntas.add(new Pergunta("O personagem é um herói?", "heroi"));
    perguntas.add(new Pergunta("O personagem é um vilão?", "vilao"));
    perguntas.add(new Pergunta("O personagem é um anti-herói?", "anti-heroi"));
    perguntas.add(new Pergunta("O personagem é neutro?", "neutro"));
    perguntas.add(new Pergunta("O personagem é protagonista?", "protagonista"));
    perguntas.add(new Pergunta("O personagem é co-protagonista?", "co-protagonista"));
    perguntas.add(new Pergunta("O personagem é antagonista?", "antagonista"));
    perguntas.add(new Pergunta("O personagem é coadjuvante?", "coadjuvante"));
    perguntas.add(new Pergunta("O personagem é figurante", "figurante"));

    perguntas.add(new Pergunta("O personagem tem transformação?", "tem transformacao"));

    perguntas.add(new Pergunta("O personagem tem poder?", "tem poder"));
    perguntas.add(new Pergunta("O personagem usa ki?", "ki"));
    perguntas.add(new Pergunta("O personagem usa cosmo?", "cosmo"));
    perguntas.add(new Pergunta("O personagem usa magia?", "magia"));
    perguntas.add(new Pergunta("O personagem usa mana?", "mana"));

    perguntas.add(new Pergunta("O personagem tem caráter?", "carater"));
    perguntas.add(new Pergunta("O personagem é inteligente?", "inteligente"));
    perguntas.add(new Pergunta("O personagem é estrategista?", "estrategista"));
    perguntas.add(new Pergunta("O personagem é safado", "safado"));
    perguntas.add(new Pergunta("O personagem é arrogante", "arrogante"));
    perguntas.add(new Pergunta("O personagem é manipulador?", "manipulador"));

    perguntas.add(new Pergunta("O personagem é da raça saiyajin?", "saiyajin"));
    perguntas.add(new Pergunta("O personagem é da raça humano?", "humano"));
    perguntas.add(new Pergunta("O personagem é da raça android?", "android"));
    perguntas.add(new Pergunta("O personagem é da raça namekuseijin?", "namekuseijin"));
    perguntas.add(new Pergunta("O personagem é da raça freeza", "freeza"));
    perguntas.add(new Pergunta("O personagem é da raça kaioshin", "kaioshin"));
    perguntas.add(new Pergunta("O personagem é da raça anjo", "anjo"));
    perguntas.add(new Pergunta("O personagem é da raça hakaishin", "hakaishin"));
    perguntas.add(new Pergunta("O personagem é da raça majin", "majin"));
    perguntas.add(new Pergunta("O personagem é da raça alienigena", "alienigena"));

    perguntas.add(new Pergunta("O personagem tem cicatriz", "cicatriz"));

    // Perguntas especificas para Sololeveling
    perguntas.add(new Pergunta("O personagem é um líder?", "lider"));
    perguntas.add(new Pergunta("O personagem é uma caçador?", "cacador"));
    perguntas.add(new Pergunta("O personagem é um monarca?", "monarca"));
    perguntas.add(new Pergunta("O personagem é um governante?", "governante"));
    perguntas.add(new Pergunta("O personagem tem rank Nacional?", "nacional"));
    perguntas.add(new Pergunta("O personagem tem rank S?", "S"));
    perguntas.add(new Pergunta("O personagem tem rank A", "A"));
    perguntas.add(new Pergunta("O personagem tem rank B", "B"));
    perguntas.add(new Pergunta("O personagem tem rank C", "C"));
    perguntas.add(new Pergunta("O personagem tem rank D", "D"));
    perguntas.add(new Pergunta("O personagem tem rank E", "E"));
    perguntas.add(new Pergunta("O personagem usa o elemento trevas?", "trevas"));
    perguntas.add(new Pergunta("O personagem usa o elemento luz?", "luz"));
    perguntas.add(new Pergunta("O personagem usa o elemento vento?", "vento"));
    perguntas.add(new Pergunta("O personagem usa o elemento fogo?", "fogo"));
    perguntas.add(new Pergunta("O personagem usa o elemento agua?", "agua"));
    perguntas.add(new Pergunta("O personagem pode invocar?", "podeInvocar"));
    perguntas.add(new Pergunta("O personagem tem todos os poderes?", "tudo"));
    perguntas.add(new Pergunta("O personagem é um espadachim?", "espadachim"));
    perguntas.add(new Pergunta("O personagem é um mago?", "mago"));
    perguntas.add(new Pergunta("O personagem é um lutador?", "lutador"));
    perguntas.add(new Pergunta("O personagem é um tank?", "tank"));
    perguntas.add(new Pergunta("O personagem é um arqueiro?", "arqueiro"));
    perguntas.add(new Pergunta("O personagem é um assassino?", "assassino"));
    perguntas.add(new Pergunta("O personagem é um curandeiro?", "curandeiro"));
    perguntas.add(new Pergunta("O personagem é um suporte?", "suporte"));

    // Perguntas especificas para Cavaleiros do Zodiaco
    perguntas.add(new Pergunta("O personagem é de Cavaleiro é do signo de pegaso", "signoPegaso"));
    perguntas.add(new Pergunta("O personagem é de Cavaleiro é do signo de dragão", "signoDragao"));
    perguntas.add(new Pergunta("O personagem é de Cavaleiro usa armadura de bronze", "armaduraBronze"));
    // Perguntas especificas para Harry Potter
    perguntas.add(new Pergunta("O personagem é de Harry Potter?", "HarryPotter"));
    perguntas.add(new Pergunta("O personagem é de Grifinória?", "casaGrifinoria"));
    perguntas.add(new Pergunta("O personagem é de Corvinal?", "casaCorvinal"));
    perguntas.add(new Pergunta("O personagem tem animal de estimação?", "animalEstimacao"));
    perguntas.add(new Pergunta("O personagem é ancestral de Salazar Slytherin?", "ancestralSalazar"));
    perguntas.add(new Pergunta("O personagem esteve na Câmara Secreta?", "esteveNaCamaraSecreta"));
    perguntas.add(new Pergunta("Os pais do personagem são trouxas?", "paisTrouxas"));

    return perguntas;
  }

  public static boolean continuarPerguntando(List<Caracteristica> personagens, int perguntasFeitas,
      Caracteristica personagemDescoberto) {
    return perguntasFeitas < 10 || (perguntasFeitas >= 10 && personagemDescoberto == null);
  }
}