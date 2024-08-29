import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controllers.Caracteristica;
import controllers.Filtro;
import personagens.*;
import utils.Pergunta;

public class Main {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    List<Caracteristica> listaPersonagens = new ArrayList<>();
    lista(listaPersonagens);

    System.out.println("Aqui estão os personagens disponíveis. Pense em um deles, mas não me diga qual é:");
    for (int i = 0; i < listaPersonagens.size(); i++) {
      System.out.println((i + 1) + "- " + listaPersonagens.get(i).getNome());
    }

    System.out.println("\nPressione Enter quando estiver pronto para começar.");
    System.out.println("Lembre-se de responder com S para sim e N para não.");
    System.out.println("_____________________________________________________");

    leitura.nextLine();

    int perguntasFeitas = 0;
    Caracteristica personagemDescoberto = null;

    while (Pergunta.continuarPerguntando(listaPersonagens, perguntasFeitas, personagemDescoberto)) {
      List<Pergunta> perguntasRelevantes = Pergunta.obterPerguntasRelevantes(listaPersonagens, perguntasFeitas,
          personagemDescoberto);
      if (perguntasRelevantes.isEmpty()) {
        break;
      }

      Pergunta perguntaAtual = perguntasRelevantes.get(0);
      System.out.println();
      System.out.println(perguntaAtual.getTexto() + " (S/N)");
      System.out.println();
      String resposta = leitura.next();
      System.out.println("_____________________________________________________");
      boolean respostaBoolean = resposta.equalsIgnoreCase("S");

      if (personagemDescoberto == null) {
        Filtro.filtrarPersonagens(listaPersonagens, perguntaAtual.getCaracteristica(), respostaBoolean);

        if (listaPersonagens.size() == 1 && personagemDescoberto == null) {
          personagemDescoberto = listaPersonagens.get(0);
        }
      }

      perguntasFeitas++;
    }

    if (personagemDescoberto != null) {
      System.out.println();
      System.out.println("Seu personagem é " + personagemDescoberto.getNome() + "!");
    } else if (listaPersonagens.isEmpty()) {
      System.out.println("Não há personagens que correspondam às características fornecidas.");
    } else {
      System.out.println("Não foi possível determinar o personagem com certeza. Os personagens restantes são:");
      for (Caracteristica p : listaPersonagens) {
        System.out.println(p.getNome());
      }
    }
  }

  public static void lista(List<Caracteristica> listaPersonagens) {
    DragonBallPersonagens.adicionarPersonagens(listaPersonagens);
    SoloLevelingPersonagens.adicionarPersonagens(listaPersonagens);
    CavaleirosDoZodiacoPersonagens.adicionarPersonagens(listaPersonagens);
    HarryPotterPersonagens.adicionarPersonagens(listaPersonagens);
    NarutoPersonagens.adicionarPersonagens(listaPersonagens);
  }
}