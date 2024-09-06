package src.utils;

import java.util.*;
import src.controllers.Features;
import src.controllers.Filter;

/**
 * Classe que representa uma pergunta no jogo de adivinhação.
 * Contém métodos para gerenciar questions e calcular sua relevância.
 */
public class Question {
  private String question;
  private String characteristic;
  private boolean isSpecific;

  /**
   * Construtor da classe Question.
   * 
   * @param question       A pergunta em si
   * @param characteristic A característica associada à pergunta
   * @param isSpecific     Indica se a pergunta é específica para um universo
   *                       particular
   */
  public Question(String question, String characteristic, boolean isSpecific) {
    this.question = question;
    this.characteristic = characteristic;
    this.isSpecific = isSpecific;
  }

  public String getQuestion() {
    return question;
  }

  public String getCharacteristic() {
    return characteristic;
  }

  public boolean isSpecific() {
    return isSpecific;
  }

  /**
   * Obtém uma lista de questions relevantes com base nos personagens restantes e
   * nas questions já feitas.
   * 
   * @param characters     Lista de personagens restantes
   * @param askedQuestions Conjunto de questions já feitas
   * @return Lista de questions relevantes ordenadas por entropia de informação
   */
  public static List<Question> getRelevantQuestions(List<Features> characters, Set<String> askedQuestions) {
    List<Question> allQuestions = createQuestionList();
    List<Question> relevantQuestions = new ArrayList<>();

    for (Question question : allQuestions) {
      if (!askedQuestions.contains(question.getQuestion()) && isQuestionRelevant(question, characters)) {
        relevantQuestions.add(question);
      }
    }

    relevantQuestions.sort((q1, q2) -> Double.compare(
        calculateInformationEntropy(q2, characters),
        calculateInformationEntropy(q1, characters)));

    return relevantQuestions;
  }

  /**
   * Obtém questions específicas para um personagem descoberto.
   * 
   * @param character      O personagem descoberto
   * @param askedQuestions Conjunto de questions já feitas
   * @return Lista de questions específicas para o personagem
   */
  public static List<Question> getCharacterSpecificQuestions(Features character, Set<String> askedQuestions) {
    List<Question> allQuestions = createQuestionList();
    List<Question> specificQuestions = new ArrayList<>();

    for (Question question : allQuestions) {
      if (!askedQuestions.contains(question.getQuestion())) {
        boolean questionAnswer = Filter.getFeature(character, question.getCharacteristic());
        String formattedQuestion = String.format("O personagem %s %s?",
            questionAnswer ? "" : "não",
            question.getQuestion().toLowerCase().replace("o personagem ", ""));
        specificQuestions.add(new Question(formattedQuestion, question.getCharacteristic(), question.isSpecific()));
      }
    }

    Collections.shuffle(specificQuestions);
    return specificQuestions;
  }

  /**
   * Verifica se uma pergunta é relevante para os personagens restantes.
   * 
   * @param question   A pergunta a ser verificada
   * @param characters Lista de personagens restantes
   * @return true se a pergunta é relevante, false caso contrário
   */
  private static boolean isQuestionRelevant(Question question, List<Features> characters) {
    boolean hasTrue = false;
    boolean hasFalse = false;

    for (Features c : characters) {
      boolean value = Filter.getFeature(c, question.getCharacteristic());
      if (value) {
        hasTrue = true;
      } else {
        hasFalse = true;
      }

      if (hasTrue && hasFalse) {
        return true;
      }
    }

    return false;
  }

  /**
   * Calcula a entropia de informação de uma pergunta.
   * 
   * @param question   A pergunta para calcular a entropia
   * @param characters Lista de personagens restantes
   * @return O valor da entropia de informação
   */
  private static double calculateInformationEntropy(Question question, List<Features> characters) {
    int total = characters.size();
    int trueCount = 0;

    for (Features c : characters) {
      if (Filter.getFeature(c, question.getCharacteristic())) {
        trueCount++;
      }
    }

    double trueProportion = (double) trueCount / total;
    double falseProportion = 1 - trueProportion;

    if (trueProportion == 0 || falseProportion == 0) {
      return 0;
    }

    return -trueProportion * Math.log(trueProportion) / Math.log(2)
        - falseProportion * Math.log(falseProportion) / Math.log(2);
  }

  /**
   * Cria a lista de todas as questions possíveis no jogo.
   * 
   * @return Lista de todas as questions
   */
  public static List<Question> createQuestionList() {
    List<Question> questions = new ArrayList<>();

    // questions específicas para Harry Potter
    questions.add(new Question("O personagem é do universo de Harry Potter?", "HarryPotter", true));
    questions.add(new Question("O personagem é um bruxo ou uma bruxa?", "bruxo", true));
    questions.add(new Question("O personagem é um monitor ou monitora em Hogwarts?", "monitor", true));
    questions.add(new Question("O personagem pertence à casa Grifinória?", "casaGrifinoria", true));
    questions.add(new Question("O personagem pertence à casa Corvinal?", "casaCorvinal", true));
    questions.add(new Question("O personagem pertence à casa Sonserina?", "casaSonserina", true));
    questions.add(new Question("O personagem pertence à casa Lufa-Lufa?", "casaLufaLufa", true));
    questions.add(new Question("O personagem possui um animal de estimação?", "animalEstimacao", true));
    questions.add(new Question("O personagem é descendente de Salazar Slytherin?", "ancestralSalazar", true));
    questions.add(new Question("O personagem já esteve na Câmara Secreta?", "esteveNaCamaraSecreta", true));
    questions.add(new Question("O personagem tem pais trouxas (não-mágicos)?", "paisTrouxas", true));
    questions.add(new Question("O personagem foi campeão no Torneio Tribruxo?", "campeaoTribruxo", true));
    questions.add(new Question("O personagem joga Quadribol?", "jogadorQuadribol", true));
    questions.add(new Question("O personagem fez parte da Armada de Dumbledore?", "membroArmadaDumbledore", true));

    // questions específicas para o Universo Marvel
    questions.add(new Question("O personagem é do Universo Marvel?", "UniversoMarvel", true));
    questions.add(new Question("O personagem é um Vingador?", "vingador", true));
    questions.add(new Question("O personagem usa um traje especial?", "traje", true));
    questions.add(new Question("O personagem tem conexão com Wakanda?", "wakanda", true));
    questions.add(new Question("O personagem é um X-Men?", "xmen", true));
    questions.add(new Question("O personagem possui poder de regeneração?", "regeneracao", true));
    questions.add(new Question("O personagem pode controlar metal?", "controleMetal", true));
    questions.add(new Question("O personagem usa um capacete como parte de seu traje?", "capacete", true));
    questions.add(new Question("O personagem possui habilidades telepáticas?", "telepatia", true));
    questions.add(new Question("O personagem possui habilidades telecinéticas?", "telecinese", true));
    questions.add(new Question("O personagem pode voar?", "voar", true));
    questions.add(new Question("O personagem pode absorver energia?", "absorverEnergia", true));
    questions
        .add(new Question("O personagem está associado à inteligência artificial?", "inteligenciaArtificial", true));
    questions.add(new Question("O personagem pode manipular a realidade?", "manipulacaoRealidade", true));
    questions.add(new Question("O personagem possui agilidade sobre-humana?", "agilidadeAprimorada", true));
    questions.add(new Question("O personagem tem status de realeza?", "realeza", true));
    questions.add(new Question("O personagem foi exposto a raios gama?", "raiosGama", true));
    questions.add(new Question("O personagem usa ou já usou um escudo?", "shield", true));
    questions.add(new Question("O personagem recebeu treinamento especial?", "treinamentoEspecial", true));
    questions.add(new Question("O personagem é considerado um super soldado?", "superSoldado", true));
    questions.add(new Question("O personagem é bilionário?", "bilionario", true));
    questions.add(new Question("O personagem é conhecido por seu patriotismo?", "patriota", true));
    questions.add(new Question("O personagem é habilidoso em combate corpo a corpo?", "combateCorpoACorpo", true));
    questions.add(new Question("O personagem é treinado em artes marciais?", "artesMarciais", true));
    questions.add(new Question("O personagem possui força divina ou sobre-humana?", "forcaDivina", true));
    questions.add(new Question("O personagem pode manipular algum tipo de energia?", "manipulacaoDeEnergia", true));
    questions.add(new Question("O personagem pode fazer feitiços ou magia?", "fazerFeitico", true));
    questions.add(new Question("O personagem tem poderes relacionados ao magnetismo?", "Maguinetismo", true));
    questions.add(new Question("O personagem é um mutante?", "mutante", true));
    questions.add(new Question("O personagem é um humano com poderes adquiridos?", "humano mutado", true));
    questions.add(new Question("O personagem é uma entidade cósmica?", "entidade cósmica", true));
    questions.add(new Question("O personagem é um Inumano?", "inumano", true));
    questions.add(new Question("O personagem é um híbrido de diferentes espécies?", "híbrido", true));
    questions.add(new Question("O personagem é um Eterno?", "eterno", true));
    questions.add(new Question("O personagem é um robô ou inteligência artificial?", "robô", true));
    questions.add(new Question("O personagem é um Gigante de Gelo?", "gigante de gelo", true));
    questions.add(new Question("O personagem é um humano com simbionte?", "humano simbionte", true));

    // questions comuns
    questions.add(new Question("O personagem é homem?", "masculino", false));
    questions.add(new Question("O personagem é mulher?", "feminino", false));
    questions.add(new Question("O personagem tem sexo indefinido?", "indefinido", false));
    questions.add(new Question("O personagem tem filho(s)?", "tem filho", false));
    questions.add(new Question("O personagem tem irmão(s)?", "tem irmao", false));
    questions.add(new Question("O personagem é de um anime Japonês?", "animeJapones", false));
    questions.add(new Question("O personagem é de um anime Chinês?", "animeChines", false));
    questions.add(new Question("O personagem tem origem Inglesa?", "Inglesa", false));
    questions.add(new Question("O personagem é um herói?", "heroi", true));
    questions.add(new Question("O personagem é um vilão?", "vilao", true));
    questions.add(new Question("O personagem é um anti-herói?", "anti-heroi", true));
    questions.add(new Question("O personagem é neutro?", "neutro", true));
    questions.add(new Question("O personagem é protagonista?", "protagonista", false));
    questions.add(new Question("O personagem é co-protagonista?", "co-protagonista", false));
    questions.add(new Question("O personagem é antagonista?", "antagonista", false));
    questions.add(new Question("O personagem é coadjuvante?", "coadjuvante", false));
    questions.add(new Question("O personagem é figurante?", "figurante", false));
    questions.add(new Question("O personagem tem transformação?", "tem transformacao", false));
    questions.add(new Question("O personagem tem poder?", "tem poder", false));
    questions.add(new Question("O personagem usa ki?", "ki", false));
    questions.add(new Question("O personagem usa cosmo?", "cosmo", false));
    questions.add(new Question("O personagem usa magia?", "magia", false));
    questions.add(new Question("O personagem usa mana?", "mana", false));
    questions.add(new Question("O personagem tem caráter?", "carater", false));
    questions.add(new Question("O personagem é inteligente?", "inteligente", false));
    questions.add(new Question("O personagem é estrategista?", "estrategista", false));
    questions.add(new Question("O personagem é safado?", "safado", false));
    questions.add(new Question("O personagem é arrogante?", "arrogante", false));
    questions.add(new Question("O personagem é manipulador?", "manipulador", false));
    questions.add(new Question("O personagem é da raça saiyajin?", "saiyajin", false));
    questions.add(new Question("O personagem é da raça humana?", "humano", false));
    questions.add(new Question("O personagem é da raça android?", "android", false));
    questions.add(new Question("O personagem é da raça namekuseijin?", "namekuseijin", false));
    questions.add(new Question("O personagem é da raça de Freeza?", "freeza", false));
    questions.add(new Question("O personagem é da raça Kaioshin?", "kaioshin", false));
    questions.add(new Question("O personagem é da raça anjo?", "anjo", false));
    questions.add(new Question("O personagem é da raça Hakaishin?", "hakaishin", false));
    questions.add(new Question("O personagem é da raça Majin?", "majin", false));
    questions.add(new Question("O personagem é da raça alienígena?", "alienigena", false));
    questions.add(new Question("O personagem tem cicatriz?", "cicatriz", false));

    return questions;
  }

  /**
   * Verifica se o jogo deve continuar fazendo perguntas.
   * 
   * @param characters          Lista de personagens restantes
   * @param askedQuestions      Conjunto de perguntas já feitas
   * @param discoveredCharacter Personagem descoberto (se houver)
   * @return true se deve continuar perguntando, false caso contrário
   */
  public static boolean shouldContinueAsking(List<Features> characters, Set<String> askedQuestions,
      Features discoveredCharacter) {
    return askedQuestions.size() < 15 || discoveredCharacter == null;
  }
}