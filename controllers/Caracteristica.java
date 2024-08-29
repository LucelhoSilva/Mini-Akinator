package controllers;

import java.util.HashMap;
import java.util.Map;

public class Caracteristica {
    private String nome;
    private String sexo;
    private boolean temFilho;
    private boolean temIrmao;
    private String anime;
    private String figura;
    private String papel;
    private boolean temTransformacao;
    private boolean temPoder;
    private String poder;
    private boolean carater;
    private boolean inteligencia;
    private boolean estrategista;
    private boolean manipulador;
    private String raca;
    private boolean safado;
    private boolean cicatriz;
    private boolean arrogante;
    private boolean TemArmadura;

    private Map<String, Object> atributosEspecificos;

    public Caracteristica(
            String nome, String sexo, boolean temFilho, boolean temIrmao, String anime, String figura,
            String papel, boolean temTransformacao, boolean temPoder, String poder,
            boolean carater, boolean inteligencia, boolean estrategista, boolean manipulador,
            String raca, boolean safado, boolean cicatriz, boolean arrogante, boolean TemArmadura) {

        this.nome = nome;
        this.sexo = sexo;
        this.temFilho = temFilho;
        this.temIrmao = temIrmao;
        this.anime = anime;
        this.figura = figura;
        this.papel = papel;
        this.temTransformacao = temTransformacao;
        this.temPoder = temPoder;
        this.poder = poder;
        this.carater = carater;
        this.inteligencia = inteligencia;
        this.estrategista = estrategista;
        this.manipulador = manipulador;
        this.raca = raca;
        this.safado = safado;
        this.cicatriz = cicatriz;
        this.arrogante = arrogante;
        this.TemArmadura = TemArmadura;

        this.atributosEspecificos = new HashMap<>();
    }

    // Métodos para adicionar e obter atributos específicos
    public void adicionarAtributoEspecifico(String chave, Object valor) {
        atributosEspecificos.put(chave, valor);
    }

    // Novo método para obter atributo específico como boolean
    public boolean obterAtributoEspecificoBoolean(String chave) {
        Object valor = atributosEspecificos.get(chave);
        return valor instanceof Boolean ? (Boolean) valor : false;
    }

    // Novo método para obter atributo específico como String
    public String obterAtributoEspecificoString(String chave) {
        Object valor = atributosEspecificos.get(chave);
        return valor instanceof String ? (String) valor : "";
    }

    // Getters para todos os atributos
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean getTemFilho() {
        return temFilho;
    }

    public boolean getTemIrmao() {
        return temIrmao;
    }

    public String getAnime() {
        return anime;
    }

    public String getFigura() {
        return figura;
    }

    public String getPapel() {
        return papel;
    }

    public boolean getTemTransformacao() {
        return temTransformacao;
    }

    public boolean getTemPoder() {
        return temPoder;
    }

    public String getPoder() {
        return poder;
    }

    public boolean getCarater() {
        return carater;
    }

    public boolean getInteligencia() {
        return inteligencia;
    }

    public boolean getEstrategista() {
        return estrategista;
    }

    public boolean getManipulador() {
        return manipulador;
    }

    public String getRaca() {
        return raca;
    }

    public boolean getSafado() {
        return safado;
    }

    public boolean getCicatriz() {
        return cicatriz;
    }

    public boolean getArrogante() {
        return arrogante;
    }

    public boolean getTemArmadura() {
        return TemArmadura;
    }

    @Override
    public String toString() {
        return nome;
    }
}