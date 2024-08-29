package personagens;

import java.util.List;

import controllers.Caracteristica;;

public class SoloLevelingPersonagens {
        public static void adicionarPersonagens(List<Caracteristica> listaPersonagens) {

                Caracteristica sungJinWoo = new Caracteristica("Sung Jin-Woo", "masculino", false, true, "Chines",
                                "heroi",
                                "protagonista", false, true, "mana",
                                true, true, true,
                                false, "humano", false, false, false,
                                false);

                sungJinWoo.adicionarAtributoEspecifico("lider", true);
                sungJinWoo.adicionarAtributoEspecifico("entidade", "cacador");
                sungJinWoo.adicionarAtributoEspecifico("rank", "nacional");
                sungJinWoo.adicionarAtributoEspecifico("elemento", "trevas");
                sungJinWoo.adicionarAtributoEspecifico("podeInvocar", true);
                sungJinWoo.adicionarAtributoEspecifico("classe", "tudo");

                Caracteristica chaHaeIN = new Caracteristica("Cha Hae-in", "feminino",
                                false, true, "Chines", "heroi",
                                "coadjuvante", false, true, "mana",
                                true, true, true,
                                false, "humano", false, false, false,
                                true);

                chaHaeIN.adicionarAtributoEspecifico("lider", true);
                chaHaeIN.adicionarAtributoEspecifico("entidade", "cacador");
                chaHaeIN.adicionarAtributoEspecifico("rank", "S");
                chaHaeIN.adicionarAtributoEspecifico("elemento", "luz");
                chaHaeIN.adicionarAtributoEspecifico("podeInvocar", false);
                chaHaeIN.adicionarAtributoEspecifico("classe", "espadachim");

                Caracteristica baekYoonHo = new Caracteristica("Baek Yoon-Ho", "masculino", false, false, "Chines",
                                "heroi",
                                "coadjuvante", true, true, "mana",
                                true, false, false,
                                false, "humano", false, false, false,
                                false);

                baekYoonHo.adicionarAtributoEspecifico("lider", false);
                baekYoonHo.adicionarAtributoEspecifico("entidade", "cacador");
                baekYoonHo.adicionarAtributoEspecifico("rank", "S");
                baekYoonHo.adicionarAtributoEspecifico("elemento", "luz");
                baekYoonHo.adicionarAtributoEspecifico("podeInvocar", false);
                baekYoonHo.adicionarAtributoEspecifico("classe", "lutador");

                Caracteristica hwangDongSoo = new Caracteristica("hwang Dong-Soo", "masculino", false, true, "Chines",
                                "vilao",
                                "antagonista", false, true, "mana",
                                false, false, false,
                                true, "humano", false, false, true,
                                false);

                hwangDongSoo.adicionarAtributoEspecifico("lider", false);
                hwangDongSoo.adicionarAtributoEspecifico("entidade", "cacador");
                hwangDongSoo.adicionarAtributoEspecifico("rank", "S");
                hwangDongSoo.adicionarAtributoEspecifico("elemento", "vento");
                hwangDongSoo.adicionarAtributoEspecifico("podeInvocar", false);
                hwangDongSoo.adicionarAtributoEspecifico("classe", "lutador");

                Caracteristica hwangDongSuk = new Caracteristica("hwang Dong-Suk", "masculino", false, true, "Chines",
                                "vilao",
                                "antagonista", false, true, "mana",
                                false, true, true,
                                true, "humano", false, false, true,
                                true);

                hwangDongSoo.adicionarAtributoEspecifico("lider", false);
                hwangDongSoo.adicionarAtributoEspecifico("entidade", "cacador");
                hwangDongSoo.adicionarAtributoEspecifico("rank", "C");
                hwangDongSoo.adicionarAtributoEspecifico("elemento", "trevas");
                hwangDongSoo.adicionarAtributoEspecifico("podeInvocar", false);
                hwangDongSoo.adicionarAtributoEspecifico("classe", "tank");

                listaPersonagens.add(sungJinWoo);
                listaPersonagens.add(chaHaeIN);
                listaPersonagens.add(baekYoonHo);
                listaPersonagens.add(hwangDongSoo);
                listaPersonagens.add(hwangDongSuk);

        }
}
