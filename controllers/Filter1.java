package controllers;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Filter1 {
  private static final Map<String, Function<Features, Boolean>> featuresMap = new HashMap<>();

  static {
    // Inicializa o mapa com todas as características
    featuresMap.put("masculino", p -> p.getSex().equals("masculino"));
    featuresMap.put("feminino", p -> p.getSex().equals("feminino"));
    featuresMap.put("indefinido", p -> p.getSex().equals("indefinido"));
    featuresMap.put("tem filho", Features::hasChild);
    featuresMap.put("tem irmao", Features::hasSibling);
    featuresMap.put("animeJapones", p -> p.getAnime().equals("Japones"));
    featuresMap.put("animeChines", p -> p.getAnime().equals("Chines"));
    featuresMap.put("Inglesa", p -> p.getAnime().equals("Inglesa"));
    featuresMap.put("heroi", p -> p.getFigure().equals("heroi"));
    featuresMap.put("vilao", p -> p.getFigure().equals("vilao"));
    featuresMap.put("anti-heroi", p -> p.getFigure().equals("anti-heroi"));
    featuresMap.put("neutro", p -> p.getFigure().equals("neutro"));
    featuresMap.put("protagonista", p -> p.getRole().equals("protagonista"));
    featuresMap.put("co-protagonista", p -> p.getRole().equals("co-protagonista"));
    featuresMap.put("antagonista", p -> p.getRole().equals("antagonista"));
    featuresMap.put("coadjuvante", p -> p.getRole().equals("coadjuvante"));
    featuresMap.put("figurante", p -> p.getRole().equals("figurante"));
    featuresMap.put("tem transformacao", Features::hasTransformation);
    featuresMap.put("tem poder", Features::hasPower);
    featuresMap.put("Ki", p -> p.getPower().equals("Ki"));
    featuresMap.put("mana", p -> p.getPower().equals("mana"));
    featuresMap.put("magia", p -> p.getPower().equals("magia"));
    featuresMap.put("cosmo", p -> p.getPower().equals("cosmo"));
    featuresMap.put("chakra", p -> p.getPower().equals("chakra"));
    featuresMap.put("carater", Features::isGoodCharacter);
    featuresMap.put("inteligente", Features::isIntelligent);
    featuresMap.put("manipulador", Features::isManipulative);
    featuresMap.put("safado", Features::isMischievous);
    featuresMap.put("arrogante", Features::isArrogant);
    featuresMap.put("cicatriz", Features::hasScar);
    featuresMap.put("saiyajin", p -> p.getRace().equals("saiyajin"));
    featuresMap.put("humano", p -> p.getRace().equals("humano"));
    featuresMap.put("namekuseijin", p -> p.getRace().equals("namekuseijin"));
    featuresMap.put("androide", p -> p.getRace().equals("android"));
    featuresMap.put("raça freeza", p -> p.getRace().equals("freeza"));
    featuresMap.put("kaioshin", p -> p.getRace().equals("kaioshin"));
    featuresMap.put("hakaishin", p -> p.getRace().equals("hakaishin"));
    featuresMap.put("anjo", p -> p.getRace().equals("anjo"));
    featuresMap.put("majin", p -> p.getRace().equals("majin"));
    featuresMap.put("alienigena", p -> p.getRace().equals("alienigena"));

    // Para atributos específicos Solo Leveling
    featuresMap.put("lider", p -> p.getSpecificBooleanAttribute("lider"));

    featuresMap.put("cacador", p -> p.getSpecificStringAttribute("entidade").equals("caçador"));
    featuresMap.put("monarca", p -> p.getSpecificStringAttribute("entidade").equals("monarca"));
    featuresMap.put("governante", p -> p.getSpecificStringAttribute("entidade").equals("governante"));

    featuresMap.put("nacional", p -> p.getSpecificStringAttribute("rank").equals("nacional"));
    featuresMap.put("S", p -> p.getSpecificStringAttribute("rank").equals("S"));
    featuresMap.put("A", p -> p.getSpecificStringAttribute("rank").equals("A"));
    featuresMap.put("B", p -> p.getSpecificStringAttribute("rank").equals("B"));
    featuresMap.put("C", p -> p.getSpecificStringAttribute("rank").equals("C"));
    featuresMap.put("D", p -> p.getSpecificStringAttribute("rank").equals("D"));
    featuresMap.put("E", p -> p.getSpecificStringAttribute("rank").equals("E"));

    featuresMap.put("podeInvocar", p -> p.getSpecificBooleanAttribute("podeInvocar"));

    featuresMap.put("guerreiro", p -> p.getSpecificStringAttribute("classes").equals("guerreiro"));
    featuresMap.put("mago", p -> p.getSpecificStringAttribute("classes").equals("mago"));
    featuresMap.put("necromante", p -> p.getSpecificStringAttribute("classes").equals("necromante"));
    featuresMap.put("assassino", p -> p.getSpecificStringAttribute("classes").equals("assassino"));
    featuresMap.put("curandeiro", p -> p.getSpecificStringAttribute("classes").equals("curandeiro"));
    featuresMap.put("suporte", p -> p.getSpecificStringAttribute("classes").equals("suporte"));
    featuresMap.put("arqueiro", p -> p.getSpecificStringAttribute("classes").equals("arqueiro"));
  }

  public static void charactersFiltered(List<Features> listaPersonagens, String caracteristica, boolean valor) {
    List<Features> charactersFiltered = listaPersonagens.stream()
        .filter(personagem -> getFeatures(personagem, caracteristica) == valor)
        .collect(Collectors.toList());
    listaPersonagens.clear();
    listaPersonagens.addAll(charactersFiltered);
  }

  public static boolean getFeatures(Features personagem, String caracteristica) {
    Function<Features, Boolean> checker = featuresMap.get(caracteristica);
    if (checker == null) {
      System.out.println("Característica não encontrada: " + caracteristica);
      return false;
    }
    return checker.apply(personagem);
  }
}