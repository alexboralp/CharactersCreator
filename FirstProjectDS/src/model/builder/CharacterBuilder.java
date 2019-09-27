/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.builder;

import java.util.ArrayList;
import model.Character;
import model.SubType;
/**
 *
 * @author Óscar Vega R
 */
public class CharacterBuilder implements IBuilder<Character> {
    
    private String nameType;
    private SubType nameSubType;
    private ArrayList<String> appearances;
    private double life;
    private double damage;
    private double level;
    private int slots;
    private int appearanceLevel;
    private int price;

    public CharacterBuilder() {
        appearances = new ArrayList<String>();
    }

    public CharacterBuilder setNameType(String nameType) {
        this.nameType = nameType;
        return this;
    }
    
    public CharacterBuilder setNameSubType(SubType nameSubType) {
        this.nameSubType = nameSubType;
        return this;
    }

    public CharacterBuilder addAppearances(String appearance) {
        appearances.add(appearance);
        return this;
    }

    public CharacterBuilder setLife(double life) {
        this.life = life;
        return this;
    }

    public CharacterBuilder setDamage(double damage) {
        this.damage = damage;
        return this;
    }

    public CharacterBuilder setLevel(double level) {
        this.level = level;
        return this;
    }

    public CharacterBuilder setSlots(int slots) {
        this.slots = slots;
        return this;
    }

    public CharacterBuilder setAppearanceLevel(int appearanceLevel) {
        this.appearanceLevel = appearanceLevel;
        return this;
    }

    public CharacterBuilder setPrice(int price) {
        this.price = price;
        return this;
    }
    
    @Override
    public Character build() {
        return new Character(nameType, nameSubType, appearances, life, damage, level, slots, appearanceLevel, price);
    }   
}
