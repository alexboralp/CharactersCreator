/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

import model.SubType;
import model.Weapon;

/**
 *
 * @author Óscar Vega R
 */
public class Knife extends Weapon {

    public Knife(String Name, SubType nameSubType, int reach, double damage, double level, int scope) {
        super(Name, nameSubType, reach, damage, level, scope);
    }

    @Override
    public void attack() {
        System.out.println("Atacando con cuchillo");
    }
    
}
