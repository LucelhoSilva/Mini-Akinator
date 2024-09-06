import java.util.ArrayList;
import java.util.List;

// import src.characters.CavaleirosDoZodiacoCharacters;
import src.characters.DragonBallCharacters;
import src.characters.HarryPotterCharacters;
import src.characters.UniversoDaDCPersonagens;
// import src.characters.NarutoCharacters;
// import src.characters.SoloLevelingCharacters;
import src.characters.UniversoMarvelPersonagens;
import src.controllers.Features;
import src.interfaces.GameInterface;

import javax.swing.SwingUtilities;

public class Main {
  public static void main(String[] args) {
    List<Features> listaPersonagens = new ArrayList<>();
    adicionarPersonagens(listaPersonagens);
    System.out.println("Quantidade de personagens disponíveis: " + listaPersonagens.size());

    System.out.println();

    System.out.println("Iniciando o jogo de adivinhação...");
    System.out.println("\nA interface gráfica será aberta em breve. Prepare-se para responder às perguntas!");

    SwingUtilities.invokeLater(() -> {
      new GameInterface(listaPersonagens);
    });
  }

  public static void adicionarPersonagens(List<Features> listaPersonagens) {
    DragonBallCharacters.adicionarPersonagens(listaPersonagens);
    // SoloLevelingCharacters.adicionarPersonagens(listaPersonagens);
    // CavaleirosDoZodiacoCharacters.adicionarPersonagens(listaPersonagens);
    HarryPotterCharacters.adicionarPersonagens(listaPersonagens);
    // NarutoCharacters.adicionarPersonagens(listaPersonagens);
    UniversoMarvelPersonagens.adicionarPersonagens(listaPersonagens);
    UniversoDaDCPersonagens.adicionarPersonagens(listaPersonagens);
  }
}