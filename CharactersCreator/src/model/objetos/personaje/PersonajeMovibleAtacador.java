/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.objetos.personaje;

import model.objetos.arma.Arma;
import java.awt.Point;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexander
 */
public class PersonajeMovibleAtacador extends PersonajeMovible implements IAtacador, IBuscadorEnemigos<PersonajeMovible>, Runnable{

    public enum ESTADO_ATAQUE {BUSCANDO_ENEMIGO, AVANZANDO, ATACANDO}
    
    protected Personaje objetivo;               // El objetivo actual del guerrero
    protected ESTADO_ATAQUE estado_ataque;                    // El estado actual del guerrero

    public PersonajeMovibleAtacador(String nombre, String apariencia, int vida, int golpesSegundo, int nivel, int campos, int nivelAparicion, int costo, int nivelMaximo, int velocidad, Point posicion) {
        super(nombre, apariencia, vida, golpesSegundo, nivel, campos, nivelAparicion, costo, nivelMaximo, velocidad, posicion);
        this.objetivo = null;
        this.estado_ataque = ESTADO_ATAQUE.BUSCANDO_ENEMIGO;
    }

    public Personaje getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Personaje objetivo) {
        this.objetivo = objetivo;
    }

    public ESTADO_ATAQUE getEstadoAtaque() {
        return estado_ataque;
    }

    public void setEstado_ataque(ESTADO_ATAQUE estado_ataque) {
        this.estado_ataque = estado_ataque;
    }

    /*
    El guerrero primero pregunta si hay un objetivo asignado y si el objetivo está vivo,
    de ser así si el objetivo está al alcance de su arma entonces lo ataca sino se mueve hacia él,
    si el objetivo no está vivo o no hay objetivo entonces se busca un objetivo.
    */
    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    Busca el objetivo que se encuentre más cercano, ¿ponemos objetivos favoritos?
    */
    @Override
    public PersonajeMovible buscarObjetivo(ArrayList<PersonajeMovible> enemigos) {
        PersonajeMovible mejorObjetivo = null;
        for(PersonajeMovible enemigo: enemigos){
            if (enemigo != null && enemigo.estado != Personaje.ESTADO.MUERTO){
                if (mejorObjetivo == null)
                    mejorObjetivo = enemigo;
                else if (distancia2(posicion, enemigo.posicion) < distancia2(posicion, mejorObjetivo.posicion))
                    mejorObjetivo = enemigo;
            }
        }
        return mejorObjetivo;
    }
    
    @Override
    public void run() {
        while(estado != Personaje.ESTADO.MUERTO){
            try {
                if (objetivo == null || objetivo.estado == Personaje.ESTADO.MUERTO){
                    objetivo = buscarObjetivo(personaje.getEnemigos());
                }else if (distancia2(personaje.objetivo.posicion, personaje.posicion) <= Math.pow(((Arma)this.arma).alcance,2)){
                    atacar();
                    sleep((int)(1000/golpesSegundo));
                }else{
                    personaje.mover();
                    sleep((int)(1000/velocidad));
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Personaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public PersonajeMovibleAtacador clonar() throws CloneNotSupportedException {
       return new PersonajeMovibleAtacador(personaje, arma);
    }

    @Override
    public PersonajeMovibleAtacador deepclonar() throws CloneNotSupportedException {
        return new PersonajeMovibleAtacador(personaje.deepclonar(), arma.deepclonar());
    }

    @Override
    public String toString() {
        return "PersonajeMovibleAtacador{" + super.toString() + ", objetivo=" + objetivo + ", estado_ataque=" + estado_ataque.toString() + '}';
    }
    
    /*
    Calcula la distancia al cuadrado entre dos puntos dados
    */
    private double distancia2(Point punto1, Point punto2){
        return Math.pow(punto2.x - punto1.x, 2) + Math.pow(punto2.y - punto1.y, 2);
    }
    
}
