/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

import model.Weapon;
import model.WeaponType;

/**
 *
 * @author Óscar Vega R
 */
public interface WeaponFactoryMethod {
    public Weapon createWeapon(WeaponType weaponType, int level);    
}
