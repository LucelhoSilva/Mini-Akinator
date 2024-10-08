package src.characters;

import java.util.List;

import src.controllers.Features;

public class DragonBallCharacters {
        public static void adicionarPersonagens(List<Features> listaPersonagens) {

                Features goku = new Features("Goku", "masculino", true, true, "Japones", "heroi",
                                "protagonista", true, true, "Ki",
                                true, false, false,
                                false, "saiyajin", false, false,
                                false, false, "guerreiro");

                goku.addSpecificAttribute("artesMarciais", true);
                goku.addSpecificAttribute("treinamentoEspecial", true);
                goku.addSpecificAttribute("combateCorpoACorpo", true);
                goku.addSpecificAttribute("manipulacaoDeEnergia", true);
                goku.addSpecificAttribute("voar", true);
                goku.addSpecificAttribute("forcaDivina", true);
                goku.addSpecificAttribute("agilidadeAprimorada", true);

                Features chiChi = new Features("ChiChi", "feminino", true, false, "Japones", "neutro",
                                "coadjuvante", false, false, "",
                                true, false, false,
                                false, "humana", false, false,
                                false, false, "humana");

                chiChi.addSpecificAttribute("artesMarciais", false);

                Features goten = new Features("Goten", "masculino", false, true, "Japones", "heroi",
                                "coadjuvante", true, true, "Ki",
                                true, false, false,
                                false, "saiyajin", false, false,
                                false, false, "guerreiro");

                goten.addSpecificAttribute("artesMarciais", true);

                Features vegeta = new Features("Vegeta", "masculino", true, true, "Japones", "heroi",
                                "co-protagonista", true, true, "Ki",
                                true, false, true,
                                false, "saiyajin", false, false,
                                true, false, "guerreiro");

                vegeta.addSpecificAttribute("artesMarciais", true);

                Features bulma = new Features("Bulma", "feminino", true, true, "Japones", "neutro",
                                "coadjuvante", false, false, "",
                                true, true, true,
                                false, "humana", false, false,
                                false, false, "humana");

                bulma.addSpecificAttribute("artesMarciais", false);

                Features trunks = new Features("Trunks", "masculino", false, false, "Japones", "heroi",
                                "coadjuvante", true, true, "Ki",
                                true, true, false,
                                false, "saiyajin", false, false,
                                false, false, "guerreiro");

                trunks.addSpecificAttribute("artesMarciais", true);

                Features gohan = new Features("gohan", "masculino", true, true, "Japones", "heroi",
                                "co-protagonista", true, true, "Ki",
                                true, true, true,
                                false, "saiyajin", false, false,
                                false, false, "guerreiro");

                gohan.addSpecificAttribute("artesMarciais", true);

                Features videl = new Features("Videl", "feminino", true, false, "Japones", "neutro",
                                "coadjuvante", false, true, "Ki",
                                true, false, false,
                                false, "humana", false, false,
                                false, false, "guerreiro");

                videl.addSpecificAttribute("artesMarciais", true);

                Features pan = new Features("Pan", "feminino", false, false, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                true, false, false,
                                false, "saiyajin", false, false,
                                false, false, "guerreiro");

                pan.addSpecificAttribute("artesMarciais", true);

                Features android17 = new Features("Android 17", "masculino", false, true, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                true, true, true,
                                false, "android", false, false,
                                false, false, "guerreiro");

                android17.addSpecificAttribute("artesMarciais", true);

                Features android18 = new Features("Android 18", "feminino", true, true, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                true, true, true,
                                true, "android", false, false,
                                false, false, "guerreiro");

                android18.addSpecificAttribute("artesMarciais", true);

                Features piccolo = new Features("Piccolo", "indefinido", false, true, "Japones", "heroi",
                                "co-protagonista", true, true, "Ki",
                                true, true, true,
                                true, "Namekuseijin", false, false,
                                false, false, "guerreiro");

                piccolo.addSpecificAttribute("artesMarciais", true);

                Features Yamcha = new Features("Yamcha", "masculino", false, false, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                true, false, false,
                                false, "humano", true, true,
                                false, false, "guerreiro");

                Yamcha.addSpecificAttribute("artesMarciais", true);

                Features kuririn = new Features("Kuririn", "masculino", true, false, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                true, false, false,
                                false, "humano", true, true,
                                false, false, "guerreiro");

                kuririn.addSpecificAttribute("artesMarciais", true);

                Features tenshinhan = new Features("Tenshinhan", "masculino", false, false, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                true, false, false,
                                false, "alienigena", true, false,
                                false, false, "guerreiro");

                tenshinhan.addSpecificAttribute("artesMarciais", true);

                Features freeza = new Features("Freeza", "masculino", false, false, "Japones", "vilao",
                                "antagonista", true, true, "Ki",
                                false, false, true,
                                true, "freeza", false, false,
                                true, false, "guerreiro");

                freeza.addSpecificAttribute("artesMarciais", true);

                Features cell = new Features("Cell", "masculino", false, false, "Japones", "vilao",
                                "antagonista", true, true, "Ki",
                                false, false, false,
                                false, "android", false, false,
                                true, false, "guerreiro");

                cell.addSpecificAttribute("artesMarciais", true);

                Features zamasu = new Features("Zamasu", "masculino", false, false, "Japones", "vilao",
                                "antagonista", true, true, "Ki",
                                false, true, true,
                                true, "kaioshin", false, false,
                                true, false, "guerreiro");

                zamasu.addSpecificAttribute("artesMarciais", true);

                Features shin = new Features("Shin", "masculino", false, false, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                false, false, false,
                                false, "kaioshin", true, false,
                                true, false, "guerreiro");

                shin.addSpecificAttribute("artesMarciais", true);

                Features gowasu = new Features("Gowasu", "masculino", false, false, "Japones", "neutro",
                                "coadjuvante", false, true, "Ki",
                                false, false, false,
                                false, "kaioshin", false, false,
                                true, false, "guerreiro");

                gowasu.addSpecificAttribute("artesMarciais", true);

                Features whis = new Features("Whis", "masculino", false, true, "Japones", "heroi",
                                "co-protagonista", false, true, "Ki",
                                true, true, true,
                                false, "anjo", false, false, false,
                                false, "guerreiro");

                whis.addSpecificAttribute("artesMarciais", true);

                Features vados = new Features("Vados", "feminino", false, true, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                true, true, true,
                                false, "anjo", false, false,
                                false, false, "guerreiro");

                vados.addSpecificAttribute("artesMarciais", true);

                Features marcarita = new Features("Marcarita", "feminino", false, true, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                true, true, true,
                                false, "anjo", false, false,
                                true, false, "guerreiro");

                marcarita.addSpecificAttribute("artesMarciais", true);

                Features mojito = new Features("Mojito", "masculino", false, true, "Japones", "heroi",
                                "coadjuvante", false, true, "Ki",
                                false, true, true,
                                true, "anjo", false, false,
                                false, false, "guerreiro");

                mojito.addSpecificAttribute("artesMarciais", true);

                Features daishinkan = new Features("Daishinkan", "masculino", true, false, "Japones", "anti-heroi",
                                "coadjuvante", false, true, "Ki",
                                true, true, true,
                                false, "anjo", false, false,
                                true, false, "guerreiro");

                daishinkan.addSpecificAttribute("artesMarciais", true);

                Features bills = new Features("Bills", "masculino", false, true, "Japones", "heroi",
                                "co-protagonista", true, true, "Ki",
                                true, true, true,
                                false, "hakaishin", false, false,
                                true, false, "guerreiro");

                bills.addSpecificAttribute("artesMarciais", true);

                Features champa = new Features("Champa", "masculino", false, true, "Japones", "heroi",
                                "coadjuvante", true, true, "Ki",
                                true, true, true,
                                true, "hakaishin", true, false,
                                true, false, "guerreiro");

                champa.addSpecificAttribute("artesMarciais", true);

                Features quitela = new Features("Quitela", "masculino", false, false, "Japones", "heroi",
                                "coadjuvante", true, true, "Ki",
                                false, true, true,
                                true, "hakaishin", false, false,
                                true, false, "guerreiro");

                quitela.addSpecificAttribute("artesMarciais", true);

                Features manjinBoo = new Features("Majin Boo", "masculino", false, false, "Japones", "vilao",
                                "antagonista", true, true, "Ki",
                                false, false, false,
                                false, "Majin", false, false,
                                false, false, "guerreiro");

                manjinBoo.addSpecificAttribute("artesMarciais", true);

                Features moro = new Features("Moro", "masculino", false, false, "Japones", "vilao",
                                "antagonista", false, true, "magia",
                                false, true, true,
                                true, "feiticeiro maligno", false, false,
                                true, false, "mago");

                moro.addSpecificAttribute("artesMarciais", true);

                Features mestreKame = new Features("Mestre Kame", "masculino", false, true, "Japones", "heroi",
                                "coadjuvante", true, true, "Ki",
                                true, true, true,
                                false, "humano", true, false,
                                false, false, "guerreiro");

                mestreKame.addSpecificAttribute("artesMarciais", true);

                Features mrSatan = new Features("Mr.Satan", "masculino", true, false, "Japones", "neutro",
                                "figurante", false, false, "",
                                false, false, false,
                                false, "humano", false, false,
                                true, false, "humano");

                mrSatan.addSpecificAttribute("artesMarciais", false);

                listaPersonagens.add(goku);
                listaPersonagens.add(chiChi);
                listaPersonagens.add(goten);
                listaPersonagens.add(vegeta);
                listaPersonagens.add(bulma);
                listaPersonagens.add(trunks);
                listaPersonagens.add(gohan);
                listaPersonagens.add(videl);
                listaPersonagens.add(pan);
                listaPersonagens.add(android17);
                listaPersonagens.add(android18);
                listaPersonagens.add(piccolo);
                listaPersonagens.add(Yamcha);
                listaPersonagens.add(kuririn);
                listaPersonagens.add(tenshinhan);
                listaPersonagens.add(freeza);
                listaPersonagens.add(cell);
                listaPersonagens.add(zamasu);
                listaPersonagens.add(shin);
                listaPersonagens.add(gowasu);
                listaPersonagens.add(whis);
                listaPersonagens.add(vados);
                listaPersonagens.add(marcarita);
                listaPersonagens.add(mojito);
                listaPersonagens.add(daishinkan);
                listaPersonagens.add(bills);
                listaPersonagens.add(champa);
                listaPersonagens.add(quitela);
                listaPersonagens.add(manjinBoo);
                listaPersonagens.add(moro);
                listaPersonagens.add(mestreKame);
                listaPersonagens.add(mrSatan);
        }
}