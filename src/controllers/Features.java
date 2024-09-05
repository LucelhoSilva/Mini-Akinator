package src.controllers;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa um personagem com vários atributos e características.
 */
public class Features {
    private String name;
    private String sex;
    private boolean hasChild;
    private boolean hasSibling;
    private String anime;
    private String figure;
    private String role;
    private boolean hasTransformation;
    private boolean hasPower;
    private String power;
    private boolean goodCharacter;
    private boolean intelligent;
    private boolean strategist;
    private boolean manipulative;
    private boolean mischievous;
    private boolean arrogant;
    private boolean hasScar;
    private String race;
    private boolean hasArmor;
    private String classes;

    private Map<String, Object> specificAttributes;

    /**
     * Constrói um novo personagem com os atributos fornecidos.
     */
    public Features(
            String name, String sex, boolean hasChild, boolean hasSibling, String anime, String figure,
            String role, boolean hasTransformation, boolean hasPower, String power,
            boolean goodCharacter, boolean intelligent, boolean strategist, boolean manipulative,
            String race, boolean mischievous, boolean hasScar, boolean arrogant, boolean hasArmor, String classes) {

        this.name = name;
        this.sex = sex;
        this.hasChild = hasChild;
        this.hasSibling = hasSibling;
        this.anime = anime;
        this.figure = figure;
        this.role = role;
        this.hasTransformation = hasTransformation;
        this.hasPower = hasPower;
        this.power = power;
        this.goodCharacter = goodCharacter;
        this.intelligent = intelligent;
        this.strategist = strategist;
        this.manipulative = manipulative;
        this.race = race;
        this.mischievous = mischievous;
        this.hasScar = hasScar;
        this.arrogant = arrogant;
        this.hasArmor = hasArmor;
        this.classes = classes;

        this.specificAttributes = new HashMap<>();
    }

    /**
     * Adiciona um atributo específico ao personagem.
     * 
     * @param key   A chave do atributo
     * @param valor O valor do atributo
     */
    public void addSpecificAttribute(String chave, Object valor) {
        specificAttributes.put(chave, valor);
    }

    /**
     * Recupera um atributo booleano específico.
     * 
     * @param key A chave do atributo
     * @return O valor booleano do atributo, ou false se não for encontrado ou não
     *         for booleano
     */
    public boolean getSpecificBooleanAttribute(String chave) {
        Object value = specificAttributes.get(chave);
        return value instanceof Boolean ? (Boolean) value : false;
    }

    /**
     * Recupera um atributo de string específico.
     * 
     * @param key A chave do atributo
     * @return O valor da string do atributo, ou uma string vazia se não for
     *         encontrada ou não for uma string
     */
    public String getSpecificStringAttribute(String chave) {
        Object value = specificAttributes.get(chave);
        return value instanceof String ? (String) value : "";
    }

    // Getters para todos os atributos
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public boolean hasChild() {
        return hasChild;
    }

    public boolean hasSibling() {
        return hasSibling;
    }

    public String getAnime() {
        return anime;
    }

    public String getFigure() {
        return figure;
    }

    public String getRole() {
        return role;
    }

    public boolean hasTransformation() {
        return hasTransformation;
    }

    public boolean hasPower() {
        return hasPower;
    }

    public String getPower() {
        return power;
    }

    public boolean isGoodCharacter() {
        return goodCharacter;
    }

    public boolean isIntelligent() {
        return intelligent;
    }

    public boolean isStrategist() {
        return strategist;
    }

    public boolean isManipulative() {
        return manipulative;
    }

    public String getRace() {
        return race;
    }

    public boolean isMischievous() {
        return mischievous;
    }

    public boolean hasScar() {
        return hasScar;
    }

    public boolean isArrogant() {
        return arrogant;
    }

    public boolean hasArmor() {
        return hasArmor;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return name;
    }
}