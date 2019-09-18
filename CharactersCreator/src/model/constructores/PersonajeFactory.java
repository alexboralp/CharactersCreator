package model.constructores;

import model.objetos.personaje.Personaje;

public class PersonajeFactory {
    
    public static Personaje crearPersonaje(String nombre, String apariencia, int vida, int golpesSegundo, int nivel, int campos, int nivelAparicion, int costo, int nivelMaximo) {

        return new Personaje(nombre, apariencia, vida, golpesSegundo, nivel, campos, nivelAparicion, costo, nivelMaximo);

    }
}
