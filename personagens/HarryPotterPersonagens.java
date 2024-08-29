package personagens;

import java.util.List;

import controllers.Caracteristica;

public class HarryPotterPersonagens {
        public static void adicionarPersonagens(List<Caracteristica> listaPersonagens) {
                Caracteristica harryPotter = new Caracteristica("Harry Potter", "masculino", false, true, "Inglesa",
                                "heroi",
                                "protagonista", true, true, "magia",
                                true, false, true,
                                false, "humano", false, true, false,
                                false);

                harryPotter.adicionarAtributoEspecifico("HarryPotter", true);
                harryPotter.adicionarAtributoEspecifico("casaGrifinoria", true);
                harryPotter.adicionarAtributoEspecifico("casaCorvinal", false);
                harryPotter.adicionarAtributoEspecifico("animalEstimacao", true);
                harryPotter.adicionarAtributoEspecifico("ancestralSalazar", false);
                harryPotter.adicionarAtributoEspecifico("esteveNaCamaraSecreta", true);
                harryPotter.adicionarAtributoEspecifico("paisTrouxas", true);

                Caracteristica hermioneGranger = new Caracteristica("Hermione Granger", "feminino", false, false,
                                "Inglesa",
                                "heroi",
                                "co-protagonista", true, true, "magia",
                                true, true, true,
                                false, "humano", false, false, false,
                                false);

                hermioneGranger.adicionarAtributoEspecifico("HarryPotter", true);
                hermioneGranger.adicionarAtributoEspecifico("casaGrifinoria", true);
                hermioneGranger.adicionarAtributoEspecifico("casaCorvinal", false);
                hermioneGranger.adicionarAtributoEspecifico("animalEstimacao", true);
                hermioneGranger.adicionarAtributoEspecifico("ancestralSalazar", false);
                hermioneGranger.adicionarAtributoEspecifico("esteveNaCamaraSecreta", true);
                hermioneGranger.adicionarAtributoEspecifico("paisTrouxas", false);

                Caracteristica ronWeasley = new Caracteristica("Ron Weasley", "masculino", false, true, "Inglesa",
                                "heroi",
                                "co-protagonista", true, true, "magia",
                                true, true, true,
                                false, "humano", false, false, false,
                                false);

                ronWeasley.adicionarAtributoEspecifico("HarryPotter", true);
                ronWeasley.adicionarAtributoEspecifico("casaGrifinoria", true);
                ronWeasley.adicionarAtributoEspecifico("casaCorvinal", false);
                ronWeasley.adicionarAtributoEspecifico("animalEstimacao", true);
                ronWeasley.adicionarAtributoEspecifico("ancestralSalazar", false);
                ronWeasley.adicionarAtributoEspecifico("esteveNaCamaraSecreta", true);
                ronWeasley.adicionarAtributoEspecifico("paisTrouxas", false);

                Caracteristica nevilleLongbottom = new Caracteristica("Neville Longbottom", "masculino", false, true,
                                "Inglesa",
                                "heroi", "coadjuvante", true, true,
                                "magia", true, false, false,
                                false, "humano", false, false, false,
                                false);

                nevilleLongbottom.adicionarAtributoEspecifico("HarryPotter", true);
                nevilleLongbottom.adicionarAtributoEspecifico("casaGrifinoria", true);
                nevilleLongbottom.adicionarAtributoEspecifico("casaCorvinal", false);
                nevilleLongbottom.adicionarAtributoEspecifico("animalEstimacao", true);
                nevilleLongbottom.adicionarAtributoEspecifico("ancestralSalazar", false);
                nevilleLongbottom.adicionarAtributoEspecifico("esteveNaCamaraSecreta", true);
                nevilleLongbottom.adicionarAtributoEspecifico("paisTrouxas", true);

                listaPersonagens.add(harryPotter);
                listaPersonagens.add(hermioneGranger);
                listaPersonagens.add(ronWeasley);
                listaPersonagens.add(nevilleLongbottom);
                // listaPersonagens.add(ginnyWeasley);

                // Adicione os outros personagens de Harry Potter aqui
        }
}