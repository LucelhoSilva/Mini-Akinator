package characters;

import java.util.List;

import controllers.Features;

public class HarryPotterCharacters {
        public static void adicionarPersonagens(List<Features> listaPersonagens) {
                Features harryPotter = new Features("Harry Potter", "masculino", false, true, "Inglesa",
                                "heroi",
                                "protagonista", true, true, "magia",
                                true, false, true,
                                false, "humano", false, true, false,
                                false, "mago");

                harryPotter.addSpecificAttribute("HarryPotter", true);
                harryPotter.addSpecificAttribute("casaGrifinoria", true);
                harryPotter.addSpecificAttribute("casaCorvinal", false);
                harryPotter.addSpecificAttribute("animalEstimacao", true);
                harryPotter.addSpecificAttribute("ancestralSalazar", false);
                harryPotter.addSpecificAttribute("esteveNaCamaraSecreta", true);
                harryPotter.addSpecificAttribute("paisTrouxas", true);

                Features hermioneGranger = new Features("Hermione Granger", "feminino", false, false,
                                "Inglesa",
                                "heroi",
                                "co-protagonista", true, true, "magia",
                                true, true, true,
                                false, "humano", false, false, false,
                                false, "mago");

                hermioneGranger.addSpecificAttribute("HarryPotter", true);
                hermioneGranger.addSpecificAttribute("casaGrifinoria", true);
                hermioneGranger.addSpecificAttribute("casaCorvinal", false);
                hermioneGranger.addSpecificAttribute("animalEstimacao", true);
                hermioneGranger.addSpecificAttribute("ancestralSalazar", false);
                hermioneGranger.addSpecificAttribute("esteveNaCamaraSecreta", true);
                hermioneGranger.addSpecificAttribute("paisTrouxas", false);

                Features ronWeasley = new Features("Ron Weasley", "masculino", false, true, "Inglesa",
                                "heroi",
                                "co-protagonista", true, true, "magia",
                                true, true, true,
                                false, "humano", false, false, false,
                                false, "mago");

                ronWeasley.addSpecificAttribute("HarryPotter", true);
                ronWeasley.addSpecificAttribute("casaGrifinoria", true);
                ronWeasley.addSpecificAttribute("casaCorvinal", false);
                ronWeasley.addSpecificAttribute("animalEstimacao", true);
                ronWeasley.addSpecificAttribute("ancestralSalazar", false);
                ronWeasley.addSpecificAttribute("esteveNaCamaraSecreta", true);
                ronWeasley.addSpecificAttribute("paisTrouxas", false);

                Features nevilleLongbottom = new Features("Neville Longbottom", "masculino", false, true,
                                "Inglesa",
                                "heroi", "coadjuvante", true, true,
                                "magia", true, false, false,
                                false, "humano", false, false, false,
                                false, "mago");

                nevilleLongbottom.addSpecificAttribute("HarryPotter", true);
                nevilleLongbottom.addSpecificAttribute("casaGrifinoria", true);
                nevilleLongbottom.addSpecificAttribute("casaCorvinal", false);
                nevilleLongbottom.addSpecificAttribute("animalEstimacao", true);
                nevilleLongbottom.addSpecificAttribute("ancestralSalazar", false);
                nevilleLongbottom.addSpecificAttribute("esteveNaCamaraSecreta", true);
                nevilleLongbottom.addSpecificAttribute("paisTrouxas", true);

                listaPersonagens.add(harryPotter);
                listaPersonagens.add(hermioneGranger);
                listaPersonagens.add(ronWeasley);
                listaPersonagens.add(nevilleLongbottom);
                // listaPersonagens.add(ginnyWeasley);

                // Adicione os outros personagens de Harry Potter aqui
        }
}