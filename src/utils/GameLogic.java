package src.utils;

import src.controllers.Features;
import src.controllers.Filter1;

import java.util.*;

public class GameLogic {
  private List<Features> originalCharacterList;
  private List<Features> currentCharacterList;
  private Set<String> questionsAsked;
  private Features discoveredCharacter;
  private List<Question> relevantQuestions;
  private String lastQuestionAsked;
  private boolean characterDiscovered;

  public GameLogic(List<Features> characters) {
    this.originalCharacterList = new ArrayList<>(characters);
    resetGame();
  }

  public void resetGame() {
    currentCharacterList = new ArrayList<>(originalCharacterList);
    questionsAsked = new HashSet<>();
    discoveredCharacter = null;
    lastQuestionAsked = null;
    characterDiscovered = false;
    updateRelevantQuestions();
  }

  public String getNextQuestion() {
    if (!relevantQuestions.isEmpty()) {
      lastQuestionAsked = relevantQuestions.get(0).getPergunta();
      return lastQuestionAsked;
    }
    return null;
  }

  public void processAnswer(boolean answer) {
    if (!relevantQuestions.isEmpty()) {
      Question currentQuestion = relevantQuestions.remove(0);

      if (!characterDiscovered) {
        Filter1.filtrarPersonagens(currentCharacterList, currentQuestion.getFeatures(), answer);
      }

      questionsAsked.add(currentQuestion.getPergunta());

      if (currentCharacterList.size() == 1 && !characterDiscovered) {
        discoveredCharacter = currentCharacterList.get(0);
        characterDiscovered = true;
        updateRelevantQuestions(); // Atualiza as perguntas para serem específicas do personagem descoberto
      }

      printQuestionAndRemainingCharactersInfo(answer);
    }
  }

  private void updateRelevantQuestions() {
    if (characterDiscovered) {
      relevantQuestions = Question.obterPerguntasEspecificasPersonagem(discoveredCharacter, questionsAsked);
    } else {
      relevantQuestions = Question.obterPerguntasRelevantes(currentCharacterList, questionsAsked);
    }
  }

  public boolean isGameOver() {
    return questionsAsked.size() >= 15 || relevantQuestions.isEmpty();
  }

  public boolean canAskMoreQuestions() {
    return !relevantQuestions.isEmpty() && questionsAsked.size() < 15;
  }

  public boolean hasDiscoveredCharacter() {
    return characterDiscovered;
  }

  public Features getDiscoveredCharacter() {
    return discoveredCharacter;
  }

  public List<Features> getRemainingCharacters() {
    return currentCharacterList;
  }

  public int getQuestionsAskedCount() {
    return questionsAsked.size();
  }

  private void printQuestionAndRemainingCharactersInfo(boolean answer) {
    System.out.println("\n--- Pergunta respondida ---");
    System.out.println("Pergunta: " + lastQuestionAsked);
    System.out.println("Resposta: " + (answer ? "Sim" : "Não"));
    System.out.println("-------------------------");
    System.out.println("--- Informações dos personagens restantes ---");
    System.out.println("Quantidade de personagens restantes: " + currentCharacterList.size());
    System.out.println("Personagens restantes:");
    for (Features character : currentCharacterList) {
      System.out.println("- " + character.getName());
    }
    System.out.println("--------------------------------\n");
  }
}