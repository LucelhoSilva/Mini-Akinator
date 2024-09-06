package src.utils;

import src.controllers.Features;
import src.controllers.Filter;

import java.util.*;

/**
 * Classe responsável por gerenciar a lógica do jogo.
 */
public class GameLogic {
  private List<Features> originalCharacterList;
  private List<Features> currentCharacterList;
  private Set<String> questionsAsked;
  private Features discoveredCharacter;
  private List<Question> relevantQuestions;
  private String lastQuestionAsked;
  private boolean characterDiscovered;

  /**
   * Construtor para GameLogic.
   * 
   * @param characters A lista inicial de personagens
   */
  public GameLogic(List<Features> characters) {
    this.originalCharacterList = new ArrayList<>(characters);
    resetGame();
  }

  /**
   * Reinicia o jogo para seu estado inicial.
   */
  public void resetGame() {
    currentCharacterList = new ArrayList<>(originalCharacterList);
    questionsAsked = new HashSet<>();
    discoveredCharacter = null;
    lastQuestionAsked = null;
    characterDiscovered = false;
    updateRelevantQuestions();
  }

  /**
   * Obtém a próxima pergunta a ser feita.
   * 
   * @return A próxima pergunta, ou null se não houver mais perguntas
   */
  public String getNextQuestion() {
    if (!relevantQuestions.isEmpty()) {
      lastQuestionAsked = relevantQuestions.get(0).getQuestion();
      return lastQuestionAsked;
    }
    return null;
  }

  /**
   * Processa a resposta para a pergunta atual.
   * 
   * @param answer A resposta booleana para a pergunta
   */
  public void processAnswer(boolean answer) {
    if (!relevantQuestions.isEmpty()) {
      Question currentQuestion = relevantQuestions.remove(0);

      if (!characterDiscovered) {
        Filter.filterCharacters(currentCharacterList, currentQuestion.getCharacteristic(), answer);
      }

      questionsAsked.add(currentQuestion.getQuestion());

      if (currentCharacterList.size() == 1 && !characterDiscovered) {
        discoveredCharacter = currentCharacterList.get(0);
        characterDiscovered = true;
        updateRelevantQuestions(); // Atualiza as perguntas para serem específicas do personagem descoberto
      }

      printQuestionAndRemainingCharactersInfo(answer);
    }
  }

  /**
   * Atualiza a lista de perguntas relevantes com base no estado atual do jogo.
   */
  private void updateRelevantQuestions() {
    if (characterDiscovered) {
      relevantQuestions = Question.getCharacterSpecificQuestions(discoveredCharacter, questionsAsked);
    } else {
      relevantQuestions = Question.getRelevantQuestions(currentCharacterList, questionsAsked);
    }
  }

  /**
   * Verifica se o jogo terminou.
   * 
   * @return true se o jogo terminou, false caso contrário
   */
  public boolean isGameOver() {
    return questionsAsked.size() >= 15 || relevantQuestions.isEmpty();
  }

  /**
   * Verifica se mais perguntas podem ser feitas.
   * 
   * @return true se mais perguntas podem ser feitas, false caso contrário
   */
  public boolean canAskMoreQuestions() {
    return !relevantQuestions.isEmpty() && questionsAsked.size() < 15;
  }

  /**
   * Verifica se um personagem foi descoberto.
   * 
   * @return true se um personagem foi descoberto, false caso contrário
   */
  public boolean hasDiscoveredCharacter() {
    return characterDiscovered;
  }

  /**
   * Obtém o personagem descoberto.
   * 
   * @return O personagem descoberto, ou null se nenhum personagem foi descoberto
   */
  public Features getDiscoveredCharacter() {
    return discoveredCharacter;
  }

  /**
   * Obtém a lista de personagens restantes.
   * 
   * @return A lista de personagens restantes
   */
  public List<Features> getRemainingCharacters() {
    return currentCharacterList;
  }

  /**
   * Obtém o número de perguntas feitas até o momento.
   * 
   * @return O número de perguntas feitas
   */
  public int getQuestionsAskedCount() {
    return questionsAsked.size();
  }

  /**
   * Imprime informações sobre a pergunta atual e os personagens restantes.
   * 
   * @param answer A resposta para a última pergunta
   */
  private void printQuestionAndRemainingCharactersInfo(boolean answer) {
    System.out.println("\n--- Question answered ---");
    System.out.println("Question: " + lastQuestionAsked);
    System.out.println("Answer: " + (answer ? "Yes" : "No"));
    System.out.println("-------------------------");
    System.out.println("--- Remaining characters information ---");
    System.out.println("Number of remaining characters: " + currentCharacterList.size());
    System.out.println("Remaining characters:");
    for (Features character : currentCharacterList) {
      System.out.println("- " + character.getName());
    }
    System.out.println("--------------------------------\n");
  }
}