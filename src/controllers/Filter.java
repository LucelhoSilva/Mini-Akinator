package src.controllers;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Classe responsável por filtrar personagens com base em suas características.
 * Esta classe contém métodos estáticos para filtrar uma lista de personagens
 * e verificar características específicas de um personagem.
 */
public class Filter {
  private static final Map<String, Function<Features, Boolean>> filter = new HashMap<>();

  static {
    // Características gerais
    filter.put("masculino", p -> p.getSex().equals("masculino"));
    filter.put("feminino", p -> p.getSex().equals("feminino"));
    filter.put("indefinido", p -> p.getSex().equals("indefinido"));
    filter.put("tem filho", Features::hasChild);
    filter.put("tem irmao", Features::hasSibling);
    filter.put("animeJapones", p -> p.getAnime().equals("Japones"));
    filter.put("animeChines", p -> p.getAnime().equals("Chines"));
    filter.put("Inglesa", p -> p.getAnime().equals("Inglesa"));
    filter.put("heroi", p -> p.getFigure().equals("heroi"));
    filter.put("vilao", p -> p.getFigure().equals("vilao"));
    filter.put("anti-heroi", p -> p.getFigure().equals("anti-heroi"));
    filter.put("neutro", p -> p.getFigure().equals("neutro"));
    filter.put("protagonista", p -> p.getRole().equals("protagonista"));
    filter.put("co-protagonista", p -> p.getRole().equals("co-protagonista"));
    filter.put("antagonista", p -> p.getRole().equals("antagonista"));
    filter.put("coadjuvante", p -> p.getRole().equals("coadjuvante"));
    filter.put("figurante", p -> p.getRole().equals("figurante"));
    filter.put("tem transformacao", Features::hasTransformation);
    filter.put("tem poder", Features::hasPower);
    filter.put("ki", p -> p.getPower().equals("Ki"));
    filter.put("mana", p -> p.getPower().equals("mana"));
    filter.put("magia", p -> p.getPower().equals("magia"));
    filter.put("cosmo", p -> p.getPower().equals("cosmo"));
    filter.put("carater", Features::isGoodCharacter);
    filter.put("inteligente", Features::isIntelligent);
    filter.put("estrategista", Features::isStrategist);
    filter.put("manipulador", Features::isManipulative);
    filter.put("safado", Features::isMischievous);
    filter.put("arrogante", Features::isArrogant);
    filter.put("cicatriz", Features::hasScar);
    filter.put("humano", p -> p.getRace().equals("humano"));
    filter.put("saiyajin", p -> p.getRace().equals("saiyajin"));
    filter.put("android", p -> p.getRace().equals("android"));
    filter.put("namekuseijin", p -> p.getRace().equals("namekuseijin"));
    filter.put("freeza", p -> p.getRace().equals("freeza"));
    filter.put("kaioshin", p -> p.getRace().equals("kaioshin"));
    filter.put("anjo", p -> p.getRace().equals("anjo"));
    filter.put("hakaishin", p -> p.getRace().equals("hakaishin"));
    filter.put("majin", p -> p.getRace().equals("majin"));
    filter.put("gigante de geloigena", p -> p.getRace().equals("gigante de geloigena"));

    // Características específicas do Universo de Harry Potter
    filter.put("HarryPotter", p -> p.getSpecificBooleanAttribute("HarryPotter"));
    filter.put("monitor", p -> p.getSpecificBooleanAttribute("monitor"));
    filter.put("casaGrifinoria", p -> p.getSpecificBooleanAttribute("casaGrifinoria"));
    filter.put("casaCorvinal", p -> p.getSpecificBooleanAttribute("casaCorvinal"));
    filter.put("casaSonserina", p -> p.getSpecificBooleanAttribute("casaSonserina"));
    filter.put("casaLufaLufa", p -> p.getSpecificBooleanAttribute("casaLufaLufa"));
    filter.put("animalEstimacao", p -> p.getSpecificBooleanAttribute("animalEstimacao"));
    filter.put("ancestralSalazar", p -> p.getSpecificBooleanAttribute("ancestralSalazar"));
    filter.put("esteveNaCamaraSecreta", p -> p.getSpecificBooleanAttribute("esteveNaCamaraSecreta"));
    filter.put("paisTrouxas", p -> p.getSpecificBooleanAttribute("paisTrouxas"));
    filter.put("campeaoTribruxo", p -> p.getSpecificBooleanAttribute("campeaoTribruxo"));
    filter.put("jogadorQuadribol", p -> p.getSpecificBooleanAttribute("jogadorQuadribol"));
    filter.put("membroArmadaDumbledore", p -> p.getSpecificBooleanAttribute("membroArmadaDumbledore"));
    filter.put("bruxa", p -> p.getClass().equals("bruxa"));
    filter.put("bruxo", p -> p.getClass().equals("bruxo"));

    // Características específicas do UniversoMarvelPersonagens
    filter.put("UniversoMarvel", p -> p.getSpecificBooleanAttribute("UniversoMarvel"));
    filter.put("vingador", p -> p.getSpecificBooleanAttribute("vingador"));
    filter.put("traje", p -> p.getSpecificBooleanAttribute("traje"));
    filter.put("wakanda", p -> p.getSpecificBooleanAttribute("wakanda"));
    filter.put("xmen", p -> p.getSpecificBooleanAttribute("xmen"));
    filter.put("regeneracao", p -> p.getSpecificBooleanAttribute("regeneracao"));
    filter.put("controleMetal", p -> p.getSpecificBooleanAttribute("controleMetal"));
    filter.put("capacete", p -> p.getSpecificBooleanAttribute("capacete"));
    filter.put("telepatia", p -> p.getSpecificBooleanAttribute("telepatia"));
    filter.put("telecinese", p -> p.getSpecificBooleanAttribute("telecinese"));
    filter.put("voar", p -> p.getSpecificBooleanAttribute("voar"));
    filter.put("absorverEnergia", p -> p.getSpecificBooleanAttribute("absorverEnergia"));
    filter.put("inteligenciaArtificial", p -> p.getSpecificBooleanAttribute("inteligenciaArtificial"));
    filter.put("manipulacaoRealidade", p -> p.getSpecificBooleanAttribute("manipulacaoRealidade"));
    filter.put("agilidadeAprimorada", p -> p.getSpecificBooleanAttribute("agilidadeAprimorada"));
    filter.put("realeza", p -> p.getSpecificBooleanAttribute("realeza"));
    filter.put("raiosGama", p -> p.getSpecificBooleanAttribute("raiosGama"));
    filter.put("shield", p -> p.getSpecificBooleanAttribute("shield"));
    filter.put("treinamentoEspecial", p -> p.getSpecificBooleanAttribute("treinamentoEspecial"));
    filter.put("superSoldado", p -> p.getSpecificBooleanAttribute("superSoldado"));
    filter.put("bilionario", p -> p.getSpecificBooleanAttribute("bilionario"));
    filter.put("patriota", p -> p.getSpecificBooleanAttribute("patriota"));
    filter.put("combateCorpoACorpo", p -> p.getSpecificBooleanAttribute("combateCorpoACorpo"));
    filter.put("artesMarciais", p -> p.getSpecificBooleanAttribute("artesMarciais"));
    filter.put("forcaDivina", p -> p.getSpecificBooleanAttribute("forcaDivina"));
    filter.put("manipulacaoDeEnergia", p -> p.getSpecificBooleanAttribute("manipulacaoDeEnergia"));
    filter.put("fazerFeitico", p -> p.getSpecificBooleanAttribute("fazerFeitico"));
    filter.put("Maguinetismo", p -> p.getSpecificBooleanAttribute("Maguinetismo"));
    filter.put("asgardiano", p -> p.getRace().equals("asgardiano"));
    filter.put("mutante", p -> p.getRace().equals("mutante"));
    filter.put("humano mutado", p -> p.getRace().equals("humano mutado"));
    filter.put("entidade cósmica", p -> p.getRace().equals("entidade cósmica"));
    filter.put("inumano", p -> p.getRace().equals("inumano"));
    filter.put("híbrido", p -> p.getRace().equals("híbrido"));
    filter.put("eterno", p -> p.getRace().equals("eterno"));
    filter.put("robô", p -> p.getRace().equals("robô"));
    filter.put("gigante de gelo", p -> p.getRace().equals("gigante de gelo"));
    filter.put("humano simbionte", p -> p.getRace().equals("humano simbionte"));

  }

  /**
   * Filtra uma lista de personagens com base em uma característica específica.
   * 
   * @param characterList Lista de personagens a ser filtrada
   * @param feature       Característica a ser verificada
   * @param value         Valor booleano esperado para a característica
   */
  public static void filterCharacters(List<Features> characterList, String feature, boolean value) {
    List<Features> filteredCharacters = characterList.stream()
        .filter(character -> getFeature(character, feature) == value)
        .collect(Collectors.toList());
    characterList.clear();
    characterList.addAll(filteredCharacters);
  }

  /**
   * Verifica se um personagem possui uma característica específica.
   * 
   * @param character Personagem a ser verificado
   * @param feature   Característica a ser verificada
   * @return true se o personagem possui a característica, false caso contrário
   */
  public static boolean getFeature(Features character, String feature) {
    Function<Features, Boolean> check = filter.get(feature);
    return check != null ? check.apply(character) : false;
  }
}
