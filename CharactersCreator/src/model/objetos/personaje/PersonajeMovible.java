/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.objetos.personaje;

import java.awt.Point;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexander
 */
public class PersonajeMovible extends Personaje implements IMovible, Runnable {
    
    public enum ESTADO_MOVIBLE {ESPERANDO, AVANZANDO}
    
    protected int velocidad;                   // Velocidad en que se mueve el guerrero
    protected Point posicion;                   // Posición en la cuadrícula donde está este objeto.
    protected ESTADO_MOVIBLE estado_movible;                    // El estado actual del guerrero
    protected Point destino;

    public PersonajeMovible(String nombre, String apariencia, int vida, int golpesSegundo, int nivel, int campos, int nivelAparicion, int costo, int nivelMaximo, int velocidad, Point posicion) {
        super(nombre, apariencia, vida, golpesSegundo, nivel, campos, nivelAparicion, costo, nivelMaximo);
        this.velocidad = velocidad;
        this.posicion = posicion;
        this.estado_movible = ESTADO_MOVIBLE.ESPERANDO;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    public ESTADO_MOVIBLE getEstado_Movible() {
        return estado_movible;
    }

    public void setEstado_Movible(ESTADO_MOVIBLE estado_movible) {
        this.estado_movible = estado_movible;
    }
    
    public void setDestino(Point destino) {
        this.destino = destino;
    }
    
    @Override
    public void run() {
        while(estado != Personaje.ESTADO.MUERTO && destino != null){
            try {
                Point vectorDirector = resta(destino, posicion);
                posicion = suma(posicion, productoEscalar(1/norma(vectorDirector), vectorDirector));
                sleep((int)(1000/velocidad));
            } catch (InterruptedException ex) {
                Logger.getLogger(Personaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /*
    Mueve el guerrero en la dirección hacia donde se encuentra el objetivo actual
    */
    @Override
    public void mover() {
        new Thread(this).start();
    }

    @Override
    public PersonajeMovible clonar() throws CloneNotSupportedException {
        PersonajeMovible clon = new PersonajeMovible(nombre, apariencia, vida, golpesSegundo, nivel, campos, nivelAparicion, costo, nivelMaximo, velocidad, posicion);
        clon.setEstado_Movible(estado_movible);
        clon.setEstado(estado);
        clon.setArmas(armas);
        return clon;
    }

    @Override
    public PersonajeMovible deepclonar() throws CloneNotSupportedException {
        PersonajeMovible clon = new PersonajeMovible(nombre, apariencia, vida, golpesSegundo, nivel, campos, nivelAparicion, costo, nivelMaximo, velocidad, posicion);
        clon.setEstado_Movible(estado_movible);
        clon.setEstado(estado);
        clon.setArmas(armas);
        return clon;
    }

    @Override
    public String toString() {
        return "PersonajeMovible{" + super.toString() + "velocidad=" + velocidad + ", posicion=" + posicion + ", estado_movible=" + estado_movible + '}';
    }
    
    /*
    Calcula la distancia al cuadrado entre dos puntos dados
    */
    private double distancia2(Point punto1, Point punto2){
        return Math.pow(punto2.x - punto1.x, 2) + Math.pow(punto2.y - punto1.y, 2);
    }
    
    private double distancia(Point punto1, Point punto2){
        return Math.sqrt(distancia2(punto1, punto2));
    }
    
    private Point resta(Point punto1, Point punto2) {
        return new Point(punto1.x - punto2.x, punto1.y - punto2.y);
    }
    
    private Point suma(Point punto1, Point punto2) {
        return new Point(punto1.x + punto2.x, punto1.y + punto2.y);
    }
    
    private Point productoEscalar(double escalar, Point punto) {
        return new Point((int)(escalar * punto.x), (int)(escalar * punto.y));
    }
    
    private double norma2(Point punto) {
        return punto.x * punto.x + punto.y * punto.y;
    }
    
    private double norma(Point punto) {
        return Math.sqrt(norma2(punto));
    }
    
}
