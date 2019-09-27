/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.prototype.IPrototype;

/**
 *
 * @author Óscar Vega R
 */
public class Character implements IPrototype<Character>{
    
    private String nameType;
    private SubType nameSubType;
    private ArrayList<String> appearances;
    private double life;
    private double damage;
    private double level;
    private int slots;
    private int appearanceLevel;
    private int price;

    public Character(String nameType, SubType nameSubType, ArrayList<String> appearances, double life, double damage, double level, int slots, int appearanceLevel, int price) {
        this.nameType = nameType;
        this.nameSubType = nameSubType;
        this.appearances = appearances;
        this.life = life;
        this.damage = damage;
        this.level = level;
        this.slots = slots;
        this.appearanceLevel = appearanceLevel;
        this.price = price;
    }

    public Character(String nameType, SubType nameSubType) {
        this.nameType = nameType;
        this.nameSubType = nameSubType;
        appearances = new ArrayList<String>();
    }


    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public SubType getNameSubType() {
        return nameSubType;
    }

    public void setNameSubType(SubType nameSubType) {
        this.nameSubType = nameSubType;
    }

    public ArrayList<String> getAppearances() {
        return appearances;
    }

    public void setAppearances(ArrayList<String> appearances) {
        this.appearances = appearances;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public int getAppearanceLevel() {
        return appearanceLevel;
    }

    public void setAppearanceLevel(int appearanceLevel) {
        this.appearanceLevel = appearanceLevel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Character clone() {
        return new Character(this.nameType, this.nameSubType);
    }

    @Override
    public Character deepClone() {
        return clone();
    }
}