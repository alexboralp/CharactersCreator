/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Óscar Vega R
 */
public enum WarriorType {
    
    ELF ("elf"),
    //LADYELF ("Elfo Femenino"),
    DARKNIGHT ("darknight"),
    //GOLDNIGHT ("Caballero Dorado"),
    ORC ("orc");
    //SKELETON ("Calavera");
    
    private String type;
    
    private WarriorType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
}
