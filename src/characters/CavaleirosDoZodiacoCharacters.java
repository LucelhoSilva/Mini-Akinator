package src.characters;

import java.util.List;

import src.controllers.Features;

public class CavaleirosDoZodiacoCharacters {
  public static void adicionarPersonagens(List<Features> listaPersonagens) {
    Features seiya = new Features("seiya", "masculino", false, false, "Japones", "heroi",
        "protagonista", false, true, "cosmo",
        true, true, true,
        false, "humano", false, false, false,
        true, "guerreiro");

    seiya.addSpecificAttribute("signo", "pegaso");
    seiya.addSpecificAttribute("armadura", "bronze");

    Features shiryu = new Features("Shiryu", "masculino", false, false, "Japones", "heroi",
        "coadjuvante", false, true, "cosmo",
        true, true, true,
        false, "humano", false, false, false,
        true, "guerreiro");

    shiryu.addSpecificAttribute("signo", "dragao");
    shiryu.addSpecificAttribute("armadura", "bronze");

    listaPersonagens.add(seiya);
    listaPersonagens.add(shiryu);
  }
}
