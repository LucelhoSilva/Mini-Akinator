package personagens;

import java.util.List;

import controllers.Caracteristica;

public class NarutoPersonagens {
  public static void adicionarPersonagens(List<Caracteristica> listaPersonagens) {

    Caracteristica naruto = new Caracteristica("Naruto Uzumaki", "masculino", false, true, "Japonesa", "heroi",
        "protagonista", true, true, "chakra",
        true, false, true,
        false, "humano", false, true, false,
        false);

    naruto.adicionarAtributoEspecifico("jinchuuriki", true);
    naruto.adicionarAtributoEspecifico("clãUzumaki", true);
    naruto.adicionarAtributoEspecifico("temKyuubi", true);
    naruto.adicionarAtributoEspecifico("sétimoHokage", true);
    naruto.adicionarAtributoEspecifico("sabeRasengan", true);
    naruto.adicionarAtributoEspecifico("paisNinjas", true);

    Caracteristica sasuke = new Caracteristica("Sasuke Uchiha", "masculino", false, true, "Japonesa", "anti-heroi",
        "co-protagonista", true, true, "chakra",
        true, false, true,
        false, "humano", false, true, false,
        false);

    sasuke.adicionarAtributoEspecifico("clãUchiha", true);
    sasuke.adicionarAtributoEspecifico("temSharingan", true);
    sasuke.adicionarAtributoEspecifico("vingador", true);
    sasuke.adicionarAtributoEspecifico("buscaPoder", true);
    sasuke.adicionarAtributoEspecifico("parceiroNaruto", true);

    listaPersonagens.add(naruto);
    listaPersonagens.add(sasuke);

  }
}
