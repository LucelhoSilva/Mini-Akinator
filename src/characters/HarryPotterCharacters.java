package src.characters;

import java.util.List;

import src.controllers.Features;

public class HarryPotterCharacters {
        public static void adicionarPersonagens(List<Features> listaPersonagens) {
                Features harryPotter = new Features("Harry Potter", "masculino", false, true, "Inglesa",
                                "heroi", "protagonista", false, true,
                                "magia", true, true, true,
                                false, "humano", false, true,
                                false, false, "bruxo");

                harryPotter.addSpecificAttribute("HarryPotter", true);
                harryPotter.addSpecificAttribute("monitor", false);
                harryPotter.addSpecificAttribute("casaGrifinoria", true);
                harryPotter.addSpecificAttribute("casaCorvinal", false);
                harryPotter.addSpecificAttribute("casaSonserina", false);
                harryPotter.addSpecificAttribute("casaLufaLufa", false);
                harryPotter.addSpecificAttribute("animalEstimacao", true);
                harryPotter.addSpecificAttribute("ancestralSalazar", false);
                harryPotter.addSpecificAttribute("esteveNaCamaraSecreta", true);
                harryPotter.addSpecificAttribute("paisTrouxas", false);
                harryPotter.addSpecificAttribute("campeaoTribruxo", true);
                harryPotter.addSpecificAttribute("jogadorQuadribol", true);
                harryPotter.addSpecificAttribute("membroArmadaDumbledore", true);

                Features hermioneGranger = new Features("Hermione Granger", "feminino", false, false, "Inglesa",
                                "heroi", "co-protagonista", false, true,
                                "magia", true, true, true,
                                false, "humano", false, false,
                                false, false, "bruxa");

                hermioneGranger.addSpecificAttribute("HarryPotter", true);
                hermioneGranger.addSpecificAttribute("monitora", true);
                hermioneGranger.addSpecificAttribute("casaGrifinoria", true);
                hermioneGranger.addSpecificAttribute("casaCorvinal", false);
                hermioneGranger.addSpecificAttribute("casaSonserina", false);
                hermioneGranger.addSpecificAttribute("casaLufaLufa", false);
                hermioneGranger.addSpecificAttribute("animalEstimacao", true);
                hermioneGranger.addSpecificAttribute("ancestralSalazar", false);
                hermioneGranger.addSpecificAttribute("esteveNaCamaraSecreta", true);
                hermioneGranger.addSpecificAttribute("paisTrouxas", true);
                hermioneGranger.addSpecificAttribute("campeaoTribruxo", false);
                hermioneGranger.addSpecificAttribute("jogadorQuadribol", false);
                hermioneGranger.addSpecificAttribute("membroArmadaDumbledore", true);

                Features ronWeasley = new Features("Ron Weasley", "masculino", false, true, "Inglesa",
                                "heroi", "co-protagonista", false, true,
                                "magia", true, false, true,
                                false, "humano", true, false,
                                false, false, "bruxo");

                ronWeasley.addSpecificAttribute("HarryPotter", true);
                ronWeasley.addSpecificAttribute("monitor", true);
                ronWeasley.addSpecificAttribute("casaGrifinoria", true);
                ronWeasley.addSpecificAttribute("casaCorvinal", false);
                ronWeasley.addSpecificAttribute("casaSonserina", false);
                ronWeasley.addSpecificAttribute("casaLufaLufa", false);
                ronWeasley.addSpecificAttribute("animalEstimacao", true);
                ronWeasley.addSpecificAttribute("ancestralSalazar", false);
                ronWeasley.addSpecificAttribute("esteveNaCamaraSecreta", true);
                ronWeasley.addSpecificAttribute("paisTrouxas", false);
                ronWeasley.addSpecificAttribute("campeaoTribruxo", false);
                ronWeasley.addSpecificAttribute("jogadorQuadribol", true);
                ronWeasley.addSpecificAttribute("membroArmadaDumbledore", true);

                Features lunaLovegood = new Features("Luna Lovegood", "feminino", false, false, "Inglesa",
                                "heroi", "coadjuvante", false, true,
                                "magia", true, true, false,
                                false, "humano", false, false,
                                false, false, "bruxa");

                lunaLovegood.addSpecificAttribute("HarryPotter", true);
                lunaLovegood.addSpecificAttribute("monitora", false);
                lunaLovegood.addSpecificAttribute("casaGrifinoria", false);
                lunaLovegood.addSpecificAttribute("casaCorvinal", true);
                lunaLovegood.addSpecificAttribute("casaSonserina", false);
                lunaLovegood.addSpecificAttribute("casaLufaLufa", false);
                lunaLovegood.addSpecificAttribute("animalEstimacao", false);
                lunaLovegood.addSpecificAttribute("ancestralSalazar", false);
                lunaLovegood.addSpecificAttribute("esteveNaCamaraSecreta", false);
                lunaLovegood.addSpecificAttribute("paisTrouxas", false);
                lunaLovegood.addSpecificAttribute("campeaoTribruxo", false);
                lunaLovegood.addSpecificAttribute("jogadorQuadribol", false);
                lunaLovegood.addSpecificAttribute("membroArmadaDumbledore", true);

                Features dracoMalfoy = new Features("Draco Malfoy", "masculino", false, false, "Inglesa",
                                "antagonista", "coadjuvante", false, true,
                                "magia", false, true, true,
                                true, "humano", true, false,
                                true, false, "bruxo");

                dracoMalfoy.addSpecificAttribute("HarryPotter", true);
                dracoMalfoy.addSpecificAttribute("monitor", true);
                dracoMalfoy.addSpecificAttribute("casaGrifinoria", false);
                dracoMalfoy.addSpecificAttribute("casaCorvinal", false);
                dracoMalfoy.addSpecificAttribute("casaSonserina", true);
                dracoMalfoy.addSpecificAttribute("casaLufaLufa", false);
                dracoMalfoy.addSpecificAttribute("animalEstimacao", false);
                dracoMalfoy.addSpecificAttribute("ancestralSalazar", false);
                dracoMalfoy.addSpecificAttribute("esteveNaCamaraSecreta", false);
                dracoMalfoy.addSpecificAttribute("paisTrouxas", false);
                dracoMalfoy.addSpecificAttribute("campeaoTribruxo", false);
                dracoMalfoy.addSpecificAttribute("jogadorQuadribol", true);
                dracoMalfoy.addSpecificAttribute("membroArmadaDumbledore", false);

                Features nevilleLongbottom = new Features("Neville Longbottom", "masculino", false, false, "Inglesa",
                                "heroi", "coadjuvante", false, true,
                                "magia", true, false, false,
                                false, "humano", false, false,
                                false, false, "bruxo");

                nevilleLongbottom.addSpecificAttribute("HarryPotter", true);
                nevilleLongbottom.addSpecificAttribute("monitor", false);
                nevilleLongbottom.addSpecificAttribute("casaGrifinoria", true);
                nevilleLongbottom.addSpecificAttribute("casaCorvinal", false);
                nevilleLongbottom.addSpecificAttribute("casaSonserina", false);
                nevilleLongbottom.addSpecificAttribute("casaLufaLufa", false);
                nevilleLongbottom.addSpecificAttribute("animalEstimacao", true);
                nevilleLongbottom.addSpecificAttribute("ancestralSalazar", false);
                nevilleLongbottom.addSpecificAttribute("esteveNaCamaraSecreta", false);
                nevilleLongbottom.addSpecificAttribute("paisTrouxas", false);
                nevilleLongbottom.addSpecificAttribute("campeaoTribruxo", false);
                nevilleLongbottom.addSpecificAttribute("jogadorQuadribol", false);
                nevilleLongbottom.addSpecificAttribute("membroArmadaDumbledore", true);

                Features ginnyWeasley = new Features("Ginny Weasley", "feminino", false, true, "Inglesa",
                                "heroi", "coadjuvante", false, true,
                                "magia", true, true, false,
                                false, "humano", true, false,
                                false, false, "bruxa");

                ginnyWeasley.addSpecificAttribute("HarryPotter", true);
                ginnyWeasley.addSpecificAttribute("monitora", false);
                ginnyWeasley.addSpecificAttribute("casaGrifinoria", true);
                ginnyWeasley.addSpecificAttribute("casaCorvinal", false);
                ginnyWeasley.addSpecificAttribute("casaSonserina", false);
                ginnyWeasley.addSpecificAttribute("casaLufaLufa", false);
                ginnyWeasley.addSpecificAttribute("animalEstimacao", false);
                ginnyWeasley.addSpecificAttribute("ancestralSalazar", false);
                ginnyWeasley.addSpecificAttribute("esteveNaCamaraSecreta", true);
                ginnyWeasley.addSpecificAttribute("paisTrouxas", false);
                ginnyWeasley.addSpecificAttribute("campeaoTribruxo", false);
                ginnyWeasley.addSpecificAttribute("jogadorQuadribol", true);
                ginnyWeasley.addSpecificAttribute("membroArmadaDumbledore", true);

                Features fredWeasley = new Features("Fred Weasley", "masculino", false, true, "Inglesa",
                                "heroi", "coadjuvante", false, true,
                                "magia", true, true, false,
                                true, "humano", true, false,
                                false, false, "bruxo");

                fredWeasley.addSpecificAttribute("HarryPotter", true);
                fredWeasley.addSpecificAttribute("monitor", false);
                fredWeasley.addSpecificAttribute("casaGrifinoria", true);
                fredWeasley.addSpecificAttribute("casaCorvinal", false);
                fredWeasley.addSpecificAttribute("casaSonserina", false);
                fredWeasley.addSpecificAttribute("casaLufaLufa", false);
                fredWeasley.addSpecificAttribute("animalEstimacao", false);
                fredWeasley.addSpecificAttribute("ancestralSalazar", false);
                fredWeasley.addSpecificAttribute("esteveNaCamaraSecreta", false);
                fredWeasley.addSpecificAttribute("paisTrouxas", false);
                fredWeasley.addSpecificAttribute("campeaoTribruxo", false);
                fredWeasley.addSpecificAttribute("jogadorQuadribol", true);
                fredWeasley.addSpecificAttribute("membroArmadaDumbledore", true);

                Features albusDumbledore = new Features("Albus Dumbledore", "masculino", false, true, "Inglesa",
                                "heroi", "coadjuvante", false, true,
                                "magia", true, true, true,
                                false, "humano", false, false,
                                false, false, "bruxo");

                albusDumbledore.addSpecificAttribute("HarryPotter", true);
                albusDumbledore.addSpecificAttribute("monitor", true);
                albusDumbledore.addSpecificAttribute("casaGrifinoria", true);
                albusDumbledore.addSpecificAttribute("casaCorvinal", false);
                albusDumbledore.addSpecificAttribute("casaSonserina", false);
                albusDumbledore.addSpecificAttribute("casaLufaLufa", false);
                albusDumbledore.addSpecificAttribute("animalEstimacao", true);
                albusDumbledore.addSpecificAttribute("ancestralSalazar", false);
                albusDumbledore.addSpecificAttribute("esteveNaCamaraSecreta", true);
                albusDumbledore.addSpecificAttribute("paisTrouxas", false);
                albusDumbledore.addSpecificAttribute("campeaoTribruxo", false);
                albusDumbledore.addSpecificAttribute("jogadorQuadribol", false);
                albusDumbledore.addSpecificAttribute("membroArmadaDumbledore", true);

                Features severusSnape = new Features("Severus Snape", "masculino", false, false, "Inglesa",
                                "anti-heroi", "coadjuvante", false, true,
                                "magia", true, true, true,
                                true, "humano", false, false,
                                true, false, "bruxo");

                severusSnape.addSpecificAttribute("HarryPotter", true);
                severusSnape.addSpecificAttribute("monitor", true);
                severusSnape.addSpecificAttribute("casaGrifinoria", false);
                severusSnape.addSpecificAttribute("casaCorvinal", false);
                severusSnape.addSpecificAttribute("casaSonserina", true);
                severusSnape.addSpecificAttribute("casaLufaLufa", false);
                severusSnape.addSpecificAttribute("animalEstimacao", false);
                severusSnape.addSpecificAttribute("ancestralSalazar", false);
                severusSnape.addSpecificAttribute("esteveNaCamaraSecreta", false);
                severusSnape.addSpecificAttribute("paisTrouxas", false);
                severusSnape.addSpecificAttribute("campeaoTribruxo", false);
                severusSnape.addSpecificAttribute("jogadorQuadribol", false);
                severusSnape.addSpecificAttribute("membroArmadaDumbledore", true);

                Features rubeusHagrid = new Features("Rubeus Hagrid", "masculino", false, false, "Inglesa",
                                "heroi", "coadjuvante", false, true,
                                "magia", true, false, false,
                                false, "meio-gigante", false, false,
                                false, false, "bruxo");

                rubeusHagrid.addSpecificAttribute("HarryPotter", true);
                rubeusHagrid.addSpecificAttribute("monitor", false);
                rubeusHagrid.addSpecificAttribute("casaGrifinoria", true);
                rubeusHagrid.addSpecificAttribute("casaCorvinal", false);
                rubeusHagrid.addSpecificAttribute("casaSonserina", false);
                rubeusHagrid.addSpecificAttribute("casaLufaLufa", false);
                rubeusHagrid.addSpecificAttribute("animalEstimacao", true);
                rubeusHagrid.addSpecificAttribute("ancestralSalazar", false);
                rubeusHagrid.addSpecificAttribute("esteveNaCamaraSecreta", true);
                rubeusHagrid.addSpecificAttribute("paisTrouxas", false);
                rubeusHagrid.addSpecificAttribute("campeaoTribruxo", false);
                rubeusHagrid.addSpecificAttribute("jogadorQuadribol", false);
                rubeusHagrid.addSpecificAttribute("membroArmadaDumbledore", true);

                Features siriusBlack = new Features("Sirius Black", "masculino", false, true, "Inglesa",
                                "heroi", "coadjuvante", true, true,
                                "magia", true, true, false,
                                false, "humano", true, false,
                                false, false, "bruxo");

                siriusBlack.addSpecificAttribute("HarryPotter", true);
                siriusBlack.addSpecificAttribute("monitor", false);
                siriusBlack.addSpecificAttribute("casaGrifinoria", true);
                siriusBlack.addSpecificAttribute("casaCorvinal", false);
                siriusBlack.addSpecificAttribute("casaSonserina", false);
                siriusBlack.addSpecificAttribute("casaLufaLufa", false);
                siriusBlack.addSpecificAttribute("animalEstimacao", false);
                siriusBlack.addSpecificAttribute("ancestralSalazar", false);
                siriusBlack.addSpecificAttribute("esteveNaCamaraSecreta", false);
                siriusBlack.addSpecificAttribute("paisTrouxas", false);
                siriusBlack.addSpecificAttribute("campeaoTribruxo", false);
                siriusBlack.addSpecificAttribute("jogadorQuadribol", false);
                siriusBlack.addSpecificAttribute("membroArmadaDumbledore", true);

                Features remusLupin = new Features("Remus Lupin", "masculino", false, false, "Inglesa",
                                "heroi", "coadjuvante", true, true,
                                "magia", true, true, false,
                                false, "lobisomem", false, true,
                                false, false, "bruxo");

                remusLupin.addSpecificAttribute("HarryPotter", true);
                remusLupin.addSpecificAttribute("monitor", true);
                remusLupin.addSpecificAttribute("casaGrifinoria", true);
                remusLupin.addSpecificAttribute("casaCorvinal", false);
                remusLupin.addSpecificAttribute("casaSonserina", false);
                remusLupin.addSpecificAttribute("casaLufaLufa", false);
                remusLupin.addSpecificAttribute("animalEstimacao", false);
                remusLupin.addSpecificAttribute("ancestralSalazar", false);
                remusLupin.addSpecificAttribute("esteveNaCamaraSecreta", false);
                remusLupin.addSpecificAttribute("paisTrouxas", false);
                remusLupin.addSpecificAttribute("campeaoTribruxo", false);
                remusLupin.addSpecificAttribute("jogadorQuadribol", false);
                remusLupin.addSpecificAttribute("membroArmadaDumbledore", true);

                Features bellatrixLestrange = new Features("Bellatrix Lestrange", "feminino", false, true, "Inglesa",
                                "vilao", "antagonista", false, true,
                                "magia", false, true, true,
                                true, "humano", true, false,
                                true, false, "bruxa");

                bellatrixLestrange.addSpecificAttribute("HarryPotter", true);
                bellatrixLestrange.addSpecificAttribute("monitora", false);
                bellatrixLestrange.addSpecificAttribute("casaGrifinoria", false);
                bellatrixLestrange.addSpecificAttribute("casaCorvinal", false);
                bellatrixLestrange.addSpecificAttribute("casaSonserina", true);
                bellatrixLestrange.addSpecificAttribute("casaLufaLufa", false);
                bellatrixLestrange.addSpecificAttribute("animalEstimacao", false);
                bellatrixLestrange.addSpecificAttribute("ancestralSalazar", false);
                bellatrixLestrange.addSpecificAttribute("esteveNaCamaraSecreta", false);
                bellatrixLestrange.addSpecificAttribute("paisTrouxas", false);
                bellatrixLestrange.addSpecificAttribute("campeaoTribruxo", false);
                bellatrixLestrange.addSpecificAttribute("jogadorQuadribol", false);
                bellatrixLestrange.addSpecificAttribute("membroArmadaDumbledore", false);

                Features choChang = new Features("Cho Chang", "feminino", false, false, "Inglesa",
                                "heroi", "coadjuvante", false, true,
                                "magia", true, false, false,
                                false, "humano", false, false,
                                false, false, "bruxa");

                choChang.addSpecificAttribute("HarryPotter", true);
                choChang.addSpecificAttribute("monitora", false);
                choChang.addSpecificAttribute("casaGrifinoria", false);
                choChang.addSpecificAttribute("casaCorvinal", true);
                choChang.addSpecificAttribute("casaSonserina", false);
                choChang.addSpecificAttribute("casaLufaLufa", false);
                choChang.addSpecificAttribute("animalEstimacao", false);
                choChang.addSpecificAttribute("ancestralSalazar", false);
                choChang.addSpecificAttribute("esteveNaCamaraSecreta", false);
                choChang.addSpecificAttribute("paisTrouxas", false);
                choChang.addSpecificAttribute("campeaoTribruxo", false);
                choChang.addSpecificAttribute("jogadorQuadribol", true);
                choChang.addSpecificAttribute("membroArmadaDumbledore", true);

                Features luciusMalfoy = new Features("Lucius Malfoy", "masculino", true, false, "Inglesa",
                                "vilao", "antagonista", false, true,
                                "magia", false, true, true,
                                true, "humano", false, false,
                                true, false, "bruxo");

                luciusMalfoy.addSpecificAttribute("HarryPotter", true);
                luciusMalfoy.addSpecificAttribute("monitor", false);
                luciusMalfoy.addSpecificAttribute("casaGrifinoria", false);
                luciusMalfoy.addSpecificAttribute("casaCorvinal", false);
                luciusMalfoy.addSpecificAttribute("casaSonserina", true);
                luciusMalfoy.addSpecificAttribute("casaLufaLufa", false);
                luciusMalfoy.addSpecificAttribute("animalEstimacao", false);
                luciusMalfoy.addSpecificAttribute("ancestralSalazar", false);
                luciusMalfoy.addSpecificAttribute("esteveNaCamaraSecreta", true);
                luciusMalfoy.addSpecificAttribute("paisTrouxas", false);
                luciusMalfoy.addSpecificAttribute("campeaoTribruxo", false);
                luciusMalfoy.addSpecificAttribute("jogadorQuadribol", false);
                luciusMalfoy.addSpecificAttribute("membroArmadaDumbledore", false);

                Features peterPettigrew = new Features("Peter Pettigrew", "masculino", false, false, "Inglesa",
                                "vilao", "antagonista", true, true,
                                "magia", false, false, true,
                                true, "humano", true, false,
                                false, false, "bruxo");

                peterPettigrew.addSpecificAttribute("HarryPotter", true);
                peterPettigrew.addSpecificAttribute("monitor", false);
                peterPettigrew.addSpecificAttribute("casaGrifinoria", true);
                peterPettigrew.addSpecificAttribute("casaCorvinal", false);
                peterPettigrew.addSpecificAttribute("casaSonserina", false);
                peterPettigrew.addSpecificAttribute("casaLufaLufa", false);
                peterPettigrew.addSpecificAttribute("animalEstimacao", false);
                peterPettigrew.addSpecificAttribute("ancestralSalazar", false);
                peterPettigrew.addSpecificAttribute("esteveNaCamaraSecreta", false);
                peterPettigrew.addSpecificAttribute("paisTrouxas", false);
                peterPettigrew.addSpecificAttribute("campeaoTribruxo", false);
                peterPettigrew.addSpecificAttribute("jogadorQuadribol", false);
                peterPettigrew.addSpecificAttribute("membroArmadaDumbledore", false);

                listaPersonagens.add(harryPotter);
                listaPersonagens.add(hermioneGranger);
                listaPersonagens.add(ronWeasley);
                listaPersonagens.add(lunaLovegood);
                listaPersonagens.add(dracoMalfoy);
                listaPersonagens.add(nevilleLongbottom);
                listaPersonagens.add(ginnyWeasley);
                listaPersonagens.add(fredWeasley);
                listaPersonagens.add(albusDumbledore);
                listaPersonagens.add(severusSnape);
                listaPersonagens.add(rubeusHagrid);
                listaPersonagens.add(siriusBlack);
                listaPersonagens.add(remusLupin);
                listaPersonagens.add(bellatrixLestrange);
                listaPersonagens.add(choChang);
                listaPersonagens.add(luciusMalfoy);
                listaPersonagens.add(peterPettigrew);

        }

}