/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.AbstractFactory;

import java.util.HashMap;
import model.Character;
import model.Weapon;

/**
 *
 * @author Óscar Vega R
 */
public interface CompleteCharacter {
    public abstract Character getCharacter();
    public abstract HashMap<String, Weapon> getWeapons();
    public abstract void addWeapon(String weaponName, Weapon weapon);
}
