package src.characters;

import java.util.List;

import src.controllers.Features;

public class NarutoCharacters {
  public static void adicionarPersonagens(List<Features> listaPersonagens) {

    Features naruto = new Features("Naruto Uzumaki", "masculino", false, true, "Japones", "heroi",
        "protagonista", true, true, "chakra",
        true, false, true,
        false, "humano", false, true, false,
        false, "ninja");

    naruto.addSpecificAttribute("jinchuuriki", true);
    naruto.addSpecificAttribute("clãUzumaki", true);
    naruto.addSpecificAttribute("temKyuubi", true);
    naruto.addSpecificAttribute("sétimoHokage", true);
    naruto.addSpecificAttribute("sabeRasengan", true);
    naruto.addSpecificAttribute("paisNinjas", true);

    Features sasuke = new Features("Sasuke Uchiha", "masculino", false, true, "Japones", "anti-heroi",
        "co-protagonista", true, true, "chakra",
        true, true, true,
        false, "humano", false, true, false,
        false, "ninja");

    sasuke.addSpecificAttribute("clãUchiha", true);
    sasuke.addSpecificAttribute("temSharingan", true);
    sasuke.addSpecificAttribute("vingador", true);
    sasuke.addSpecificAttribute("buscaPoder", true);
    sasuke.addSpecificAttribute("parceiroNaruto", true);

    listaPersonagens.add(naruto);
    listaPersonagens.add(sasuke);

  }
}
