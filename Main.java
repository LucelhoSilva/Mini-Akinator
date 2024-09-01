import java.util.ArrayList;
import java.util.List;

import characters.DragonBallCharacters;
import characters.SoloLevelingCharacters;
import characters.CavaleirosDoZodiacoCharacters;
import characters.HarryPotterCharacters;
import characters.NarutoCharacters;
import characters.UniversoMarvelPersonagens;

import controllers.Features;
import javax.swing.SwingUtilities;

import interfaces.QuestionInterface;

public class Main {
  public static void main(String[] args) {
    List<Features> listaPersonagens = new ArrayList<>();
    adicionarPersonagens(listaPersonagens);

    System.out.println("Iniciando o jogo de adivinhação...");
    System.out.println("Aqui estão os personagens disponíveis. Pense em um deles, mas não me diga qual é:");
    for (int i = 0; i < listaPersonagens.size(); i++) {
      System.out.println((i + 1) + "- " + listaPersonagens.get(i).getName());
    }

    System.out.println("\nA interface gráfica será aberta em breve. Prepare-se para responder às perguntas!");

    // Iniciar a interface gráfica
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        QuestionInterface questionInterface = new QuestionInterface(listaPersonagens);
        questionInterface.setVisible(true);
      }
    });
  }

  public static void adicionarPersonagens(List<Features> listaPersonagens) {
    // Adicione outras listas de personagens aqui, se necessário
    DragonBallCharacters.adicionarPersonagens(listaPersonagens);
    SoloLevelingCharacters.adicionarPersonagens(listaPersonagens);
    CavaleirosDoZodiacoCharacters.adicionarPersonagens(listaPersonagens);
    HarryPotterCharacters.adicionarPersonagens(listaPersonagens);
    NarutoCharacters.adicionarPersonagens(listaPersonagens);
    UniversoMarvelPersonagens.adicionarPersonagens(listaPersonagens);
  }
}