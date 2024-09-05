package src.utils;

import java.util.*;
import src.controllers.Features;
import src.controllers.Filter1;

public class Question {
  private String pergunta;
  private String caracteristica;
  private boolean isSpecific;

  public Question(String pergunta, String caracteristica, boolean isSpecific) {
    this.pergunta = pergunta;
    this.caracteristica = caracteristica;
    this.isSpecific = isSpecific;
  }

  public String getPergunta() {
    return pergunta;
  }

  public String getFeatures() {
    return caracteristica;
  }

  public boolean isSpecific() {
    return isSpecific;
  }

  public static List<Question> obterPerguntasRelevantes(List<Features> personagens, Set<String> perguntasFeitas) {
    List<Question> todasPerguntas = criarListaPerguntas();
    List<Question> perguntasRelevantes = new ArrayList<>();

    for (Question pergunta : todasPerguntas) {
      if (!perguntasFeitas.contains(pergunta.getPergunta()) && perguntaERelevante(pergunta, personagens)) {
        perguntasRelevantes.add(pergunta);
      }
    }

    perguntasRelevantes.sort((p1, p2) -> Double.compare(
        calcularEntropiaInformacao(p2, personagens),
        calcularEntropiaInformacao(p1, personagens)));

    return perguntasRelevantes;
  }

  public static List<Question> obterPerguntasEspecificasPersonagem(Features personagem, Set<String> perguntasFeitas) {
    List<Question> todasPerguntas = criarListaPerguntas();
    List<Question> perguntasEspecificas = new ArrayList<>();

    for (Question pergunta : todasPerguntas) {
      if (!perguntasFeitas.contains(pergunta.getPergunta())) {
        boolean respostaPergunta = Filter1.getFeatures(personagem, pergunta.getFeatures());
        String perguntaFormatada = String.format("O personagem %s %s?",
            respostaPergunta ? "" : "não",
            pergunta.getPergunta().toLowerCase().replace("o personagem ", ""));
        perguntasEspecificas.add(new Question(perguntaFormatada, pergunta.getFeatures(), pergunta.isSpecific()));
      }
    }

    Collections.shuffle(perguntasEspecificas);
    return perguntasEspecificas;
  }

  private static boolean perguntaERelevante(Question pergunta, List<Features> personagens) {
    boolean temVerdadeiro = false;
    boolean temFalso = false;

    for (Features p : personagens) {
      boolean valor = Filter1.getFeatures(p, pergunta.getFeatures());
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
      if (Filter1.getFeatures(p, pergunta.getFeatures())) {
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

    // Perguntas específicas para Harry Potter
    perguntas.add(new Question("O personagem é do universo de Harry Potter?", "HarryPotter", true));
    perguntas.add(new Question("O personagem é um bruxo ou uma bruxa?", "bruxo", true));
    perguntas.add(new Question("O personagem é um monitor ou monitora em Hogwarts?", "monitor", true));
    perguntas.add(new Question("O personagem pertence à casa Grifinória?", "casaGrifinoria", true));
    perguntas.add(new Question("O personagem pertence à casa Corvinal?", "casaCorvinal", true));
    perguntas.add(new Question("O personagem pertence à casa Sonserina?", "casaSonserina", true));
    perguntas.add(new Question("O personagem pertence à casa Lufa-Lufa?", "casaLufaLufa", true));
    perguntas.add(new Question("O personagem possui um animal de estimação?", "animalEstimacao", true));
    perguntas.add(new Question("O personagem é descendente de Salazar Slytherin?", "ancestralSalazar", true));
    perguntas.add(new Question("O personagem já esteve na Câmara Secreta?", "esteveNaCamaraSecreta", true));
    perguntas.add(new Question("O personagem tem pais trouxas (não-mágicos)?", "paisTrouxas", true));
    perguntas.add(new Question("O personagem foi campeão no Torneio Tribruxo?", "campeaoTribruxo", true));
    perguntas.add(new Question("O personagem joga Quadribol?", "jogadorQuadribol", true));
    perguntas.add(new Question("O personagem fez parte da Armada de Dumbledore?", "membroArmadaDumbledore", true));

    // Perguntas específicas para o Universo Marvel
    perguntas.add(new Question("O personagem é do Universo Marvel?", "UniversoMarvel", true));
    perguntas.add(new Question("O personagem é um Vingador?", "vingador", true));
    perguntas.add(new Question("O personagem usa um traje especial?", "traje", true));
    perguntas.add(new Question("O personagem tem conexão com Wakanda?", "wakanda", true));
    perguntas.add(new Question("O personagem é um X-Men?", "xmen", true));
    perguntas.add(new Question("O personagem possui poder de regeneração?", "regeneracao", true));
    perguntas.add(new Question("O personagem pode controlar metal?", "controleMetal", true));
    perguntas.add(new Question("O personagem usa um capacete como parte de seu traje?", "capacete", true));
    perguntas.add(new Question("O personagem possui habilidades telepáticas?", "telepatia", true));
    perguntas.add(new Question("O personagem possui habilidades telecinéticas?", "telecinese", true));
    perguntas.add(new Question("O personagem pode voar?", "voo", true));
    perguntas.add(new Question("O personagem pode absorver energia?", "absorverEnergia", true));
    perguntas
        .add(new Question("O personagem está associado à inteligência artificial?", "inteligenciaArtificial", true));
    perguntas.add(new Question("O personagem pode manipular a realidade?", "manipulacaoRealidade", true));
    perguntas.add(new Question("O personagem possui agilidade sobre-humana?", "agilidadeAprimorada", true));
    perguntas.add(new Question("O personagem tem status de realeza?", "realeza", true));
    perguntas.add(new Question("O personagem foi exposto a raios gama?", "raiosGama", true));
    perguntas.add(new Question("O personagem usa ou já usou um escudo?", "shield", true));
    perguntas.add(new Question("O personagem recebeu treinamento especial?", "treinamentoEspecial", true));
    perguntas.add(new Question("O personagem é considerado um super soldado?", "superSoldado", true));
    perguntas.add(new Question("O personagem é bilionário?", "bilionario", true));
    perguntas.add(new Question("O personagem é conhecido por seu patriotismo?", "patriota", true));
    perguntas.add(new Question("O personagem é habilidoso em combate corpo a corpo?", "combateCorpoACorpo", true));
    perguntas.add(new Question("O personagem é treinado em artes marciais?", "artesMarciais", true));
    perguntas.add(new Question("O personagem possui força divina ou sobre-humana?", "forcaDivina", true));
    perguntas.add(new Question("O personagem pode manipular algum tipo de energia?", "manipulacaoDeEnergia", true));
    perguntas.add(new Question("O personagem pode fazer feitiços ou magia?", "fazerFeitico", true));
    perguntas.add(new Question("O personagem tem poderes relacionados ao magnetismo?", "Maguinetismo", true));
    perguntas.add(new Question("O personagem é um mutante?", "mutante", true));
    perguntas.add(new Question("O personagem é um humano com poderes adquiridos?", "humano mutado", true));
    perguntas.add(new Question("O personagem é uma entidade cósmica?", "entidade cósmica", true));
    perguntas.add(new Question("O personagem é um Inumano?", "inumano", true));
    perguntas.add(new Question("O personagem é um híbrido de diferentes espécies?", "híbrido", true));
    perguntas.add(new Question("O personagem é um Eterno?", "eterno", true));
    perguntas.add(new Question("O personagem é um robô ou inteligência artificial?", "robô", true));
    perguntas.add(new Question("O personagem é um Gigante de Gelo?", "gigante de gelo", true));
    perguntas.add(new Question("O personagem é um humano com simbionte?", "humano simbionte", true));

    // Perguntas comuns
    perguntas.add(new Question("O personagem é homem?", "masculino", false));
    perguntas.add(new Question("O personagem é mulher?", "feminino", false));
    perguntas.add(new Question("O personagem tem sexo indefinido?", "indefinido", false));
    perguntas.add(new Question("O personagem tem filho(s)?", "tem filho", false));
    perguntas.add(new Question("O personagem tem irmão(s)?", "tem irmao", false));
    perguntas.add(new Question("O personagem é de um anime Japonês?", "animeJapones", false));
    perguntas.add(new Question("O personagem é de um anime Chinês?", "animeChines", false));
    perguntas.add(new Question("O personagem tem origem Inglesa?", "Inglesa", false));
    perguntas.add(new Question("O personagem é um herói?", "heroi", true));
    perguntas.add(new Question("O personagem é um vilão?", "vilao", true));
    perguntas.add(new Question("O personagem é um anti-herói?", "anti-heroi", true));
    perguntas.add(new Question("O personagem é neutro?", "neutro", true));
    perguntas.add(new Question("O personagem é protagonista?", "protagonista", false));
    perguntas.add(new Question("O personagem é co-protagonista?", "co-protagonista", false));
    perguntas.add(new Question("O personagem é antagonista?", "antagonista", false));
    perguntas.add(new Question("O personagem é coadjuvante?", "coadjuvante", false));
    perguntas.add(new Question("O personagem é figurante?", "figurante", false));
    perguntas.add(new Question("O personagem tem transformação?", "tem transformacao", false));
    perguntas.add(new Question("O personagem tem poder?", "tem poder", false));
    perguntas.add(new Question("O personagem usa ki?", "ki", false));
    perguntas.add(new Question("O personagem usa cosmo?", "cosmo", false));
    perguntas.add(new Question("O personagem usa magia?", "magia", false));
    perguntas.add(new Question("O personagem usa mana?", "mana", false));
    perguntas.add(new Question("O personagem tem caráter?", "carater", false));
    perguntas.add(new Question("O personagem é inteligente?", "inteligente", false));
    perguntas.add(new Question("O personagem é estrategista?", "estrategista", false));
    perguntas.add(new Question("O personagem é safado?", "safado", false));
    perguntas.add(new Question("O personagem é arrogante?", "arrogante", false));
    perguntas.add(new Question("O personagem é manipulador?", "manipulador", false));
    perguntas.add(new Question("O personagem é da raça saiyajin?", "saiyajin", false));
    perguntas.add(new Question("O personagem é da raça humana?", "humano", false));
    perguntas.add(new Question("O personagem é da raça android?", "android", false));
    perguntas.add(new Question("O personagem é da raça namekuseijin?", "namekuseijin", false));
    perguntas.add(new Question("O personagem é da raça de Freeza?", "freeza", false));
    perguntas.add(new Question("O personagem é da raça Kaioshin?", "kaioshin", false));
    perguntas.add(new Question("O personagem é da raça anjo?", "anjo", false));
    perguntas.add(new Question("O personagem é da raça Hakaishin?", "hakaishin", false));
    perguntas.add(new Question("O personagem é da raça Majin?", "majin", false));
    perguntas.add(new Question("O personagem é da raça alienígena?", "alienigena", false));
    perguntas.add(new Question("O personagem tem cicatriz?", "cicatriz", false));

    return perguntas;
  }

  public static boolean continuarPerguntando(List<Features> personagens, Set<String> perguntasFeitas,
      Features personagemDescoberto) {
    return perguntasFeitas.size() < 15 || personagemDescoberto == null;
  }
}