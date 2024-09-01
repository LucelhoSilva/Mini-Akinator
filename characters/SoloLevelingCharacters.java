package characters;

import java.util.List;

import controllers.Features;;

public class SoloLevelingCharacters {
        public static void adicionarPersonagens(List<Features> listaPersonagens) {

                Features sungJinWoo = new Features("Sung Jin-Woo", "masculino", false, true, "Chines",
                                "heroi",
                                "protagonista", true, true, "mana",
                                true, true, true,
                                false, "humano", false, false,
                                false, true, "necromante");

                sungJinWoo.addSpecificAttribute("lider", true);
                sungJinWoo.addSpecificAttribute("entidade", "cacador");
                sungJinWoo.addSpecificAttribute("elemento", "sombra");
                sungJinWoo.addSpecificAttribute("rank", "nacional");
                sungJinWoo.addSpecificAttribute("podeInvocar", true);

                // Featrures thomasAndre = new Features("Thomas Andre", "masculino", false,
                // true, "Chines",
                // "heroi",
                // "co-protagonista", false, true, "mana",
                // true, true, true,
                // false, "humano", false, false, false,
                // false, "guerreiro");

                Features chaHaeIN = new Features("Cha Hae-in", "feminino",
                                false, true, "Chines", "heroi",
                                "coadjuvante", false, true, "mana",
                                true, true, true,
                                false, "humano", false, false, false,
                                true, "espadachim");

                chaHaeIN.addSpecificAttribute("lider", true);
                chaHaeIN.addSpecificAttribute("entidade", "cacador");
                sungJinWoo.addSpecificAttribute("elemento", "sombra");
                chaHaeIN.addSpecificAttribute("rank", "S");
                chaHaeIN.addSpecificAttribute("podeInvocar", false);

                Features baekYoonHo = new Features("Baek Yoon-Ho", "masculino", false, false, "Chines",
                                "heroi",
                                "coadjuvante", true, true, "mana",
                                true, false, false,
                                false, "humano", false, false, false,
                                false, "guerreiro");

                baekYoonHo.addSpecificAttribute("lider", false);
                baekYoonHo.addSpecificAttribute("entidade", "cacador");
                baekYoonHo.addSpecificAttribute("rank", "S");
                baekYoonHo.addSpecificAttribute("elemento", "luz");
                baekYoonHo.addSpecificAttribute("podeInvocar", false);
                baekYoonHo.addSpecificAttribute("classe", "lutador");

                Features hwangDongSoo = new Features("hwang Dong-Soo", "masculino", false, true, "Chines",
                                "vilao",
                                "antagonista", false, true, "mana",
                                false, false, false,
                                true, "humano", false, false, true,
                                false, "lutador");

                hwangDongSoo.addSpecificAttribute("lider", false);
                hwangDongSoo.addSpecificAttribute("entidade", "cacador");
                hwangDongSoo.addSpecificAttribute("rank", "S");
                hwangDongSoo.addSpecificAttribute("podeInvocar", false);

                Features hwangDongSuk = new Features("hwang Dong-Suk", "masculino", false, true, "Chines",
                                "vilao",
                                "antagonista", false, true, "mana",
                                false, true, true,
                                true, "humano", false, false, true,
                                true, "tank");

                hwangDongSoo.addSpecificAttribute("lider", false);
                hwangDongSoo.addSpecificAttribute("entidade", "cacador");
                hwangDongSoo.addSpecificAttribute("rank", "C");
                hwangDongSoo.addSpecificAttribute("podeInvocar", false);

                listaPersonagens.add(sungJinWoo);
                listaPersonagens.add(chaHaeIN);
                listaPersonagens.add(baekYoonHo);
                listaPersonagens.add(hwangDongSoo);
                listaPersonagens.add(hwangDongSuk);

        }
}
