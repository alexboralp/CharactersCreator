/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.prototype;

import java.util.HashMap;

/**
 *
 * @author Óscar Vega R
 */
public class PrototypeFactory {
    private static HashMap<String,IPrototype> prototypes = new HashMap<String, IPrototype>();
    
    public static IPrototype getPrototype(String prototypeName){
        return prototypes.get(prototypeName).deepClone();
    }
    
    public static void addPrototype(String prototypeName,IPrototype prototype){
        prototypes.put(prototypeName, prototype);
    }
}
