package personagens;

import java.util.List;

import controllers.Caracteristica;

public class CavaleirosDoZodiacoPersonagens {
  public static void adicionarPersonagens(List<Caracteristica> listaPersonagens) {
    Caracteristica seiya = new Caracteristica("seiya", "masculino", false, false, "Japones", "heroi",
        "protagonista", false, true, "cosmo",
        true, true, true,
        false, "humano", false, false, false,
        true);

    seiya.adicionarAtributoEspecifico("signo", "pegaso");
    seiya.adicionarAtributoEspecifico("armadura", "bronze");

    Caracteristica shiryu = new Caracteristica("Shiryu", "masculino", false, false, "Japones", "heroi",
        "coadjuvante", false, true, "cosmo",
        true, true, true,
        false, "humano", false, false, false,
        true);

    shiryu.adicionarAtributoEspecifico("signo", "dragao");
    shiryu.adicionarAtributoEspecifico("armadura", "bronze");

    listaPersonagens.add(seiya);
    listaPersonagens.add(shiryu);
  }
}
