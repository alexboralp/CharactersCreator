/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.objetos.arma;

import model.objetos.personaje.IPrototype;

/**
 *
 * @author alexander
 * @author jeesquivel
 */
public  class Arma implements IPrototype<Arma>{
    protected String nombre;
    protected int alcance;
    protected int danno;
    protected int nivel;
    protected int rango;
    
    protected int nivelMaximo;
    protected int nivelAparicion;
    protected String apariencia;

    public Arma(String nombre, int alcance, int danno, int nivel, int rango, int nivelMaximo, int nivelAparicion, String apariencia) {
        this.nombre = nombre;
        this.alcance = alcance;
        this.danno = danno;
        this.rango = rango;
        this.nivel = nivel;
        
        this.nivelMaximo = nivelMaximo;
        this.nivelAparicion= nivelAparicion;
        this.apariencia = apariencia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getDanno() {
        return danno;
    }

    public void setDanno(int danno) {
        this.danno = danno;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String  getApariencia() {
        return this.apariencia;
    }

    public void setApariencia(String  apariencia) {
        this.apariencia = apariencia;
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

    @Override
    public Arma clonar() {
       return new Arma(nombre, alcance, danno, nivel, rango, nivelMaximo, nivelAparicion, apariencia);
    }

    @Override
    public Arma deepclonar() {
        return clonar();
    }

    @Override
    public String toString() {
        return "{\"nombre\":\""+ nombre +"\",\n"+
                "\"alcance\":"+alcance+",\n"+
                "\"danno\":"+danno+",\n"+
                "\"nivel\":"+nivel+ ",\n"+
                "\"rango\":"+ rango+",\n"+
                "\"nivelMaximo\":"+ nivelMaximo+",\n"+
                "\"nivelAparicion\":"+ nivelAparicion+",\n"+
                "\"apariencia\":\""+apariencia+"\"}";
    }

}
