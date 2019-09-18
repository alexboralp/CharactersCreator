/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.objetos.personaje;

import model.objetos.arma.Arma;
import java.util.ArrayList;

/**
 *
 * @author alexander
 */
public class Personaje implements IPrototype<Personaje>{
    
    public enum ESTADO {VIVO, MUERTO}
    
    protected String nombre;                    // Nombre que tendrá el objeto
    protected String apariencia;                // Lista de direcciones donde estarán las imágenes de este objeto
    protected int vida;                         // Puntos de vida del objeto
    protected int golpesSegundo;                // Cantidad de veces que el guerrero ataca por segundo
    protected int nivel;                        // Nivel en el que está el objeto
    protected int campos;                       // Campos que necesita el guerreroprotected IArma armaFavorita;           // El arma favorita de este guerrero por la que obtiene un porcentaje mayor de daño
    protected int nivelAparicion;               // Nivel del personaje a partir del cual se tendrá acceso al objeto
    protected int costo;                        // Costo en dinero del juego necesario para comprar el objeto
    
    protected int nivelMaximo;                  // Nivel máximo al que puede llegar este personaje
    protected ESTADO estado;
    
    protected ArrayList<Arma> armas;           // El arma favorita de este guerrero por la que obtiene un porcentaje mayor de daño
    
    public Personaje(String nombre, String apariencia, int vida, int golpesSegundo, int nivel, int campos, int nivelAparicion, int costo, int nivelMaximo) {
        this.nombre = nombre;
        this.apariencia = apariencia;
        this.vida = vida;
        this.golpesSegundo = golpesSegundo;
        this.nivel = nivel;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.nivelMaximo = nivelMaximo;
        this.estado = ESTADO.VIVO;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getNivelMaximo() {
        return nivelMaximo;
    }

    public void setNivelMaximo(int nivelMaximo) {
        this.nivelMaximo = nivelMaximo;
    }

    public int getNivelAparicion() {
        return nivelAparicion;
    }

    public void setNivelAparicion(int nivelAparicion) {
        this.nivelAparicion = nivelAparicion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String  getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public ESTADO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }
    
    public void atacado(int danno){
        this.vida -= danno;
        if (this.vida <= 0)
            this.estado = ESTADO.MUERTO;
    }

    public int getGolpesSegundo() {
        return golpesSegundo;
    }

    public void setGolpesSegundo(int golpesSegundo) {
        this.golpesSegundo = golpesSegundo;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    @Override
    public String toString() {
        return "Personaje{" + 
                "nombre=" + nombre + 
                ", apariencia=" + apariencia + 
                ", vida=" + vida + 
                ", golpesSegundo=" + golpesSegundo + 
                ", nivel=" + nivel + 
                ", campos=" + campos + 
                ", nivelAparicion=" + nivelAparicion + 
                ", costo=" + costo + 
                ", nivelMaximo=" + nivelMaximo + 
                ", estado=" + estado + 
                ", armas=" + armas + '}';
    }
    
    @Override
    public Personaje clonar() throws CloneNotSupportedException {
        Personaje clon = new Personaje(nombre, apariencia, vida, golpesSegundo, nivel, campos, nivelAparicion, costo, nivelMaximo);
        clon.setArmas(armas);
        return clon;
    }

    @Override
    public Personaje deepclonar() throws CloneNotSupportedException {
        Personaje clon = new Personaje(nombre, apariencia, vida, golpesSegundo, nivel, campos, nivelAparicion, costo, nivelMaximo);
        clon.setArmas(armas);
        return clon;
    }
    
}
