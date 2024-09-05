package src.controllers;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe responsável por filtrar uma lista de personagens com base em uma
 * determinada característica.
 */
public class Filter {
    /**
     * Filtra uma lista de personagens com base em uma determinada característica.
     *
     * Este método cria uma nova lista contendo apenas os personagens que possuem
     * a característica.
     * 
     * @param listaPersonagens A lista de personagens a ser filtrada.
     * @param Features         A característica a ser filtrada.
     * @param valor            O valor da característica a ser filtrado.
     * 
     */
    public static void filtrarPersonagens(List<Features> listaPersonagens, String Features, boolean valor) {
        List<Features> personagensFiltrados = listaPersonagens.stream()
                .filter(personagem -> getFeatures(personagem, Features) == valor)
                .collect(Collectors.toList());
        listaPersonagens.clear();
        listaPersonagens.addAll(personagensFiltrados);
    }

    /**
     * Verifica se um personagem possui uma determinada característica.
     *
     * Este método busca por uma característica específica no personagem e retorna
     * true se a característica for encontrada, caso contrário, retorna false.
     *
     * @param personagem O personagem a ser analisado.
     * @param Features   A característica a ser verificada (e.g., "masculino",
     *                   "temFilho").
     * @return `true` se o personagem possui a característica, `false` caso
     *         contrário.
     */
    public static boolean getFeatures(Features personagem, String Features) {
        switch (Features) {
            ////////////////////////////////// Sexo /////////////////////////////
            case "masculino":
                return personagem.getSex().equals("masculino");
            case "feminino":
                return personagem.getSex().equals("feminino");
            case "indefinido":
                return personagem.getSex().equals("indefinido");
            ////////////////////////////////// Filho /////////////////////////////
            case "tem filho":
                return personagem.hasChild();
            ////////////////////////////////// Irmão /////////////////////////////
            case "tem irmao":
                return personagem.hasSibling();
            ////////////////////////////////// Anime //////////////////////////////////
            case "animeJapones":
                return personagem.getAnime().equals("Japones");
            case "animeChines":
                return personagem.getAnime().equals("Chines");
            case "Inglesa":
                return personagem.getAnime().equals("Inglesa");
            ////////////////////////////////// Figura //////////////////////////////////
            case "heroi":
                return personagem.getFigure().equals("heroi");
            case "vilao":
                return personagem.getFigure().equals("vilao");
            case "anti-heroi":
                return personagem.getFigure().equals("anti-heroi");
            case "neutro":
                return personagem.getFigure().equals("neutro");
            ////////////////////////////////// Papel //////////////////////////////////
            case "protagonista":
                return personagem.getRole().equals("protagonista");
            case "co-protagonista":
                return personagem.getRole().equals("co-protagonista");
            case "antagonista":
                return personagem.getRole().equals("antagonista");
            case "coadjuvante":
                return personagem.getRole().equals("coadjuvante");
            case "figurante":
                return personagem.getRole().equals("figurante");
            ////////////////////////////////// Transformação /////////////////////////////
            case "tem transformacao":
                return personagem.hasTransformation();
            ////////////////////////////////// Poder //////////////////////////////////
            case "tem poder":
                return personagem.hasPower();
            case "ki":
                return personagem.getPower().equals("ki");
            case "mana":
                return personagem.getPower().equals("mana");
            case "magia":
                return personagem.getPower().equals("magia");
            case "cosmo":
                return personagem.getPower().equals("cosmo");
            ////////////////////////////////// Carater //////////////////////////////////
            case "carater":
                return personagem.isGoodCharacter();
            case "inteligente":
                return personagem.isIntelligent();
            case "estrategista":
                return personagem.isStrategist();
            case "manipulador":
                return personagem.isManipulative();
            case "safado":
                return personagem.isMischievous();
            case "arrogante":
                return personagem.isArrogant();
            ////////////////////////////////// Features fisica
            ////////////////////////////////// //////////////////////////////////
            case "cicatriz":
                return personagem.hasScar();
            ////////////////////////////////// Raça //////////////////////////////////
            case "saiyajin":
                return personagem.getRace().equals("saiyajin");
            case "humano":
                return personagem.getRace().equals("humana");
            case "android":
                return personagem.getRace().equals("android");
            case "namekuseijin":
                return personagem.getRace().equals("namekuseijin");
            case "freeza":
                return personagem.getRace().equals("freeza");
            case "kaioshin":
                return personagem.getRace().equals("kaioshin");
            case "anjo":
                return personagem.getRace().equals("anjo");
            case "hakaishin":
                return personagem.getRace().equals("hakaishin");
            case "Majin":
                return personagem.getRace().equals("majin");
            case "alienigena":
                return personagem.getRace().equals("alienigena");
            ////////////////////////////////// Solo Leveling ////////////////////////////
            case "lider":
                return personagem.getSpecificBooleanAttribute("lider");
            case "cacador":
                return personagem.getSpecificStringAttribute("entidade").equals("caçador");
            case "monarca":
                return personagem.getSpecificStringAttribute("entidade").equals("monarca");
            case "governante":
                return personagem.getSpecificStringAttribute("entidade").equals("governante");
            ////////////////////////////////// Rank ////////////////////////////
            case "nacional":
                return personagem.getSpecificStringAttribute("rank").equals("Nacional");
            case "S":
                return personagem.getSpecificStringAttribute("rank").equals("S");
            case "A":
                return personagem.getSpecificStringAttribute("rank").equals("A");
            case "B":
                return personagem.getSpecificStringAttribute("rank").equals("B");
            case "C":
                return personagem.getSpecificStringAttribute("rank").equals("C");
            case "D":
                return personagem.getSpecificStringAttribute("rank").equals("D");
            case "E":
                return personagem.getSpecificStringAttribute("rank").equals("E");
            ////////////////////////////////// Elemento ////////////////////////////
            case "vento":
                return personagem.getSpecificStringAttribute("elemento").equals("vento");
            case "luz":
                return personagem.getSpecificStringAttribute("elemento").equals("luz");
            case "trevas":
                return personagem.getSpecificStringAttribute("elemento").equals("trevas");
            case "agua":
                return personagem.getSpecificStringAttribute("elemento").equals("agua");
            case "fogo":
                return personagem.getSpecificStringAttribute("elemento").equals("fogo");
            ///////////////////////// Pode Invocar /////////////////
            case "podeInvocar":
                return personagem.getSpecificBooleanAttribute("podeInvocar");
            ////////////////////////////////// Classe //////////////////////////////////
            case "tudo":
                return personagem.getSpecificStringAttribute("classe").equals("tudo");
            case "espadachim":
                return personagem.getSpecificStringAttribute("classe").equals("espadachim");
            case "mago":
                return personagem.getSpecificStringAttribute("classe").equals("mago");
            case "lutador":
                return personagem.getSpecificStringAttribute("classe").equals("lutador");
            case "suporte":
                return personagem.getSpecificStringAttribute("classe").equals("suporte");
            case "arqueiro":
                return personagem.getSpecificStringAttribute("classe").equals("arqueiro");
            case "tank":
                return personagem.getSpecificStringAttribute("classe").equals("tank");

            ////////////////////////////////// Cavaleiros Do Zodiaco ///////////////////
            case "elementoFogo":
                return personagem.getSpecificStringAttribute("elemento").equals("fogo");
            case "elementoTerra":
                return personagem.getSpecificStringAttribute("elemento").equals("terra");
            case "signoPegaso":
                return personagem.getSpecificStringAttribute("signo").equals("pegaso");
            case "signoDragao":
                return personagem.getSpecificStringAttribute("signo").equals("dragao");
            case "armaduraBronze":
                return personagem.getSpecificStringAttribute("armadura").equals("bronze");
            ////////////////////////////////// Harry Potter ///////////////////////////
            case "HarryPotter":
                return personagem.getSpecificBooleanAttribute("HarryPotter");
            case "casaGrifinoria":
                return personagem.getSpecificBooleanAttribute("casaGrifinoria");
            case "casaCorvinal":
                return personagem.getSpecificBooleanAttribute("casaCorvinal");
            case "animalEstimacao":
                return personagem.getSpecificBooleanAttribute("animalEstimacao");
            case "ancestralSalazar":
                return personagem.getSpecificBooleanAttribute("ancestralSalazar");
            case "esteveNaCamaraSecreta":
                return personagem.getSpecificBooleanAttribute("esteveNaCamaraSecreta");
            case "paisTrouxas":
                return personagem.getSpecificBooleanAttribute("paisTrouxas");
            default:
                return false;
        }
    }
}