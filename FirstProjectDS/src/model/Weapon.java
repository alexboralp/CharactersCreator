/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.SubType;
import model.prototype.IPrototype;

/**
 *
 * @author Óscar Vega R
 */
public abstract class Weapon {
    
    private String Name;
    private SubType nameSubType;
    private ArrayList<String> appearances;
    private int reach;
    private double damage;
    private double level;
    private int scope;

    public Weapon(String Name, SubType nameSubType, int reach, double damage, double level, int scope) {
        this.Name = Name;
        this.nameSubType = nameSubType;
        appearances = new ArrayList<String>();
        this.reach = reach;
        this.damage = damage;
        this.level = level;
        this.scope = scope;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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
    
    public void addAppearances(String appearance) {
        appearances.add(appearance);
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
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

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }
    
    public abstract void attack();
    
}
