/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import model.AbstractFactory.CompleteCharacter;
import model.prototype.IPrototype;

/**
 *
 * @author Óscar Vega R
 */
public class ArmedCharacter implements CompleteCharacter, IPrototype<ArmedCharacter>{
    
    private Character character;
    private HashMap<String, Weapon> weapons;

    public ArmedCharacter(Character character) {
        this.character = character;
        weapons = new HashMap<String, Weapon>();
    }

    @Override
    public Character getCharacter() {
        return character;
    }

    @Override
    public HashMap<String, Weapon> getWeapons() {
        return weapons;
    }
    
    @Override
    public void addWeapon(String weaponName, Weapon weapon) {
        weapons.put(weaponName, weapon);
    }

    @Override
    public ArmedCharacter clone() {
        return new ArmedCharacter(this.character); 
    }

    @Override
    public ArmedCharacter deepClone() {
        return clone();
    }
    
}
