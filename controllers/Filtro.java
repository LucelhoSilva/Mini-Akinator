package controllers;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe responsável por filtrar uma lista de personagens com base em uma
 * determinada característica.
 */
public class Filtro {
    /**
     * Filtra uma lista de personagens com base em uma determinada característica.
     *
     * Este método cria uma nova lista contendo apenas os personagens que possuem
     * a característica.
     * 
     * @param listaPersonagens A lista de personagens a ser filtrada.
     * @param caracteristica   A característica a ser filtrada.
     * @param valor            O valor da característica a ser filtrado.
     * 
     */
    public static void filtrarPersonagens(List<Caracteristica> listaPersonagens, String caracteristica, boolean valor) {
        List<Caracteristica> personagensFiltrados = listaPersonagens.stream()
                .filter(personagem -> getCaracteristica(personagem, caracteristica) == valor)
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
     * @param personagem     O personagem a ser analisado.
     * @param caracteristica A característica a ser verificada (e.g., "masculino",
     *                       "temFilho").
     * @return `true` se o personagem possui a característica, `false` caso
     *         contrário.
     */
    public static boolean getCaracteristica(Caracteristica personagem, String caracteristica) {
        switch (caracteristica) {
            ////////////////////////////////// Sexo /////////////////////////////
            case "masculino":
                return personagem.getSexo().equals("masculino");
            case "feminino":
                return personagem.getSexo().equals("feminino");
            case "indefinido":
                return personagem.getSexo().equals("indefinido");
            ////////////////////////////////// Filho /////////////////////////////
            case "tem filho":
                return personagem.getTemFilho();
            ////////////////////////////////// Irmão /////////////////////////////
            case "tem irmao":
                return personagem.getTemIrmao();
            ////////////////////////////////// Anime //////////////////////////////////
            case "animeJapones":
                return personagem.getAnime().equals("Japones");
            case "animeChines":
                return personagem.getAnime().equals("Chines");
            case "Inglesa":
                return personagem.getAnime().equals("Inglesa");
            ////////////////////////////////// Figura //////////////////////////////////
            case "heroi":
                return personagem.getFigura().equals("heroi");
            case "vilao":
                return personagem.getFigura().equals("vilao");
            case "anti-heroi":
                return personagem.getFigura().equals("anti-heroi");
            case "neutro":
                return personagem.getFigura().equals("neutro");
            ////////////////////////////////// Papel //////////////////////////////////
            case "protagonista":
                return personagem.getPapel().equals("protagonista");
            case "co-protagonista":
                return personagem.getPapel().equals("co-protagonista");
            case "antagonista":
                return personagem.getPapel().equals("antagonista");
            case "coadjuvante":
                return personagem.getPapel().equals("coadjuvante");
            case "figurante":
                return personagem.getPapel().equals("figurante");
            ////////////////////////////////// Transformação /////////////////////////////
            case "tem transformacao":
                return personagem.getTemTransformacao();
            ////////////////////////////////// Poder //////////////////////////////////
            case "ki":
                return personagem.getPoder().equals("ki");
            case "mana":
                return personagem.getPoder().equals("mana");
            case "magia":
                return personagem.getPoder().equals("magia");
            case "cosmo":
                return personagem.getPoder().equals("cosmo");
            case "tem poder":
                return personagem.getTemPoder();
            ////////////////////////////////// Carater //////////////////////////////////
            case "carater":
                return personagem.getCarater();
            case "inteligente":
                return personagem.getInteligencia();
            case "estrategista":
                return personagem.getEstrategista();
            case "manipulador":
                return personagem.getManipulador();
            case "safado":
                return personagem.getSafado();
            case "arrogante":
                return personagem.getArrogante();
            ////////////////////////////////// Caracteristica fisica
            ////////////////////////////////// //////////////////////////////////
            case "cicatriz":
                return personagem.getCicatriz();
            ////////////////////////////////// Raça //////////////////////////////////
            case "saiyajin":
                return personagem.getRaca().equals("saiyajin");
            case "humano":
                return personagem.getRaca().equals("humana");
            case "android":
                return personagem.getRaca().equals("android");
            case "namekuseijin":
                return personagem.getRaca().equals("namekuseijin");
            case "raca freeza":
                return personagem.getRaca().equals("raca freeza");
            case "kaioshin":
                return personagem.getRaca().equals("kaioshin");
            case "anjo":
                return personagem.getRaca().equals("anjo");
            case "hakaishin":
                return personagem.getRaca().equals("hakaishin");
            case "Majin":
                return personagem.getRaca().equals("majin");
            case "alienigena":
                return personagem.getRaca().equals("alienigena");
            ////////////////////////////////// Solo Leveling ////////////////////////////
            case "lider":
                return personagem.obterAtributoEspecificoBoolean("lider");
            case "cacador":
                return personagem.obterAtributoEspecificoString("entidade").equals("caçador");
            case "monarca":
                return personagem.obterAtributoEspecificoString("entidade").equals("monarca");
            case "governante":
                return personagem.obterAtributoEspecificoString("entidade").equals("governante");
            ////////////////////////////////// Rank ////////////////////////////
            case "nacional":
                return personagem.obterAtributoEspecificoString("rank").equals("Nacional");
            case "S":
                return personagem.obterAtributoEspecificoString("rank").equals("S");
            case "A":
                return personagem.obterAtributoEspecificoString("rank").equals("A");
            case "B":
                return personagem.obterAtributoEspecificoString("rank").equals("B");
            case "C":
                return personagem.obterAtributoEspecificoString("rank").equals("C");
            case "D":
                return personagem.obterAtributoEspecificoString("rank").equals("D");
            case "E":
                return personagem.obterAtributoEspecificoString("rank").equals("E");
            ////////////////////////////////// Elemento ////////////////////////////
            case "vento":
                return personagem.obterAtributoEspecificoString("elemento").equals("vento");
            case "luz":
                return personagem.obterAtributoEspecificoString("elemento").equals("luz");
            case "trevas":
                return personagem.obterAtributoEspecificoString("elemento").equals("trevas");
            case "agua":
                return personagem.obterAtributoEspecificoString("elemento").equals("agua");
            case "fogo":
                return personagem.obterAtributoEspecificoString("elemento").equals("fogo");
            ///////////////////////// Pode Invocar /////////////////
            case "podeInvocar":
                return personagem.obterAtributoEspecificoBoolean("podeInvocar");
            ////////////////////////////////// Classe //////////////////////////////////
            case "tudo":
                return personagem.obterAtributoEspecificoString("classe").equals("tudo");
            case "espadachim":
                return personagem.obterAtributoEspecificoString("classe").equals("espadachim");
            case "mago":
                return personagem.obterAtributoEspecificoString("classe").equals("mago");
            case "lutador":
                return personagem.obterAtributoEspecificoString("classe").equals("lutador");
            case "suporte":
                return personagem.obterAtributoEspecificoString("classe").equals("suporte");
            case "arqueiro":
                return personagem.obterAtributoEspecificoString("classe").equals("arqueiro");
            case "tank":
                return personagem.obterAtributoEspecificoString("classe").equals("tank");

            ////////////////////////////////// Cavaleiros Do Zodiaco ///////////////////
            case "elementoFogo":
                return personagem.obterAtributoEspecificoString("elemento").equals("fogo");
            case "elementoTerra":
                return personagem.obterAtributoEspecificoString("elemento").equals("terra");
            case "signoPegaso":
                return personagem.obterAtributoEspecificoString("signo").equals("pegaso");
            case "signoDragao":
                return personagem.obterAtributoEspecificoString("signo").equals("dragao");
            case "armaduraBronze":
                return personagem.obterAtributoEspecificoString("armadura").equals("bronze");
            ////////////////////////////////// Harry Potter ///////////////////////////
            case "HarryPotter":
                return personagem.obterAtributoEspecificoBoolean("HarryPotter");
            case "casaGrifinoria":
                return personagem.obterAtributoEspecificoBoolean("casaGrifinoria");
            case "casaCorvinal":
                return personagem.obterAtributoEspecificoBoolean("casaCorvinal");
            case "animalEstimacao":
                return personagem.obterAtributoEspecificoBoolean("animalEstimacao");
            case "ancestralSalazar":
                return personagem.obterAtributoEspecificoBoolean("ancestralSalazar");
            case "esteveNaCamaraSecreta":
                return personagem.obterAtributoEspecificoBoolean("esteveNaCamaraSecreta");
            case "paisTrouxas":
                return personagem.obterAtributoEspecificoBoolean("paisTrouxas");
            default:
                return false;
        }
    }
}