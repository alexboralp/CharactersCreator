/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

import model.SubType;
import model.Weapon;
import model.WeaponType;

/**
 *
 * @author Óscar Vega R
 */
public class WeaponFactory implements WeaponFactoryMethod {

    @Override
    public Weapon createWeapon(WeaponType weaponType, int level) {
        switch(weaponType){ //String Name, SubType nameSubType, int reach, double damage, double level, int scope
            case KNIFE:
                return new Knife("Cuchillo",SubType.OVERLAND,1,20,level,1);
            case SWORD:
                return new Sword("Espada",SubType.OVERLAND,2,30,level,3);
            /*case SPEAR:
                return new Spear("Lanza",SubType.OVERLAND,3,40,level,3);
            case BOW:
                return new Bow("Arco",SubType.OVERHEAD,4,10,level,3);
            case GREATBOW:
                return new GreatBow("Gran Arco",SubType.OVERHEAD,5,20,level,3);
            case RECURVEBOW:
                return new RecurveBow("Arco Recurvo",SubType.OVERHEAD,6,30,level,3);*/
            default:
                return new None("Ninguna",SubType.OVERLAND,1,10,level,1);
        }
    }
    
    
}
